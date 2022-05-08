package javaeepp.mihuyou.entity;

import java.util.Collection;

//返回前端数据的类
public class ResultBean {
    private int code;
    private String message;
    private Collection date;

    private ResultBean(){}
//    错误信息
    public static ResultBean error(int code, String message){
        ResultBean resultBean = new ResultBean();
        resultBean.setCode(code);
        resultBean.setMessage(message);
        return resultBean;
    }

//    成功信息
    public static ResultBean success(){
        ResultBean resultBean = new ResultBean();
        resultBean.setCode(0);
        resultBean.setMessage("success");
        return resultBean;
    }


//    成功信息二
    public static ResultBean success(Collection date){
        ResultBean resultBean = new ResultBean();
        resultBean.setCode(0);
        resultBean.setMessage("success");
        resultBean.setDate(date);
        return resultBean;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Collection getDate() {
        return date;
    }

    public void setDate(Collection date) {
        this.date = date;
    }
}
