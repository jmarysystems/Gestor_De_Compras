/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package gestor_new;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import javax.persistence.Query;
import jpa.JPAUtil;
import syspdv.RetornarQuantidadeVendida;
import utilidades.JOPM;
import utilidades.Retornar_Data_de_Hoje_Mais_IntDias_Receb;

/**
 *
 * @author Ana
 */
public class Tabela_Pesquisa_BD_Gestor_New_Extras extends Thread { 
    
    int i = 0;
    String codigoProduto = "";
    Tabela_New_BD_Gestor Tabela_New_BD_Gestor;
    
    private List<gestor.Gestordecomprasprodutos> list;
    
    SimpleDateFormat out = new SimpleDateFormat("dd.MM.yyyy");
    
    public Tabela_Pesquisa_BD_Gestor_New_Extras( Tabela_New_BD_Gestor Tabela_New_BD_Gestor2, int i2, String codigoProduto2 ){   
        
        //System.out.println( "I - " + i2 + " - " + "codigoProduto - " + codigoProduto2 );
        i             = i2;
        codigoProduto = codigoProduto2;
        Tabela_New_BD_Gestor = Tabela_New_BD_Gestor2;
    } 
            
    public void run(){  
        
        synchronized ( this ) {
            
            try{
                
                a();   
            } catch( Exception e ){}
        }          
    }  
    
    public void a(){  
        synchronized(this) { 
            
            try{
            
                Query q = JPAUtil.em().createNativeQuery( "SELECT * FROM SCHEMAJMARY.GESTORDECOMPRASPRODUTOS WHERE CODIGOPRODUTO = ? ORDER BY ID DESC", gestor.Gestordecomprasprodutos.class );
                q.setParameter(1, codigoProduto.trim() );
                
                list = q.getResultList();
                
                b();
                    
            } catch( Exception e ){}
        }          
    } 
    
    public void b(){  
        
        synchronized ( this ) {
            
            try{
                
                for (int r = 0; r < list.size(); r++){
                    
                    if( r == 0 ) {
                        
                        c( r );
                    }
                    else if( r == 1 ) {
                        d( r );
                    }
                    else if( r == 2 ) {
                        e( r );
                    }
                    else if( r > 2 ) {
                        
                        break;
                    }
                }
                
            } catch( Exception e ){}
        }          
    }
    
    public void c(int nList){  
        
        synchronized ( this ) {
            
            try{
                
                try{ Tabela_New_BD_Gestor.tmPesquisa.setValueAt( out.format( list.get( nList ).getData() ), i, 7);  } catch( Exception e ){}
                try{ Tabela_New_BD_Gestor.tmPesquisa.setValueAt( list.get( nList ).getCusto()             , i, 8);  } catch( Exception e ){}
                try{ Tabela_New_BD_Gestor.tmPesquisa.setValueAt( list.get( nList ).getVenda()             , i, 9);  } catch( Exception e ){}
                try{ Tabela_New_BD_Gestor.tmPesquisa.setValueAt( list.get( nList ).getEstoque()           , i, 10); } catch( Exception e ){}
                try{ Tabela_New_BD_Gestor.tmPesquisa.setValueAt( list.get( nList ).getPedido()            , i, 11); } catch( Exception e ){}
                
            } catch( Exception e ){}
        }          
    }
    
    public void d(int nList){  
        
        synchronized ( this ) {
            
            try{
                
                try{ Tabela_New_BD_Gestor.tmPesquisa.setValueAt( out.format( list.get( nList ).getData() ), i, 12);  } catch( Exception e ){}
                try{ Tabela_New_BD_Gestor.tmPesquisa.setValueAt( list.get( nList ).getCusto()             , i, 13);  } catch( Exception e ){}
                try{ Tabela_New_BD_Gestor.tmPesquisa.setValueAt( list.get( nList ).getVenda()             , i, 14);  } catch( Exception e ){}
                try{ Tabela_New_BD_Gestor.tmPesquisa.setValueAt( list.get( nList ).getEstoque()           , i, 15); } catch( Exception e ){}
                try{ Tabela_New_BD_Gestor.tmPesquisa.setValueAt( list.get( nList ).getPedido()            , i, 16); } catch( Exception e ){}
                
            } catch( Exception e ){}
        }          
    }
    
    public void e(int nList){  
        
        synchronized ( this ) {
            
            try{
                
                try{ Tabela_New_BD_Gestor.tmPesquisa.setValueAt( out.format( list.get( nList ).getData() ), i, 17);  } catch( Exception e ){}
                try{ Tabela_New_BD_Gestor.tmPesquisa.setValueAt( list.get( nList ).getCusto()             , i, 18);  } catch( Exception e ){}
                try{ Tabela_New_BD_Gestor.tmPesquisa.setValueAt( list.get( nList ).getVenda()             , i, 19);  } catch( Exception e ){}
                try{ Tabela_New_BD_Gestor.tmPesquisa.setValueAt( list.get( nList ).getEstoque()           , i, 20); } catch( Exception e ){}
                try{ Tabela_New_BD_Gestor.tmPesquisa.setValueAt( list.get( nList ).getPedido()            , i, 21); } catch( Exception e ){}
                
            } catch( Exception e ){}
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
