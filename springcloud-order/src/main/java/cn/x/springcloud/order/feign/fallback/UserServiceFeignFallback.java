package cn.x.springcloud.order.feign.fallback;

import cn.x.springcloud.order.feign.UserServiceFeignClient;
import org.springframework.stereotype.Component;

/**
 * @author xqa
 * @since 2021/1/14
 */
@Component
public class UserServiceFeignFallback implements UserServiceFeignClient {

    @Override
    public String hello() {
        return "feign_fallback";
    }
}
