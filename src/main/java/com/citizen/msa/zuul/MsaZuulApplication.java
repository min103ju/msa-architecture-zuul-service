package com.citizen.msa.zuul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy
public class MsaZuulApplication {
    public static void main(String[] args) {
        SpringApplication.run(MsaZuulApplication.class, args);
    }
}
