package ynu.edu.base.service.Imp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ynu.edu.base.dao.FlowrateRegionBoundaryMapper;
import ynu.edu.base.pojo.FlowrateRegionBoundary;
import ynu.edu.base.pojo.FlowrateRegionBoundaryExample;
import ynu.edu.base.service.FlowrateRegionBoundaryService;

import java.util.List;

@Service
public class FlowrateRegionBoundaryServiceImp implements FlowrateRegionBoundaryService {
    @Autowired
    public FlowrateRegionBoundaryMapper flowrateRegionBoundaryMapper;
    @Override
    public long countByExample(FlowrateRegionBoundaryExample example) {
        return flowrateRegionBoundaryMapper.countByExample(example);
    }

    @Override
    public int deleteByExample(FlowrateRegionBoundaryExample example) {
        return flowrateRegionBoundaryMapper.deleteByExample(example);
    }

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return flowrateRegionBoundaryMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(FlowrateRegionBoundary record) {
        return flowrateRegionBoundaryMapper.insert(record);
    }

    @Override
    public int insertSelective(FlowrateRegionBoundary record) {
        return flowrateRegionBoundaryMapper.insertSelective(record);
    }

    @Override
    public List<FlowrateRegionBoundary> selectByExample(FlowrateRegionBoundaryExample example) {
        return flowrateRegionBoundaryMapper.selectByExample(example);
    }

    @Override
    public FlowrateRegionBoundary selectByPrimaryKey(Integer id) {
        return flowrateRegionBoundaryMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByExampleSelective(FlowrateRegionBoundary record, FlowrateRegionBoundaryExample example) {
        return flowrateRegionBoundaryMapper.updateByExampleSelective(record, example);
    }

    @Override
    public int updateByExample(FlowrateRegionBoundary record, FlowrateRegionBoundaryExample example) {
        return flowrateRegionBoundaryMapper.updateByExample(record, example);
    }

    @Override
    public int updateByPrimaryKeySelective(FlowrateRegionBoundary record) {
        return flowrateRegionBoundaryMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(FlowrateRegionBoundary record) {
        return flowrateRegionBoundaryMapper.updateByPrimaryKey(record);
    }
}
