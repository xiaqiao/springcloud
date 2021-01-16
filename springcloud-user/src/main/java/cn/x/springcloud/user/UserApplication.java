package cn.x.springcloud.user;

import cn.x.springcloud.user.feign.OrderFeignClient;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.AutoConfigurationExcludeFilter;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.TypeExcludeFilter;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.FilterType;

/**
 * @author xqa
 * @since 2021/1/8
 */
@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
@EnableCircuitBreaker
@Slf4j
@ComponentScan(value = "cn.x.springcloud.user",
        excludeFilters =
                {@ComponentScan.Filter(
                        type = FilterType.CUSTOM,
                        classes = {TypeExcludeFilter.class}
                ), @ComponentScan.Filter(
                        type = FilterType.CUSTOM,
                        classes = {AutoConfigurationExcludeFilter.class}
                ), @ComponentScan.Filter(
                        type = FilterType.ASSIGNABLE_TYPE,
                        classes = OrderFeignClient.class)})
public class UserApplication {
    public static void main(String[] args) {
        SpringApplication.run(UserApplication.class, args);
        log.info("项目启动完成");
    }
}
