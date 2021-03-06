package com.tuacy.center.turbine.rabbitmq;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.turbine.stream.EnableTurbineStream;

@SpringBootApplication
@EnableDiscoveryClient
@EnableTurbineStream
public class TurbineRabbitmqApplication {
    public static void main(String[] args) {
        SpringApplication.run(TurbineRabbitmqApplication.class, args);
    }
}
