package br.com.svvs.jdbc.redis;

import br.com.svvs.jdbc.redis.response.RedisArrayResponse;
import br.com.svvs.jdbc.redis.response.RedisResponse;
import br.com.svvs.jdbc.redis.response.RedisScanResponse;
import br.com.svvs.jdbc.redis.response.RedisShutdownResponse;
import br.com.svvs.jdbc.redis.response.RedisSimpleResponse;

public enum RedisCommand {

  REDISQL_CREATE_DB("REDISQL.CREATE_DB",RedisSimpleResponse.INSTANCE),
  REDISQL_EXEC("REDISQL.EXEC", RedisArrayResponse.INSTANCE),
  REDISQL_CREATE_STATEMENT("REDISQL.CREATE_STATEMENT", RedisSimpleResponse.INSTANCE),
  REDISQL_EXEC_STATEMENT("REDISQL.EXEC_STATEMENT", RedisArrayResponse.INSTANCE),
  REDISQL_DELETE_STATEMENT("REDISQL.DELETE_STATEMENT", RedisSimpleResponse.INSTANCE),
  REDISQL_UPDATE_STATEMENT("REDISQL.UPDATE_STATEMENT", RedisSimpleResponse.INSTANCE),
  REDISQL_QUERY("REDISQL.QUERY", RedisArrayResponse.INSTANCE),
  REDISQL_QUERY_STATEMENT("REDISQL.QUERY_STATEMENT", RedisArrayResponse.INSTANCE), 

