package javaeepp.mihuyou.entity;

public class SalesSituation {
    private int GoodsId;
    private int SoldNum;
    private String year;
    private String mon;
    private String day;
    private double totalPrice;
    private String GoodsName;
    private int soldLastYear;
    private double ADDL;

    public double getADDL() {
        return ADDL;
    }

    public void setADDL(double ADDL) {
        this.ADDL = ADDL;
    }

    public int getSoldLastYear() {
        return soldLastYear;
    }

    public void setSoldLastYear(int soldLastYear) {
        this.soldLastYear = soldLastYear;
    }

    public String getGoodsName() {
        return GoodsName;
    }

    public void setGoodsName(String goodsName) {
        GoodsName = goodsName;
    }

    public int getGoodsId() {
        return GoodsId;
    }

    public void setGoodsId(int goodsId) {
        GoodsId = goodsId;
    }

    public int getSoldNum() {
        return SoldNum;
    }

    public void setSoldNum(int soldNum) {
        SoldNum = soldNum;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getMon() {
        return mon;
    }

    public void setMon(String mon) {
        this.mon = mon;
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }
}
