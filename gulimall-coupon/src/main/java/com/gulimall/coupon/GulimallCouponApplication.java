package com.gulimall.coupon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 *
 * 1 使用nacos作为统一配置中心
     * 1） 引入依赖 nacos-config
     * 2） 创建一个bootstrap.properties. 固定名称
     *  spring.application.name=gulimall-coupon
     *  spring.cloud.nacos.config.server-addr=127.0.0.1:8848
     * 3） 在nacos配置中心添加配置文件 ${pring.application.name}-env.properties
     * 4） 在3的配置文件中添加需要动态获取的配置项
     * 5） 动态获取配置
     *   @RefreshScope(proxyMode = ScopedProxyMode.DEFAULT)  动态获取并刷新配置
     *   @Value可以动态获取配置
     *   如果配置中心和当前应用拥有同一个配置项， 配置中心优先
 * 2 细节
     * 1） 命名空间：配置隔离
     *     默认命名空间 public
     *     开发，测试，生产用来作为环境隔离,bootstrap.properties 添加配置
     *     spring.cloud.nacos.config.namespace=命名空间ID
     * 2）基于每一个微服务名创建命名空间，只加载自己命名空间下的所有配置
     * 3） 配置集:所有配置的集合叫做配置集
     * 4） 配置集ID:文件名(Data ID)
     *
     * 5） 配置分组
     *  默认所有配置集都属于:DEFAULT_GROUP:
     *  根据特定情况选取：
     *  双11：1111
     *  618：618
     *  双12：1212
    *  通用的解决方案：根据微服务创建自己的命名空间，使用分组区分环境 dev,test,prod
 *  3 同时加载多个配置集
 *     1）任何配置文件都可以托管到配置中心
 *     2）只需在bootstrap.properties 中通过扩展配置文件尽心特别说明
 *        本地可以使用的注解依旧可用
 *         @Value，@Configureproperties
 *        优先获取配置中心的值
 */
@EnableDiscoveryClient
@SpringBootApplication
public class GulimallCouponApplication {

    public static void main(String[] args) {
        SpringApplication.run(GulimallCouponApplication.class, args);
    }

}
