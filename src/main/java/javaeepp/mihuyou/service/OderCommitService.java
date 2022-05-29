package javaeepp.mihuyou.service;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONPObject;
import javaeepp.mihuyou.entity.ResultBean;
import javaeepp.mihuyou.entity.cartGoodsInfo;
import javaeepp.mihuyou.entity.myOrderInfo;
import javaeepp.mihuyou.mapper.OderCommitMapper;
import jdk.management.resource.internal.inst.FileOutputStreamRMHooks;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Service;

import javax.print.DocFlavor;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.Calendar;
import java.util.List;

@Service
public class OderCommitService {
    @Autowired
    OderCommitMapper oderCommitMapper;

//    public ResultBean createOrderFirst(HttpServletRequest request, HttpSession session,String time){
//        String GoodsId = request.getParameter("GoodsIdToOrder");
//        JSONArray jsonGoodsIdToOrder = JSON.parseArray(GoodsId);
//
//        String UId = session.getAttribute("userNum").toString();
//        for (int i = 0; i < jsonGoodsIdToOrder.size(); i++) {
//            //生成订单
////            oderCommitMapper.createOrderFirst(jsonGoodsIdToOrder.get(i).toString(),UId,time);
////            //订单号生成
////            oderCommitMapper.addOrderNum();
////            //库存变化
////            oderCommitMapper.delGoodsStock(jsonGoodsIdToOrder.get(i).toString(),UId);
////            //购物车显示变化，actFlag值变化从而影响购物车显示
//            oderCommitMapper.changeActFlag(jsonGoodsIdToOrder.get(i).toString(),UId);
//        }
//        return ResultBean.success();
//    }

    public String createOrderFirst(HttpServletRequest request, HttpSession session,String time){
        String GoodsId = request.getParameter("GoodsIdToOrder");
        JSONArray jsonGoodsIdToOrder = JSON.parseArray(GoodsId);

        String UId = session.getAttribute("userNum").toString();
        for (int i = 0; i < jsonGoodsIdToOrder.size(); i++) {
            //            生成订单
            oderCommitMapper.createOrderFirst(jsonGoodsIdToOrder.get(i).toString(),UId,time);
            //订单号生成
            oderCommitMapper.addOrderNum();
            //库存变化
            oderCommitMapper.delGoodsStock(jsonGoodsIdToOrder.get(i).toString(),UId);
            //购物车显示变化，actFlag值变化从而影响购物车显示
            oderCommitMapper.changeActFlag(jsonGoodsIdToOrder.get(i).toString(),UId);
        }
        String flag = "1";
        return flag;
    }



    public String createOrderFinally(HttpServletRequest request, HttpSession session,String time){
        String GoodsId = request.getParameter("GoodsIdToOrderFin");
        JSONArray jsonGoodsIdToOrder = JSON.parseArray(GoodsId);
        //报表
        Calendar date = Calendar.getInstance();
        String year = String.valueOf(date.get(Calendar.YEAR));
        String mon = String.valueOf(date.get(Calendar.MONTH)+1);
        String day = String.valueOf(date.get(Calendar.DATE));
        //

        String UId = session.getAttribute("userNum").toString();
        for (int i = 0; i < jsonGoodsIdToOrder.size(); i++) {
            System.out.println("*******************");
            System.out.println(jsonGoodsIdToOrder.get(i).toString());
            System.out.println("*******************");

            int IfExistFlag  = 0;
            IfExistFlag = oderCommitMapper.addToStatementFirst(jsonGoodsIdToOrder.get(i).toString(),year,mon,day);
            if (IfExistFlag != 0){
                System.out.println("act");
                oderCommitMapper.UpdateStatement(UId,jsonGoodsIdToOrder.get(i).toString(),year,mon,day);
            }else {
                oderCommitMapper.createStatement(jsonGoodsIdToOrder.get(i).toString(),UId,year,mon,day);
            }


            oderCommitMapper.changeActFlagFin(jsonGoodsIdToOrder.get(i).toString(),UId);

            oderCommitMapper.changeOrderActFlag(jsonGoodsIdToOrder.get(i).toString(),UId);

        }
//        for (int i = 0; i < jsonGoodsIdToOrder.size(); i++) {
//            int IfExistFlag  = 0;
//            GoodsId = jsonGoodsIdToOrder.getString(i);
//            System.out.println("*********************************************************");
//            System.out.println(jsonGoodsIdToOrder.getString(i));
//
//            System.out.println("*********************************************************");
//
//            IfExistFlag = oderCommitMapper.addToStatementFirst(GoodsId,year,mon,day);
//            //报表增加
//            System.out.println(IfExistFlag);
//            if (IfExistFlag != 0){
//                System.out.println("act");
//                oderCommitMapper.UpdateStatement(UId,GoodsId,year,mon,day);
//            }else {
//                oderCommitMapper.createStatement(GoodsId,year,mon,day);
//            }
//        }
        String flag = "1";
        return flag;
    }
    //获取我的订单界面
    public List<myOrderInfo> getMyOrder(String UId){
        return oderCommitMapper.getMyOrder(UId);
    }


    public List<cartGoodsInfo> showSecondOrder(String UId){
        return oderCommitMapper.showSecondOrder(UId);
    }
}
