package cn.x.springcloud.order.feign.fallback;

import cn.x.springcloud.order.bean.ResponseResult;
import cn.x.springcloud.order.feign.UserFeignClient;
import feign.hystrix.FallbackFactory;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.util.Map;

/**
 * @author xqa
 * @since 2021/1/15
 */
@Component
@Slf4j
public class UserFeignFallbackFactory implements FallbackFactory<UserFeignClient> {

    @Override
    public UserFeignClient create(Throwable throwable) {
        log.error("fallback: {}", throwable.getMessage());
        return new UserFeignClient() {
            @Override
            public ResponseResult<Map> user(Integer id) {
                return null;
            }
        };
    }
}
