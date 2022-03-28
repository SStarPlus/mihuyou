package javaeepp.mihuyou.controller;

import javaeepp.mihuyou.service.EditGoodsService;
import javaeepp.mihuyou.service.RemoveGoodsTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
public class EditGoodsController {
    @Autowired
    private EditGoodsService editGoodsService;

    @Autowired
    private RemoveGoodsTypeService removeGoodsTypeService;
//修改商品信息
    @RequestMapping("EditGoods")
    public String EditGoods(HttpServletRequest request){
        String GoodsId = request.getParameter("GoodsId");
        String GoodsName = request.getParameter("GoodsName");
        String GoodsType = request.getParameter("GoodsType");
        String GoodsInformation = request.getParameter("GoodsInformation");
        String GoodsPrice = request.getParameter("GoodsPrice");
        String GoodsStock = request.getParameter("GoodsStock");
        String GoodsPullOff = request.getParameter("GoodsPullOff");
//        System.out.println(GoodsId);
        System.out.println("进入修改");
        editGoodsService.EditGoodsDetail(GoodsId,GoodsName,GoodsType,GoodsInformation,GoodsPrice,GoodsStock ,GoodsPullOff);
        return "redirect:removeGoods";
    }
}
