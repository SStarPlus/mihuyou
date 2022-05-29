package javaeepp.mihuyou.service;

import javaeepp.mihuyou.entity.NationInfo;
import javaeepp.mihuyou.entity.User_Manager;
import javaeepp.mihuyou.entity.Users;
import javaeepp.mihuyou.mapper.LoginMapper;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.logging.LogManager;

@Service
public class LoginService {
    @Autowired
    private LoginMapper loginMapper;
    public int loginCheck(String UserNum, String UserPwd){
        int flag = loginMapper.loginCheck(UserNum,UserPwd);
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
//    public class  LoginService implements UserDetailsService {
//    @Autowired
//    private LoginMapper loginMapper;
//
//    @Override
//    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
//        Collection<GrantedAuthority> authorities = new ArrayList<>();
//
//        Users flag = loginMapper.selectByName(username);
//        if (flag == null){
//            throw new UsernameNotFoundException("用户不存在");
//        }
//
//
//        List<Users> users = loginMapper.listByUserId(Integer.valueOf(flag.getUid()));
//
//        for (Users user: users){
//            Users role = loginMapper.selectById(users.);
//            authorities.add(new SimpleGrantedAuthority((role.getUid().toString()));
//        }
//
//        return  new User(, flag.getPassword(), authorities);
//    }
//
//    public int loginManagerCheck(User_Manager UserManager, String ManagerNum, String ManagerPwd){
//        int flag = loginMapper.loginManagerCheck(UserManager,ManagerNum,ManagerPwd);
//        return flag;
//    }
////    获取民族信息
//    public List<NationInfo> getNationInfo(){
//        return loginMapper.getNationInfo();
//    }
//}