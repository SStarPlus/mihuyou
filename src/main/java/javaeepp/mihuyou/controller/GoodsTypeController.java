package javaeepp.mihuyou.controller;

import javaeepp.mihuyou.exception.ResultBean;
import javaeepp.mihuyou.exception.SDException;
import javaeepp.mihuyou.service.AddGoodsTypeService;
import javaeepp.mihuyou.service.RemoveGoodsTypeService;
import org.apache.ibatis.javassist.NotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

@Controller
public class GoodsTypeController {
    @Autowired
    AddGoodsTypeService addGoodsTypeService;

    @Autowired
    RemoveGoodsTypeService removeGoodsTypeService;

    //添加商品类别
    @RequestMapping("confirmAddGoodsType")
    public String confirmAddGoodsType(HttpServletRequest request){
        String GoodsTypeId = request.getParameter("GoodsTypeId");
        String GoodsTypeName = request.getParameter("GoodsTypeName");

        addGoodsTypeService.AddAGoodsType(Integer.parseInt(GoodsTypeId), GoodsTypeName);
        return "addGoodsType";
    }
//    测试,无用
    @RequestMapping("/backInfo")
    @ResponseBody
    public ResultBean backInfo(HttpServletRequest request){
        return ResultBean.success();
    }
//    删除商品类型
    @RequestMapping("/confirmRemoveGoodsType")
    @ResponseBody
    public ResultBean removeGoodsType(HttpServletRequest request, Model model){
        int GoodsTypeId = Integer.parseInt(request.getParameter("GoodsTypeId"));
        removeGoodsTypeService.DelAGoodsType(GoodsTypeId);

        model.addAttribute("GoodsTypeList", removeGoodsTypeService.getAllGoodsTypeList());
        return ResultBean.success();
    }
//    完成操作后更新商品类型信息
    @RequestMapping("updateGoodsTypeList")
    public String updateGoodsTypeList(Model model){
        model.addAttribute("GoodsTypeList", removeGoodsTypeService.getAllGoodsTypeList());

        return "removeGoodsType::goodsTypeListFragment";
    }
//    修改商品信息
    @RequestMapping("/confirmEditGoodsType")
    @ResponseBody
    public ResultBean confirmEditGoodsType(HttpServletRequest request){
        int GoodsTypeId = Integer.parseInt(request.getParameter("GoodsTypeId"));
        String GoodsTypeName = request.getParameter("GoodsTypeName");
        System.out.println(GoodsTypeId);
        System.out.println(GoodsTypeName);
        removeGoodsTypeService.EditGoodsType(GoodsTypeId, GoodsTypeName);

        return ResultBean.success();
    }

    @RequestMapping("/testEx")
    public String testEx() throws IOException, NotFoundException {
        throw new NotFoundException("123");
//        return "addGoodsType";
    }
}
