/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package produto_por_fornecedor_new;

import java.awt.event.MouseListener;
import java.util.List;
import javax.persistence.Query;
import jpa.DAOGenericoJPA;
import jpa.JPAUtil;
import utilidades.JOPM;
import utilidades.OperacaoRealizada;

/**
 *
 * @author pc
 */
public class Produto_Por_Fornecedor_New_Inicio {
        
    Produto_Por_Fornecedor_New Produto_Por_Fornecedor_New;//Materias_Home; 
    
    public Produto_Por_Fornecedor_New_Inicio( Produto_Por_Fornecedor_New Produto_Por_Fornecedor_New2 ) {
        
        Produto_Por_Fornecedor_New = Produto_Por_Fornecedor_New2;

        inicio();
    }
    
    ///////////////////////////////////////////////////////////////////////////
    public Produto_Por_Fornecedor_New_Inicio( Produto_Por_Fornecedor_New Produto_Por_Fornecedor_New2, produto_por_fornecedor.Produtoporfornecedor Produtoporfornecedor ) {
        
        Produto_Por_Fornecedor_New = Produto_Por_Fornecedor_New2;
          
        setarDadosDoBancoNoJPanel( Produtoporfornecedor );
        
        //Eventos
        try{
            MouseListener[] MouseListener = Produto_Por_Fornecedor_New.btSalvar.getMouseListeners();
            for ( MouseListener MouseListener1 : MouseListener) {
                Produto_Por_Fornecedor_New.btSalvar.removeMouseListener( MouseListener1 );
            }
        
            Produto_Por_Fornecedor_New.btSalvar.addMouseListener(new java.awt.event.MouseAdapter() {
                @Override
                 public void mousePressed(java.awt.event.MouseEvent evt) {

                    salvar( Produto_Por_Fornecedor_New.Produtoporfornecedor, true );
                    alteracoesExternas( Produto_Por_Fornecedor_New.Produtoporfornecedor );
                }
            });    
        }catch(Exception e ){} 
        Produto_Por_Fornecedor_New.btSalvar.setEnabled(true);
        
    }
    ///////////////////////////////////////////////////////////////////////////
    
    private void inicio(){
        
        new Thread() {   @Override public void run() { try { Thread.sleep( 1 ); 

                                    
        } catch( Exception e ){ JOPM JOptionPaneMod = new JOPM( 2, "inicio(), \n"
                + e.getMessage() + "\n", "Subcategorias_New_Inicio" ); } } }.start();                 
    }
    
    private void alteracoesExternas( produto_por_fornecedor.Produtoporfornecedor Produtoporfornecedor ){
        try {           
            
            

        } catch( Exception e ){ JOPM JOptionPaneMod = new JOPM( 2, "alteracoesExternas, \n"
                + e.getMessage() + "\n", this.getClass().getSimpleName() ); }   
        
    }
    
    
    //Salvar
    public void salvar( produto_por_fornecedor.Produtoporfornecedor Produtoporfornecedor, boolean alterar ) {
        if( Produto_Por_Fornecedor_New.btSalvar.isEnabled() ) {
            
            if( !Produto_Por_Fornecedor_New.tfFornecedor.getText().trim().equals( "" )  ){
                
                if( !Produto_Por_Fornecedor_New.tfProduto.getText().trim().equals( "" )  ){
                    
                    confirmarSalvar( Produtoporfornecedor, alterar );
                }
                else{ sem2(); }
                
            }
            else{ sem1(); }
        }
    } 
    
    public void confirmarSalvar( produto_por_fornecedor.Produtoporfornecedor Produtoporfornecedor, boolean alterar ) {
        Produtoporfornecedor = pegarDadosDoJPanelParaSalvar( Produtoporfornecedor );

        if( verificarRepeticao( Produtoporfornecedor ) == false ){
                            
            DAOGenericoJPA DAOGenericoJPA = new DAOGenericoJPA(Produtoporfornecedor, JPAUtil.em());
            DAOGenericoJPA.gravanovoOUatualizar();
            Produto_Por_Fornecedor_New.tfProduto.setText("");
            OperacaoRealizada OPS = new OperacaoRealizada(); OPS.setVisible(true); 
            //Produto_Por_Fornecedor_New.Produto_Por_Fornecedor_Home.Inicio.cancelar();
        }
        else{ repetido(); }
    }
   
   private void sem1() {
       JOPM JOptionPaneMod = new JOPM( 2, "FORNECEDOR, "
                        + "\nO FORNECEDOR não foi selecionado "
                        + "\nSelecine um FORNECEDOR para continuar"
                        + "\n", "FORNECEDOR" );
   }
   
   private void sem2() {
       JOPM JOptionPaneMod = new JOPM( 2, "PRODUTO, "
                        + "\nO PRODUTO não foi selecionado "
                        + "\nSelecine um PRODUTO para continuar"
                        + "\n", "PRODUTO" );
   }
   
   private void repetido() {
       JOPM JOptionPaneMod = new JOPM( 2, "PRODUTO JÁ CADASTRADO PARA O FORNECEDOR, "
                        + "\nO PRODUTO informado já existe cadastrado para este fornecedor"
                        + "\nInforme um PRODUTO ainda não cadastrado para o fornecedor"
                        + "\n", "PRODUTO JÁ CADASTRADO PARA O FORNECEDOR" );
   }
   
