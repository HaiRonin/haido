package com.whl.controller;


import com.whl.entity.DoregInfo;
import com.whl.service.DoregInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author wu123
 * @since 2019-01-14
 */
@Controller
@RequestMapping("/doregInfo")
public class DoregInfoController {
    @Autowired
    private DoregInfoService doregInfoService;

    @RequestMapping("/test")
    @ResponseBody
    public String test2() {

        DoregInfo dopayInfo = doregInfoService.selectById(1);
        return dopayInfo.toString();
    }
}

