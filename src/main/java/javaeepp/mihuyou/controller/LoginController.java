package javaeepp.mihuyou.controller;
import javaeepp.mihuyou.entity.User_Manager;
import javaeepp.mihuyou.service.LoginService;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;


@Controller
public class LoginController {
    @Autowired
    private LoginService loginService;
    @RequestMapping("login")
    public String enterLogin(){
        return "login";
    }

    @RequestMapping("loginJudge")
    public String loginJudge(HttpServletRequest request, Model model, User user, RedirectAttributes redirectAttributes, HttpSession session){


        if(request.getParameter("inputType").equals("注册")) {

            model.addAttribute("NationInfoList",loginService.getNationInfo());
            return "registrationPage";
        }
        else if(request.getParameter("inputType").equals("登录")){
            String UserNum  =request.getParameter("userNum");
            String UserPwd = request.getParameter("userPwd");
            String verifyCode = request.getParameter("verifyCode");

            System.out.println(UserNum);
            System.out.println(UserPwd);
            System.out.println(verifyCode);

            System.out.println("000000");
            System.out.println(session.getAttribute("VerifyCode"));

            //
            int flag = 0;
            flag = loginService.loginCheck(user,UserNum,UserPwd);
            System.out.println(flag);
            if (flag>0 &&verifyCode.equals(session.getAttribute("VerifyCode"))) {
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



    //管理员登录
    @RequestMapping("managerLoginJudge")
    public String managerLoginJudge(HttpServletRequest request, Model model, User_Manager UserManager, RedirectAttributes redirectAttributes, HttpSession session){
        String ManagerNum = request.getParameter("ManagerNum");
        String ManagerPwd = request.getParameter("ManagerPwd");

        int flag = 0;
        flag = loginService.loginManagerCheck(UserManager,ManagerNum,ManagerPwd);
        System.out.println(flag);
        if (flag>0) {
            return "testManager";
        }
        else {
            System.out.println("账号或密码错误");
            return "login";
        }
    }

}
