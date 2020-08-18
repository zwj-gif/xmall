package cn.exrick.common.jedis;

import java.util.List;

/**
 * @author Exrickx
 */
public interface JedisClient {

	String set(String key, String value);//设置给定key的值

	String get(String key);//获取给定key的值

	Boolean exists(String key);//检查给定key是否存在

	Long expire(String key, int seconds);//给定key设置过期时间

	Long ttl(String key);//返回给定key的剩余生存时间

	Long incr(String key);

	Long hset(String key, String field, String value);

	String hget(String key, String field);

	Long hdel(String key, String... field);//用于删除哈希表 key 中的一个或多个指定字段，不存在的字段将被忽略

	Boolean hexists(String key, String field);//查看哈希表key，指定字段是否存在

	List<String> hvals(String key);//返回哈希表所有域的值

	Long del(String key);//用于在key存在时删除key
}
