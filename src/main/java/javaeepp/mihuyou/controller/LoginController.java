package javaeepp.mihuyou.controller;

import com.sun.deploy.net.HttpResponse;
import javaeepp.mihuyou.service.LoginService;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.servlet.http.HttpServletRequest;

@Controller
public class LoginController {
    @Autowired

    private LoginService loginService;
    @RequestMapping("login")
    public String enterLogin(){
        return "login";
    }

    @RequestMapping("loginJudge")
    public String loginJudge(HttpServletRequest request, Model model, User user, RedirectAttributes redirectAttributes){
        if(request.getParameter("inputType").equals("注册")) {
            return "registrationPage";
        }
        else if(request.getParameter("inputType").equals("登录")){
            String UserNum  =request.getParameter("userNum");
            String UserPwd = request.getParameter("userPwd");

            System.out.println(UserNum);
            System.out.println(UserPwd);

            int flag = 0;
            flag = loginService.loginCheck(user,UserNum,UserPwd);
            System.out.println(flag);
            if (flag>0){
                return "test";
            }
            else {
                System.out.println("账号或密码错误");
                return "login";
            }
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
