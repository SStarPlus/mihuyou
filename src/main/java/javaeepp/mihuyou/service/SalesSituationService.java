package javaeepp.mihuyou.service;

import javaeepp.mihuyou.controller.SalesSituationController;
import javaeepp.mihuyou.entity.SalesSituation;
import javaeepp.mihuyou.mapper.SalesSituationMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Calendar;
import java.util.List;

@Service
public class SalesSituationService {
    @Autowired
    SalesSituationMapper salesSituationMapper;
    public List<SalesSituation> getYear() {
        Calendar date = Calendar.getInstance();
        String year = String.valueOf(date.get(Calendar.YEAR));
        return salesSituationMapper.getYear(year);
    }

    public List<SalesSituation> getMon(){

        Calendar date = Calendar.getInstance();
        String year = String.valueOf(date.get(Calendar.YEAR));
        String mon = String.valueOf(date.get(Calendar.MONTH)+1);
        return salesSituationMapper.getMon(year,mon);
    }

    public List<SalesSituation> getDay(){
        Calendar date = Calendar.getInstance();
        String year = String.valueOf(date.get(Calendar.YEAR));
        String mon = String.valueOf(date.get(Calendar.MONTH)+1);
        String day = String.valueOf(date.get(Calendar.DATE));

        return salesSituationMapper.getDay(year,mon,day);
    }
}
