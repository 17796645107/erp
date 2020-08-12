package com.demo.erp.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class HellpController {
    @RequestMapping("aaa")
    public String aaa() {
        return "Hello!房俊涵";
    }
}
