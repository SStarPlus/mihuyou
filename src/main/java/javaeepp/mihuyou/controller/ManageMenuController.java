package javaeepp.mihuyou.controller;

import javaeepp.mihuyou.service.AddGoodsTypeService;
import javaeepp.mihuyou.service.RemoveGoodsTypeService;
import javaeepp.mihuyou.service.removeGoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import sun.security.jgss.GSSCaller;

import javax.servlet.http.HttpServletRequest;

@Controller
public class ManageMenuController {
    @Autowired
    RemoveGoodsTypeService removeGoodsTypeService;
    @Autowired
    removeGoodsService removeGoodsService;

    @RequestMapping("manageMenu")
    public String toManageMenu(Model model){
        model.addAttribute("path", "这是路径");
        return "manageMenu";
    }

    @RequestMapping("/addGoodsType")
    public String toAddGoodsType(){
        return "addGoodsType";
    }

    @RequestMapping("/removeGoodsType")
    public String toRemoveGoodsType(Model model){


        model.addAttribute("GoodsTypeList", removeGoodsTypeService.getAllGoodsTypeList());
        model.addAttribute("testTxt", "这是测试文本");
        return "removeGoodsType";
    }



    @RequestMapping("AddGoods")
    public String AddGoods(Model model){
        return "addGoods";
    }
    
    @RequestMapping("removeGoods")
    public String removeGoods(Model model){
        model.addAttribute("Goods",removeGoodsService.getGoodsDetail());
        return "removeGoods";
    }

    @RequestMapping("GoodsEdit")
    public String ShowEditGoods(Model model,HttpServletRequest request){
        String GoodsId = request.getParameter("GoodsId");
        String GoodsName = request.getParameter("GoodsName");
        String GoodsType = request.getParameter("GoodsType");
        String GoodsInformation = request.getParameter("GoodsInformation");
        String GoodsPrice = request.getParameter("GoodsPrice");
        String GoodsStock = request.getParameter("GoodsStock");
        String GoodsPullOff = request.getParameter("GoodsPullOff");
//        System.out.println(GoodsId);

        model.addAttribute("GoodsId",GoodsId);
        model.addAttribute("GoodsName",GoodsName);
        model.addAttribute("GoodsType",GoodsType);
        model.addAttribute("GoodsInformation",GoodsInformation);
        model.addAttribute("GoodsPrice",GoodsPrice);
        model.addAttribute("GoodsStock", GoodsStock);
        model.addAttribute("GoodsPullOff",GoodsPullOff);
        return "EditGoods";
    }

//    @RequestMapping("/home")
//    public String ShowHome(){
//        return "redirect:getGoodsTypesHome";
//    }
}
