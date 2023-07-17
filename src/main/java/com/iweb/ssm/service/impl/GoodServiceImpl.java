package com.iweb.ssm.service.impl;

import com.iweb.ssm.bean.Good;
import com.iweb.ssm.bean.GoodLike;
import com.iweb.ssm.mapper.GoodMapper;
import com.iweb.ssm.service.GoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GoodServiceImpl implements GoodService {

    @Autowired
    private GoodMapper goodMapper;

    @Override
    public List<Good> goodList(GoodLike goodLike) {
        return goodMapper.goodList(goodLike);
    }

    @Override
    public void addGood(Good good) {
        goodMapper.addGood(good);
    }

    @Override
    public void deleteGood(Integer id) {
        goodMapper.deleteGood(id);
    }

    @Override
    public void batchDeleteGood(String ids) {
        goodMapper.batchDeleteGood(ids);
    }

    @Override
    public void updateGood(Good good) {
        goodMapper.updateGood(good);
    }
}
