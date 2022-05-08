package javaeepp.mihuyou.mapper;

import javaeepp.mihuyou.entity.cartGoodsInfo;
import javaeepp.mihuyou.entity.myOrderInfo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface OderCommitMapper {

    public void createOrderFirst(@Param("GoodsId") String GoodsId
                                ,@Param("UId") String UId
                                ,@Param("Time") String time);
    public void addOrderNum();
    public void delGoodsStock(@Param("GoodsId") String GoodsId,
                              @Param("UId") String UId);
    public void changeActFlag(@Param("GoodsId") String GoodsId,
                              @Param("UId") String UId);
    public void changeActFlagFin(@Param("GoodsId") String GoodsId,
                              @Param("UId") String UId);

    //我的订单
    List<myOrderInfo> getMyOrder(@Param("UId") String UId);
    //订单生产界面获取订单中的商品
    List<cartGoodsInfo> showSecondOrder(@Param("UId") String UId);
}
