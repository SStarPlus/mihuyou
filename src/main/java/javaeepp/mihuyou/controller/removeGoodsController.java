package javaeepp.mihuyou.controller;

import javaeepp.mihuyou.entity.Goods;
import javaeepp.mihuyou.service.removeGoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
public class removeGoodsController {
    @Autowired
    private removeGoodsService removeGoodsService;


    @RequestMapping("GoodsPullOff")
    public String GoodsPullOff(HttpServletRequest request){
        String GoodsId = request.getParameter("GoodsId");
//        System.out.println(GoodsId);
        int flag = 0;
        flag = removeGoodsService.removeGoods(GoodsId);
        if (flag>0)
            return "redirect:removeGoods";
        else
            return "redirect:removeGoods";

    }
}
