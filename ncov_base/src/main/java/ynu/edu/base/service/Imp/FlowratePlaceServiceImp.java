package ynu.edu.base.service.Imp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ynu.edu.base.dao.FlowratePlaceMapper;
import ynu.edu.base.pojo.FlowratePlace;
import ynu.edu.base.pojo.FlowratePlaceExample;
import ynu.edu.base.service.FlowratePlaceService;

import java.util.List;

@Service
public class FlowratePlaceServiceImp implements FlowratePlaceService {
    @Autowired
    public FlowratePlaceMapper flowratePlaceMapper;

    @Override
    public long countByExample(FlowratePlaceExample example) {
        return flowratePlaceMapper.countByExample(example);
    }

    @Override
    public int deleteByExample(FlowratePlaceExample example) {
        return flowratePlaceMapper.deleteByExample(example);
    }

    @Override
    public int deleteByPrimaryKey(String id) {
        return flowratePlaceMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(FlowratePlace record) {
        return flowratePlaceMapper.insert(record);
    }

    @Override
    public int insertSelective(FlowratePlace record) {
        return flowratePlaceMapper.insertSelective(record);
    }

    @Override
    public List<FlowratePlace> selectByExample(FlowratePlaceExample example) {
        return flowratePlaceMapper.selectByExample(example);
    }

    @Override
    public FlowratePlace selectByPrimaryKey(String id) {
        return flowratePlaceMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByExampleSelective(FlowratePlace record, FlowratePlaceExample example) {
        return flowratePlaceMapper.updateByExampleSelective(record, example);
    }

    @Override
    public int updateByExample(FlowratePlace record, FlowratePlaceExample example) {
        return flowratePlaceMapper.updateByExample(record, example);
    }

    @Override
    public int updateByPrimaryKeySelective(FlowratePlace record) {
        return flowratePlaceMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(FlowratePlace record) {
        return flowratePlaceMapper.updateByPrimaryKey(record);
    }
}
