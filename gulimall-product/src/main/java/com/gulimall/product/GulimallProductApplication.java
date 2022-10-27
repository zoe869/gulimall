package com.gulimall.product;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 1 mybatis-plus
 *          <dependency>
 *             <groupId>com.baomidou</groupId>
 *             <artifactId>mybatis-plus-boot-starter</artifactId>
 *             <version>3.2.0</version>
*         </dependency>
 *  2 连接池组件
 *      2.1 配置连接池application.yml
 *      2.2 配置mybatis-plus
 *          2.2.1 @MapperScan
 *          2.2.2 Mapper.xml 文件路径(application.yml)
 *          2.2.3
 */
@MapperScan("com.gulimall.product.dao")
@SpringBootApplication
public class GulimallProductApplication {

    public static void main(String[] args) {
        SpringApplication.run(GulimallProductApplication.class, args);
    }

}
