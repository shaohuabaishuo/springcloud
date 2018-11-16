package com.example.eurekserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;


@SpringBootApplication
@EnableEurekaServer
public class EurekserverApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekserverApplication.class, args);
    }
}
