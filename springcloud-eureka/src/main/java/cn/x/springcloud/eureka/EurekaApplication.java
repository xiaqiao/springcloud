package cn.x.springcloud.eureka;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author xqa
 * @since 2021/1/8
 */
@SpringBootApplication
@EnableEurekaServer
@Slf4j
public class EurekaApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaApplication.class, args);
        log.info("项目启动完成");
    }

}
