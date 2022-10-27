package com.gulimall.product;

import com.gulimall.product.entity.BrandEntity;
import com.gulimall.product.service.BrandService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class GulimallProductApplicationTests {

    @Autowired
    BrandService brandService;

    @Test
    void contextLoads() {
        BrandEntity brandEntity = new BrandEntity();
        brandEntity.setName("sansumg");
        brandService.save(brandEntity);
        System.out.println("保存成功。。。");

    }

    @Test
    void testUpdate() {
        BrandEntity brandEntity = new BrandEntity();
        brandEntity.setBrandId(6L);
        brandEntity.setName("Sumsang");
        brandEntity.setDescript("好好看的手机");
        brandService.updateById(brandEntity);
        System.out.println("修改成功。。。");

    }

}
