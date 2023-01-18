package com.bitc.securitytest.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/sec")  // 기본 주소로 sec 사용
@Controller
public class SecTestController {

    @RequestMapping({"/", "/index"})
    public String index() {
        return "sec/index";
    }

    @RequestMapping("/all")
    public String all() {
        return "sec/all";
    }

    @RequestMapping("/member")
    public String member() {
        return "sec/member";
    }

    @RequestMapping("/admin")
    public String admin() {
        return "sec/admin";
    }
}
