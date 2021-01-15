package cn.x.springcloud.user.feign;

import cn.x.springcloud.user.bean.ResponseResult;
import cn.x.springcloud.user.config.OrderFeignConfig;
import cn.x.springcloud.user.feign.fallback.OrderFeignFallbackFactory;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;
import java.util.Map;

/**
 * @author xqa
 * @since 2021/1/8
 */
@FeignClient(name = "springcloud-order",
        configuration = OrderFeignConfig.class,
        fallbackFactory = OrderFeignFallbackFactory.class)
public interface OrderFeignClient {

    @GetMapping(value = "/order/user/{id}")
    ResponseResult<List<Map>> orderByUser(@PathVariable Integer id);

}
