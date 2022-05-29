package javaeepp.mihuyou.service;

import javaeepp.mihuyou.entity.myOrderInfo;
import javaeepp.mihuyou.mapper.UnpaidMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UnpaidService {
    @Autowired
    UnpaidMapper unpaidMapper;

    public List<myOrderInfo> showUnpaid(String UId){
        return unpaidMapper.showUnpaid(UId);
    }
//
//    public void checkUnpaid(String Time){
//
//    }

    public void cancelOrder(String UId, String GoodsId){
        //修改订单状态
        unpaidMapper.cancelOrder(UId,GoodsId);
        //修改购物车内状态
        unpaidMapper.cancelOrderFst(UId,GoodsId);
    }

}
