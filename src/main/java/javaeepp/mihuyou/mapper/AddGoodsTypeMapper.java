package javaeepp.mihuyou.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface AddGoodsTypeMapper {
    void AddAGoodsType(@Param("GoodsTypeId") int GoodsTypeId,
                       @Param("GoodsTypeName") String GoodsTypeName);

    void AddGoodsTypeFlag(@Param("GoodsTypeId") int GoodsTypeId);
}
