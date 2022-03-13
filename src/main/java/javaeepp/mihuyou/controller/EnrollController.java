package javaeepp.mihuyou.controller;


import javaeepp.mihuyou.service.EnrollService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
public class EnrollController {
    @Autowired
    private EnrollService enrollService;

    @RequestMapping("enroll")
    public String UsersEnroll(HttpServletRequest request, HttpServletResponse response, Model model){
        return "enroll";
    }

}
