package javaeepp.mihuyou.exception;

/**
 * 基础错误接口类
 */
public interface BaseErrorInfo {

    /**
     * 错误码
     * @return
     */
    String getResultCode();

    /**
     * 错误信息
     * @return
     */
    String getResultMsg();
}
