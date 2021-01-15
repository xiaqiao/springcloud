package cn.x.springcloud.order.controller;

import cn.x.springcloud.order.feign.UserServiceFeignClient;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author xqa
 * @since 2021/1/8
 */
@RestController
@RequestMapping("/test")
public class TestController {

    @Autowired
    private RestTemplate restTemplate;
    @Autowired
    private UserServiceFeignClient userServiceFeignClient;

    @GetMapping("/hello")
    public String hello() {
        return "hello_order";
    }

    @GetMapping("/user/rest")
    public String userRest() {
        return restTemplate.getForObject("http://localhost:8881/test/hello", String.class);
    }

    @GetMapping("/user/feign")
//    @HystrixCommand(fallbackMethod = "userFeignFallBack")
    public String userFeign() {
        return userServiceFeignClient.hello();
    }

    public String userFeignFallBack() {
        return "fallback";
    }

}
