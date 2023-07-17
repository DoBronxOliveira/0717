package com.iweb.ssm.mapper;

import com.iweb.ssm.bean.Good;
import com.iweb.ssm.bean.GoodLike;
import org.apache.ibatis.annotations.Param;

import java.util.List;
public interface GoodMapper {

    List<Good> goodList(GoodLike goodLike);

    void addGood(Good good);

    void batchDeleteGood(String ids);

    void deleteGood(@Param("id") Integer id);

    void updateGood(Good good);
}
