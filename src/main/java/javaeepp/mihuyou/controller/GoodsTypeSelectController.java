package javaeepp.mihuyou.controller;

import com.sun.org.apache.xpath.internal.operations.Mod;
import javaeepp.mihuyou.entity.Goods;
import javaeepp.mihuyou.service.GoodsRecommendService;
import javaeepp.mihuyou.service.GoodsTypeHomeService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
public class GoodsTypeSelectController {
    @Autowired
    private GoodsRecommendService goodsRecommendService;
    @Autowired
    private GoodsTypeHomeService getGoodsTypeHomeService;
//   @RequestMapping("getGoodsTypesHome")
    @RequestMapping("/home")
    public String getGoodsTypesHome(Model model,HttpSession session){
        String UId = session.getAttribute("userNum").toString();
        List<Goods> list = getGoodsTypeHomeService.getGoodsByType("2001");
        System.out.println("list.size="+list.size());

        model.addAttribute("GoodsTypesHome", getGoodsTypeHomeService.getType());

        model.addAttribute("GoodsSelectTypeId" , getGoodsTypeHomeService.getGoodsByType("2001"));
//        return "/insertPart/HomeSideBar";

        model.addAttribute("GoodsRecommend",goodsRecommendService.getData(UId));
        model.addAttribute("GoodsRecommend5",goodsRecommendService.getData2(UId));
        return "Home2";
    }

    @RequestMapping("SelectGoodsByType")
    public String SelectGoodsByType(Model model, HttpServletRequest request, HttpSession session){
        String GoodsTypeId = request.getParameter("GoodsTypeId");
//        System.out.println(GoodsTypeId);
        String UID = session.getAttribute("userNum").toString();
        System.out.println(UID);
        model.addAttribute("GoodsSelectTypeId" , getGoodsTypeHomeService.getGoodsByType(GoodsTypeId));

        int flag = getGoodsTypeHomeService.getGoodsByType(GoodsTypeId).size();


        if (flag>0) {
            return "SelectGoodsShow";
        }
        else {
            return "NotFindGoods";
        }
    }

    @RequestMapping("SelectByKey")
    public String SelectByKey(Model model,HttpServletRequest request){
        String key = request.getParameter("Key");
        System.out.println(key);

        model.addAttribute("GoodsSelectByKey",getGoodsTypeHomeService.getGoodsByKey(key));


        int flag = getGoodsTypeHomeService.getGoodsByKey(key).size();
        if (flag <= 0){
            return "NotFindGoods";
        }else {
            return "SelectGoodsShow";
        }
    }
}
