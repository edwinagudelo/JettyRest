
package co.sbi.jettyrest.model;

import java.sql.Connection;
import java.sql.SQLException;
import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

/**
 *
 * @author ICM7223A
 */
public class DbConnection {
    
    private static HikariConfig config = new HikariConfig("resources/dbaccess.properties");
    private static HikariDataSource ds;
    
    static {
        ds = new HikariDataSource(config);
    }
    
    private DbConnection(){}
    
    public static Connection getConnection() throws SQLException{
        return ds.getConnection();
    }
    
}
