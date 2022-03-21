package javaeepp.mihuyou.controller;

import javaeepp.mihuyou.service.MailService;
import javaeepp.mihuyou.service.RegistrationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.Random;

@Controller
public class RegistrationController {
    @Autowired
    RegistrationService registrationService;

    @Autowired
    private MailService mailService;

    @RequestMapping("/user_registration_func")
    public String userRegistration(HttpServletRequest request, Model model){

        if(request.getParameter("inputType").equals("返回")){
            return "login";
        }else if(request.getParameter("inputType").equals("确认")){
            if(request.getParameter("verifyResult").equals("1")){
                System.out.println("验证码正确！");
//            注册信息整合
                String[] infoNames = {"userName", "userPwd", "userNation", "userSex"};
                String[] infos = new String[infoNames.length];
                for (int i = 0; i < infos.length; i++) {
                    infos[i] = request.getParameter(infoNames[i]);
                }
//            将整合的信息加入数据库
                registrationService.userRegistration(infos);
                return "login";
            }else {
                System.out.println("验证码错误！");
                return "registrationPage";
            }
        }
        System.out.println("未响应");
        return "registrationPage";
    }

    @RequestMapping("/getCheckCode")
    @ResponseBody
    public String getCheckCode(String email){
        String checkCode = String.valueOf(new Random().nextInt(899999) + 100000);
        String message = "您的注册验证码为："+checkCode;
        try {
            mailService.sendSimpleMail(email, "注册验证码", message);
        }catch (Exception e){
            e.printStackTrace();
            return "";
        }
        return checkCode;
    }
}
