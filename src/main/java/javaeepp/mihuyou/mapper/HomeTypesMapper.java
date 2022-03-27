package javaeepp.mihuyou.mapper;

import javaeepp.mihuyou.entity.Goods;
import javaeepp.mihuyou.entity.GoodsTypeInfo;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface HomeTypesMapper {
    List<GoodsTypeInfo> getType();

    List<Goods> getGoodsByType(String GoodsTypeId);

    List<Goods> getGoodsByKey(String key);
}
