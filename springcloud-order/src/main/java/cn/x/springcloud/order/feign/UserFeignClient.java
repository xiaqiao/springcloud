package cn.x.springcloud.order.feign;

import cn.x.springcloud.order.bean.ResponseResult;
import cn.x.springcloud.order.config.UserFeignConfig;
import cn.x.springcloud.order.feign.fallback.UserFeignFallbackFactory;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.Map;

/**
 * @author xqa
 * @since 2021/1/8
 */
@FeignClient(name = "springcloud-user",
        configuration = UserFeignConfig.class,
//        fallback = UserFeignFallback.class,
        fallbackFactory = UserFeignFallbackFactory.class)
public interface UserFeignClient {

    @GetMapping(value = "/user/{id}")
    ResponseResult<Map> user(@PathVariable Integer id);

}
