package ynu.edu.base.service;

import org.apache.ibatis.annotations.Param;
import ynu.edu.base.pojo.FlowrateRegionBoundary;
import ynu.edu.base.pojo.FlowrateRegionBoundaryExample;

import java.util.List;

public interface FlowrateRegionBoundaryService {
    long countByExample(FlowrateRegionBoundaryExample example);

    int deleteByExample(FlowrateRegionBoundaryExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(FlowrateRegionBoundary record);

    int insertSelective(FlowrateRegionBoundary record);

    List<FlowrateRegionBoundary> selectByExample(FlowrateRegionBoundaryExample example);

    FlowrateRegionBoundary selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") FlowrateRegionBoundary record, @Param("example") FlowrateRegionBoundaryExample example);

    int updateByExample(@Param("record") FlowrateRegionBoundary record, @Param("example") FlowrateRegionBoundaryExample example);

    int updateByPrimaryKeySelective(FlowrateRegionBoundary record);

    int updateByPrimaryKey(FlowrateRegionBoundary record);
}
