package javaeepp.mihuyou.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
public class registrationController {
    @RequestMapping("user_registration_func")
    public String userRegistration(HttpServletRequest request, Model model){
        if(request.getParameter("inputType").equals("返回")){
            return "login";
        }else if(request.getParameter("inputType").equals("确认")){
            String[] infoNames = {"userName", "userPwd", "userNation", "userSex"};
            String[] infos = new String[infoNames.length];
            for (int i = 0; i < infos.length; i++) {
                infos[i] = request.getParameter(infoNames[i]);
            }

        }
        return "registrationPage";
    }
}
