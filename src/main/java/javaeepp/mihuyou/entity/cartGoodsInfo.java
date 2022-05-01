package javaeepp.mihuyou.entity;

public class cartGoodsInfo {
    private String GoodsId;
    private String GoodsInformation;
    private String GoodsName;
    private double GoodsPrice;
    private String GoodsPictureString;
    private int GoodsNum;
    private String UId;

    private double total;

    public String getGoodsId() {
        return GoodsId;
    }

    public void setGoodsId(String goodsId) {
        GoodsId = goodsId;
    }

    public String getGoodsInformation() {
        return GoodsInformation;
    }

    public void setGoodsInformation(String goodsInformation) {
        GoodsInformation = goodsInformation;
    }

    public String getGoodsName() {
        return GoodsName;
    }

    public void setGoodsName(String goodsName) {
        GoodsName = goodsName;
    }

    public double getGoodsPrice() {
        return GoodsPrice;
    }

    public void setGoodsPrice(double goodsPrice) {
        GoodsPrice = goodsPrice;
    }

    public String getGoodsPictureString() {
        return GoodsPictureString;
    }

    public void setGoodsPictureString(String goodsPictureString) {
        GoodsPictureString = goodsPictureString;
    }

    public int getGoodsNum() {
        return GoodsNum;
    }

    public void setGoodsNum(int goodsNum) {
        GoodsNum = goodsNum;
    }

    public String getUId() {
        return UId;
    }

    public void setUId(String UId) {
        this.UId = UId;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }
//    SELECT g.GoodsId,g.GoodsInformation,g.GoodsName,g.GoodsPrice,gp.GoodsPictureString,sc.GoodsNum,SC.UId
}
