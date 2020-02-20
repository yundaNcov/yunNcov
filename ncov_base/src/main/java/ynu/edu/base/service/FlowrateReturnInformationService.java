package ynu.edu.base.service;

import org.apache.ibatis.annotations.Param;
import ynu.edu.base.pojo.FlowrateReturnInformation;
import ynu.edu.base.pojo.FlowrateReturnInformationExample;

import java.util.List;

public interface FlowrateReturnInformationService {
    long countByExample(FlowrateReturnInformationExample example);

    int deleteByExample(FlowrateReturnInformationExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(FlowrateReturnInformation record);

    int insertSelective(FlowrateReturnInformation record);

    List<FlowrateReturnInformation> selectByExample(FlowrateReturnInformationExample example);

    FlowrateReturnInformation selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") FlowrateReturnInformation record, @Param("example") FlowrateReturnInformationExample example);

    int updateByExample(@Param("record") FlowrateReturnInformation record, @Param("example") FlowrateReturnInformationExample example);

    int updateByPrimaryKeySelective(FlowrateReturnInformation record);

    int updateByPrimaryKey(FlowrateReturnInformation record);
}
