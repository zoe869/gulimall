package com.gulimall.member;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * 1 使用nacos 作为服务注册中心
 *  1.1 在公共依赖包里common 里面添加导入依赖 nacos-discovery
 *  1.2 下载nacos-server作为服务器，并启动
 *  1.3 配置注解，使用服务发现
 *  1.4 配置application.properties
 *      添加注册中心地址：127.0.0.1:8848
 *      添加注册到服务中心的服务名称
 *
 */
@EnableFeignClients("com.gulimall.member.feign")
@EnableDiscoveryClient
@SpringBootApplication
public class GulimallMemberApplication {
    public static void main(String[] args) {
        SpringApplication.run(GulimallMemberApplication.class, args);
    }

}
