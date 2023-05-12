
package co.sbi.jettyrest.infrastructure;

import java.sql.Connection;
import java.sql.SQLException;
import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

/**
 *
 * @author Edwin Agudelo (edwin.agudelo@gmail.com)
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
