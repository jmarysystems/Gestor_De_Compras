/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package gestor_new;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;
import syspdv.RetornarQuantidadeVendida;
import utilidades.JOPM;
import utilidades.Retornar_Data_de_Hoje_Mais_IntDias_Receb;

/**
 *
 * @author Ana
 */
public class Tabela_Pesquisa_BD_Gestor_New_Venda extends Thread { 
    
    int i = 0;
    String codigoProduto = "";
    Tabela_New_BD_Gestor Tabela_New_BD_Gestor;
    
    public Tabela_Pesquisa_BD_Gestor_New_Venda( Tabela_New_BD_Gestor Tabela_New_BD_Gestor2, int i2, String codigoProduto2 ){   
        
        i             = i2;
        codigoProduto = codigoProduto2;
        Tabela_New_BD_Gestor = Tabela_New_BD_Gestor2;
    } 
            
    public void run(){  
        synchronized ( this ) {
            
            verificarsedbexiste(); 
        }  
    }  
    
    public void verificarsedbexiste(){  
        synchronized(this) {  
            
            Tabela_New_BD_Gestor.tmPesquisa.setValueAt( vendaEmXDias( codigoProduto, 7  ) , i, 4);
        }  
    } 
  
    public String vendaEmXDias(String codigoProduto, int dias ){
        synchronized(this) {
            
            String retorno      = "";
            String ultimaCompra = "";
            String dataHoje     = "";
            try { 
            
                Date dataHojeMesnos7 = Retornar_Data_de_Hoje_Mais_IntDias_Receb.get( dias, false );
            
                SimpleDateFormat out = new SimpleDateFormat("dd.MM.yyyy");
            
                ultimaCompra = out.format( dataHojeMesnos7 );
            
                GregorianCalendar gc = new GregorianCalendar();
                Date dataHojeB = gc.getTime();
            
                dataHoje = out.format( dataHojeB );
            
                float quantidadeVendidaDoProduto = RetornarQuantidadeVendida.retornarQuantidadeVendida( ultimaCompra, dataHoje, codigoProduto.trim() );
            
                retorno = String.valueOf( ( int ) quantidadeVendidaDoProduto );
            
            } catch( Exception e ){ JOPM JOptionPaneMod = new JOPM( 2, "vendaEm7Dias(String codigoProduto ), \n"
                    + e.getMessage() + "\n", this.getClass().getSimpleName() ); }   
        
            //System.out.println( ultimaCompra + " - " + dataHoje + " - " + retorno );
            return retorno;
        }
    }
                    
    /******************Executar Teste*************************************
     * @param args************************
    public static void main(String[] args) {            
          
        ControleThread t1 = new ControleThread(); 
        
        t1.setName("Thread1");   
        
        t1.start();  
    }
    /******************Executar Teste*************************************/
    
}