  APPEND(RedisSimpleResponse.INSTANCE),
  AUTH(RedisSimpleResponse.INSTANCE),
  BGREWRITEAOF(RedisSimpleResponse.INSTANCE),
  BGSAVE(RedisSimpleResponse.INSTANCE),
  BITCOUNT(RedisSimpleResponse.INSTANCE),
  BITFIELD(RedisArrayResponse.INSTANCE),
  BITOP(RedisSimpleResponse.INSTANCE),
  BITPOS(RedisSimpleResponse.INSTANCE),
  BLPOP(RedisArrayResponse.INSTANCE),
  BRPOP(RedisArrayResponse.INSTANCE),
  BRPOPLPUSH(RedisSimpleResponse.INSTANCE),
  DBSIZE(RedisSimpleResponse.INSTANCE),
  DECR(RedisSimpleResponse.INSTANCE),
  DECRBY(RedisSimpleResponse.INSTANCE),
  DEL(RedisSimpleResponse.INSTANCE),
  EXISTS(RedisSimpleResponse.INSTANCE),
  EXPIRE(RedisSimpleResponse.INSTANCE),
  EXPIREAT(RedisSimpleResponse.INSTANCE),
  FLUSHALL(RedisSimpleResponse.INSTANCE),
  FLUSHDB(RedisSimpleResponse.INSTANCE),
  GET(RedisSimpleResponse.INSTANCE),
  GETBIT(RedisSimpleResponse.INSTANCE),
  GETSET(RedisSimpleResponse.INSTANCE),
  HDEL(RedisSimpleResponse.INSTANCE),
  HEXISTS(RedisSimpleResponse.INSTANCE),
  HGET(RedisSimpleResponse.INSTANCE),
  HGETALL(RedisArrayResponse.INSTANCE),
  HINCRBY(RedisSimpleResponse.INSTANCE),
  HINCRBYFLOAT(RedisSimpleResponse.INSTANCE),
  HKEYS(RedisArrayResponse.INSTANCE),
  HLEN(RedisSimpleResponse.INSTANCE),
  HMGET(RedisArrayResponse.INSTANCE),
  HMSET(RedisSimpleResponse.INSTANCE),
  HSCAN(RedisScanResponse.INSTANCE),
  HSET(RedisSimpleResponse.INSTANCE),
  HSETNX(RedisSimpleResponse.INSTANCE),
  HSTRLEN(RedisSimpleResponse.INSTANCE),
  HVALS(RedisArrayResponse.INSTANCE),
  INCR(RedisSimpleResponse.INSTANCE),
  INCRBY(RedisSimpleResponse.INSTANCE),
  INFO(RedisSimpleResponse.INSTANCE),
  KEYS(RedisArrayResponse.INSTANCE),
  LASTSAVE(RedisSimpleResponse.INSTANCE),
  LINDEX(RedisSimpleResponse.INSTANCE),
  LINSERT(RedisSimpleResponse.INSTANCE),
  LLEN(RedisSimpleResponse.INSTANCE),
  LPOP(RedisSimpleResponse.INSTANCE),
  LPUSH(RedisSimpleResponse.INSTANCE),
  LPUSHX(RedisSimpleResponse.INSTANCE),
  LRANGE(RedisArrayResponse.INSTANCE),
  LREM(RedisSimpleResponse.INSTANCE),
  LSET(RedisSimpleResponse.INSTANCE),
  LTRIM(RedisSimpleResponse.INSTANCE),
  MGET(RedisArrayResponse.INSTANCE),
  MOVE(RedisSimpleResponse.INSTANCE),
  MSET(RedisSimpleResponse.INSTANCE),
  PEXPIRE(RedisSimpleResponse.INSTANCE),
  PTTL(RedisSimpleResponse.INSTANCE),
  QUIT(RedisSimpleResponse.INSTANCE),
  RANDOMKEY(RedisSimpleResponse.INSTANCE),
  RENAME(RedisSimpleResponse.INSTANCE),
  RENAMENX(RedisSimpleResponse.INSTANCE),
  RPOP(RedisSimpleResponse.INSTANCE),
  RPOPLPUSH(RedisSimpleResponse.INSTANCE),
  RPUSH(RedisSimpleResponse.INSTANCE),
  RPUSHX(RedisSimpleResponse.INSTANCE),
  SADD(RedisSimpleResponse.INSTANCE),
  SAVE(RedisSimpleResponse.INSTANCE),
  SCAN(RedisScanResponse.INSTANCE),
  SCARD(RedisSimpleResponse.INSTANCE),
  SELECT(RedisSimpleResponse.INSTANCE),
  SET(RedisSimpleResponse.INSTANCE),
  SETBIT(RedisSimpleResponse.INSTANCE),
  SETNX(RedisSimpleResponse.INSTANCE),
  SDIFF(RedisArrayResponse.INSTANCE),
  SDIFFSTORE(RedisSimpleResponse.INSTANCE),
  SHUTDOWN(RedisShutdownResponse.INSTANCE),
  SINTER(RedisArrayResponse.INSTANCE),
  SINTERSTORE(RedisSimpleResponse.INSTANCE),
  SISMEMBER(RedisSimpleResponse.INSTANCE),
  SMEMBERS(RedisArrayResponse.INSTANCE),
  SMOVE(RedisSimpleResponse.INSTANCE),
  SORT(RedisSimpleResponse.INSTANCE),
  SPOP(RedisSimpleResponse.INSTANCE),
  SRANDMEMBER(RedisSimpleResponse.INSTANCE),
  SREM(RedisSimpleResponse.INSTANCE),
  SSCAN(RedisScanResponse.INSTANCE),
  STRLEN(RedisSimpleResponse.INSTANCE),
  SUNION(RedisSimpleResponse.INSTANCE),
  SUNIONSTORE(RedisSimpleResponse.INSTANCE),
  TIME(RedisArrayResponse.INSTANCE),
  TTL(RedisSimpleResponse.INSTANCE),
  TYPE(RedisSimpleResponse.INSTANCE),
  UNWATCH(RedisSimpleResponse.INSTANCE),
  WATCH(RedisSimpleResponse.INSTANCE),
  ZADD(RedisSimpleResponse.INSTANCE),
  ZCARD(RedisSimpleResponse.INSTANCE),
  ZCOUNT(RedisSimpleResponse.INSTANCE),
  ZINCRBY(RedisSimpleResponse.INSTANCE),
  ZINTERSTORE(RedisSimpleResponse.INSTANCE),
  ZLEXCOUNT(RedisSimpleResponse.INSTANCE),
  ZRANGE(RedisArrayResponse.INSTANCE),
  ZRANGEBYLEX(RedisArrayResponse.INSTANCE),
  ZRANGEBYSCORE(RedisArrayResponse.INSTANCE),
  ZRANK(RedisSimpleResponse.INSTANCE),
  ZREM(RedisSimpleResponse.INSTANCE),
  ZREMRANGEBYLEX(RedisSimpleResponse.INSTANCE),
  ZREMRANGEBYRANK(RedisSimpleResponse.INSTANCE),
  ZREMRANGEBYSCORE(RedisSimpleResponse.INSTANCE),
  ZREVRANGE(RedisArrayResponse.INSTANCE),
  ZREVRANGEBYLEX(RedisArrayResponse.INSTANCE),
  ZREVRANGEBYSCORE(RedisArrayResponse.INSTANCE),
  ZREVRANK(RedisSimpleResponse.INSTANCE),
  ZSCAN(RedisScanResponse.INSTANCE),
  ZSCORE(RedisSimpleResponse.INSTANCE),
  ZUNIONSTORE(RedisSimpleResponse.INSTANCE);

  private final RedisResponse response;
  private final String command;

  private RedisCommand(RedisResponse response) {
    this(null, response);
  }

  private RedisCommand(String command, RedisResponse response) {
    this.command = command == null ? name() : command;
    this.response = response;
  }

  public RedisResponse getResponse() {
    return response;
  }
  
  public String command() {
    return command;
  }
}
