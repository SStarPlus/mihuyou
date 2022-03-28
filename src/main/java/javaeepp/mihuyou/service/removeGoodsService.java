package javaeepp.mihuyou.service;

import javaeepp.mihuyou.entity.Goods;
import javaeepp.mihuyou.mapper.removeGoodsMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class removeGoodsService {
    @Autowired
    private removeGoodsMapper removeGoodsMapper;

    //获取商品列表
    public List<Goods> getGoodsDetail (){
        List<Goods> goods_detail = null;
        goods_detail = removeGoodsMapper.getGoodsDetail();
        return goods_detail;
    }
    //删除商品
    public int removeGoods(String GoodsId){
//        System.out.println("2"+GoodsId);
        int flag = removeGoodsMapper.removeGoods(GoodsId);
        return flag;
    }

    //获取一个商品图片信息
    public List<Goods> getAGoodPicture(String GoodsId){
        return removeGoodsMapper.getAGoodPicture(GoodsId);
    }
}
