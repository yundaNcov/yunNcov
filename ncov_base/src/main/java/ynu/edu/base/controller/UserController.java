package ynu.edu.base.controller;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.dao.DuplicateKeyException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import ynu.edu.base.dao.UserMapper;
import ynu.edu.base.pojo.*;
import ynu.edu.base.service.FlowrateMapDingService;
import ynu.edu.base.service.FlowrateReturnInformationService;
import ynu.edu.base.service.Imp.FlowrateMapDingServiceImp;
import ynu.edu.base.service.UserService;
import ynu.edu.base.until.Json;
import ynu.edu.base.until.ResultUtil;
import ynu.edu.entity.Result;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.text.SimpleDateFormat;
import java.util.*;

@RestController
@RequestMapping(value = "/user")
public class UserController {

    @Autowired
    private UserMapper userMapper;
    @Autowired
    private UserService userService;
    @Autowired
    private FlowrateReturnInformationService flowrateReturnInformationService; //返程信息
    @Autowired
    private FlowrateMapDingService flowrateMapDingService;  //定位服务

    private UserExample example = new UserExample();
    private FlowrateMapDingExample mapDingExample = new FlowrateMapDingExample();
    private FlowrateReturnInformationExample returnInformationExample = new FlowrateReturnInformationExample();

    /**
     * 每一个Mapper都有如下方法，那个方法不太懂可以问我
     * int countByExample(UserExample example) thorws SQLException    按条件计数
     * int deleteByPrimaryKey(Integer id) thorws SQLException    按主键删除
     * int deleteByExample(UserExample example) thorws SQLException    按条件查询
     * String/Integer insert(User record) thorws SQLException    插入数据（返回值为ID）
     * User selectByPrimaryKey(Integer id) thorws SQLException    按主键查询
     * ListselectByExample(UserExample example) thorws SQLException    按条件查询
     * ListselectByExampleWithBLOGs(UserExample example) thorws SQLException    按条件查询（包括BLOB字段）。只有当数据表中的字段类型有为二进制的才会产生。
     * int updateByPrimaryKey(User record) thorws SQLException    按主键更新
     * int updateByPrimaryKeySelective(User record) thorws SQLException    按主键更新值不为null的字段
     * int updateByExample(User record, UserExample example) thorws SQLException    按条件更新
     * int updateByExampleSelective(User record, UserExample example) thorws SQLException    按条件更新值不为null的字段
     * @param user
     * @return
     * @throws Exception
     */


    @RequestMapping(value = "/accessinsert")
    public String accessinsert(@RequestBody User user) throws Exception{
        try {
//            access.setDate(new Date());
            //插入用户
            userMapper.insert(user);
//            //根据用户id删除用户
//            userMapper.deleteByPrimaryKey(user.getId());
//
//            userMapper.updateByPrimaryKeySelective(user);
//            userMapper.updateByPrimaryKey(user);
//
//
//            UserExample example=new UserExample();
//            //分页设置第几页
//            example.setStartRow(1);
//            //分页设置每页大小
//            example.setPageSize(5);
//            List<User> users=new ArrayList<>();
//            users=userMapper.selectByExample(example);
            Json json=new Json();
            json.setStatus("1");
            return JSONArray.toJSON(json).toString();
        }catch (Exception e){

            Json json=new Json();
            json.setStatus("0");
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            e.printStackTrace(new PrintStream(baos));
            String exception = baos.toString();
            json.setRows(exception);
            return JSONArray.toJSON(json).toString();
        }
    }


    /**
     * 登录接口
     * @param login
     * @return
     */
    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public Result login(@RequestBody Map<String, String> login) {

        try {
            String name = login.get("name");
            String password = login.get("password");
            // 根据用户名查询
            example.clear();
            example.createCriteria().andNameEqualTo(name);
            List<User> users = userService.selectByExample(example);
            if (users.size() == 0) {
                return ResultUtil.error(201, "该用户不存在");
            } else {
                if (StringUtils.equals(users.get(0).getPassword(), password)) {
                    return ResultUtil.success(null);
                } else {
                    return ResultUtil.error(202, "密码错误");
                }
            }
        } catch (Exception e) {
            return ResultUtil.error(201, "账号或密码为空");
        }
    }


