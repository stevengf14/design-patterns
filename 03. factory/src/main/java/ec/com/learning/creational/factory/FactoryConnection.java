package ec.com.learning.creational.factory;

import ec.com.learning.creational.factory.inter.Connection;
import ec.com.learning.creational.factory.inter.impl.EmptyConnection;
import ec.com.learning.creational.factory.inter.impl.MysqlConnection;
import ec.com.learning.creational.factory.inter.impl.OracleConnection;
import ec.com.learning.creational.factory.inter.impl.PostgresqlConnection;
import ec.com.learning.creational.factory.inter.impl.SqlServerConnection;

/**
 *
 * @author Steven Guamán - February 2022
 */
public class FactoryConnection {

    public Connection getConnection(String database) {
        if (database == null) {
            return new EmptyConnection();
        }
        if (database.equalsIgnoreCase("MYSQL")) {
            return new MysqlConnection();
        } else if (database.equalsIgnoreCase("ORACLE")) {
            return new OracleConnection();
        } else if (database.equalsIgnoreCase("POSTGRESQL")) {
            return new PostgresqlConnection();
        } else if (database.equalsIgnoreCase("SQLSERVER")) {
            return new SqlServerConnection();
        }
        return new EmptyConnection();
    }
}
