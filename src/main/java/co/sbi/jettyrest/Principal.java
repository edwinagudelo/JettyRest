
package co.sbi.jettyrest;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.servlet.ServletContextHandler;
import org.eclipse.jetty.servlet.ServletHolder;
import org.glassfish.jersey.servlet.ServletContainer;

/**
 *
 * @author Edwin Agudelo (edwin.agudelo@gmail.com)
 */
public class Principal {
    
    static final Logger logger = LoggerFactory.getLogger(Principal.class);
    
    public static void main(String[] args){
        
        Properties prop = new Properties();
        
        logger.info("Iniciando aplicacion");
        logger.info("Cargando archivo properties principal");
        
        try(FileInputStream fistr = new FileInputStream("resources/config.properties")){
            prop.load(fistr);
            logger.info("Puerto:" + prop.getProperty("application.port"));
        }catch(IOException ioex){
            logger.error("Error al cargar el archivo properties", ioex);
            return;
        }
        
        Server server = new Server(Integer.parseInt(prop.getProperty("application.port","8280")));
        ServletContextHandler ctx = new ServletContextHandler(ServletContextHandler.NO_SESSIONS);
        
        ctx.setContextPath("/");
        server.setHandler(ctx);
        
        ServletHolder serHol = ctx.addServlet(ServletContainer.class, "/test/rest/*");
        serHol.setInitOrder(1);
        serHol.setInitParameter("jersey.config.server.provider.packages", "co.sbi.jettyrest.web.rest");
        
        try{
            logger.info("Iniciando Servidor");
            server.start();
            server.join();
        }catch(Exception ex){
            logger.error("Error al iniciar la aplicacion", ex);
        }finally{
            server.destroy();
            logger.info("Servidor finalizado");
        }
    }
    
}
