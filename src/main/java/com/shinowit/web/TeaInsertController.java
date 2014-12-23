package com.shinowit.web;

import com.shinowit.dao.mapper.TeaInfoMapper;
import com.shinowit.model.TeaInfo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

/**
 * Created by SC on 2014/12/23.
 */
@Controller
@RequestMapping("/tea")
public class TeaInsertController {

    @Resource
    private TeaInfoMapper tea_dao;

    @RequestMapping("/login")
    public String log(@ModelAttribute("teainfo")TeaInfo teainfo){
        return "reg";
    }



    @RequestMapping("/teainsert")
    public String teainsert(@ModelAttribute("teainfo")TeaInfo teainfo){
        int result=tea_dao.insert(teainfo);
        if(result>0){
            return "ok";
        }else{
            return "reg";
        }

    }
}
