package javaeepp.mihuyou.controller;

import javaeepp.mihuyou.service.RegistrationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
public class registrationController {
    @Autowired
    RegistrationService registrationService;

    @RequestMapping("/user_registration_func")
    public String userRegistration(HttpServletRequest request){
        if(request.getParameter("inputType").equals("返回")){
            return "login";
        }else if(request.getParameter("inputType").equals("确认")){
//            将获取的信息整合
            String[] infoNames = {"userName", "userPwd", "userSex", "userNation"};
            String[] infos = new String[infoNames.length];
            for (int i = 0; i < infos.length; i++) {
                infos[i] = request.getParameter(infoNames[i]);
            }
//            将信息传入service，并插入数据库
            registrationService.userRegistration(infos);
            return "login";
        }

        return "registrationPage";
    }
}
