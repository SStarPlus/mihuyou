package javaeepp.mihuyou.Util;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtil {
    public String getNowDate(){
        String nowDate = null;
        Date date = new Date();
        DateFormat simpleDateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        nowDate = simpleDateFormat.format(date);
        System.out.println(nowDate);
        return nowDate;
    }
}
