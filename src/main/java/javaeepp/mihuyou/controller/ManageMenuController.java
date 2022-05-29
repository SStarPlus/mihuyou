package javaeepp.mihuyou.controller;

import javaeepp.mihuyou.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import sun.security.jgss.GSSCaller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Controller
public class ManageMenuController {
    @Autowired
    RemoveGoodsTypeService removeGoodsTypeService;
    @Autowired
    removeGoodsService removeGoodsService;
    @Autowired
    GoodsDetailShowService goodsDetailShowService;
    @Autowired
    ShoppingCartService shoppingCartService;
    @Autowired
    GoodsStarService goodsStarService;

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
        String GoodsPictureString = request.getParameter("GoodsPictureString");
        System.out.println(GoodsPictureString);

        model.addAttribute("GoodsId",GoodsId);
        model.addAttribute("GoodsName",GoodsName);
        model.addAttribute("GoodsType",GoodsType);
        model.addAttribute("GoodsInformation",GoodsInformation);
        model.addAttribute("GoodsPrice",GoodsPrice);
        model.addAttribute("GoodsStock", GoodsStock);
        model.addAttribute("GoodsPullOff",GoodsPullOff);
        model.addAttribute("GoodsPictureString",GoodsPictureString);
        return "EditGoods";
    }

//    @RequestMapping("/home")
//    public String ShowHome(){
//        return "redirect:getGoodsTypesHome";
//    }
    
    @RequestMapping("ShowGoodsDetail")
    public String ShowGoodsDetail(HttpSession session, HttpServletRequest request, Model model){
        String GoodsId = request.getParameter("GoodsId");
//        String UId = session.getAttribute("userNum").toString();
//        int flag = 0;
//        String HON;
//        flag = goodsStarService.GoodsStarFromDetail(GoodsId,UId);
//        if (flag>0){
//            HON = ""
//        }
//        else {
//
//        }
        //获取详情界面需要显示的值
        model.addAttribute("Goods" , goodsDetailShowService.getGoodsDetail(GoodsId));
        System.out.println(GoodsId);
        return "GoodsDetail";
    }
    //购物车内物品显示
    //在HomeHeadBar进入
    @RequestMapping("toMyShoppingCart")
    public String showMyShoppingCart(HttpSession session,HttpServletRequest request , Model model){
        String UId = session.getAttribute("userNum").toString();
        System.out.println(UId);

        model.addAttribute("cartGoods",shoppingCartService.getMyShoppingCart(UId));
        return "myShoppingCart";
    }

}
