/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package home_db.tabelas;

import java.sql.Connection;
import java.sql.Statement;
import javax.swing.JOptionPane;
import derby.DB;

/**
 *
 * @author AnaMariana
 */
public class CategoriaDoProduto {
    
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

        try {                     
            
            s = con.createStatement(); 
            
            s       
            .execute( "CREATE TABLE SCHEMAJMARY.CATEGORIADOPRODUTO ( "
                    + "ID          INTEGER NOT NULL PRIMARY KEY GENERATED ALWAYS AS IDENTITY (START WITH 1, INCREMENT BY 1),"

                    + "NOMEDACATEGORIADOPRODUTO   VARCHAR(300)   "
                                        
                    + ")" 
            );
            
        } catch ( Exception e ) {
            
            retorno = false;
            JOptionPane.showMessageDialog( null, "Erro! \n" + e.getMessage().toString() );    
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
