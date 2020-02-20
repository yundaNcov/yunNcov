package ynu.edu.base.service;

import org.apache.ibatis.annotations.Param;
import ynu.edu.base.pojo.FlowratePlace;
import ynu.edu.base.pojo.FlowratePlaceExample;

import java.util.List;

public interface FlowratePlaceService {
    long countByExample(FlowratePlaceExample example);

    int deleteByExample(FlowratePlaceExample example);

    int deleteByPrimaryKey(String id);

    int insert(FlowratePlace record);

    int insertSelective(FlowratePlace record);

    List<FlowratePlace> selectByExample(FlowratePlaceExample example);

    FlowratePlace selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") FlowratePlace record, @Param("example") FlowratePlaceExample example);

    int updateByExample(@Param("record") FlowratePlace record, @Param("example") FlowratePlaceExample example);

    int updateByPrimaryKeySelective(FlowratePlace record);

    int updateByPrimaryKey(FlowratePlace record);
}
