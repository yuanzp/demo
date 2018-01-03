package com.longruan.web.demo.demo1.controller;


import com.longruan.web.demo.demo1.service.SysUserService;
import com.longruan.web.demo.demo1.utils.ResultGenerator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
@Validated
public class SysUserController {
    private Logger log = LoggerFactory.getLogger(this.getClass());

    private final SysUserService userService;

    private final ResultGenerator generator;

    @Autowired  //自动装配
    public SysUserController(SysUserService userService, ResultGenerator generator) {
        this.userService = userService;
        this.generator = generator;
    }

}
