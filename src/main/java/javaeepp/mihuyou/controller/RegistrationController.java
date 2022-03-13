package javaeepp.mihuyou.controller;

import javaeepp.mihuyou.service.RegistrationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
public class RegistrationController {
    @Autowired
    RegistrationService registrationService;

    @RequestMapping("/user_registration_func")
    public String userRegistration(HttpServletRequest request, Model model){
        if(request.getParameter("inputType").equals("返回")){
            return "login";
        }else if(request.getParameter("inputType").equals("确认")){
//            注册信息整合
            String[] infoNames = {"userName", "userPwd", "userNation", "userSex"};
            String[] infos = new String[infoNames.length];
            for (int i = 0; i < infos.length; i++) {
                infos[i] = request.getParameter(infoNames[i]);
            }
//            将整合的信息加入数据库
            registrationService.userRegistration(infos);
            return "login";
        }
        System.out.println("未响应");
        return "registrationPage";
    }
}
