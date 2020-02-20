package ynu.edu.base.service.Imp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ynu.edu.base.dao.FlowrateAccessRecordMapper;
import ynu.edu.base.pojo.FlowrateAccessRecord;
import ynu.edu.base.pojo.FlowrateAccessRecordExample;
import ynu.edu.base.service.FlowrateAccessRecordService;

import java.util.List;

@Service
public class FlowrateAccessRecordServiceImp implements FlowrateAccessRecordService {
    @Autowired
    public FlowrateAccessRecordMapper flowrateAccessRecordMapper;

    @Override
    public long countByExample(FlowrateAccessRecordExample example) {
        return flowrateAccessRecordMapper.countByExample(example);
    }

    @Override
    public int deleteByExample(FlowrateAccessRecordExample example) {
        return flowrateAccessRecordMapper.deleteByExample(example);
    }

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return flowrateAccessRecordMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(FlowrateAccessRecord record) {
        return flowrateAccessRecordMapper.insert(record);
    }

    @Override
    public int insertSelective(FlowrateAccessRecord record) {
        return flowrateAccessRecordMapper.insertSelective(record);
    }

    @Override
    public List<FlowrateAccessRecord> selectByExample(FlowrateAccessRecordExample example) {
        return flowrateAccessRecordMapper.selectByExample(example);
    }

    @Override
    public FlowrateAccessRecord selectByPrimaryKey(Integer id) {
        return flowrateAccessRecordMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByExampleSelective(FlowrateAccessRecord record, FlowrateAccessRecordExample example) {
        return flowrateAccessRecordMapper.updateByExampleSelective(record, example);
    }

    @Override
    public int updateByExample(FlowrateAccessRecord record, FlowrateAccessRecordExample example) {
        return flowrateAccessRecordMapper.updateByExample(record, example);
    }

    @Override
    public int updateByPrimaryKeySelective(FlowrateAccessRecord record) {
        return flowrateAccessRecordMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(FlowrateAccessRecord record) {
        return flowrateAccessRecordMapper.updateByPrimaryKey(record);
    }
}
