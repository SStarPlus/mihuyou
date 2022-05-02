package javaeepp.mihuyou.exception;

import java.util.Collection;

//返回前端数据的类
public class ResultBean {
    private String code;
    private String message;
    private Collection date;

    private ResultBean(){}

    public ResultBean(BaseErrorInfo errorInfo){
        this.code = errorInfo.getResultCode();
        this.message = errorInfo.getResultMsg();
    }

//    错误信息
    public static ResultBean error(String code, String message){
        ResultBean resultBean = new ResultBean();
        resultBean.setCode(code);
        resultBean.setMessage(message);
        return resultBean;
    }
//    错误信息二

    public static ResultBean error(BaseErrorInfo errorInfo){
        ResultBean resultBean = new ResultBean();
        resultBean.setCode(errorInfo.getResultCode());
        resultBean.setMessage(errorInfo.getResultMsg());
        return resultBean;
    }

//    成功信息
    public static ResultBean success(){
        ResultBean resultBean = new ResultBean();
        resultBean.setCode("0");
        resultBean.setMessage("success");
        return resultBean;
    }

//    成功信息二
    public static ResultBean success(Collection date){
        ResultBean resultBean = new ResultBean();
        resultBean.setCode("0");
        resultBean.setMessage("success");
        resultBean.setDate(date);
        return resultBean;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
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
