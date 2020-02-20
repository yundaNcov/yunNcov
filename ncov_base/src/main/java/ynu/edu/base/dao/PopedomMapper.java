package ynu.edu.base.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;
import ynu.edu.base.pojo.Popedom;
import ynu.edu.base.pojo.PopedomExample;
import ynu.edu.base.pojo.PopedomKey;
@Component
public interface PopedomMapper {
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