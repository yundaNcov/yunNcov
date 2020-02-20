package ynu.edu.base.service.Imp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ynu.edu.base.dao.FlowrateReturnInformationMapper;
import ynu.edu.base.pojo.FlowrateReturnInformation;
import ynu.edu.base.pojo.FlowrateReturnInformationExample;
import ynu.edu.base.service.FlowrateReturnInformationService;

import java.util.List;

@Service
public class FlowrateReturnInformationServiceImp implements FlowrateReturnInformationService {
    @Autowired
    public FlowrateReturnInformationMapper flowrateReturnInformationMapper;
    @Override
    public long countByExample(FlowrateReturnInformationExample example) {
        return flowrateReturnInformationMapper.countByExample(example);
    }

    @Override
    public int deleteByExample(FlowrateReturnInformationExample example) {
        return flowrateReturnInformationMapper.deleteByExample(example);
    }

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return flowrateReturnInformationMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(FlowrateReturnInformation record) {
        return flowrateReturnInformationMapper.insert(record);
    }

    @Override
    public int insertSelective(FlowrateReturnInformation record) {
        return flowrateReturnInformationMapper.insertSelective(record);
    }

    @Override
    public List<FlowrateReturnInformation> selectByExample(FlowrateReturnInformationExample example) {
        return flowrateReturnInformationMapper.selectByExample(example);
    }

    @Override
    public FlowrateReturnInformation selectByPrimaryKey(Integer id) {
        return flowrateReturnInformationMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByExampleSelective(FlowrateReturnInformation record, FlowrateReturnInformationExample example) {
        return flowrateReturnInformationMapper.updateByExampleSelective(record, example);
    }

    @Override
    public int updateByExample(FlowrateReturnInformation record, FlowrateReturnInformationExample example) {
        return flowrateReturnInformationMapper.updateByExample(record, example);
    }

    @Override
    public int updateByPrimaryKeySelective(FlowrateReturnInformation record) {
        return flowrateReturnInformationMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(FlowrateReturnInformation record) {
        return flowrateReturnInformationMapper.updateByPrimaryKey(record);
    }
}
