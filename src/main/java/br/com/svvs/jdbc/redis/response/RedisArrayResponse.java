package br.com.svvs.jdbc.redis.response;

import java.sql.ResultSet;
import java.util.Arrays;

import br.com.svvs.jdbc.redis.RedisConnection;
import br.com.svvs.jdbc.redis.RedisResultSet;

public class RedisArrayResponse implements RedisResponse {

    public static final RedisResponse INSTANCE = new RedisArrayResponse();

    private RedisArrayResponse() {
    }

    @Override
    public ResultSet processResponse(final RedisConnection connection, final String command, final Object response) {
        return new RedisResultSet((Object[])response);
    }

}
