package com.whl.controller;

import com.whl.model.User;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;
import springfox.documentation.annotations.ApiIgnore;

/**
 * Created by ASUS on 2019/1/14.
 */
@RestController
@Api(tags="Test API")
public class ApiTestController {
    @ApiOperation(value = "测试post请求",notes="注意事项")
    @ApiImplicitParam(dataType = "User",name = "user",value = "用户信息",required = true)
    @RequestMapping(value = "/testPost",method = RequestMethod.POST)
    public String testPost(@RequestBody User user){
        return "success";
    }


    @ApiOperation(value = "测试get请求",notes="注意事项")
    @ApiImplicitParam(name = "id",value = "用户id",dataType = "String",paramType = "path")
    @RequestMapping(value = "/testGet/{id}",method = RequestMethod.GET)
    public String testGet(@PathVariable String id){
        return id;
    }

    @ApiOperation(value = "测试组合注解",notes="注意事项")
    @ApiImplicitParams({
            @ApiImplicitParam(dataType = "User",name = "user",value = "用户信息",required = true,paramType = "body"),
            @ApiImplicitParam(dataType = "string",name = "id",value = "用户id",required = true,paramType = "path")
    })
    @RequestMapping(value = "/joinAnnotation/{id}",method = RequestMethod.POST)
    public User joinAnnotation(@PathVariable String id,@RequestBody User user){
        return user;
    }

    @ApiIgnore
    public String testIgnore(){
        return "success";
    }
}
