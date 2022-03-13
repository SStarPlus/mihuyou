package javaeepp.mihuyou.controller;

import com.alipay.api.internal.mapping.ApiField;
//import io.swagger.annotations.ApiOperation;
import javaeepp.mihuyou.IVerifyCodeGen;
import javaeepp.mihuyou.SimpleCharVerifyCodeGenImpl;
import javaeepp.mihuyou.VerifyCode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.io.IOException;

import static com.sun.xml.internal.ws.spi.db.BindingContextFactory.LOGGER;

@Controller
public class CheckController {
//        @RequestMapping("verifyCode")

//    @ApiOperation(value = "验证码")

    @GetMapping("/verifyCode")

    public void verifyCode(HttpServletRequest request, HttpServletResponse response) {
        IVerifyCodeGen iVerifyCodeGen = new SimpleCharVerifyCodeGenImpl();
        try {
//设置长宽
            VerifyCode verifyCodeD = iVerifyCodeGen.generate(80, 28);
            String code = verifyCodeD.getCode();
            LOGGER.info(code);
//将VerifyCode绑定session
            request.getSession().setAttribute("VerifyCode", code);
//设置响应头
            response.setHeader("Pragma", "no-cache");
//设置响应头
            response.setHeader("Cache-Control", "no-cache");
//在代理服务器端防止缓冲
            response.setDateHeader("Expires", 0);
//设置响应内容类型
            response.setContentType("image/jpeg");
            response.getOutputStream().write(verifyCodeD.getImgBytes());
            response.getOutputStream().flush();
        } catch (IOException e) {
            LOGGER.info("");
        }
    }
}
