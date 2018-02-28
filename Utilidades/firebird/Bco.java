package firebird;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;



public class Bco
{
    public static void main(String args[])
   {
        Connection conn = null;
        String teste = "SELECT SUM(ITVQTDVDA) FROM ITEVDA WHERE TRNDAT BETWEEN('01.09.2014') AND ('29.09.2014') AND PROCOD=07898287990120";
        try
      {
         Class.forName("org.firebirdsql.jdbc.FBDriver");
                                                                              //C:\Users\pc\Videos\Bueno
         conn = DriverManager.getConnection( "jdbc:firebirdsql:192.168.0.6/3050:c:/syspdv/syspdv_srv.gdb", "SYSDBA", "masterkey");
                                           //"jdbc:firebirdsql:192.168.0.6/3050:c:/syspdv/syspdv_srv.gdb", "SYSDBA", "masterkey"
         
         Statement stm = conn.createStatement();
         ResultSet rs = stm.executeQuery(teste);
         while (rs.next())
         {
            System.out.println(  );
         }
      }
      catch(ClassNotFoundException e) {
          e.printStackTrace();
      }
      catch(SQLException e){ 
          e.printStackTrace();
      }
      finally {
         try { conn.close(); }
         catch(SQLException onConClose){ onConClose.printStackTrace(); }
      }
   }
}
