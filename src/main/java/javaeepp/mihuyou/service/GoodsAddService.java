package javaeepp.mihuyou.service;

import javaeepp.mihuyou.entity.Goods;
import javaeepp.mihuyou.mapper.GoodsAddMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sun.swing.plaf.GTKKeybindings;

@Service
public class GoodsAddService {
    @Autowired
    private GoodsAddMapper goodsAddMapper;
    public int addGoods(Goods goods, String GoodsId, String GoodsName, String GoodsType, String GoodsInformation, String GoodsPrice, String GoodsStock){
        int flag = goodsAddMapper.AddGoods(goods,GoodsId,GoodsName, GoodsType,GoodsInformation,GoodsPrice,GoodsStock);
        return flag;
    }
}
