package cn.x.springcloud.user.feign.fallback;

import cn.x.springcloud.user.bean.ResponseResult;
import cn.x.springcloud.user.feign.OrderFeignClient;
import feign.hystrix.FallbackFactory;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

/**
 * @author xqa
 * @since 2021/1/15
 */
@Component
@Slf4j
public class OrderFeignFallbackFactory implements FallbackFactory<OrderFeignClient> {

    @Override
    public OrderFeignClient create(Throwable throwable) {
        log.error("fallback: {}", throwable.getMessage());
        return new OrderFeignClient() {
            @Override
            public ResponseResult<List<Map>> orderByUser(Integer id) {
                return null;
            }
        };
    }
}
