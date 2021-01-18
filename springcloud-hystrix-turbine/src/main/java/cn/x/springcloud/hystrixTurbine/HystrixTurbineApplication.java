package cn.x.springcloud.hystrixTurbine;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.turbine.EnableTurbine;

/**
 * @author xqa
 * @since 2021/1/8
 */
@SpringBootApplication
@EnableTurbine
@Slf4j
public class HystrixTurbineApplication {
    public static void main(String[] args) {
        SpringApplication.run(HystrixTurbineApplication.class, args);
        log.info("项目启动完成");
    }
}
