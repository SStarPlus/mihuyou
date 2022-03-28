package javaeepp.mihuyou.entity;

import com.sun.xml.internal.messaging.saaj.packaging.mime.internet.ContentType;
import org.apache.tomcat.util.http.fileupload.FileItem;
import org.apache.tomcat.util.http.fileupload.disk.DiskFileItem;
import org.springframework.lang.NonNull;
import org.springframework.mock.web.MockMultipartFile;
import org.springframework.web.multipart.MultipartFile;
import org.thymeleaf.util.ContentTypeUtils;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.nio.file.Files;

public class Goods {
    private String GoodsId;
    private String GoodsName;
    private String GoodsType;
    private String GoodsInformation;
    private String GoodsPrice;
    private String GoodsStock;
    private String GoodsPullOff;
    private MultipartFile GoodsPicture;
    private String GoodsPictureString;

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

    public MultipartFile getGoodsPicture() {
        return GoodsPicture;
    }

    public void setGoodsPicture(MultipartFile goodsPicture) {
        GoodsPicture = goodsPicture;
    }

    public String getGoodsPictureString() {
        return GoodsPictureString;
    }

    public void setGoodsPictureString(String goodsPictureString) {
        GoodsPictureString = goodsPictureString;
    }
}
