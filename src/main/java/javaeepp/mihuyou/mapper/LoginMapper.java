package javaeepp.mihuyou.mapper;

import javaeepp.mihuyou.entity.NationInfo;
import javaeepp.mihuyou.entity.User_Manager;
import javaeepp.mihuyou.entity.Users;
import org.apache.catalina.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface LoginMapper {
    int loginCheck( String UserNum,String UserPwd);

    int loginManagerCheck(@Param("ManagerCheck")User_Manager userManager ,String ManagerNum,String ManagerPwd);

    List<NationInfo> getNationInfo();


//    Later

    Users selectByName(@Param("username") String userName);
    List<Users> listByUserId(Integer userId);
    Users selectById(Integer UId);
}