    /**
     * 注册
     * @param user
     * @return
     */
    @RequestMapping(value = "/signin", method = RequestMethod.POST)
    public Result register(@RequestBody Map<String, String> user) {
        try {
            // 统计user表中已经存在得数据, 计算主键
            example.clear();
            int l = (int)userService.countByExample(example);
            User person = new User();
            person.setUsername(user.get("username"));
            person.setPassword(user.get("password"));
            person.setNumber(user.get("number"));
            person.setPhone(user.get("phone"));
            person.setName(user.get("name"));
            person.setDepartment(user.get("department"));
            person.setId(l + 1);

            userService.insert(person);
            return ResultUtil.success(null);
        }catch (Exception e) {
            return ResultUtil.error(201, "操作异常");
        }
    }

    /**
     * 可视化数据
     * @return
     */
    @RequestMapping(value = "/getvisualizations", method = RequestMethod.GET)
    public Result getvisualizations() {
        return null;
    }

    /**
     * 根据用户角色id查询用户信息
     * @param userRoleId
     * @return
     */
    @RequestMapping(value = "/userRoleId", method = RequestMethod.GET)
    public Result infoByUserRoleId(@RequestParam String userRoleId) {
        try {
            example.clear();
            example.createCriteria().andRoleIdEqualTo(Integer.parseInt(userRoleId));
            List<User> users = userService.selectByExample(example);
            if(users.size() == 0) {
                return ResultUtil.error(201, "用户角色id不存在");
            } else {
                return ResultUtil.success(users);
            }

        }catch (Exception e) {
            return ResultUtil.error(201, "操作异常");
        }
    }

    /**
     * 保存用户得位置信息
     * @param location
     * @return
     */
    @RequestMapping(value = "/sendlocation", method = RequestMethod.POST)
    public Result sendLocation(@RequestBody Map<String, String> location) {
        try {
            String longitude = location.get("longitude"); //经度
            String latitude = location.get("latitude"); //维度
            Integer userId = Integer.parseInt(location.get("userId")); //用户id
            String address = location.get("name"); //打卡位置

            // 查询定位表中得数据条数
            mapDingExample.clear();
            long l = flowrateMapDingService.countByExample(mapDingExample);

            FlowrateMapDing mapDing = new FlowrateMapDing();
            mapDing.setId((int)l + 1);
            mapDing.setAddress(address);
            mapDing.setDate(new Date());
            mapDing.setX(longitude);
            mapDing.setY(latitude);
            mapDing.setUserId(userId);

            //插入数据
            int insert = flowrateMapDingService.insert(mapDing);
            return ResultUtil.success(insert);

        }catch (Exception e) {
            return ResultUtil.error(201, "操作异常");
        }
    }

    /**
     * 更新用户信息
     * @param map
     * @return
     */
    @RequestMapping(value = "/updateuser", method = RequestMethod.POST)
    public Result updateUser(@RequestBody Map<String, String> map) {
        try {
            // 根据userId查询已有得信息
            int userId = Integer.parseInt(map.get("userid"));
            User user = userService.selectByPrimaryKey(userId);
            if (user != null) {
                user.setDepartment(map.get("department"));
                user.setName(map.get("name"));
                user.setNumber(map.get("number"));
                user.setUsername(map.get("username"));
                example.clear();
                example.createCriteria().andIdEqualTo(user.getId());
                int i = userService.updateByExample(user, example);
                return ResultUtil.success(i);
            } else {
                return ResultUtil.error(201, "用户id不正确");
            }
        }catch (Exception e) {
            e.printStackTrace();
            return ResultUtil.error(201, "操作异常");
        }
    }


