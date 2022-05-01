package javaeepp.mihuyou.service;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import javaeepp.mihuyou.controller.ShoppingCartController;
import javaeepp.mihuyou.entity.ResultBean;
import javaeepp.mihuyou.entity.cartGoodsInfo;
import javaeepp.mihuyou.mapper.ShoppingCartMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;

@Service
public class ShoppingCartService {
    @Autowired
    ShoppingCartMapper shoppingCartMapper;


    public int checkGoodsIfExist(String GoodsId ,String UId){
        int flag = shoppingCartMapper.CheckGoodsIfExist(GoodsId,UId);
        return flag;
    }

    public int insertGoods(String GoodsId,String UId,String Num){
        int flag = shoppingCartMapper.insertGoods(GoodsId,UId,Num);
        return flag;
    }

    public int updateGoodsNum(String GoodsId,String UId,String Num){
        int flag = shoppingCartMapper.updateGoodsNum(GoodsId,UId,Num);
        return flag;
    }

    public List<cartGoodsInfo> getMyShoppingCart(String UId){
        return shoppingCartMapper.getMyShoppingCart(UId);
    }

    public int simRemoveFromCart(String UId,String GoodsId){
        int flag = shoppingCartMapper.simRemoveFromCart(UId,GoodsId);
        return flag;
    }

    public int cartGoodsNumDel(String UId,String GoodsId){
        int flag = shoppingCartMapper.cartGoodsNumDel(UId,GoodsId);
        return flag;
    }

    public int cartGoodsNumPlus (String UId,String GoodsId) {
        int flag = shoppingCartMapper.cartGoodsNumPlus(UId, GoodsId);
        return flag;
    }


    public ResultBean delCartAGoods(HttpServletRequest request, HttpSession session){
        String delCartAGoods = request.getParameter("delCartGoodsList");
        JSONArray jsonCancelStarGoods = JSON.parseArray(delCartAGoods);
        String UID = session.getAttribute("userNum").toString();
        for (int i = 0; i < jsonCancelStarGoods.size(); i++) {
            System.out.println(jsonCancelStarGoods.get(i).toString());
            System.out.println(UID);
            shoppingCartMapper.delCartAGoods(jsonCancelStarGoods.get(i).toString(),UID);
        }

        return ResultBean.success();
    }
}
