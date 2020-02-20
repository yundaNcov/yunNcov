package ynu.edu.base.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;
import ynu.edu.base.pojo.FlowrateMapDing;
import ynu.edu.base.pojo.FlowrateMapDingExample;
@Component
public interface FlowrateMapDingMapper {
    long countByExample(FlowrateMapDingExample example);

    int deleteByExample(FlowrateMapDingExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(FlowrateMapDing record);

    int insertSelective(FlowrateMapDing record);

    List<FlowrateMapDing> selectByExample(FlowrateMapDingExample example);

    FlowrateMapDing selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") FlowrateMapDing record, @Param("example") FlowrateMapDingExample example);

    int updateByExample(@Param("record") FlowrateMapDing record, @Param("example") FlowrateMapDingExample example);

    int updateByPrimaryKeySelective(FlowrateMapDing record);

    int updateByPrimaryKey(FlowrateMapDing record);
}