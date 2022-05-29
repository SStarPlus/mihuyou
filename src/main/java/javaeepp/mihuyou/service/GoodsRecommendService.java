package javaeepp.mihuyou.service;

import com.sun.org.apache.xpath.internal.objects.XNull;
import javaeepp.mihuyou.entity.*;
import javaeepp.mihuyou.mapper.GoodsRecommendMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GoodsRecommendService {
    @Autowired
    private GoodsRecommendMapper goodsRecommendMapper;

//    public static double GetCommon(int[] a, int[] b ){
//        double all = 0;
//        double all1 = 0;
//        double c[] = new double[5];
//        double d[] = new double[5];
//        if (a.length < b.length){
//            for (int i = 0; i < a.length; i++) {
//                all += a[i];
//            }
//            all = all/a.length;
//            for (int i = 0; i < a.length; i++) {
//                c[i] = a[i]-all;
//            }
//
//            for (int i = 0; i < a.length; i++) {
//                all1 += b[i];
//            }
//            all1 = all1/b.length;
//            for (int i = 0; i < a.length; i++) {
//                d[i] = b[i] - all1;
//            }
//        }
//        else {
//            for (int i = 0; i < b.length; i++) {
//                all += a[i];
//            }
//            all =all/a.length;
//            for (int i = 0; i < b.length; i++) {
//                c[i] = a[i] - all;
//            }
//
//            for (int i = 0; i < b.length; i++) {
//                all1 += b[i];
//            }
//            all1 = all1/b.length;
//            for (int i = 0; i < b.length; i++) {
//                d[i] = b[i] - all1;
//            }
//        }
//        double re = (c[1]*d[1]+c[2]*d[2]+c[3]*d[3]+c[4]*d[4]+c[0]*d[0])/(Math.sqrt(c[1]*c[1]+c[2]*c[2]+c[3]*c[3]+c[4]*c[4]+c[0]*c[0])*Math.sqrt(d[1]*d[1]+d[2]*d[2]+d[3]*d[3]+d[4]*d[4]+d[0]*d[0]));
//        return re;
//    }
//
//
////    public int getNum(int[] a, int[] b){
////        int num = 0;
////        for (int i = 0; i <a.length ; i++) {
////            for (int j = 0; j<b.length;j++){
////                if (a[i]==b[j]){
////                    num++;
////                }
////            }
////        }
////        return num;
////    }
//
//    public String[] getData(String UId){
//        List<UId> list = goodsRecommendMapper.getId(UId);
//        String arr[]  = new String[20];
//
//        int MyGoods[] = new int[5];
//        int arr1[] = new int[5];
////        int arr2[] = new int[5];
////        int arr3[] = new int[5];
////        int arr4[] = new int[5];
////        int arr5[] = new int[5];
//        if (list.size()>10){
//           for (int i = 0 ; i <10;i++){
//               arr[i] = list.get(i).getUId();
//           }
//        }else {
//           for (int i = 0 ; i <list.size();i++){
//               arr[i] = list.get(i).getUId();
//           }
//        }//获取UId
//
//
//        List<UIdWithGoods> listMy = goodsRecommendMapper.getGoodsIdA(UId);
//        if(listMy.size()>5){
//            for (int i = 0 ; i < 5; i++){
//                MyGoods[i] = listMy.get(i).getGoodsId();
//            }
//        }
//        else {
//            for (int i = 0 ; i < listMy.size(); i++){
//                MyGoods[i] = listMy.get(i).getGoodsId();
//            }
//        }
//
//
//        List<UIdWithGoods> list1 = goodsRecommendMapper.getGoodsIdA(list.get(0).getUId());
//        if (list1.size()>5){
//            for (int i = 0 ; i < 5; i++){
//                arr1[i] = list1.get(i).getGoodsId();
//            }
//        }
//        else {
//            for (int i = 0 ; i < list1.size(); i++){
//                arr1[i] = list1.get(i).getGoodsId();
//            }
//        }//获得GoodsId
//        System.out.println("MyGoods////////////////////////////////////////////////");
//        for (int i = 0; i <MyGoods.length ; i++) {
//            System.out.println(MyGoods[i]);
//        }
//        System.out.println("///////////////////////////////////////////");
//        System.out.println("arr1///////////////////////////////////////////");
//        for (int i = 0; i <arr1.length ; i++) {
//            System.out.println(arr1[i]);
//        }
//        System.out.println("///////////////////////////////////////////");
//        System.out.println("相似度");
//        System.out.println(GetCommon(MyGoods,arr1));
//
//        return arr;
//    }

    public List<Goods> getData(String UId){
        List<UserLike> getUserLikeScore = goodsRecommendMapper.getScore(UId);
        int[] arr = new int[10];
        int a0,a1,a2,a3,a4,a5,a6,a7,a8,a9;
//        for (int i = 0 ; i <10;i++){
//            arr[i] = getUserLikeScore.
//        }
        System.out.println("//////////////////////////////////");
//        for (int i = 0 ; i < getUserLikeScore.size();i++){
//            System.out.println(getUserLikeScore.get(i).getP1());
//        }
        a0 = getUserLikeScore.get(0).getSum1()/getUserLikeScore.get(0).getP1();
//        a1 = getUserLikeScore.get(0).getSum1()/getUserLikeScore.get(0).getP2();
//        a2 = getUserLikeScore.get(0).getSum1()/getUserLikeScore.get(0).getP3();
//        a3 = getUserLikeScore.get(0).getSum1()/getUserLikeScore.get(0).getP4();
//        a4 = getUserLikeScore.get(0).getSum1()/getUserLikeScore.get(0).getP5();
//        a5 = getUserLikeScore.get(0).getSum1()/getUserLikeScore.get(0).getP6();
//        a6 = getUserLikeScore.get(0).getSum1()/getUserLikeScore.get(0).getP7();
//        a7 = getUserLikeScore.get(0).getSum1()/getUserLikeScore.get(0).getP8();
//        a8 = getUserLikeScore.get(0).getSum1()/getUserLikeScore.get(0).getP9();
//        a9 = getUserLikeScore.get(0).getSum1()/getUserLikeScore.get(0).getP10();
        List<Goods> goods1 = goodsRecommendMapper.getGood1(a0);

        System.out.println(a0);
        return goods1;
    }
    public List<Goods> getData2(String UId){
        List<UserLike> getUserLikeScore = goodsRecommendMapper.getScore(UId);
        int[] arr = new int[10];
        int a0,a1,a2,a3,a4,a5,a6,a7,a8,a9;
        a4 = getUserLikeScore.get(0).getSum1()/getUserLikeScore.get(0).getP4();
        List<Goods> goods5 = goodsRecommendMapper.getGood5(a4);

        return goods5;
    }
}
