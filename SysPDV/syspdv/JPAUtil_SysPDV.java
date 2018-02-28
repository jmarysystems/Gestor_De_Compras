package syspdv;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JPAUtil_SysPDV implements Serializable {
    
    public static EntityManager em() { EntityManager em = null; try{

            final String PERSISTENCE_UNIT_NAME = "todos";   //C:\Users\Usuario\Videos
            EntityManagerFactory factory;
            
            String str  = "jdbc:firebirdsql:192.168.0.6/3050:c:/syspdv/syspdv_srv.gdb";
            String str2 = "jdbc:firebirdsql:localhost/3050:C:/Users/pc/Videos/Bueno/syspdv_srv.gdb";
            String str3 = "jdbc:firebirdsql:localhost/3050:C:/Users/Usuario/Videos/syspdv_srv.gdb";
        
            Map pmap = new HashMap();
            pmap.put("javax.persistence.jdbc.driver", "org.firebirdsql.jdbc.FBDriver" );  
            pmap.put("javax.persistence.jdbc.url", str2 );  
            pmap.put("javax.persistence.jdbc.user", "SYSDBA" );  
            pmap.put("javax.persistence.jdbc.password", "masterkey" );
            pmap.put("eclipselink.jdbc.native-sql", "true");
            factory = Persistence.createEntityManagerFactory( PERSISTENCE_UNIT_NAME,pmap);  
            em = factory.createEntityManager();   
                                    
        } catch( Exception e ){ /*e.printStackTrace(); JOptionPaneMod JOPM = new JOptionPaneMod( 2, "emUtil(), \n"
                + e.getMessage() + "\n", "JPAUtil" );*/ }
    
        return em;
    }
}