package com.example.demo.limit;

public interface RateLimitService {

    /**
     * 接口频次限制校验
     *
     * @param ip
     *            客户端IP
     * @param uri
     *            请求接口名
     * @param rateLimit
     *            限制频次信息
     * @return
     * @author single-聪
     * @date 2020年6月1日
     * @version 1.6.1
     */
    Boolean limit(String ip, String uri, RateLimit rateLimit);
}
