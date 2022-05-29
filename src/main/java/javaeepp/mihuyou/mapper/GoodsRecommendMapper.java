package javaeepp.mihuyou.mapper;

import javaeepp.mihuyou.entity.*;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface GoodsRecommendMapper {
//    public List<UId> getId(@Param("UId") String UId);
//    public List<UIdWithGoods> getGoodsIdA(@Param("UId") String UId);
    public List<UserLike> getScore(@Param("UId") String UId);
    public List<Goods> getGood1(@Param("a0") int a0);
    public List<Goods> getGood5(@Param("a4")int a4);
}
