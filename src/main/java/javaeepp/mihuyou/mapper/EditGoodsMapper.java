package javaeepp.mihuyou.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface EditGoodsMapper {
    void EditGoods(String GoodsId,String GoodsName,String GoodsType,String GoodsInformation,String GoodsPrice,String GoodsStock ,String GoodsPullOff);
}
