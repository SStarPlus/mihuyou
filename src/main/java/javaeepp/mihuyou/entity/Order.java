package javaeepp.mihuyou.entity;

import java.sql.Date;

public class Order {
    private String GoodsId;
    private int GoodsNum;
    private Double GoodsPrice;
    private String OrderNumber;
    private Date CreateDate;
    private double TotalPrice;

    public String getGoodsId() {
        return GoodsId;
    }

    public void setGoodsId(String goodsId) {
        GoodsId = goodsId;
    }

    public int getGoodsNum() {
        return GoodsNum;
    }

    public void setGoodsNum(int goodsNum) {
        GoodsNum = goodsNum;
    }

    public Double getGoodsPrice() {
        return GoodsPrice;
    }

    public void setGoodsPrice(Double goodsPrice) {
        GoodsPrice = goodsPrice;
    }

    public String getOrderNumber() {
        return OrderNumber;
    }

    public void setOrderNumber(String orderNumber) {
        OrderNumber = orderNumber;
    }

    public Date getCreateDate() {
        return CreateDate;
    }

    public void setCreateDate(Date createDate) {
        CreateDate = createDate;
    }

    public double getTotalPrice() {
        return TotalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        TotalPrice = totalPrice;
    }
}
