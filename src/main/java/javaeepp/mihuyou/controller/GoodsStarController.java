package javaeepp.mihuyou.controller;

import javaeepp.mihuyou.entity.Goods;
import javaeepp.mihuyou.exception.ResultBean;
import javaeepp.mihuyou.service.GoodsStarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
public class GoodsStarController {
    @Autowired
    GoodsStarService goodsStarService;

    @RequestMapping("/toStarPage")
    public String toStarPage(HttpServletRequest request, Model model, HttpSession session){
        String UID = session.getAttribute("userNum").toString();
        List<Goods> starGoodsList = goodsStarService.getStarGoodsList(UID);

        model.addAttribute("starGoodsList", starGoodsList);
        return "Star";
    }

    @RequestMapping("/starAGood")
    @ResponseBody
    public ResultBean starAGood(HttpServletRequest request, HttpSession session){
        return goodsStarService.starAGood(request, session);
    }

    @RequestMapping("/cancelStarAGood")
    @ResponseBody
    public ResultBean cancelStarAGood(HttpServletRequest request, HttpSession session){
        return goodsStarService.cancelStarAGood(request, session);
    }

    @RequestMapping("/cancelStarGoods")
    @ResponseBody
    public ResultBean cancelStarGoods(HttpServletRequest request, HttpSession session){
        return goodsStarService.cancelStarGoods(request, session);
    }

}
