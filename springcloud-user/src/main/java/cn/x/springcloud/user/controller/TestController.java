package cn.x.springcloud.user.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author xqa
 * @since 2021/1/8
 */
@RestController
@RequestMapping("/test")
@Slf4j
public class TestController {

    @Value("${server.port}")
    private String port;

    @GetMapping("/hello")
    public String hello() {
        return "hello_user" + port;
    }

}
