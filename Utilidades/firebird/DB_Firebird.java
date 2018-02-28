package firebird;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author ana
 */
public class DB_Firebird {
    
    public Connection derby(){
        Connection con = null;
        
        try{       
                  
            String url = "";           
            String driver = "";            
            switch( DB_Bean_Firebird.tipo_de_conexao ){
                case "alone": 
                        url    = DB_Bean_Firebird.urlAlone;           
                        driver = DB_Bean_Firebird.driverAlone;
                    break;
                case "network": 
                        url    = DB_Bean_Firebird.urlNetwork;           
                        driver = DB_Bean_Firebird.driverNetwork;
                    break;    
            }
                   
            Class.forName( driver );        
            con = DriverManager.getConnection( url );
        }catch(ClassNotFoundException | SQLException e){ e.printStackTrace(); }
    
        return con;
    }
    
    public static void main( String args[] ){
        DB_Firebird DB_Firebird = new DB_Firebird();
        DB_Firebird.derby();
    }
    
}
