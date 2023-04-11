/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
        //config.setJdbcUrl("jdbc:postgresql://192.168.0.201/desarrollo");
        //config.setUsername("edwin");
        //config.setPassword("edwin");
        ds = new HikariDataSource(config);
    }
    
    private DbConnection(){}
    
    public static Connection getConnection() throws SQLException{
        return ds.getConnection();
    }
    
}
