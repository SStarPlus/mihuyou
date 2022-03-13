package javaeepp.mihuyou.mapper;

import org.apache.catalina.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface LoginMapper {
    int loginCheck(@Param("User")User user, String UserNum,String UserPwd);
}