   private boolean verificarRepeticao( produto_por_fornecedor.Produtoporfornecedor Produtoporfornecedor ) {  
       boolean retorno = false;
        try{
            
            Query q = JPAUtil.em().createNativeQuery( "SELECT * FROM SCHEMAJMARY.PRODUTOPORFORNECEDOR", produto_por_fornecedor.Produtoporfornecedor.class );
            List<produto_por_fornecedor.Produtoporfornecedor> list = q.getResultList();
            
            for (int i = 0; i < list.size(); i++){
                
                if( list.get(i).getIdFornecedor() == Produtoporfornecedor.getIdFornecedor() ){
                    
                    Query q2 = JPAUtil.em().createNativeQuery( "SELECT * FROM SCHEMAJMARY.PRODUTOPORFORNECEDOR WHERE ID_FORNECEDOR = ?", produto_por_fornecedor.Produtoporfornecedor.class );
                    q2.setParameter( 1, list.get(i).getIdFornecedor() );  
                    
                    List<produto_por_fornecedor.Produtoporfornecedor> list2 = q2.getResultList();
                    
                    for (int m = 0; m < list2.size(); m++){
                        
                        if( list.get(i).getId() != Produtoporfornecedor.getId() ){
                            
                            if( list.get(i).getCodigoproduto().equals( Produtoporfornecedor.getCodigoproduto() ) ){
                        
                                retorno = true;
                                break;    
                            }
                        }
                    }
                                        
                }
            }

        }catch(Exception e ){} 
        
        return retorno;
    }
   
    private produto_por_fornecedor.Produtoporfornecedor pegarDadosDoJPanelParaSalvar( produto_por_fornecedor.Produtoporfornecedor Produtoporfornecedor ) {          
        try{
       
            Produtoporfornecedor.setNomeourazaosocial( Produto_Por_Fornecedor_New.Fornecedor.getNomeourazaosocial() );
            Produtoporfornecedor.setNomefantasia( Produto_Por_Fornecedor_New.Fornecedor.getNomefantasia() );
            
            Produtoporfornecedor.setIdFornecedor( Produto_Por_Fornecedor_New.Fornecedor.getId() );
            
            Produtoporfornecedor.setCodigoproduto( Produto_Por_Fornecedor_New.Produto.getCodigoproduto() );
            Produtoporfornecedor.setDescricaoproduto( Produto_Por_Fornecedor_New.Produto.getDescricaoproduto() );
            
            Produtoporfornecedor.setNomedacategoriadoproduto( Produto_Por_Fornecedor_New.Produto.getNomedacategoriadoproduto() );
            
            Produtoporfornecedor.setNomedaembalagem( Produto_Por_Fornecedor_New.Produto.getNomedaembalagem() );
            Produtoporfornecedor.setCodigodaembalagem( Produto_Por_Fornecedor_New.Produto.getCodigodaembalagem() );
            Produtoporfornecedor.setQuantidadedeitensnaembalagem( Produto_Por_Fornecedor_New.Produto.getQuantidadedeitensnaembalagem() );
            
            Produtoporfornecedor.setIdCategoriadoproduto( Produto_Por_Fornecedor_New.Produto.getIdCategoriadoproduto() );
            
            Produtoporfornecedor.setIdProduto( Produto_Por_Fornecedor_New.Produto.getId() );
                                    
            Produtoporfornecedor.setIdEmbalagem( Produto_Por_Fornecedor_New.Produto.getIdEmbalagem() );
                      
        }catch(Exception e ){} 
        
        return Produtoporfornecedor;
    }
    
    public void setarDadosDoBancoNoJPanel( produto_por_fornecedor.Produtoporfornecedor Produtoporfornecedor ) {          
        try{
            
            Produto_Por_Fornecedor_New.Fornecedor.setNomeourazaosocial( Produtoporfornecedor.getNomeourazaosocial() ); 
            Produto_Por_Fornecedor_New.Fornecedor.setNomefantasia( Produtoporfornecedor.getNomefantasia() ); 
            
            Produto_Por_Fornecedor_New.Fornecedor.setId( Produtoporfornecedor.getIdFornecedor() );
            
            Produto_Por_Fornecedor_New.Produto.setCodigoproduto( Produtoporfornecedor.getCodigoproduto() );
            Produto_Por_Fornecedor_New.Produto.setDescricaoproduto( Produtoporfornecedor.getDescricaoproduto() );
            
            Produto_Por_Fornecedor_New.Produto.setNomedacategoriadoproduto( Produtoporfornecedor.getNomedacategoriadoproduto() );
            
            Produto_Por_Fornecedor_New.Produto.setNomedaembalagem( Produtoporfornecedor.getNomedaembalagem() );
            Produto_Por_Fornecedor_New.Produto.setCodigodaembalagem( Produtoporfornecedor.getCodigodaembalagem() );
            Produto_Por_Fornecedor_New.Produto.setQuantidadedeitensnaembalagem( Produtoporfornecedor.getQuantidadedeitensnaembalagem() );
            
            Produto_Por_Fornecedor_New.Produto.setIdCategoriadoproduto( Produtoporfornecedor.getIdCategoriadoproduto() );
            
            Produto_Por_Fornecedor_New.Produto.setId( Produtoporfornecedor.getIdProduto() );
                                    
            Produto_Por_Fornecedor_New.Produto.setIdEmbalagem( Produtoporfornecedor.getIdEmbalagem() );
            
            /////
            Produto_Por_Fornecedor_New.tfFornecedor.setText( Produtoporfornecedor.getNomeourazaosocial() );
            Produto_Por_Fornecedor_New.tfProduto.setText( Produtoporfornecedor.getDescricaoproduto() );        
      
        }catch(Exception e ){} 
    }
    
    public void desabilitarComponentesDoJPanel( boolean b ) {          
        try{
            
            //Produto_Por_Fornecedor_New.tfDescricaoDoProduto       .setEditable(b);       

        }catch(Exception e ){} 
    }
    
}
