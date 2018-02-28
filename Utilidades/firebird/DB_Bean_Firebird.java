package firebird;

/**
 *
 * @author ana
 */
public class DB_Bean_Firebird {
    
    public static String tipo_de_conexao = "network"; //alone
    public static String ip_do_servidor  = "192.168.0.6";
    public static String porta_servidor  = "5030";
    public static String tipoDeBanco     = "firebirdsql";
    public static String nomeDoBanco     = "syspdv_srv.gdb";
    public static String usuario         = "sysbda";
    public static String senha           = "masterkey";    
    public static String endereco_db     = System.getProperty("user.home") + System.getProperty("file.separator") + "JMarySystems";       
    public static String bootPassword    = "a@Simple_More_Than_16_Char_Password";
    
    public static String driverAlone     = "org.firebirdsql.jdbc.FBDriver"; 
    public static String driverNetwork   = "org.firebirdsql.jdbc.FBDriver";
   
    public static String urlAlone        = "jdbc:"+tipoDeBanco+":" + endereco_db + "/" + nomeDoBanco+";" + "user="+usuario+";" + "password="+senha+"";
    public static String urlNetwork      = "jdbc:"+tipoDeBanco+"://" + ip_do_servidor + ":"+porta_servidor+"/" + nomeDoBanco+";" + "user="+usuario+";" + "password="+senha+"";
    
}
