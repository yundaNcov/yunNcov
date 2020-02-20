package ynu.edu.base.service.Imp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ynu.edu.base.dao.FlowrateArchiveMapper;
import ynu.edu.base.pojo.FlowrateArchive;
import ynu.edu.base.pojo.FlowrateArchiveExample;
import ynu.edu.base.service.FlowrateArchiveService;

import java.util.List;
@Service
public class FlowrateArchiveServiceImp implements FlowrateArchiveService {
    @Autowired
    public FlowrateArchiveMapper flowrateArchiveMapper;
    @Override
    public long countByExample(FlowrateArchiveExample example) {
        return flowrateArchiveMapper.countByExample(example);
    }

    @Override
    public int deleteByExample(FlowrateArchiveExample example) {
        return flowrateArchiveMapper.deleteByExample(example);
    }

    @Override
    public int deleteByPrimaryKey(String id) {
        return flowrateArchiveMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(FlowrateArchive record) {
        return flowrateArchiveMapper.insert(record);
    }

    @Override
    public int insertSelective(FlowrateArchive record) {
        return flowrateArchiveMapper.insertSelective(record);
    }

    @Override
    public List<FlowrateArchive> selectByExample(FlowrateArchiveExample example) {
        return flowrateArchiveMapper.selectByExample(example);
    }

    @Override
    public FlowrateArchive selectByPrimaryKey(String id) {
        return flowrateArchiveMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByExampleSelective(FlowrateArchive record, FlowrateArchiveExample example) {
        return flowrateArchiveMapper.updateByExampleSelective(record, example);
    }

    @Override
    public int updateByExample(FlowrateArchive record, FlowrateArchiveExample example) {
        return flowrateArchiveMapper.updateByExample(record, example);
    }

    @Override
    public int updateByPrimaryKeySelective(FlowrateArchive record) {
        return flowrateArchiveMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(FlowrateArchive record) {
        return flowrateArchiveMapper.updateByPrimaryKey(record);
    }
}
