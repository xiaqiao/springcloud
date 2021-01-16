package cn.x.springcloud.hystrixDashboard;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

/**
 * @author xqa
 * @since 2021/1/8
 */
@SpringBootApplication
@EnableHystrixDashboard
@Slf4j
public class HystrixDashboardApplication {
    public static void main(String[] args) {
        SpringApplication.run(HystrixDashboardApplication.class, args);
        log.info("项目启动完成");
    }
}
