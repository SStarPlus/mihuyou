package javaeepp.mihuyou.mapper;

import javaeepp.mihuyou.entity.Goods;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface GoodsAddMapper {
    int AddGoods(@Param("GoodsAdd") Goods goods,String GoodsId, String GoodsName, String GoodsType, String GoodsInformation, String GoodsPrice, String GoodsStock);
}
