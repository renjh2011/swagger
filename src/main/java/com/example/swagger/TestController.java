package com.example.swagger;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.web.bind.annotation.*;

/**
* @Author: 高建伟
* @Date: 2022/11/22
* @Description:
*/
@RestController
@RequestMapping("/test")
@Api(tags = "测试控制器")
public class TestController {

    @ApiOperation("测试接口")
    @GetMapping("/hello")
    public String hello(){
        return "Hello world";
    }

    @ApiOperation("保存测试字典接口")
    @PostMapping("/saveDict")
    public String saveDict(@ApiParam(value = "id", required = true, example = "123456") @RequestBody TestDict testDict){
        return testDict.toString();
    }
}
