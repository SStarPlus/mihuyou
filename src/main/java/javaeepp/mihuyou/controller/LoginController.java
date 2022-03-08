package javaeepp.mihuyou.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
public class LoginController {
    @RequestMapping("login")
    public String enterLogin(){
        return "login";
    }

    @RequestMapping("loginJudge")
    public String loginJudge(HttpServletRequest request, Model model){
        if(request.getParameter("inputType").equals("注册")){
            return "registrationMenu";
        }
        int fromWhere = 0;
        if(fromWhere == 1){
            return "userMenu";
        }else if(fromWhere == 2){
            return "managerMenu";
        }
        return "login";
    }

    @RequestMapping("user_registration")
    public String userRegistration(){
        return "enroll";
    }

}
