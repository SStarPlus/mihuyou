package javaeepp.mihuyou.service;

import javaeepp.mihuyou.Util.DateUtil;
import javaeepp.mihuyou.Util.RandomUtil;
import javaeepp.mihuyou.entity.Goods;
import javaeepp.mihuyou.mapper.GoodsAddMapper;
import org.apache.commons.io.FileUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.ResourceUtils;
import sun.swing.plaf.GTKKeybindings;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.FileNotFoundException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

@Service
public class GoodsAddService {
    DateUtil dateUtil;
    
    RandomUtil randomUtil;

    @Autowired
    private GoodsAddMapper goodsAddMapper;

    public int addGoods(Goods goods, String GoodsId, String GoodsName, String GoodsType,String GoodsInformation, String GoodsPrice, String GoodsStock, HttpServletRequest request){
        int flag = goodsAddMapper.AddGoods(goods,GoodsId,GoodsName, GoodsType,GoodsInformation,GoodsPrice,GoodsStock);
        GoodsPictureTranslation(goods, request);

        goodsAddMapper.AddGoodsPicture(GoodsId, goods.getGoodsPictureString());
        return flag;
    }

//    添加商品
    private String GoodsPictureTranslation(Goods goods, HttpServletRequest request){
        String nowDate = null;
        Date date = new Date();
        DateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMddHHmmss");
        nowDate = simpleDateFormat.format(date);
        System.out.println(nowDate);
        String newFileName = nowDate + ".png";

//        String savePath = request.getSession().getServletContext().getRealPath("/uploads/");
        String savePath = System.getProperty("user.dir") + "/src//main/resources/static/pictures";
        System.out.println(savePath);

        goods.setGoodsPictureString(newFileName);

        File pictureFile = new File(savePath, newFileName);
        if(!pictureFile.getParentFile().exists()){
            pictureFile.getParentFile().mkdir();
        }
        try {
//            FileUtils.copyInputStreamToFile(goods.getGoodsPicture().getInputStream(), pictureFile);
            goods.getGoodsPicture().transferTo(pictureFile);
        }catch (Exception e){
            e.printStackTrace();
        }

        return newFileName;
    }
}
