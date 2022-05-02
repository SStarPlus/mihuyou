package javaeepp.mihuyou.exception;

import com.sun.org.slf4j.internal.Logger;
import com.sun.org.slf4j.internal.LoggerFactory;
import org.apache.ibatis.javassist.NotFoundException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

@ControllerAdvice
public class MyExceptionHandler {

    private static final Logger logger = LoggerFactory.getLogger(MyExceptionHandler.class);

    /**
     * 自定义的业务异常
     */
    @ExceptionHandler(value = SDException.class)
    @ResponseBody
    public ResultBean SDExceptionHandler(HttpServletRequest request, SDException e){
        logger.error("自定义业务异常！原因是：", e);
        return ResultBean.error(e.getErrorCode(), e.getErrorMsg());
    }

    /**
     *空指针异常
     */
    @ExceptionHandler(value = NullPointerException.class)
    @ResponseBody
    public ResultBean NullPointerExceptionHandler(HttpServletRequest request, NullPointerException e){
        logger.error("空指针异常！原因是：", e);
        return ResultBean.error(ExceptionEnum.BODY_NOT_MATCH);
    }

    /**
     * 找不到资源异常
     */
    @ExceptionHandler(value = NotFoundException.class)
    @ResponseBody
    public ResultBean NotFoundExceptionHandler(HttpServletRequest request, NotFoundException e){
        logger.error("找不到资源异常，原因是：", e);
        return ResultBean.error(ExceptionEnum.NOT_FOUND);
    }

    /**
     * 其它异常处理
     */
    @ExceptionHandler(value = Exception.class)
    @ResponseBody
    public ResultBean exceptionHandler(HttpServletRequest request, Exception e){
        logger.error("未知异常！原因是：", e);
        return ResultBean.error(ExceptionEnum.INTERNAL_SERVICE_ERROR);
    }
}
