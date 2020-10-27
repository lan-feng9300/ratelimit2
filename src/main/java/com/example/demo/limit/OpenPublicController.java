package com.example.demo.limit;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Api(tags = "用户接口管理")
@RestController
public class OpenPublicController {

    @Autowired
    RedisTemplate redisTemplate;
    @ApiOperation("rate测试")
    @RateLimit(number = 2, cycle = 10)
    @GetMapping("/rate")
    public void rate() {

        redisTemplate.opsForValue().set("aa",1234);
        System.out.println("异常");
    }
}
