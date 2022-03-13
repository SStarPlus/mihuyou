package javaeepp.mihuyou.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface RegistrationMapper {
    void addUsers(@Param("userInfoList") String[] userInfos);
    void addInformation(@Param("userInfoList") String[] userInfos);
}
