package br.com.svvs.jdbc.redis;

import java.sql.ResultSet;
import java.sql.SQLException;

public abstract class RedisAbstractStatement {

    protected boolean isClosed = false;
    protected RedisConnection connection;
    protected ResultSet resultSet;
    protected String sql;

    protected RedisAbstractStatement(String sql, RedisConnection connection) {
        this.sql  = sql;
        this.connection = connection;
    }
    protected RedisAbstractStatement(RedisConnection connection) {
        this.connection = connection;
    }

    public boolean execute(String sql) throws SQLException {

        if(isClosed)
            throw new SQLException("This statement is closed.");

        try {
            resultSet = RedisCommandProcessor.runCommand(connection, sql, RedisCommand.REDISQL_EXEC);

            return true;

        } catch (RedisParseException |
                 RedisResultException e) {
            throw new SQLException(e);
        }
    }
    
    public boolean execute(String sql, final RedisCommand command) throws SQLException {

      if(isClosed)
        throw new SQLException("This statement is closed.");

      try {
        resultSet = RedisCommandProcessor.runCommand(connection, sql, command);

        return true;

      } catch (RedisParseException |
          RedisResultException e) {
        throw new SQLException(e);
      }
    }

}
