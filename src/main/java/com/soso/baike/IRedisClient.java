package com.soso.baike;

import redis.clients.jedis.*;

import java.io.Closeable;

/**
 * Created by wangdongyun on 2016/9/21.
 * 这个接口的和 Jedis 实现的所有的接口保持 一致性
 */
public interface IRedisClient extends JedisCommands,
        MultiKeyCommands, AdvancedJedisCommands, ScriptingCommands,
        BasicCommands, ClusterCommands, BinaryJedisCommands,
        MultiKeyBinaryCommands, AdvancedBinaryJedisCommands,
        BinaryScriptingCommands, Closeable {
}
