package org.itm94lj.template.demo.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.itm94lj.template.common.api.CommonResult;
import org.itm94lj.template.common.exception.ApiException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


@Controller
@Api(tags = "HelloController", description = "Hello模块")
@RequestMapping("/hello")
public class HelloController {

    @ApiOperation("Hello方法调用")
    @RequestMapping(value = "/say", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult<String> sayHello() {
        throw new ApiException("hello invoke failed");
//        return CommonResult.success("hello", "Hello方法调用成功");
    }
}
