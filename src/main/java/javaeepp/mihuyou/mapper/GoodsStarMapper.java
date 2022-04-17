package javaeepp.mihuyou.mapper;

import javaeepp.mihuyou.entity.Goods;
import javaeepp.mihuyou.entity.Star;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface GoodsStarMapper {
//    收藏指定用户的一件指定商品
    public void StarAGood(@Param("StarGoodsId") String StarGoodsId,
                          @Param("StarDate") String StarDate,
                          @Param("StarUId") String StarUId);
//    取消收藏指定用户的一件指定商品
    public void CancelStarAGood(@Param("StarGoodsId") String StarGoodsId,
                                @Param("StarUId") String StarUId);
//    获取指定用户的收藏商品信息
    List<Star> GetStarGoodsInfoByUID(@Param("UId") String UID);
//    通过商品id获取商品信息
    public List<Goods> GetGoodsByGoodsId(@Param("GoodsIdList") int[] GoodsIdList);
}
