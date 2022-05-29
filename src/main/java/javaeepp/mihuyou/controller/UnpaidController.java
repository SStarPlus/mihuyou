package javaeepp.mihuyou.controller;

import javaeepp.mihuyou.service.UnpaidService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.sql.Timestamp;
import java.util.Date;

@Controller
public class UnpaidController {
    @Autowired
    UnpaidService unpaidService;
    @RequestMapping("showUnpaid")
    public String showUnpaid(HttpSession session,Model model){
        String UId = session.getAttribute("userNum").toString();

        String Time = new Timestamp(new Date().getTime()).toString();

//        unpaidService.checkUnpaid(Time);

        model.addAttribute("unpaid",unpaidService.showUnpaid(UId));

        return "Unpaid";
    }
    @RequestMapping("cancelOrder")
    public String ShowUnpaidHt(HttpServletRequest request , HttpSession session,Model model){
        String UId = session.getAttribute("userNum").toString();
        String GoodsId = request.getParameter("GoodsId");
        unpaidService.cancelOrder(UId,GoodsId);

        return "redirect:showUnpaid";
    }

    @RequestMapping("PayForOrder")
    public String PayForOrder(HttpServletRequest request , HttpSession session ){
        String UId = session.getAttribute("userNum").toString();
        String GoodsId = request.getParameter("GoodsId");


        return "redirect:Index/Pay";
    }


}
