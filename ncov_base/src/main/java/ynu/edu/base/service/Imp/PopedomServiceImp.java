package ynu.edu.base.service.Imp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ynu.edu.base.dao.PopedomMapper;
import ynu.edu.base.pojo.Popedom;
import ynu.edu.base.pojo.PopedomExample;
import ynu.edu.base.pojo.PopedomKey;
import ynu.edu.base.service.PopedomService;

import java.util.List;

@Service
public class PopedomServiceImp implements PopedomService {
    @Autowired
    public PopedomMapper popedomMapper;
    @Override
    public long countByExample(PopedomExample example) {
        return popedomMapper.countByExample(example);
    }

    @Override
    public int deleteByExample(PopedomExample example) {
        return popedomMapper.deleteByExample(example);
    }

    @Override
    public int deleteByPrimaryKey(PopedomKey key) {
        return popedomMapper.deleteByPrimaryKey(key);
    }

    @Override
    public int insert(Popedom record) {
        return popedomMapper.insert(record);
    }

    @Override
    public int insertSelective(Popedom record) {
        return popedomMapper.insertSelective(record);
    }

    @Override
    public List<Popedom> selectByExample(PopedomExample example) {
        return popedomMapper.selectByExample(example);
    }

    @Override
    public Popedom selectByPrimaryKey(PopedomKey key) {
        return popedomMapper.selectByPrimaryKey(key);
    }

    @Override
    public int updateByExampleSelective(Popedom record, PopedomExample example) {
        return popedomMapper.updateByExampleSelective(record, example);
    }

    @Override
    public int updateByExample(Popedom record, PopedomExample example) {
        return popedomMapper.updateByExample(record, example);
    }

    @Override
    public int updateByPrimaryKeySelective(Popedom record) {
        return popedomMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Popedom record) {
        return popedomMapper.updateByPrimaryKey(record);
    }
}
