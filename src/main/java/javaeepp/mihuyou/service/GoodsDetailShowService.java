package javaeepp.mihuyou.service;

import javaeepp.mihuyou.entity.Goods;
import javaeepp.mihuyou.mapper.GoodsDetailShowMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GoodsDetailShowService {
    @Autowired
    private GoodsDetailShowMapper goodsDetailShowMapper;

    public List<Goods> getGoodsDetail(String GoodsId){
        return goodsDetailShowMapper.getGoodsDetail(GoodsId);
    }
}
