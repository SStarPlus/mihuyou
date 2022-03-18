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

    public List<GoodsTypeInfo> getAllGoodsTypeList(){
        return removeGoodsTypeMapper.SelectAllGoodsTypeList();
    }
}
