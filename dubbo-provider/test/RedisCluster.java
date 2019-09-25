import redis.clients.jedis.HostAndPort;
import redis.clients.jedis.JedisCluster;
import redis.clients.jedis.JedisPoolConfig;

import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

public class RedisCluster {


    public static void main(String[] args) throws IOException {
        Set<HostAndPort> jedisClusterNode = new HashSet<HostAndPort>();
        jedisClusterNode.add(new HostAndPort("192.1668.4.5", 8001));
        jedisClusterNode.add(new HostAndPort("192.168.4.6", 8002));
        jedisClusterNode.add(new HostAndPort("192.168.4.7", 8003));
        jedisClusterNode.add(new HostAndPort("192.168.4.5", 8004));
        jedisClusterNode.add(new HostAndPort("192.168.4.6", 8005));
        jedisClusterNode.add(new HostAndPort("192.168.4.7", 800));

        JedisPoolConfig config = new JedisPoolConfig();
        config.setMaxTotal(100);
        config.setMaxIdle(10);
        config.setTestOnBorrow(true);
        JedisCluster jedisCluster = new JedisCluster(jedisClusterNode, 6000, 5000, config);
        System.out.println(jedisCluster.set("student", "yangcan1"));
        System.out.println(jedisCluster.set("age", "19"));

        System.out.println(jedisCluster.get("student"));
        System.out.println(jedisCluster.get("name"));

        jedisCluster.close();

    }
}
