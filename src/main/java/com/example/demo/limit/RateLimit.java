package com.example.demo.limit;

import java.lang.annotation.*;

@Target({ ElementType.METHOD })
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface RateLimit {

    /** 周期,单位是秒 */
    int cycle() default 5;

    /** 请求次数 */
    int number() default 1;

    /** 默认提示信息 */
    String msg() default "请勿重复点击";

}
