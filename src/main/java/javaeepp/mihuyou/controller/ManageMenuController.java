package javaeepp.mihuyou.controller;

import javaeepp.mihuyou.service.AddGoodsTypeService;
import javaeepp.mihuyou.service.RemoveGoodsTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
public class ManageMenuController {
    @Autowired
    RemoveGoodsTypeService removeGoodsTypeService;

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
        return "removeGoodsType";
    }
}
