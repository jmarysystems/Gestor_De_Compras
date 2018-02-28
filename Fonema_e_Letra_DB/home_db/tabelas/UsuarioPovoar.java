/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package home_db.tabelas;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;
import javax.swing.JOptionPane;
import derby.DB;
import utilidades.JOPM;

/**
 *
 * @author AnaMariana
 */
public class UsuarioPovoar {
    
    public static boolean criar() {     
        Connection con = null;     
        Statement s;
                
        boolean retorno;
        
        DB DB = new DB();
               
        try {

            con = DB.derby();
            
            retorno = true;
            
        } catch ( Exception e ) {
            
            retorno = false;
            JOptionPane.showMessageDialog( null, "Erro! \n" + e.getMessage().toString() );    
        } 

                        
        try{
                
            
            PreparedStatement pstm;
            
            String cadastrar = "INSERT INTO SCHEMAJMARY.USUARIO ( "
                    //+ "ID          INTEGER NOT NULL PRIMARY KEY GENERATED ALWAYS AS IDENTITY (START WITH 1, INCREMENT BY 1),"
                                        
                    + "LOGIN                       ,"
                    + "SENHA                       ,"
                    + "PERMITIRACESSO              ,"
                    
                    + "CADASTRARUSUARIO               ,"
                    + "CADASTRARFORNECEDOR            ,"
                    + "CADASTRARPRODUTO               ,"
                    + "CADASTRARPRODUTOPORFORNECEDOR  ,"
                    + "CADASTRARGESTORDECOMPRAS       ,"
                    
                    + "ALTERARUSUARIO               ,"
                    + "ALTERARFORNECEDOR            ,"
                    + "ALTERARPRODUTO               ,"
                    + "ALTERARPRODUTOPORFORNECEDOR  ,"
                    + "ALTERARGESTORDECOMPRAS       ,"
                    
                    + "ALTERARGESTORDECOMPRASCUSTO       ,"
                    + "ALTERARGESTORDECOMPRASVENDA       ,"
                    + "ALTERARGESTORDECOMPRASESTOQUE     ,"
                    + "ALTERARGESTORDECOMPRASPEDIDO      ,"
                    
                    + "EXCLUIRUSUARIO               ,"
                    + "EXCLUIRFORNECEDOR            ,"
                    + "EXCLUIRPRODUTO               ,"
                    + "EXCLUIRPRODUTOPORFORNECEDOR  ,"
                    + "EXCLUIRGESTORDECOMPRAS       ,"
                    
                    + "PESQUISARUSUARIO               ,"
                    + "PESQUISARFORNECEDOR            ,"
                    + "PESQUISARPRODUTO               ,"
                    + "PESQUISARPRODUTOPORFORNECEDOR  ,"
                    + "PESQUISARGESTORDECOMPRAS        "
                    
                    + ")" 
                    
                    + "VALUES ( "
                    + "?, ?, ?, ?, ?,"
                    + "?, ?, ?, ?, ?,"
                    + "?, ?, ?, ?, ?,"
                    + "?, ?, ?, ?, ?,"
                    + "?, ?, ?, ?,   "
                    + "?, ?, ?"
                    
                    + ")"
            ;
            
            
            pstm = con.prepareStatement( cadastrar );            
            pstm.setString ( 1,  "cleilson"                    ); 
            pstm.setString ( 2, "23071354"                     ); 
            pstm.setBoolean( 3,  true                          ); 
            
            pstm.setBoolean( 4,  true                         );  
            pstm.setBoolean( 5,  true                         );   
            pstm.setBoolean( 6,  true                         );   
            pstm.setBoolean( 7,  true                         );   
            
            pstm.setBoolean( 8,  true                         );   
            pstm.setBoolean( 9,  true                         );   
            pstm.setBoolean( 10,  true                         );   
            pstm.setBoolean( 11,  true                         );   
            
            pstm.setBoolean( 12,  true                         );   
            pstm.setBoolean( 13,  true                         );   
            pstm.setBoolean( 14,  true                         );   
            pstm.setBoolean( 15,  true                         );   
           
            pstm.setBoolean( 16,  true                         );   
            pstm.setBoolean( 17,  true                         );   
            pstm.setBoolean( 18,  true                         );   
            pstm.setBoolean( 19,  true                         ); 
            
            //
            pstm.setBoolean( 20,  true                         );   
            pstm.setBoolean( 21,  true                         );   
            pstm.setBoolean( 22,  true                         );   
            pstm.setBoolean( 23,  true                         ); 
            
            pstm.setBoolean( 24,  true                         );   
            pstm.setBoolean( 25,  true                         );   
            pstm.setBoolean( 26,  true                         );   
            pstm.setBoolean( 27,  true                         );
                        
            pstm.executeUpdate();
            
            retorno = true;

        } catch ( Exception e ) {
            
            retorno = false;
            JOPM JOptionPaneMod = new JOPM( 2, "criar(), \n"
                + e.getMessage() + "\n", "UsuarioPovoar" );
        }             
        
        
        return retorno;
    }
    
    /******************Executar Teste*************************************
     * @param args************************/
    public static void main(String[] args) {            
        criar();
    }
    /******************Executar Teste*************************************/
    
}
