package javaeepp.mihuyou.mapper;

import javaeepp.mihuyou.entity.NationInfo;
import org.apache.catalina.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface LoginMapper {
    int loginCheck(@Param("User")User user, String UserNum,String UserPwd);
//    获取民族信息接口
    List<NationInfo> getNationInfo();
}
