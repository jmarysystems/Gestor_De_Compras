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
public class ProdutoPorFornecedor {
    
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
            .execute( "CREATE TABLE SCHEMAJMARY.PRODUTOPORFORNECEDOR ( "
                    + "ID            INTEGER NOT NULL PRIMARY KEY GENERATED ALWAYS AS IDENTITY (START WITH 1, INCREMENT BY 1),"
 
                    + "NOMEOURAZAOSOCIAL    VARCHAR(300)  ,"
                    + "NOMEFANTASIA         VARCHAR(300)  ,"
                    
                    + "CODIGOPRODUTO                 VARCHAR(300)  ,"
                    + "DESCRICAOPRODUTO              VARCHAR(300)  ,"
                    
                    + "NOMEDACATEGORIADOPRODUTO      VARCHAR(300)  ,"
                    
                    + "NOMEDAEMBALAGEM               VARCHAR(300)  ,"                    
                    + "CODIGODAEMBALAGEM             VARCHAR(300)  ,"
                    + "QUANTIDADEDEITENSNAEMBALAGEM  INTEGER       ,"
                    
                    + "ID_EMBALAGEM    INTEGER NOT NULL,"                    
                    + "CONSTRAINT EMBALAGEM_ID_PRODUTOPORFORNECEDOR FOREIGN KEY (ID_EMBALAGEM) references SCHEMAJMARY.EMBALAGEM (ID),"
                    
                    + "ID_CATEGORIADOPRODUTO    INTEGER NOT NULL,"                    
                    + "CONSTRAINT CATEGORIADOPRODUTO_ID_PRODUTOPORFORNECEDOR FOREIGN KEY (ID_CATEGORIADOPRODUTO) references SCHEMAJMARY.CATEGORIADOPRODUTO (ID),"
                                                            
                    + "ID_PRODUTO    INTEGER NOT NULL   ,"                    
                    + "CONSTRAINT PRODUTO_ID_PRODUTOPORFORNECEDOR FOREIGN KEY (ID_PRODUTO) references SCHEMAJMARY.PRODUTO (ID),"
                    
                    + "ID_FORNECEDOR    INTEGER NOT NULL,"                    
                    + "CONSTRAINT FORNECEDOR_ID_PRODUTOPORFORNECEDOR FOREIGN KEY (ID_FORNECEDOR) references SCHEMAJMARY.FORNECEDOR (ID)"
                    
                    + ")" 
            );
            
        } catch ( Exception e ) {
            
            retorno = false;
            JOptionPane.showMessageDialog( null, "Erro! \n" + e.getMessage() );    
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
