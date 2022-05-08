package javaeepp.mihuyou.controller;

import javaeepp.mihuyou.entity.ResultBean;
import javaeepp.mihuyou.service.OderCommitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.sql.Timestamp;
import java.util.Date;
import java.util.jar.Attributes;

@Controller
public class OrderCommitController {
    @Autowired
    OderCommitService oderCommitService;

//    @RequestMapping("pushOrderFst")
//    @ResponseBody
//    public ResultBean pushOrderFst(HttpServletRequest request, HttpSession session, Model model){
//        String Time = new Timestamp(new Date().getTime()).toString();
//        return oderCommitService.createOrderFirst(request, session,Time);
//    }
    @RequestMapping("pushOrderFst")
    public String pushOrderFst(HttpServletRequest request, HttpSession session, Model model, RedirectAttributes attributes){
//        String Time = new Timestamp(new Date().getTime()).toString();
        oderCommitService.createOrderFirst(request,session);
        String UId = session.getAttribute("userNum").toString();

        attributes.addAttribute("UId",UId);

        return "redirect:showSecondOrder";
    }

    @RequestMapping("pushOrderFinally")
    public String pushOrderFinally(HttpServletRequest request,HttpSession session,Model model , RedirectAttributes attributes){
        String UId = request.getParameter("UID");
        String Time = new Timestamp(new Date().getTime()).toString();

        oderCommitService.createOrderFinally(request, session,Time);
        return "redirect:toMyShoppingCart";
    }

    @RequestMapping("showSecondOrder")
    public String showSecondOrder(HttpServletRequest request , Model model,HttpSession session, RedirectAttributes attributes){
        String UId = session.getAttribute("userNum").toString();

        model.addAttribute("cartGoods",oderCommitService.showSecondOrder(UId));
        return "showDetailOrder";
    }

    @RequestMapping("ShowOrder")
    public String ShowOrder(HttpServletRequest request,Model model,HttpSession session){
        String UId = session.getAttribute("userNum").toString();
        System.out.println(UId);

        model.addAttribute("OrderGoods",oderCommitService.getMyOrder(UId));
        return "showOrderDetail";
    }
}
