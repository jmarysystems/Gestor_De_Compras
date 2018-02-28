/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package html;

import vizualizar_impressao.Imprimir_Home_Inicio;
import java.text.SimpleDateFormat;
import java.util.List;
import javax.persistence.Query;
import jpa.JPAUtil;
import print.ControleThread_Print;

/**
 *
 * @author Ana
 */
public class Html_Gestor {
    
    ControleThread_Print ControleThread_Print;
    
    Query q                                   = null;
    List<gestor.Gestordecomprasprodutos> list = null;
    int IDGESTORRECEBIDA                      = -1;
    
    public Html_Gestor( ControleThread_Print ControleThread_Print2 ) {
        
        ControleThread_Print = ControleThread_Print2;
        
        IDGESTORRECEBIDA = ControleThread_Print.IDGESTORRECEBIDA;
    }
            
    public void getHtmlGestor(){
        String retorno = "";
        
        StringBuilder sb = new StringBuilder();
        
        try{ 
                                    
            try{            
                q = JPAUtil.em().createNativeQuery( "SELECT * FROM SCHEMAJMARY.GESTORDECOMPRASPRODUTOS WHERE ID_GESTORDECOMPRAS = ?", gestor.Gestordecomprasprodutos.class );
                q.setParameter(1, IDGESTORRECEBIDA );                     
                list = q.getResultList();  
                
                try{
                    for( int g = 0; g < list.size(); g++){
                                                
                        Query qX1 = JPAUtil.em().createNativeQuery( "SELECT * FROM SCHEMAJMARY.FORNECEDOR WHERE ID = ?", fornecedor.Fornecedor.class );
                        qX1.setParameter(1, list.get(g).getIdFornecedor() );                                                                                            
                        List<fornecedor.Fornecedor> listTemp = qX1.getResultList();
                        for (int xc = 0; xc < listTemp.size(); xc++){
                            SimpleDateFormat out = new SimpleDateFormat("dd.MM.yyyy");
                            
                            
                            sb.append( getHtmlGestorInicio( listTemp.get(xc), out.format( list.get( g ).getData() ) ) );
                            sb.append( getHtmlGestorMeio() );
                            sb.append( getHtmlGestorFim() );
                            break;
                        }
                        break;
                    }
                }catch(Exception e){}

            } catch( Exception e){}

        } catch( Exception e){}
        
        retorno = sb.toString();
        
        ControleThread_Print.html = retorno;
        
        //new Thread() {   @Override public void run() { try { Thread.sleep( 1 ); 
            ControleThread_Print.verificar_se_arq_existe();
        //} catch( Exception e ){ JOPM JOPM = new JOPM( 2, "getHtmlGestor(), \n" + e.getMessage() + "\n", this.getClass().getSimpleName() ); } } }.start(); 
    }
    
    ////////////////////////////////////////////////////////////////////
    Imprimir_Home_Inicio Imprimir_Home_Inicio;
    public Html_Gestor( Imprimir_Home_Inicio Imprimir_Home_Inicio2 ) {
        
        Imprimir_Home_Inicio = Imprimir_Home_Inicio2;
        
        IDGESTORRECEBIDA = Imprimir_Home_Inicio.Imprimir_Home.IDGESTORRECEBIDA;
        
        String retorno = "";
        
        StringBuilder sb = new StringBuilder();
        
        try{ 
                                    
            try{            
                q = JPAUtil.em().createNativeQuery( "SELECT * FROM SCHEMAJMARY.GESTORDECOMPRASPRODUTOS WHERE ID_GESTORDECOMPRAS = ?", gestor.Gestordecomprasprodutos.class );
                q.setParameter(1, IDGESTORRECEBIDA );                     
                list = q.getResultList();  
                
                try{
                    for( int g = 0; g < list.size(); g++){
                                                
                        Query qX1 = JPAUtil.em().createNativeQuery( "SELECT * FROM SCHEMAJMARY.FORNECEDOR WHERE ID = ?", fornecedor.Fornecedor.class );
                        qX1.setParameter(1, list.get(g).getIdFornecedor() );                                                                                            
                        List<fornecedor.Fornecedor> listTemp = qX1.getResultList();
                        for (int xc = 0; xc < listTemp.size(); xc++){
                            SimpleDateFormat out = new SimpleDateFormat("dd.MM.yyyy");
                            
                            
                            sb.append( getHtmlGestorInicio( listTemp.get(xc), out.format( list.get( g ).getData() ) ) );
                            sb.append( getHtmlGestorMeio() );
                            sb.append( getHtmlGestorFim() );
                            break;
                        }
                        break;
                    }
                }catch(Exception e){}

            } catch( Exception e){}

        } catch( Exception e){}
        
        retorno = sb.toString();
        
        Imprimir_Home_Inicio.html = retorno;
        
        //new Thread() {   @Override public void run() { try { Thread.sleep( 1 ); 
            Imprimir_Home_Inicio.addAbaVisualizarImpressao( retorno );
        //} catch( Exception e ){ JOPM JOPM = new JOPM( 2, "getHtmlGestor(), \n" + e.getMessage() + "\n", this.getClass().getSimpleName() ); } }
    }
    ////////////////////////////////////////////////////////////////////
    
