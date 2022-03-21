package javaeepp.mihuyou.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface EditGoodsMapper {
    //修改商品信息
    void EditGoods(String GoodsId,String GoodsName,String GoodsType,
                   String GoodsInformation,String GoodsPrice,String GoodsStock ,String GoodsPullOff);
}
