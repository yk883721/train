package com.vai.train.member.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * test
 *
 * @author yk
 * @since 2023-08-15
 */

@RestController
@RequestMapping("test")
public class TestController {

    @GetMapping("hello")
    public String hello(String param1) {
        return "hello world";
    }

}
