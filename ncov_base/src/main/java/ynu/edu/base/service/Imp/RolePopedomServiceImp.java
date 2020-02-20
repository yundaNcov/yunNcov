package ynu.edu.base.service.Imp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ynu.edu.base.dao.RolePopedomMapper;
import ynu.edu.base.pojo.RolePopedomExample;
import ynu.edu.base.pojo.RolePopedomKey;
import ynu.edu.base.service.RolePopedomService;

import java.util.List;

@Service
public class RolePopedomServiceImp implements RolePopedomService {
    @Autowired
    public RolePopedomMapper rolePopedomMapper;
    @Override
    public long countByExample(RolePopedomExample example) {
        return rolePopedomMapper.countByExample(example);
    }

    @Override
    public int deleteByExample(RolePopedomExample example) {
        return rolePopedomMapper.deleteByExample(example);
    }

    @Override
    public int deleteByPrimaryKey(RolePopedomKey key) {
        return rolePopedomMapper.deleteByPrimaryKey(key);
    }

    @Override
    public int insert(RolePopedomKey record) {
        return rolePopedomMapper.insert(record);
    }

    @Override
    public int insertSelective(RolePopedomKey record) {
        return rolePopedomMapper.insertSelective(record);
    }

    @Override
    public List<RolePopedomKey> selectByExample(RolePopedomExample example) {
        return rolePopedomMapper.selectByExample(example);
    }

    @Override
    public int updateByExampleSelective(RolePopedomKey record, RolePopedomExample example) {
        return rolePopedomMapper.updateByExampleSelective(record, example);
    }

    @Override
    public int updateByExample(RolePopedomKey record, RolePopedomExample example) {
        return rolePopedomMapper.updateByExample(record, example);
    }
}
