package javaeepp.mihuyou.controller;

import javaeepp.mihuyou.service.GoodsRecommendService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class GoodsRecommendController {
    @Autowired
    private GoodsRecommendService goodsRecommendService;

//    @RequestMapping("GetRecommend")
//    public String GetRecommend(){
//        String UId = "admin";
//        goodsRecommendService.getData(UId);
//
//        return "Home2";
//    }
//    @RequestMapping("GetRecommend")
//    public String GetRecommend(Model model){
//        String UId = "admin";
//
//        model.addAttribute("Goods",goodsRecommendService.getData(UId));
//        return "Home2";
//    }
}
