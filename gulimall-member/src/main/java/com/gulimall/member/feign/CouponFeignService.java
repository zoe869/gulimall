package com.gulimall.member.feign;

import com.common.utils.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 1 想要远程调用别的服务
 * 1）引入open-feign依赖
 * 2）编些feign接口，声明每一个存在的接口方法
 * 3) 编写一个接口
 */
@FeignClient("gulimall-coupon")
public interface CouponFeignService {

    @RequestMapping("/coupon/coupon/member/list")
    public R memberCoupons();

}
