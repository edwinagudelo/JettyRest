
package co.sbi.jettyrest.model;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *
 * @author ICM7223A
 */
public class DbActions {
    
    static final Logger logger = LoggerFactory.getLogger(DbActions.class);
    
    public static String getVersion(){
        String retorno = "";
        try{
            Connection conn = DbConnection.getConnection();
            PreparedStatement ps = conn.prepareStatement("Select version()");
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                retorno = rs.getString(1);
            }
        }catch(SQLException sqlex){
            logger.error("Error al traer la version de la base de datos", sqlex);
            retorno = "Error";
        }
        return retorno;
    }
    
}
