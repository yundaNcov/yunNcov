package ynu.edu.base.service;

import org.apache.ibatis.annotations.Param;
import ynu.edu.base.pojo.RolePopedomExample;
import ynu.edu.base.pojo.RolePopedomKey;

import java.util.List;

public interface RolePopedomService {
    long countByExample(RolePopedomExample example);

    int deleteByExample(RolePopedomExample example);

    int deleteByPrimaryKey(RolePopedomKey key);

    int insert(RolePopedomKey record);

    int insertSelective(RolePopedomKey record);

    List<RolePopedomKey> selectByExample(RolePopedomExample example);

    int updateByExampleSelective(@Param("record") RolePopedomKey record, @Param("example") RolePopedomExample example);

    int updateByExample(@Param("record") RolePopedomKey record, @Param("example") RolePopedomExample example);
}
