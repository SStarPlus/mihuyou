package javaeepp.mihuyou.entity;

public class Goods {
    private String GoodsId;
    private String GoodsName;
    private String GoodsType;
    private String GoodsInformation;
    private String GoodsPrice;
    private String GoodsStock;
    private String GoodsPullOff;

    public String getGoodsId() {
        return GoodsId;
    }

    public void setGoodsId(String goodsId) {
        GoodsId = goodsId;
    }

    public String getGoodsName() {
        return GoodsName;
    }

    public void setGoodsName(String goodsName) {
        GoodsName = goodsName;
    }

    public String getGoodsType() {
        return GoodsType;
    }

    public void setGoodsType(String goodsType) {
        GoodsType = goodsType;
    }

    public String getGoodsInformation() {
        return GoodsInformation;
    }

    public void setGoodsInformation(String goodsInformation) {
        GoodsInformation = goodsInformation;
    }

    public String getGoodsPrice() {
        return GoodsPrice;
    }

    public void setGoodsPrice(String goodsPrice) {
        GoodsPrice = goodsPrice;
    }

    public String getGoodsStock() {
        return GoodsStock;
    }

    public void setGoodsStock(String GoodsStock) {
        this.GoodsStock = GoodsStock;
    }

    public String getGoodsPullOff() {
        return GoodsPullOff;
    }

    public void setGoodsPullOff(String goodsPullOff) {
        GoodsPullOff = goodsPullOff;
    }
}
