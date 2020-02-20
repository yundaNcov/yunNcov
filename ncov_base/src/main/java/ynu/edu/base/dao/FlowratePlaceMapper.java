package ynu.edu.base.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;
import ynu.edu.base.pojo.FlowratePlace;
import ynu.edu.base.pojo.FlowratePlaceExample;
@Component
public interface FlowratePlaceMapper {
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