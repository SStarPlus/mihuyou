package javaeepp.mihuyou.mapper;

import javaeepp.mihuyou.entity.myOrderInfo;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;
@Mapper
@Repository
public interface UnpaidMapper {
        List<myOrderInfo> showUnpaid(String UId);
        void cancelOrder(String UId,String GoodsId);
        void cancelOrderFst(String UId,String GoodsId);
}
