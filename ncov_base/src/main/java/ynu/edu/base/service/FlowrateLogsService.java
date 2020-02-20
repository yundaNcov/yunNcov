package ynu.edu.base.service;

import org.apache.ibatis.annotations.Param;
import ynu.edu.base.pojo.FlowrateLogs;
import ynu.edu.base.pojo.FlowrateLogsExample;

import java.util.List;

public interface FlowrateLogsService {
    long countByExample(FlowrateLogsExample example);

    int deleteByExample(FlowrateLogsExample example);

    int deleteByPrimaryKey(String id);

    int insert(FlowrateLogs record);

    int insertSelective(FlowrateLogs record);

    List<FlowrateLogs> selectByExample(FlowrateLogsExample example);

    FlowrateLogs selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") FlowrateLogs record, @Param("example") FlowrateLogsExample example);

    int updateByExample(@Param("record") FlowrateLogs record, @Param("example") FlowrateLogsExample example);

    int updateByPrimaryKeySelective(FlowrateLogs record);

    int updateByPrimaryKey(FlowrateLogs record);
}
