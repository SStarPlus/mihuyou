package javaeepp.mihuyou.service;

import javaeepp.mihuyou.entity.Goods;
import javaeepp.mihuyou.entity.ResultBean;
import javaeepp.mihuyou.entity.Star;
import javaeepp.mihuyou.mapper.GoodsStarMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.List;

@Service
public class GoodsStarService {
    @Autowired
    GoodsStarMapper goodsStarMapper;
//    收藏指定用户的一件指定商品
    public ResultBean starAGood(HttpServletRequest request){
        String StarGoodId = request.getParameter("StarGoodId");
        String UID = "10001";
        Date date = new Date();
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println(dateFormat.format(date));
        goodsStarMapper.StarAGood(StarGoodId, dateFormat.format(date), UID);

        return ResultBean.success();
    }
//    取消收藏指定用户的一件指定商品
    public ResultBean cancelStarAGood(HttpServletRequest request){
        String CancelStarGoodId = request.getParameter("CancelStarGoodId");
        System.out.println(CancelStarGoodId);
        String UID = "10001";
        goodsStarMapper.CancelStarAGood(CancelStarGoodId, UID);

        return ResultBean.success();
    }

//    获取指定用户收藏的商品
    public List<Goods> getStarGoodsList(String UID){
        List<Star> starList = goodsStarMapper.GetStarGoodsInfoByUID(UID);
        int[] goodsIdList = new int[starList.size()];
        for (int i = 0; i < goodsIdList.length; i++) {
            goodsIdList[i] = starList.get(i).getStarGoodsId();
        }

        if(goodsIdList.length <= 0){
            List<Goods> emptyList = Collections.emptyList();
            return emptyList;
        }

        return goodsStarMapper.GetGoodsByGoodsId(goodsIdList);
    }
}
