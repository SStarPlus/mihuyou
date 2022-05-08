package javaeepp.mihuyou.controller;

import javaeepp.mihuyou.exception.ResultBean;
import javaeepp.mihuyou.service.ShoppingCartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Controller
public class ShoppingCartController {
    @Autowired
    ShoppingCartService shoppingCartService;

    //加入购物车 判断是否已存在
    @RequestMapping("ATShopCart")
    @ResponseBody
    public String AddToShoppingCart(HttpSession session , HttpServletRequest request, Model model , RedirectAttributes redirectAttributes){
        String UID = session.getAttribute("userNum").toString();

        System.out.println("UID:"+UID);
        String GoodsId = request.getParameter("GoodsId");
        System.out.println("GoodsId"+GoodsId);
        String Num = request.getParameter("Num");
        System.out.println("Num"+Num);
        int flag = 0;
        flag = shoppingCartService.checkGoodsIfExist(GoodsId,UID);

        if (flag==0){
            flag = shoppingCartService.insertGoods(GoodsId,UID , Num);
        }else {
            flag = shoppingCartService.updateGoodsNum(GoodsId , UID,Num);
        }
        redirectAttributes.addAttribute("GoodsId",GoodsId);
        redirectAttributes.addAttribute("UId",UID);
        return "redirect:ShowGoodsDetail";
    }

    @RequestMapping("SimRemoveFromCart")
    public String SimRemoveFromCart(HttpSession session,HttpServletRequest request ,RedirectAttributes redirectAttributes){
        String UId = session.getAttribute("userNum").toString();
        String GoodsId = request.getParameter("GoodsId");

        shoppingCartService.simRemoveFromCart(UId,GoodsId);
        redirectAttributes.addAttribute("UId",UId);
        return "redirect:toMyShoppingCart";
    }

    @RequestMapping("CartGoodsNumDel")
    public String CartGoodsNumDel(HttpSession session, HttpServletRequest request,RedirectAttributes redirectAttributes){
        String UId = session.getAttribute("userNum").toString();
        String GoodsId = request.getParameter("GoodsId");

        shoppingCartService.cartGoodsNumDel(UId,GoodsId);

        redirectAttributes.addAttribute("UId",UId);
        return "redirect:toMyShoppingCart";
    }

    @RequestMapping("CartGoodsNumPlus")
    public String CartGoodsNumPlus(HttpSession session, HttpServletRequest request,RedirectAttributes redirectAttributes){
        String UId = session.getAttribute("userNum").toString();
        String GoodsId = request.getParameter("GoodsId");

        shoppingCartService.cartGoodsNumPlus(UId,GoodsId);

        redirectAttributes.addAttribute("UId",UId);
        return "redirect:toMyShoppingCart";
    }

    @RequestMapping("delCartAGoods")
    @ResponseBody
    public ResultBean delCartAGoods(HttpServletRequest request, HttpSession session){
        return shoppingCartService.delCartAGoods(request, session);
    }

}
