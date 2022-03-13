package javaeepp.mihuyou.service;

import javaeepp.mihuyou.mapper.RegistrationMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RegistrationService {
    @Autowired
    RegistrationMapper registrationMapper;

    public void userRegistration(String[] userInfos){
//        填入users表的信息
        String[] usersInfo = new String[2];
        usersInfo[0] = userInfos[0];
        usersInfo[1] = userInfos[1];
//        填入information表的信息
        String[] informationInfo = new String[3];
        informationInfo[0] = userInfos[0];
        informationInfo[1] = userInfos[2];
        informationInfo[2] = userInfos[3];

        registrationMapper.addUsers(usersInfo);
        registrationMapper.addInformation(informationInfo);
    }

}
