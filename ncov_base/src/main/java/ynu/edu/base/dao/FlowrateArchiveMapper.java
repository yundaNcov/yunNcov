package ynu.edu.base.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;
import ynu.edu.base.pojo.FlowrateArchive;
import ynu.edu.base.pojo.FlowrateArchiveExample;
@Component
public interface FlowrateArchiveMapper {
    long countByExample(FlowrateArchiveExample example);

    int deleteByExample(FlowrateArchiveExample example);

    int deleteByPrimaryKey(String id);

    int insert(FlowrateArchive record);

    int insertSelective(FlowrateArchive record);

    List<FlowrateArchive> selectByExample(FlowrateArchiveExample example);

    FlowrateArchive selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") FlowrateArchive record, @Param("example") FlowrateArchiveExample example);

    int updateByExample(@Param("record") FlowrateArchive record, @Param("example") FlowrateArchiveExample example);

    int updateByPrimaryKeySelective(FlowrateArchive record);

    int updateByPrimaryKey(FlowrateArchive record);
}