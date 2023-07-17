package com.iweb.ssm.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.iweb.ssm.bean.Good;
import com.iweb.ssm.bean.GoodLike;
import com.iweb.ssm.service.GoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@Controller
public class GoodController {
    @Autowired
    private GoodService goodService;

    @GetMapping("/goodList")
    @ResponseBody
    public PageInfo<Good> goodList(int page, int pageSize, GoodLike goodLike){
        //等同于处理 limit a,b
        PageHelper.startPage(page,pageSize);
        List<Good> goods = goodService.goodList(goodLike);
        PageInfo<Good> pageInfo = new PageInfo<>(goods);
        return pageInfo;
    }
    @PostMapping("/goodList")
    public String addGood(Good good){
        goodService.addGood(good);
        return "redirect:/";
    }

    @PostMapping("/deleteGood")
    @ResponseBody
    public String deleteGood(Integer id){
        goodService.deleteGood(id);
        return "删除成功";
    }
    @PostMapping("/batchDeleteGood")
    @ResponseBody
    public String batchDeleteGood(String values){
        goodService.batchDeleteGood(values);
        return "删除成功";
    }
    @PostMapping("/updateGood")
    public String updateGood(Good good){
        goodService.updateGood(good);
        return "redirect:/";
    }

}
