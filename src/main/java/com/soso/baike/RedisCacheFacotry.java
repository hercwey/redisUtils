package com.soso.baike;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * Created by wangdongyun on 2016/9/21.
 */
public class RedisCacheFacotry {
    private IRedisClient iRedisClient;

    public RedisCacheFacotry(IRedisClient redisClient) {
        this.iRedisClient = redisClient;
    }

    public IRedisClient getRedisClient(String prefix) {
        return (IRedisClient) Proxy.newProxyInstance(RedisCacheFacotry.class.getClassLoader(), new Class[]{IRedisClient.class}, new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                return method.invoke(iRedisClient);
            }
        });
    }

}
