package javaeepp.mihuyou.service;

import javaeepp.mihuyou.entity.Goods;
import javaeepp.mihuyou.entity.GoodsTypeInfo;
import javaeepp.mihuyou.mapper.HomeTypesMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GoodsTypeHomeService {
    @Autowired
    private HomeTypesMapper homeTypesMapper;

    public List<GoodsTypeInfo> getType(){
        return  homeTypesMapper.getType();
    }

    public List<Goods> getGoodsByType(String GoodsTypeId){
        return homeTypesMapper.getGoodsByType(GoodsTypeId);
    }

    public List<Goods> getGoodsByKey(String key){
        return homeTypesMapper.getGoodsByKey(key);
    }
}
