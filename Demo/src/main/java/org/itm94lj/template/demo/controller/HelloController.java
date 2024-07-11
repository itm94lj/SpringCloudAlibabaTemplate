package org.itm94lj.template.demo.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


@Controller
@Api(tags = "HelloController", description = "Hello模块")
@RequestMapping("/hello")
public class HelloController {

    @ApiOperation("Hello方法调用")
    @RequestMapping(value = "/say", method = RequestMethod.GET)
    @ResponseBody
    public String sayHello() {
        return "hello";
    }
}
