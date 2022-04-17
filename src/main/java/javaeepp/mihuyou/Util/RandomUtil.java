package javaeepp.mihuyou.Util;

import java.util.Random;

public class RandomUtil {
    public String getRandom(){
        String num = "";
        Random r = new Random();
        num = r.nextInt(999) + 1000 + "";

        return num;
    }
}
