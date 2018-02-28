/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package html;

import java.text.SimpleDateFormat;
import java.util.List;
import javax.persistence.Query;
import jpa.JPAUtil;

/**
 *
 * @author Ana
 */
public class Html_Extras { 
    
    private String codigoProduto = "";
    
    private List<gestor.Gestordecomprasprodutos> list;
    
    private SimpleDateFormat out = new SimpleDateFormat("dd.MM.yyyy");
    
    public Html_Extras( String codigoProduto2 ){   
        
        codigoProduto = codigoProduto2;
    } 
    
    String data1    = "";
    String custo1   = "";
    String venda1   = "";
    String estoque1 = "";
    String pedido1  = "";
    
    String data2    = "";
    String custo2   = "";
    String venda2   = "";
    String estoque2 = "";
    String pedido2  = "";
    
    String data3    = "";
    String custo3   = "";
    String venda3   = "";
    String estoque3 = "";
    String pedido3  = "";
            
    public String get(){  
            
        try{
                
            Query q = JPAUtil.em().createNativeQuery( "SELECT * FROM SCHEMAJMARY.GESTORDECOMPRASPRODUTOS WHERE CODIGOPRODUTO = ? ORDER BY ID DESC", gestor.Gestordecomprasprodutos.class );
            q.setParameter(1, codigoProduto.trim() );
                
            list = q.getResultList();
              
            b();
            
        } catch( Exception e ){}   
        
        return getR();
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
                
                try{ data1 = String.valueOf   ( out.format( list.get( nList ).getData() ) );  } catch( Exception e ){}
                try{ custo1 = String.valueOf  ( list.get( nList ).getCusto()              );  } catch( Exception e ){}
                try{ venda1 = String.valueOf  ( list.get( nList ).getVenda()              );  } catch( Exception e ){}
                try{ estoque1 = String.valueOf( list.get( nList ).getEstoque()            ); } catch( Exception e ){}
                try{ pedido1 = String.valueOf ( list.get( nList ).getPedido()             ); } catch( Exception e ){}
                
            } catch( Exception e ){}
        }          
    }
    
    public void d(int nList){  
        
        synchronized ( this ) {
            
            try{
                
                try{ data2 = String.valueOf   ( out.format( list.get( nList ).getData() ) );  } catch( Exception e ){}
                try{ custo2 = String.valueOf  ( list.get( nList ).getCusto()              );  } catch( Exception e ){}
                try{ venda2 = String.valueOf  ( list.get( nList ).getVenda()              );  } catch( Exception e ){}
                try{ estoque2 = String.valueOf( list.get( nList ).getEstoque()            ); } catch( Exception e ){}
                try{ pedido2 = String.valueOf ( list.get( nList ).getPedido()             ); } catch( Exception e ){}
                
            } catch( Exception e ){}
        }          
    }
    
    public void e(int nList){  
        
        synchronized ( this ) {
            
            try{
                
                try{ data3 = String.valueOf   ( out.format( list.get( nList ).getData() ) );  } catch( Exception e ){}
                try{ custo3 = String.valueOf  ( list.get( nList ).getCusto()              );  } catch( Exception e ){}
                try{ venda3 = String.valueOf  ( list.get( nList ).getVenda()              );  } catch( Exception e ){}
                try{ estoque3 = String.valueOf( list.get( nList ).getEstoque()            ); } catch( Exception e ){}
                try{ pedido3 = String.valueOf ( list.get( nList ).getPedido()             ); } catch( Exception e ){}
                
            } catch( Exception e ){}
        }          
    }
    
    public String getR(){  
        String retorno = 
            "<td  align='center'>&nbsp;&nbsp;" + data1    + "&nbsp;&nbsp;</td>" +
            "<td align='right'>&nbsp;&nbsp;" + custo1   + "&nbsp;&nbsp;</td>" +
            "<td align='right'>&nbsp;&nbsp;" + venda1   + "&nbsp;&nbsp;</td>" +
            "<td align='right'>&nbsp;&nbsp;" + estoque1 + "&nbsp;&nbsp;</td>" +
            "<td align='right'>&nbsp;&nbsp;" + pedido1  + "&nbsp;&nbsp;</td>" +
        
            "<td align='center'>&nbsp;&nbsp;" + data2    + "&nbsp;&nbsp;</td>" +
            "<td align='right'>&nbsp;&nbsp;" + custo2   + "&nbsp;&nbsp;</td>" +
            "<td align='right'>&nbsp;&nbsp;" + venda2   + "&nbsp;&nbsp;</td>" +
            "<td align='right'>&nbsp;&nbsp;" + estoque2 + "&nbsp;&nbsp;</td>" +
            "<td align='right'>&nbsp;&nbsp;" + pedido2  + "&nbsp;&nbsp;</td>" +
        
            "<td align='center'>&nbsp;&nbsp;" + data3    + "&nbsp;&nbsp;</td>" +
            "<td align='right'>&nbsp;&nbsp;" + custo3   + "&nbsp;&nbsp;</td>" +
            "<td align='right'>&nbsp;&nbsp;" + venda3   + "&nbsp;&nbsp;</td>" +
            "<td align='right'>&nbsp;&nbsp;" + estoque3 + "&nbsp;&nbsp;</td>" +
            "<td align='right'>&nbsp;&nbsp;" + pedido3  + "&nbsp;&nbsp;</td>" ;
        
        return retorno;
    }  
            
}
