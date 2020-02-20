package ynu.edu.base.service.Imp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ynu.edu.base.dao.FlowrateLogsMapper;
import ynu.edu.base.pojo.FlowrateLogs;
import ynu.edu.base.pojo.FlowrateLogsExample;
import ynu.edu.base.service.FlowrateLogsService;

import java.util.List;

@Service
public class FlowrateLogsServiceImp implements FlowrateLogsService {
    @Autowired
    public FlowrateLogsMapper flowrateLogsMapper;

    @Override
    public long countByExample(FlowrateLogsExample example) {
        return flowrateLogsMapper.countByExample(example);
    }

    @Override
    public int deleteByExample(FlowrateLogsExample example) {
        return flowrateLogsMapper.deleteByExample(example);
    }

    @Override
    public int deleteByPrimaryKey(String id) {
        return flowrateLogsMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(FlowrateLogs record) {
        return flowrateLogsMapper.insert(record);
    }

    @Override
    public int insertSelective(FlowrateLogs record) {
        return flowrateLogsMapper.insertSelective(record);
    }

    @Override
    public List<FlowrateLogs> selectByExample(FlowrateLogsExample example) {
        return flowrateLogsMapper.selectByExample(example);
    }

    @Override
    public FlowrateLogs selectByPrimaryKey(String id) {
        return flowrateLogsMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByExampleSelective(FlowrateLogs record, FlowrateLogsExample example) {
        return flowrateLogsMapper.updateByExampleSelective(record, example);
    }

    @Override
    public int updateByExample(FlowrateLogs record, FlowrateLogsExample example) {
        return flowrateLogsMapper.updateByExample(record, example);
    }

    @Override
    public int updateByPrimaryKeySelective(FlowrateLogs record) {
        return flowrateLogsMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(FlowrateLogs record) {
        return flowrateLogsMapper.updateByPrimaryKey(record);
    }
}
