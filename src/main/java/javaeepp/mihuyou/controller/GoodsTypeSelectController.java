package javaeepp.mihuyou.controller;

import com.sun.org.apache.xpath.internal.operations.Mod;
import javaeepp.mihuyou.service.GoodsTypeHomeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
public class GoodsTypeSelectController {
    @Autowired
    private GoodsTypeHomeService getGoodsTypeHomeService;
//   @RequestMapping("getGoodsTypesHome")
    @RequestMapping("/home")
    public String getGoodsTypesHome(Model model){

        model.addAttribute("GoodsTypesHome", getGoodsTypeHomeService.getType());
//        return "/insertPart/HomeSideBar";

        return "Home";
        //gaizheng
    }

    @RequestMapping("SelectGoodsByType")
    public String SelectGoodsByType(Model model,HttpServletRequest request){
        String GoodsTypeId = request.getParameter("GoodsTypeId");
        System.out.println(GoodsTypeId);

        model.addAttribute("GoodsSelectTypeId" , getGoodsTypeHomeService.getGoodsByType(GoodsTypeId));
        return "SelectGoodsShow";
    }

    @RequestMapping("SelectByKey")
    public String SelectByKey(Model model,HttpServletRequest request){
        String key = request.getParameter("Key");
        System.out.println(key);

        model.addAttribute("GoodsSelectByKey",getGoodsTypeHomeService.getGoodsByKey(key));
        return "SelectGoodsShow";
    }
}
