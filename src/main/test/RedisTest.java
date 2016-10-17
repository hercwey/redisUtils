import com.soso.baike.IRedisClient;
import com.soso.baike.RedisPrefixWrapper;
import com.soso.baike.RedisClientFactory;

/**
 * Created by wangdongyun on 2016/9/21.
 */
public class RedisTest {
    public static void main(String []args)
    {
        IRedisClient redisClient= RedisClientFactory.createRedisClient("10.136.1124.45",6379);
        RedisPrefixWrapper cacheFacotry=new RedisPrefixWrapper(redisClient);
        IRedisClient client=cacheFacotry.getRedisClient("hl_wang");
        System.out.println(client.exists("dong"));
        System.out.println(client.get("dong"));
        System.out.println(redisClient.get("hl_wangdong"));
    }
}
