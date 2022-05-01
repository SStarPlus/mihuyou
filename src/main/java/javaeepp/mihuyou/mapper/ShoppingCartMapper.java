package javaeepp.mihuyou.mapper;

import javaeepp.mihuyou.controller.ShoppingCartController;
import javaeepp.mihuyou.entity.cartGoodsInfo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.SplittableRandom;

@Repository
@Mapper
public interface ShoppingCartMapper {
    int CheckGoodsIfExist(@Param("GoodsId") String GoodsId , @Param("UId") String UId);
    int insertGoods(@Param("GoodsId") String GoodsId, @Param("UId") String UId, @Param("Num")String Num);
    int updateGoodsNum(@Param("GoodsId") String GoodsId, @Param("UId") String UId,@Param("Num")String Num);

    int simRemoveFromCart(@Param("UId") String UId, @Param("GoodsId") String GoodsId);

    int cartGoodsNumDel(@Param("UId") String UId, @Param("GoodsId") String GoodsId);
    int cartGoodsNumPlus(@Param("UId") String UId, @Param("GoodsId") String GoodsId);


    public void delCartAGoods(@Param("GoodsId") String GoodsId,
                                @Param("UId") String UId);

    List<cartGoodsInfo> getMyShoppingCart(@Param("UId") String UId);
}
