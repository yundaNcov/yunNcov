package ynu.edu.base.service.Imp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ynu.edu.base.dao.FlowrateMapDingMapper;
import ynu.edu.base.pojo.FlowrateMapDing;
import ynu.edu.base.pojo.FlowrateMapDingExample;
import ynu.edu.base.service.FlowrateMapDingService;

import java.util.List;
@Service
public class FlowrateMapDingServiceImp implements FlowrateMapDingService {
    @Autowired
    public FlowrateMapDingMapper flowrateMapDingMapper;
    @Override
    public long countByExample(FlowrateMapDingExample example) {
        return flowrateMapDingMapper.countByExample(example);
    }

    @Override
    public int deleteByExample(FlowrateMapDingExample example) {
        return flowrateMapDingMapper.deleteByExample(example);
    }

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return flowrateMapDingMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(FlowrateMapDing record) {
        return flowrateMapDingMapper.insert(record);
    }

    @Override
    public int insertSelective(FlowrateMapDing record) {
        return flowrateMapDingMapper.insertSelective(record);
    }

    @Override
    public List<FlowrateMapDing> selectByExample(FlowrateMapDingExample example) {
        return flowrateMapDingMapper.selectByExample(example);
    }

    @Override
    public FlowrateMapDing selectByPrimaryKey(Integer id) {
        return flowrateMapDingMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByExampleSelective(FlowrateMapDing record, FlowrateMapDingExample example) {
        return flowrateMapDingMapper.updateByExampleSelective(record, example);
    }

    @Override
    public int updateByExample(FlowrateMapDing record, FlowrateMapDingExample example) {
        return flowrateMapDingMapper.updateByExample(record, example);
    }

    @Override
    public int updateByPrimaryKeySelective(FlowrateMapDing record) {
        return flowrateMapDingMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(FlowrateMapDing record) {
        return flowrateMapDingMapper.updateByPrimaryKey(record);
    }
}
