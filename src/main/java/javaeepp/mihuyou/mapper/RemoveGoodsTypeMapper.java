package javaeepp.mihuyou.mapper;

import javaeepp.mihuyou.entity.GoodsTypeInfo;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface RemoveGoodsTypeMapper {
    List<GoodsTypeInfo> SelectAllGoodsTypeList();
}
