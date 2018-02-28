/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package html;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import javax.persistence.Query;
import jpa.JPAUtil;
import print.ControleThread_Print;
import syspdv.RetornarQuantidadeVendida;
import utilidades.JOPM;
import utilidades.Retornar_Data_de_Hoje_Mais_IntDias_Receb;

/**
 *
 * @author Ana
 */
public class Html_Gestor_Por_Fornecedor {
    
    ControleThread_Print ControleThread_Print;
    
    Query q                                                = null;
    List<produto_por_fornecedor.Produtoporfornecedor> list = null;
    int IDFORNECEDORRECEBIDA                               = -1;
    
    public Html_Gestor_Por_Fornecedor( ControleThread_Print ControleThread_Print2 ) {
        
        ControleThread_Print = ControleThread_Print2;
        
        IDFORNECEDORRECEBIDA = ControleThread_Print.IDGESTORRECEBIDA;
        
        try{ q = ControleThread_Print.q; } catch( Exception e ){}
    }
    
    public void getHtmlGestor(){
        String retorno = "";
        
        StringBuilder sb = new StringBuilder();
        
        try{ 
                                    
            try{            
                //q = JPAUtil.em().createNativeQuery( "SELECT * FROM SCHEMAJMARY.PRODUTOPORFORNECEDOR WHERE ID_FORNECEDOR = ?", produto_por_fornecedor.Produtoporfornecedor.class );
                //q.setParameter(1, IDFORNECEDORRECEBIDA );                     
                list = q.getResultList();  
                
                try{
                    for( int g = 0; g < list.size(); g++){ 
                                                
                        Query qX1 = JPAUtil.em().createNativeQuery( "SELECT * FROM SCHEMAJMARY.FORNECEDOR WHERE ID = ?", fornecedor.Fornecedor.class );
                        qX1.setParameter(1, list.get(g).getIdFornecedor());                                                                                            
                        @SuppressWarnings("unchecked")
                        List<fornecedor.Fornecedor> listTemp = qX1.getResultList();
                        for (int xc = 0; xc < listTemp.size(); xc++){
                            SimpleDateFormat out = new SimpleDateFormat("dd.MM.yyyy");
                            
                            GregorianCalendar gc = new GregorianCalendar();
                            Date dataHoje = gc.getTime();
                                                        
                            sb.append( getHtmlGestorInicio( listTemp.get(xc), out.format( dataHoje ) ) );
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

                                + "<b>&nbsp;&nbsp;&nbsp;&nbsp;PRODUTOS POR FORNECEDOR - BUENO MESSEJANA</b>"                                          
                    
                            + "</td>"
                    
                            + "<td align='right' class='txttitulo'>"
                                
                                +"<div>"
                                    +"<table>"
                                        +"<tbody>"
                                            +"<tr>"
                                                +"<td align='center'>"+ "DATA:&nbsp;&nbsp;" +  dataG +"<hr noshade=\"noshade\" size=\"1\">" + "<b>&nbsp;Nº:&nbsp;&nbsp;" +  IDFORNECEDORRECEBIDA + "</b>" + "</td>"
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
                           
                        "<caption>Tabela&nbsp;Produtos&nbsp;Por&nbsp;Fornecedor&nbsp;-&nbsp;Gestor&nbsp;de&nbsp;Compras&nbsp;Bueno&nbsp;Messejana</caption>"+    
                                                       
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
                    
                    Html_Extras Html_Extras = new Html_Extras( list.get(i).getCodigoproduto() );
                    
                    String vendaEm7Dias = "";
                    synchronized(this) {
                        
                       try{ vendaEm7Dias = vendaEmXDias( list.get(i).getCodigoproduto(), 7 ); } catch( Exception e ){}   
                    }
                    
                    synchronized(this) {
                        sb.append(                       
                        
                            "<tr>" + 
                                "<td align='center'>" + list.get(i).getIdProduto()        + "</td>" +
                                "<td align='right'>"  + list.get(i).getCodigoproduto()    + "</td>" +  
                                "<td>"                + list.get(i).getDescricaoproduto() + "</td>" +    
                                "<td align='right'>"                   + "</td>" +  
                                "<td align='right'>"  + vendaEm7Dias   + "</td>" +  
                                "<td align='right'>"                   + "</td>" +   
                                "<td align='right'>"                   + "</td>" +     
                                Html_Extras.get() +    
                            "</tr>"  
                        );
                    }
                } catch( Exception e ){}
            }
                                    
            sb.append( "</table>" + "</CENTER></DIV>" );
            
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
    
}
