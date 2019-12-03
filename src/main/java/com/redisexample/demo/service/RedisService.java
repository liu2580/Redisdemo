package com.redisexample.demo.service;

/**
 * @author liutianqi
 * @date 2019/12/2
 */
public interface RedisService {

    public void set(String id, String name);

    public String get(String id);

    public void update(String id,String name);

    public void delete(String id);

}
