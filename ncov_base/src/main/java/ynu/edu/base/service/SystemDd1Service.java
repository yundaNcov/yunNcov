package ynu.edu.base.service;

import org.apache.ibatis.annotations.Param;
import ynu.edu.base.pojo.SystemDd1;
import ynu.edu.base.pojo.SystemDd1Example;

import java.util.List;

public interface SystemDd1Service {
    long countByExample(SystemDd1Example example);

    int deleteByExample(SystemDd1Example example);

    int deleteByPrimaryKey(Integer id);

    int insert(SystemDd1 record);

    int insertSelective(SystemDd1 record);

    List<SystemDd1> selectByExample(SystemDd1Example example);

    SystemDd1 selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") SystemDd1 record, @Param("example") SystemDd1Example example);

    int updateByExample(@Param("record") SystemDd1 record, @Param("example") SystemDd1Example example);

    int updateByPrimaryKeySelective(SystemDd1 record);

    int updateByPrimaryKey(SystemDd1 record);
}
