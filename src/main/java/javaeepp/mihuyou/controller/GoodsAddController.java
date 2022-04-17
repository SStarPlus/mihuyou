package javaeepp.mihuyou.controller;

import javaeepp.mihuyou.Util.DateUtil;
import javaeepp.mihuyou.entity.Goods;
import javaeepp.mihuyou.service.GoodsAddService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
public class GoodsAddController {
    DateUtil dateUtil;

    @Autowired
    private GoodsAddService goodsAddService;

//添加商品
    @RequestMapping("GoodsAdd")
    public String GoodsAdd(HttpServletRequest request , Model model, Goods goods){
        String GoodsId = request.getParameter("GoodsId");
        String GoodsName = request.getParameter("GoodsName");
        String GoodsType = request.getParameter("GoodsType");
        String GoodsInformation = request .getParameter("GoodsInformation");
        String GoodsPrice = request.getParameter("GoodsPrice");
        String GoodsStock = request.getParameter("GoodsStock");

//        System.out.println(GoodsId+"||"+GoodsName+"||"+GoodsType+"||"+GoodsInformation+"||"+GoodsPrice+"||"+GoodsStock);

        int flag = 0;
        flag = goodsAddService.addGoods(goods , GoodsId,GoodsName,GoodsType,GoodsInformation,GoodsPrice,GoodsStock,request);
        if (flag>0){
            return "redirect:AddGoods";
        }else
            return "redirect:AddGoods";
    }

}