    /**
     * 返程经过地点记录
     * @param map
     * @return
     */
    @RequestMapping(value = "/beforeback", method = RequestMethod.POST)
    public Result beforeBack(@RequestBody Map<String, Object> map) {
        try {
            String userid = map.get("userid").toString();
            if (StringUtils.isNotBlank(userid)) {
                int userId = Integer.parseInt(userid);
                ArrayList<String> locationList = new ArrayList<>();
                ArrayList<Object> locations = (ArrayList<Object>)map.get("locations");
                for (Object temp : locations) {
                    Map<String, String> tmp = (Map<String,String>) temp;
                    locationList.add(tmp.get("location"));
                }
                String str = StringUtils.join(locationList, ",");

                //根据userid查询是否已存在
                returnInformationExample.clear();
                returnInformationExample.createCriteria().andUserIdEqualTo(userId);
                List<FlowrateReturnInformation> informations = flowrateReturnInformationService.selectByExample(returnInformationExample);
                //如果不存在，则新增
                returnInformationExample.clear();
                if(informations.size() == 0) {
                    long l = flowrateReturnInformationService.countByExample(returnInformationExample);
                    FlowrateReturnInformation information = new FlowrateReturnInformation();
                    information.setId((int) l + 1);
                    information.setUserId(userId);
                    information.setStayplace(str);

                    int insert = flowrateReturnInformationService.insert(information);
                    return ResultUtil.success(insert);
                } else if (informations.size() == 1) { //如果存在一条数据，则为更新
                    FlowrateReturnInformation information = informations.get(0);
                    String stayplace = information.getStayplace();
                    information.setStayplace(str + ',' + stayplace);
                    returnInformationExample.createCriteria().andIdEqualTo(information.getId());
                    int i = flowrateReturnInformationService.updateByExample(information, returnInformationExample);
                    return ResultUtil.success(i);
                }
                return ResultUtil.error(201, "意料之外得错误");
            } else {
                return ResultUtil.error(201, "userid不能为空");
            }

        }catch (Exception e) {
            return ResultUtil.error(201, "操作异常");
        }
    }

    /**
     * 返校登记
     * @param map
     * @return
     */
    @RequestMapping(value = "/backschools", method = RequestMethod.POST)
    public Result backSchools(@RequestBody Map<String, Object> map) {
        try {

            String userid = map.get("userid").toString();
            List<String> transportway = new ArrayList<>(); // 交通工具
            List<String> begin = new ArrayList<>(); //起始地
            List<String> end = new ArrayList<>(); //到达地
            List<String> betime = new ArrayList<>(); //起始时间
            List<String> entime = new ArrayList<>(); //到达时间
            ArrayList<Object> backinfo = (ArrayList<Object>)map.get("backinfo");
            // 提取相同字段得值并保存
            for (Object temp : backinfo) {
                System.out.println(temp);
                Map<String, String> tmp = (Map<String,String>) temp;
                transportway.add(tmp.get("transportway"));
                begin.add(tmp.get("begin"));
                end.add(tmp.get("end"));
                betime.add(tmp.get("betime"));
                entime.add(tmp.get("entime"));
            }

            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            Date start = dateFormat.parse(betime.get(0)); //获取最起始时间
            Date ending = dateFormat.parse(entime.get(entime.size() - 1)); //获取最后到达时间
            FlowrateReturnInformation returnInformation = new FlowrateReturnInformation();
            returnInformation.setType(StringUtils.join(transportway, ","));
            returnInformation.setDeparture(StringUtils.join(begin, ","));
            returnInformation.setDestination(StringUtils.join(end, ","));
            returnInformation.setDepartureTime(start);
            returnInformation.setDestinationTime(ending);

            if(StringUtils.isNotBlank(userid)) {
                //根据userId查找信息
                int userId = Integer.parseInt(userid);
                returnInformation.setUserId(userId);
                returnInformationExample.clear();
                returnInformationExample.createCriteria().andUserIdEqualTo(userId);
                List<FlowrateReturnInformation> list = flowrateReturnInformationService.selectByExample(returnInformationExample);
                //如果信息不存在，则新增
                returnInformationExample.clear();
                if(list.size() == 0) {

                    long l = flowrateReturnInformationService.countByExample(returnInformationExample);
                    returnInformation.setId((int) l + 1);
                    int i = flowrateReturnInformationService.insert(returnInformation);
                    return ResultUtil.success(i);
                }
                return ResultUtil.error(201, "信息已存在或其他错误");
            }else {
                return ResultUtil.error(201, "userId不能为空");
            }
        }catch (Exception e) {
            e.printStackTrace();
            return ResultUtil.error(201, "操作异常");
        }
    }
}
