package ynu.edu.base.service;

import org.apache.ibatis.annotations.Param;
import ynu.edu.base.pojo.Popedom;
import ynu.edu.base.pojo.PopedomExample;
import ynu.edu.base.pojo.PopedomKey;

import java.util.List;

public interface PopedomService {
    long countByExample(PopedomExample example);

    int deleteByExample(PopedomExample example);

    int deleteByPrimaryKey(PopedomKey key);

    int insert(Popedom record);

    int insertSelective(Popedom record);

    List<Popedom> selectByExample(PopedomExample example);

    Popedom selectByPrimaryKey(PopedomKey key);

    int updateByExampleSelective(@Param("record") Popedom record, @Param("example") PopedomExample example);

    int updateByExample(@Param("record") Popedom record, @Param("example") PopedomExample example);

    int updateByPrimaryKeySelective(Popedom record);

    int updateByPrimaryKey(Popedom record);
}
