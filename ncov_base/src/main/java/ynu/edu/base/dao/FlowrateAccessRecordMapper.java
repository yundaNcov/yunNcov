package ynu.edu.base.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;
import ynu.edu.base.pojo.FlowrateAccessRecord;
import ynu.edu.base.pojo.FlowrateAccessRecordExample;
@Component
public interface FlowrateAccessRecordMapper {
    long countByExample(FlowrateAccessRecordExample example);

    int deleteByExample(FlowrateAccessRecordExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(FlowrateAccessRecord record);

    int insertSelective(FlowrateAccessRecord record);

    List<FlowrateAccessRecord> selectByExample(FlowrateAccessRecordExample example);

    FlowrateAccessRecord selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") FlowrateAccessRecord record, @Param("example") FlowrateAccessRecordExample example);

    int updateByExample(@Param("record") FlowrateAccessRecord record, @Param("example") FlowrateAccessRecordExample example);

    int updateByPrimaryKeySelective(FlowrateAccessRecord record);

    int updateByPrimaryKey(FlowrateAccessRecord record);
}