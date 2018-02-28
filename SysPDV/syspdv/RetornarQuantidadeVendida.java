/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package syspdv;

import java.util.List;
import javax.persistence.Query;

/**
 *
 * @author caixa
 */
public class RetornarQuantidadeVendida {
    
    public static float retornarQuantidadeVendida( String dataInicial, String dataFinal, String codigoProduto2 ) {                                                      
        float retorno = 0; //System.out.println( dataInicial + " - " + dataFinal + " - " + codigoProduto2 );
        try { 
            String codigoProdutoX = "";
            try{
                StringBuilder resp = new StringBuilder();
                int fim = 14 - codigoProduto2.length(); 
                if( codigoProduto2.length() < 14 ){
                    
                    for (int x = 0; x < fim; x++) {
                        resp.append('0');
                    }
                }
                codigoProdutoX = resp.toString().trim()+codigoProduto2.trim();
            } catch( Exception e ){}
            
            String codigoProduto = retornarProcod( codigoProdutoX );
            
            //System.out.println( dataInicial + " - " + dataFinal + " - " + codigoProduto + " - "  + codigoProduto2);

            if ( codigoProduto.trim().equals("0") ){ 
                
                 codigoProduto =  codigoProdutoX;
            }
            
            Query qSys = JPAUtil_SysPDV.em().createNativeQuery( "SELECT * FROM ITEVDA WHERE TRNDAT BETWEEN('"+dataInicial+"') AND ('"+dataFinal+"') AND PROCOD='"+codigoProduto+"'", syspdv.Itevda.class );
            //"SELECT SUM(ITVQTDVDA) FROM ITEVDA WHERE TRNDAT BETWEEN('01.09.2014') AND ('29.09.2014') AND PROCOD=07898287990120"
            List<syspdv.Itevda> list = qSys.getResultList();

            if ( list.isEmpty() ){  
                retorno = 0;
            }else{
                for (int i = 0; i < list.size(); i++){
                    
                    retorno += list.get(i).getItvqtdvda().floatValue();                                        
                }
                
                //System.out.println( retorno );
            }
        } catch( Exception e ){ retorno = -1;/*JOptionPaneMod JOptionPaneMod = new JOptionPaneMod( 2, "pesquisar(), \n"
                + e.getMessage() + "\n", "Menu_Pesquisa" );*/ }    
        
        return retorno;
    } 
    
    public static String retornarProcod( String codigoProduto2 ) {                                                      
        String retorno = ""; 
        try { 
            String codigoProdutoX = "";
            try{
                StringBuilder resp = new StringBuilder();
                int fim = 14 - codigoProduto2.length(); 
                if( codigoProduto2.length() < 14 ){
                    
                    for (int x = 0; x < fim; x++) {
                        resp.append('0');
                    }
                }
                codigoProdutoX = resp.toString().trim()+codigoProduto2.trim();
            } catch( Exception e ){}
            
            String codigoProduto = codigoProdutoX;
            //System.out.println( "PROCOD COM BASE NO PROCODAUX " + codigoProduto );
                   
            Query qSys;
            List<Produtoaux> list = null;
            try{

                qSys = JPAUtil_SysPDV.em().createNativeQuery( "SELECT * FROM PRODUTOAUX WHERE PROCODAUX ='"+codigoProduto+"'", Produtoaux.class );
            
                list = qSys.getResultList();
                
            } catch( Exception e ){  retorno = "-1"; }

            if ( list.isEmpty() ){  retorno = "0";
                //System.out.println( "LISTA VAZIA - PROCOD COM BASE NO PROCODAUX " + codigoProduto );
            }else{
                for (int i = 0; i < list.size(); i++){
                    
                    retorno += list.get(i).getProcod();   
                    //System.out.println( "PROCOD COM BASE NO PROCODAUX " + retorno );
                    break;
                }
                                
            }
        } catch( Exception e ){  retorno = "-1"; }    
        
        return retorno;
    } 
    
    public static void main( String args[] ){
        try{
            System.out.println( retornarQuantidadeVendida("01.09.2014", "29.09.2014", "07898287990120" ) );
        } catch( Exception e ){}
    }
    
}
