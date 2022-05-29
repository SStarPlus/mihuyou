package javaeepp.mihuyou.mapper;

import javaeepp.mihuyou.controller.SalesSituationController;
import javaeepp.mihuyou.entity.SalesSituation;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface SalesSituationMapper {
    List<SalesSituation> getYear(@Param("year") String year);
    List<SalesSituation> getMon(@Param("year") String year,
                                @Param("mon") String mon);

    List<SalesSituation> getDay(@Param("year") String year,
                                @Param("mon") String mon,
                                @Param("day") String day);
}
