package javaeepp.mihuyou.controller;

import javaeepp.mihuyou.entity.Goods;
import javaeepp.mihuyou.entity.ResultBean;
import javaeepp.mihuyou.service.GoodsStarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
public class GoodsStarController {
    @Autowired
    GoodsStarService goodsStarService;

    @RequestMapping("/toStarPage")
    public String toStarPage(HttpServletRequest request, Model model){
        List<Goods> starGoodsList = goodsStarService.getStarGoodsList("10001");

        model.addAttribute("starGoodsList", starGoodsList);
        return "Star";
    }

    @RequestMapping("/starAGood")
    @ResponseBody
    public ResultBean starAGood(HttpServletRequest request){
        return goodsStarService.starAGood(request);
    }

    @RequestMapping("/cancelStarAGood")
    @ResponseBody
    public ResultBean cancelStarAGood(HttpServletRequest request){
        return goodsStarService.cancelStarAGood(request);
    }
}
