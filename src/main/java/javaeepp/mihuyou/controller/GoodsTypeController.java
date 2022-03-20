package javaeepp.mihuyou.controller;

import javaeepp.mihuyou.entity.ResultBean;
import javaeepp.mihuyou.service.AddGoodsTypeService;
import javaeepp.mihuyou.service.RemoveGoodsTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

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

    @RequestMapping("/backInfo")
    @ResponseBody
    public ResultBean backInfo(HttpServletRequest request){
        return ResultBean.success();
    }

    @RequestMapping("/confirmRemoveGoodsType")
    @ResponseBody
    public ResultBean removeGoodsType(HttpServletRequest request){
        int GoodsTypeId = Integer.parseInt(request.getParameter("GoodsTypeId"));
        removeGoodsTypeService.DelAGoodsType(GoodsTypeId);
        return ResultBean.success();
    }
}
