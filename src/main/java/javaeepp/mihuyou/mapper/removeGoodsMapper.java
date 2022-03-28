package javaeepp.mihuyou.mapper;

import javaeepp.mihuyou.entity.Goods;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface removeGoodsMapper {
    List<Goods> getGoodsDetail() ;

    int removeGoods(@Param("GoodsId")String GoodsId);

    List<Goods> getAGoodPicture(@Param("GoodsId") String GoodsId);
}
