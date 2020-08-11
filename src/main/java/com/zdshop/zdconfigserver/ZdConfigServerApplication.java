package com.zdshop.zdconfigserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class ZdConfigServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(ZdConfigServerApplication.class, args);
    }

}
