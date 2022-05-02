package javaeepp.mihuyou.exception;

/**
 * 自定义异常类
 */
public class SDException extends RuntimeException{
    static final long serialVersionUID = 1L;

    /**
     * 错误码
     */
    protected String errorCode;

    /**
     * 错误信息
     */
    protected String errorMsg;

    public SDException(){
        super();
    }

    public SDException(BaseErrorInfo errorInfo){
        super(errorInfo.getResultCode());
        this.errorCode = errorInfo.getResultCode();
        this.errorMsg = errorInfo.getResultMsg();
    }

    public SDException(BaseErrorInfo errorInfo, Throwable throwable){
        super(errorInfo.getResultCode(), throwable);
        this.errorCode = errorInfo.getResultCode();
        this.errorMsg = errorInfo.getResultMsg();
    }

    public SDException(String errorMsg){
        super(errorMsg);
        this.errorMsg = errorMsg;
    }

    public SDException(String errorCode, String errorMsg) {
        this.errorCode = errorCode;
        this.errorMsg = errorMsg;
    }

    public SDException(String errorCode, String errorMsg, Throwable cause) {
        super(errorMsg, cause);
        this.errorCode = errorCode;
        this.errorMsg = errorMsg;
    }

    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    public String getErrorMsg() {
        return errorMsg;
    }

    public void setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
    }

    @Override
    public Throwable fillInStackTrace(){
        return this;
    }
}
