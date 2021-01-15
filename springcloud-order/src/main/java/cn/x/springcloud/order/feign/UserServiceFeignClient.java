package cn.x.springcloud.order.feign;

import cn.x.springcloud.order.config.UserFeignConfig;
import cn.x.springcloud.order.feign.fallback.UserServiceFeignFallback;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author xqa
 * @since 2021/1/8
 */
@FeignClient(name = "springcloud-user", configuration = UserFeignConfig.class, fallback = UserServiceFeignFallback.class)
public interface UserServiceFeignClient {

    @GetMapping(value = "/test/hello")
    String hello();

}