    private String getHtmlGestorInicio( fornecedor.Fornecedor F, String dataG ){

        String retorno = "";
        
        try{ StringBuilder sb = new StringBuilder();

            sb.append(
            "<html>"
                    
                + "<head> <title> HOME </title>"
                + "<meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">"
                + "<link rel=\"stylesheet\" type=\"text/css\" media=\"screen\" href=\""+ getClass().getResource("/css/estrutura.css").toString() +"\" />"
                + "</head>"
                    
                + "<body>" 
                    
                    + "<table WIDTH=100% >"
                    
                        + "<tr>"
                    
                            + "<td>"
                    
                                +"<img src='" + getClass().getResource("/utilidades_imagens/bueno_logo.png").toString() + "'" + " width=\"180\" height=\"100\" border=\"0\" ALIGN=BOTTOM title=\"BUENO MESSEJANA\" >"                                            
                    
                            + "</td>"
                    
                            + "<td class='txttitulo'>"

                                + "<b>&nbsp;&nbsp;&nbsp;&nbsp;GESTOR DE COMPRAS - BUENO MESSEJANA</b>"                                          
                    
                            + "</td>"
                    
                            + "<td align='right' class='txttitulo'>"
                                
                                +"<div>"
                                    +"<table>"
                                        +"<tbody>"
                                            +"<tr>"
                                                +"<td align='center'>"+ "DATA:&nbsp;&nbsp;" +  dataG +"<hr noshade=\"noshade\" size=\"1\">" + "<b>&nbsp;Nº:&nbsp;&nbsp;" +  IDGESTORRECEBIDA + "</b>" + "</td>"
                                            +"</tr>"
                                        +"</tbody>"
                                    +"</table>"
                                +"</div>"
                    
                            + "</td>"
                    
                        + "</tr>"
                    
                    + "</table>"
                    
                    + "<HR SIZE=1 WIDTH=100% NOSHADE>" +
                    
                    "<table>"
                    
                        + "<tr>"
                    
                            + "<td>"
                                  +"<b> FORNECEDOR </b> &nbsp;&nbsp;&nbsp;" 
                            + "</td>"
                    
                            + "<td>"
                                
                                + "&nbsp;" + F.getNomeourazaosocial()
                    
                            + "</td>"
                    
                            + "<td>"
                                  +"&nbsp;&nbsp;&nbsp;<b> NOME&nbsp;VENDEDOR </b> &nbsp;&nbsp;&nbsp;" 
                            + "</td>"
                    
                            + "<td>"
                                
                                + "&nbsp;" + F.getNomevendedor()
                    
                            + "</td>"
                    
                            + "<td>"
                                  +"&nbsp;&nbsp;&nbsp;<b> TELEFONE&nbsp;VENDEDOR </b> &nbsp;&nbsp;&nbsp;" 
                            + "</td>"
                    
                            + "<td>"
                                
                                + "&nbsp;" + F.getTelefonevendedor()
                    
                            + "</td>"
                    
                            + "<td>"
                                  +"&nbsp;&nbsp;&nbsp;<b> PRAZO&nbsp;PAGAMENTO </b> &nbsp;&nbsp;&nbsp;" 
                            + "</td>"
                    
                            + "<td>"
                                
                                + "&nbsp;" + F.getPrazodepagamento()
                    
                            + "</td>"
                    
                        + "</tr>"
                    
                        + "<tr>"
                    
                            + "<td>"
                                  +"<b> NOME&nbsp;FANTASIA </b> &nbsp;&nbsp;&nbsp;" 
                            + "</td>"
                    
                            + "<td>"
                                
                                + "&nbsp;" + F.getNomefantasia()
                    
                            + "</td>"
                    
                            + "<td>"
                                  +"&nbsp;&nbsp;&nbsp;<b> NOME&nbsp;SUPERVISOR </b> &nbsp;&nbsp;&nbsp;" 
                            + "</td>"
                    
                            + "<td>"
                                
                                + "&nbsp;" + F.getNomesupervisor()
                    
                            + "</td>"
                    
                            + "<td>"
                                  +"&nbsp;&nbsp;&nbsp;<b> TELEFONE&nbsp;SUPERVISOR </b> &nbsp;&nbsp;&nbsp;" 
                            + "</td>"
                    
                            + "<td>"
                                
                                + "&nbsp;" + F.getTelefonesupervisor()
                    
                            + "</td>"
                    
                            + "<td>"
                                  +"&nbsp;&nbsp;&nbsp;<b> PRAZO&nbsp;ENTREGA </b> &nbsp;&nbsp;&nbsp;" 
                            + "</td>"
                    
                            + "<td>"
                                
                                + "&nbsp;" + F.getPrazodeentrega()
                    
                            + "</td>"
                    
                        + "</tr>"
                    
                    + "</table>" +
                    
                    "<HR SIZE=1 WIDTH=100% NOSHADE>" 
            );
            
            retorno = sb.toString();
            
        } catch( Exception e ){}  
        
        
        return retorno;
    }
    
