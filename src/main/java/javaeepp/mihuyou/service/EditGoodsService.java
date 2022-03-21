package javaeepp.mihuyou.service;

import javaeepp.mihuyou.mapper.EditGoodsMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EditGoodsService {
    @Autowired
    private EditGoodsMapper editGoodsMapper;

    //修改商品信息
    public void EditGoodsDetail(String GoodsId,String GoodsName,String GoodsType,
                                String GoodsInformation,String GoodsPrice,String GoodsStock ,String GoodsPullOff){
        editGoodsMapper.EditGoods(GoodsId,GoodsName,GoodsType,GoodsInformation,GoodsPrice,GoodsStock ,GoodsPullOff);
    }
}
