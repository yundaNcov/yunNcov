package ynu.edu.base.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;
import ynu.edu.base.pojo.FlowrateLogs;
import ynu.edu.base.pojo.FlowrateLogsExample;
@Component
public interface FlowrateLogsMapper {
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