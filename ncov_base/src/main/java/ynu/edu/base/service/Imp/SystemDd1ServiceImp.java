package ynu.edu.base.service.Imp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ynu.edu.base.dao.SystemDd1Mapper;
import ynu.edu.base.pojo.SystemDd1;
import ynu.edu.base.pojo.SystemDd1Example;
import ynu.edu.base.service.SystemDd1Service;

import java.util.List;
@Service
public class SystemDd1ServiceImp implements SystemDd1Service {
    @Autowired
    public SystemDd1Mapper systemDd1Mapper;
    @Override
    public long countByExample(SystemDd1Example example) {
        return systemDd1Mapper.countByExample(example);
    }

    @Override
    public int deleteByExample(SystemDd1Example example) {
        return systemDd1Mapper.deleteByExample(example);
    }

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return systemDd1Mapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(SystemDd1 record) {
        return systemDd1Mapper.insert(record);
    }

    @Override
    public int insertSelective(SystemDd1 record) {
        return systemDd1Mapper.insertSelective(record);
    }

    @Override
    public List<SystemDd1> selectByExample(SystemDd1Example example) {
        return systemDd1Mapper.selectByExample(example);
    }

    @Override
    public SystemDd1 selectByPrimaryKey(Integer id) {
        return systemDd1Mapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByExampleSelective(SystemDd1 record, SystemDd1Example example) {
        return systemDd1Mapper.updateByExampleSelective(record, example);
    }

    @Override
    public int updateByExample(SystemDd1 record, SystemDd1Example example) {
        return systemDd1Mapper.updateByExample(record, example);
    }

    @Override
    public int updateByPrimaryKeySelective(SystemDd1 record) {
        return systemDd1Mapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(SystemDd1 record) {
        return systemDd1Mapper.updateByPrimaryKey(record);
    }
}
