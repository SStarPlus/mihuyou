package javaeepp.mihuyou.service;

import javaeepp.mihuyou.entity.NationInfo;
import javaeepp.mihuyou.entity.User_Manager;
import javaeepp.mihuyou.mapper.LoginMapper;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LoginService {
    @Autowired
    private LoginMapper loginMapper;
    public int loginCheck(User user,String UserNum, String UserPwd){
        int flag = loginMapper.loginCheck(user,UserNum,UserPwd);
        return flag;
    }

    public int loginManagerCheck(User_Manager UserManager, String ManagerNum, String ManagerPwd){
        int flag = loginMapper.loginManagerCheck(UserManager,ManagerNum,ManagerPwd);
        return flag;
    }
//    获取民族信息
    public List<NationInfo> getNationInfo(){
        return loginMapper.getNationInfo();
    }
}
