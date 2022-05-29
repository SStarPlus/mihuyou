package javaeepp.mihuyou.config;

import java.lang.ref.SoftReference;
import java.util.Calendar;
import java.util.List;

public class Test {
    public static void main(String[] args){
//        Calendar date = Calendar.getInstance();
//        String year = String.valueOf(date.get(Calendar.YEAR));
//
//        String mon = String.valueOf(date.get(Calendar.MONTH)+1);
//
//        String day = String.valueOf(date.get(Calendar.DATE));
//        System.out.println(year);
//        System.out.println(mon);
//        System.out.println(day);
//        int a[] ={1001,1002,1003,1004,1005};
//        int b[] = {1003,1004,1005,1006,1007};
//        int a[] = {4,3,4,4,0};
//        int b[] =  {3,1,2,3,0};
//        double c[] = new double[5];
//        double d[] = new double[5];
//        double all = 0;
//        double all1 = 0;
//        if (a.length < b.length){
//            for (int i = 0; i < a.length; i++) {
//                all += a[i];
//            }
//            for (int i = 0; i < a.length; i++) {
//                c[i] = (double)(a[i]-( all/a.length));
//            }
//
//            for (int i = 0; i < a.length; i++) {
//                all1 += b[i];
//            }
//            for (int i = 0; i < a.length; i++) {
//                d[i] = (double)(b[i] - (all1/a.length));
//            }
//        }
//        else {
//            for (int i = 0; i < b.length; i++) {
//                all += a[i];
//            }
//            for (int i = 0; i < b.length; i++) {
//                c[i] = (double)(a[i]-( all/a.length));
//            }
//
//            for (int i = 0; i < b.length; i++) {
//                all1 += b[i];
//            }
//            for (int i = 0; i < b.length; i++) {
//                d[i] = (double)(b[i] - (all1/a.length));
//            }
//        }
//        double re = (c[1]*d[1]+c[2]*d[2]+c[3]*d[3]+c[4]*d[4]+c[0]*d[0])/(Math.sqrt(c[1]*c[1]+c[2]*c[2]+c[3]*c[3]+c[4]*c[4]+c[0]*c[0])+Math.sqrt(d[1]*d[1]+d[2]*d[2]+d[3]*d[3]+d[4]*d[4]+d[0]*d[0]));
//        System.out.println(re);
            int[] a = {1001,1002,1004,1003,1005};
            int[] b = {1010,1004,1003,1002,1001};
            double all = 0;
            double all1 = 0;
        double c[] = new double[5];
        double d[] = new double[5];
        if (a.length < b.length){
            for (int i = 0; i < a.length; i++) {
                all += a[i];
            }
            all = all/a.length;
            for (int i = 0; i < a.length; i++) {
                c[i] = a[i]-all;
            }

            for (int i = 0; i < a.length; i++) {
                all1 += b[i];
            }
            all1 = all1/b.length;
            for (int i = 0; i < a.length; i++) {
                d[i] = b[i] - all1;
            }
        }
        else {
            for (int i = 0; i < b.length; i++) {
                all += a[i];
            }
            all =all/a.length;
            for (int i = 0; i < b.length; i++) {
                c[i] = a[i] - all;
            }

            for (int i = 0; i < b.length; i++) {
                all1 += b[i];
            }
            all1 = all1/b.length;
            for (int i = 0; i < b.length; i++) {
                d[i] = b[i] - all1;
            }
        }
        double re = (c[1]*d[1]+c[2]*d[2]+c[3]*d[3]+c[4]*d[4]+c[0]*d[0])/(Math.sqrt(c[1]*c[1]+c[2]*c[2]+c[3]*c[3]+c[4]*c[4]+c[0]*c[0])*Math.sqrt(d[1]*d[1]+d[2]*d[2]+d[3]*d[3]+d[4]*d[4]+d[0]*d[0]));
        System.out.println(re);
    }
}
