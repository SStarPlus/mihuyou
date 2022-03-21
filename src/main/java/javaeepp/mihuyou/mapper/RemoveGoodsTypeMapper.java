package javaeepp.mihuyou.mapper;

import javaeepp.mihuyou.entity.GoodsTypeInfo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface RemoveGoodsTypeMapper {
//    获取所有未删除商品类型
    List<GoodsTypeInfo> SelectAllGoodsTypeList();
//    伪删除指定商品类别
    void DelAGoodsType(@Param("GoodsTypeId") int GoodsTypeId);
//    编辑指定商品类别
    void EditGoodsType(@Param("GoodsTypeId") int GoodsTypeId,
                       @Param("GoodsTypeName") String GoodsTypeName);
}
