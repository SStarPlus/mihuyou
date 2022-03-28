package javaeepp.mihuyou.mapper;

import javaeepp.mihuyou.entity.Goods;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface GoodsAddMapper {
    //添加新商品
    int AddGoods(@Param("GoodsAdd") Goods goods,String GoodsId, String GoodsName,
                 String GoodsType, String GoodsInformation, String GoodsPrice, String GoodsStock);
    //添加新商品图片
    void AddGoodsPicture(@Param("GoodsId") String GoodsId,
                    @Param("GoodsPictureString") String GoodsPictureString);
}
