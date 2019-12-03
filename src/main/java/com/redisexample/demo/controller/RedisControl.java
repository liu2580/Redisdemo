package com.redisexample.demo.controller;

import com.redisexample.demo.service.RedisServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author liutianqi
 * @date 2019/12/2
 */



@RestController
@RequestMapping("/redis")

public class RedisControl {

    @Autowired
    private RedisServiceImpl redisServiceImpl;//设置redis中的key和value

    @RequestMapping("/add")
    public String setRedis(String id,String name){
        redisServiceImpl.set(id, name);
        return "redis设置成功"+"id="+id+" name="+name;
    }

//获得redis中的value

    @RequestMapping("/select")
    public String getRedis(String id){
        return "redis获得值成功"+"name="+redisServiceImpl.get(id);
    }

//修改redis中的value

    @RequestMapping("/update")
    public String updateRedis(String id,String name){
        redisServiceImpl.update(id, name);
        System.out.println("修改成");
        return "redis修改成功"+"id="+id+" name="+redisServiceImpl.get(id);
    }

//修改redis中的value

    @RequestMapping("/delete")
    public String deleteRedis(String id,String name){
        redisServiceImpl.delete(id);
        return "redis删除成功";
    }

}
