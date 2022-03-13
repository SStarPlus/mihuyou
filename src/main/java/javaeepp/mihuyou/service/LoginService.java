package javaeepp.mihuyou.service;

import javaeepp.mihuyou.mapper.LoginMapper;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginService {
    @Autowired
    private LoginMapper loginMapper;
    public int loginCheck(User user,String UserNum, String UserPwd){
        int flag = loginMapper.loginCheck(user,UserNum,UserPwd);
        System.out.println(flag);
        return flag;
    }
}
