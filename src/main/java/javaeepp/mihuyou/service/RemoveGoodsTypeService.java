package javaeepp.mihuyou.service;

import javaeepp.mihuyou.entity.GoodsTypeInfo;
import javaeepp.mihuyou.mapper.RemoveGoodsTypeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RemoveGoodsTypeService {
    @Autowired
    RemoveGoodsTypeMapper removeGoodsTypeMapper;
//    获取所有未删除商品类型信息
    public List<GoodsTypeInfo> getAllGoodsTypeList(){
        return removeGoodsTypeMapper.SelectAllGoodsTypeList();
    }
//    伪删除指定商品类别
    public void DelAGoodsType(int GoodsTypeId){
        removeGoodsTypeMapper.DelAGoodsType(GoodsTypeId);
    }

    public void EditGoodsType(int GoodsTypeId, String GoodsTypeName){
        removeGoodsTypeMapper.EditGoodsType(GoodsTypeId, GoodsTypeName);
    }
}
