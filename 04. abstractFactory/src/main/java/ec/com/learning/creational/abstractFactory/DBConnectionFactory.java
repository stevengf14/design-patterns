package ec.com.learning.creational.abstractFactory;

import ec.com.learning.creational.abstractFactory.inter.AbstractFactory;
import ec.com.learning.creational.abstractFactory.inter.DBConnection;
import ec.com.learning.creational.abstractFactory.inter.RESTConnection;
import ec.com.learning.creational.abstractFactory.inter.impl.EmptyConnection;
import ec.com.learning.creational.abstractFactory.inter.impl.MysqlConnection;
import ec.com.learning.creational.abstractFactory.inter.impl.OracleConnection;
import ec.com.learning.creational.abstractFactory.inter.impl.PostgresqlConnection;
import ec.com.learning.creational.abstractFactory.inter.impl.SqlServerConnection;

/**
 *
 * @author Steven Guamán - February 2022
 */
public class DBConnectionFactory implements AbstractFactory {

    @Override
    public DBConnection getDB(String database) {
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

    @Override
    public RESTConnection getREST(String area) {
        return null;
    }

}
