package cn.x.springcloud.config;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * @author xqa
 * @since 2021/1/27
 */
@SpringBootApplication
@EnableConfigServer
@Slf4j
public class ConfigServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConfigServerApplication.class, args);
        log.info("项目启动完成");
    }

}