    public double custoT   = 0;
    
    private String getHtmlGestorMeio(){
        String retorno = "";
        
        try{ StringBuilder sb = new StringBuilder();
                                                  //a4: 595-842 //width='100%'
            sb.append( "<DIV align=\"center\"><CENTER>" + "<table width='100%' border=\"1\">" );
            
                   sb.append(   
                           
                        "<caption>Tabela Produtos - Gestor de Compras Bueno Messejana</caption>"+    
                                                       
                        "<tr>" + 
                            "<th>" + "ID"                             + "</th>" +   
                            "<th>" + "CODIGO"                         + "</th>" +
                            "<th>" + "DESCRICAO&nbsp;DO&nbsp;PRODUTO" + "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</th>" +
                            "<th>" + "CUSTO"                          + "</th>" + 
                            "<th>" + "VENDA"                          + "</th>" +
                            "<th>" + "ESTOQUE"              + "</th>" +   
                            "<th>" + "PEDIDO"               + "</th>" +   
                                
                            "<th>" + "DATA"                 + "</th>" +  
                            "<th>" + "CUSTO"                + "</th>" + 
                            "<th>" + "VENDA"                + "</th>" + 
                            "<th>" + "ESTOQUE"              + "</th>" +  
                            "<th>" + "PEDIDO"               + "</th>" +  
                                
                            "<th>" + "DATA"                 + "</th>" +  
                            "<th>" + "CUSTO"                + "</th>" +
                            "<th>" + "VENDA"                + "</th>" +   
                            "<th>" + "ESTOQUE"              + "</th>" +   
                            "<th>" + "PEDIDO"               + "</th>" +  
                                
                            "<th>" + "DATA"                 + "</th>" + 
                            "<th>" + "CUSTO"                + "</th>" +
                            "<th>" + "VENDA"                + "</th>" + 
                            "<th>" + "ESTOQUE"              + "</th>" +
                            "<th>" + "PEDIDO"               + "</th>" +
                                
                        "</tr>"
                   );      

            for (int i = 0; i < list.size(); i++){
                
                int c = i; c+=1;
                try{
                    
                    synchronized(this) {
                        
                        custoT += list.get(i).getCusto() * list.get(i).getPedido();
                    }
                    
                    synchronized(this) {
                        Html_Extras Html_Extras = new Html_Extras( list.get(i).getCodigoproduto() );
                    
                        sb.append(                       
                        
                            "<tr>" + 
                                "<td align='center'>" + c                                 + "</td>" +
                                "<td align='right'>" + list.get(i).getCodigoproduto()    + "</td>" +  
                                "<td>" + list.get(i).getDescricaoproduto() + "</td>" +    
                                "<td align='right'>"  + list.get(i).getCusto()           + "</td>" +  
                                "<td align='right'>"  + list.get(i).getVenda()           + "</td>" +  
                                "<td align='right'>"  + list.get(i).getEstoque()         + "</td>" +   
                                "<td align='right'>"  + list.get(i).getPedido()          + "</td>" +     
                                Html_Extras.get() +    
                            "</tr>"  
                        );
                    }
                } catch( Exception e ){}
            }
                                    
            sb.append( "</table>" + "</CENTER></DIV>" );
            
            sb.append(                       
                        "<p><p><table width='100%' border='0'>" +
                            "<tr>" + 
                                "<td align='right' class='ftm16px'>" + "R$&nbsp;TOTAL:&nbsp;&nbsp;" + custoT + "</td>" + 
                            "</tr>"  +
                        "</table>"
                    );
            
            retorno = sb.toString();
            
        } catch( Exception e ){}         
        
        return retorno;
    }
    
    private String getHtmlGestorFim(){
        String retorno = "";
        
        try{ StringBuilder sb = new StringBuilder();

            sb.append(
                    
                "</body>"                    
           +"</html>"
            );
            
            retorno = sb.toString();
        } catch( Exception e ){}          
        
        return retorno;
    }
    
}
