package com.iweb.ssm.service;

import com.iweb.ssm.bean.Good;
import com.iweb.ssm.bean.GoodLike;

import java.util.List;

public interface GoodService {

    List<Good> goodList(GoodLike goodLike);

    void addGood(Good good);

    void deleteGood(Integer id);

    void batchDeleteGood(String ids);

    void updateGood(Good good);
}
