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


    public void changeOrderActFlag(String GoodsId,String UId);


    //报表
    //1.判断是否在该年该月改日已经存在数据  存在则直接update 否则重新insert
    int addToStatementFirst(@Param("GoodsId") String GoodsId,
                            @Param("year") String year,
                            @Param("mon") String mon,
                            @Param("day") String day);

    public void UpdateStatement(@Param("UId") String UId,
                                @Param("GoodsId") String GoodsId,
                                @Param("year") String year,
                                @Param("mon") String mon,
                                @Param("day") String day);
    public void createStatement(@Param("GoodsId") String GoodsId,
                                @Param("UId") String UId,
                                @Param("year") String year,
                                @Param("mon") String mon,
                                @Param("day") String day);
}
