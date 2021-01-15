package cn.x.springcloud.user.config;

import feign.Logger;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author xqa
 * @since 2021/1/11
 */
@Configuration
public class OrderFeignConfig {

//    /**
//     * 使用feign默认契约 支持feign原生注解
//     *
//     * @return
//     */
//    @Bean
//    public Contract feignContract() {
//        return new feign.Contract.Default();
//    }

    @Bean
    public Logger.Level feignLoggerLevel() {
        return Logger.Level.BASIC;
    }

//    @Bean
//    public BasicAuthRequestInterceptor basicAuthRequestInterceptor() {
//        return new BasicAuthRequestInterceptor("user", "password");
//    }

//    @Bean
//    @Scope("prototype")
//    public Feign.Builder feignBuilder() {
//        /**
//         * feign.hystrix.enabled 设置true 全局开启支持hystrix时可以配置单个feign客户端不支持hystrix
//         */
//        return new Feign.Builder();
//
//        /**
//         * feign.hystrix.enabled 设置false 全局关闭支持hystrix时可以配置单个feign客户端支持hystrix
//         */
//        return HystrixFeign.builder();
//
//    }
}
