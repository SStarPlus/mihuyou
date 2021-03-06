package javaeepp.mihuyou.service;

import javaeepp.mihuyou.mapper.AddGoodsTypeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AddGoodsTypeService {
    @Autowired
    AddGoodsTypeMapper addGoodsTypeMapper;
//添加商品类型
    public void AddAGoodsType(int GoodsTypeId, String GoodsTypeName){
        addGoodsTypeMapper.AddAGoodsType(GoodsTypeId, GoodsTypeName);
        addGoodsTypeMapper.AddGoodsTypeFlag(GoodsTypeId);
    }
}
