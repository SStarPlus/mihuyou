package javaeepp.mihuyou.service;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import javaeepp.mihuyou.entity.Goods;
import javaeepp.mihuyou.entity.ResultBean;
import javaeepp.mihuyou.entity.Star;
import javaeepp.mihuyou.mapper.GoodsStarMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
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
    public ResultBean starAGood(HttpServletRequest request, HttpSession session){
        String StarGoodId = request.getParameter("StarGoodId");
        String UID = session.getAttribute("userNum").toString();;
        Date date = new Date();
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println(dateFormat.format(date));
        goodsStarMapper.StarAGood(StarGoodId, dateFormat.format(date), UID);

        return ResultBean.success();
    }
//    取消收藏指定用户的一件指定商品
    public ResultBean cancelStarAGood(HttpServletRequest request, HttpSession session){
        String CancelStarGoodId = request.getParameter("CancelStarGoodId");
        System.out.println(CancelStarGoodId);
        String UID = session.getAttribute("userNum").toString();;
        goodsStarMapper.CancelStarAGood(CancelStarGoodId, UID);

        return ResultBean.success();
    }
//    批量取消指定用户的指定商品
    public ResultBean cancelStarGoods(HttpServletRequest request, HttpSession session){
        String CancelStarGoods = request.getParameter("CancelStarGoodIdList");
        JSONArray jsonCancelStarGoods = JSON.parseArray(CancelStarGoods);

        String UID = session.getAttribute("userNum").toString();

        for (int i = 0; i < jsonCancelStarGoods.size(); i++) {
            goodsStarMapper.CancelStarAGood(jsonCancelStarGoods.get(i).toString(), UID);
        }

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
    //未启用
//    GoodsStarFromDeatil
//    public int GoodsStarFromDetail(String GoodsId,String UId){
//        return goodsStarMapper.GoodsStarFromDetail(GoodsId,UId);
//    }
}
