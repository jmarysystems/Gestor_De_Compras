/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package categoria_do_produto_new;

import java.awt.event.MouseListener;
import java.util.List;
import javax.persistence.Query;
import jpa.DAOGenericoJPA;
import jpa.JPAUtil;
import utilidades.JOPM;

/**
 *
 * @author pc
 */
public class Categoria_do_Produto_New_Inicio {
        
    Categoria_do_Produto_New Categoria_do_Produto_New;//Materias_Home; 
    
    public Categoria_do_Produto_New_Inicio( Categoria_do_Produto_New Categoria_do_Produto_New2 ) {
        
        Categoria_do_Produto_New = Categoria_do_Produto_New2;

        inicio();
    }
    
    ///////////////////////////////////////////////////////////////////////////
    public Categoria_do_Produto_New_Inicio( Categoria_do_Produto_New Categoria_do_Produto_New2, categoria_do_produto.Categoriadoproduto Categoriadoproduto ) {
        
        Categoria_do_Produto_New = Categoria_do_Produto_New2;
          
        setarDadosDoBancoNoJPanel( Categoriadoproduto );
        
        //Eventos
        try{
            MouseListener[] MouseListener = Categoria_do_Produto_New.btSalvar.getMouseListeners();
            for ( MouseListener MouseListener1 : MouseListener) {
                Categoria_do_Produto_New.btSalvar.removeMouseListener( MouseListener1 );
            }
        
            Categoria_do_Produto_New.btSalvar.addMouseListener(new java.awt.event.MouseAdapter() {
                @Override
                 public void mousePressed(java.awt.event.MouseEvent evt) {

                    salvar( Categoria_do_Produto_New.Categoriadoproduto, true );
                    alteracoesExternas( Categoria_do_Produto_New.Categoriadoproduto );
                    alteracoesExternas2( Categoria_do_Produto_New.Categoriadoproduto );
                }
            });    
        }catch(Exception e ){} 
        Categoria_do_Produto_New.btSalvar.setEnabled(true);
        
    }
    ///////////////////////////////////////////////////////////////////////////
    
    private void inicio(){
        
        new Thread() {   @Override public void run() { try { Thread.sleep( 1 ); 
        
            
                        
        } catch( Exception e ){ JOPM JOptionPaneMod = new JOPM( 2, "inicio(), \n"
                + e.getMessage() + "\n", "Subcategorias_New_Inicio" ); } } }.start();                 
    }
    
    private void alteracoesExternas( categoria_do_produto.Categoriadoproduto Categoriadoproduto ){
        try {           
            
            Query q = JPAUtil.em().createNativeQuery( "SELECT * FROM SCHEMAJMARY.PRODUTO WHERE ID_CATEGORIADOPRODUTO = ?", produto.Produto.class );
            q.setParameter(1, Categoriadoproduto.getId() ); 
            
            List<produto.Produto> list = q.getResultList();
            for (int i = 0; i < list.size(); i++){
                
                produto.Produto Produto = list.get(i);
                
                if( !list.get(i).getNomedacategoriadoproduto().trim().equals( Categoriadoproduto.getNomedacategoriadoproduto().trim() ) ) {
                    
                    Produto.setNomedacategoriadoproduto( Categoriadoproduto.getNomedacategoriadoproduto() );
                
                    DAOGenericoJPA DAOGenericoJPA = new DAOGenericoJPA(Produto, JPAUtil.em());
                    DAOGenericoJPA.gravanovoOUatualizar();
                }
                else{
                    
                    break;
                }
            }
            
        } catch( Exception e ){ JOPM JOptionPaneMod = new JOPM( 2, "alteracoesExternas, \n"
                + e.getMessage() + "\n", this.getClass().getSimpleName() ); }   
        
    }
    
    private void alteracoesExternas2( categoria_do_produto.Categoriadoproduto Categoriadoproduto ){
        try {           
            
            Query q2 = JPAUtil.em().createNativeQuery( "SELECT * FROM SCHEMAJMARY.PRODUTOPORFORNECEDOR WHERE ID_CATEGORIADOPRODUTO = ?", produto_por_fornecedor.Produtoporfornecedor.class );
            q2.setParameter(1, Categoriadoproduto.getId() ); 
            
            List<produto_por_fornecedor.Produtoporfornecedor> list = q2.getResultList();
            for (int i = 0; i < list.size(); i++){
                
                produto_por_fornecedor.Produtoporfornecedor Produtoporfornecedor = list.get(i);
                
                if( !list.get(i).getNomedacategoriadoproduto().trim().equals( Categoriadoproduto.getNomedacategoriadoproduto().trim() ) ) {
                    
                    Produtoporfornecedor.setNomedacategoriadoproduto( Categoriadoproduto.getNomedacategoriadoproduto() );
                
                    DAOGenericoJPA DAOGenericoJPA = new DAOGenericoJPA(Produtoporfornecedor, JPAUtil.em());
                    DAOGenericoJPA.gravanovoOUatualizar();
                }
                else{
                    
                    break;
                }
            }
            
        } catch( Exception e ){ JOPM JOptionPaneMod = new JOPM( 2, "alteracoesExternas, \n"
                + e.getMessage() + "\n", this.getClass().getSimpleName() ); }   
        
    }
    
    //Salvar
    public void salvar( categoria_do_produto.Categoriadoproduto Categoriadoproduto, boolean alterar ) {  
        if( Categoria_do_Produto_New.btSalvar.isEnabled() ) {
            
            if( Categoria_do_Produto_New.tfNomeDaCategoriaDoProduto.getText().trim().length() > 3 ) {
                
               confirmarSalvar( Categoriadoproduto, alterar );                                          
                
            }
            else{ sem1(); }
        }
    } 
    
    public void confirmarSalvar( categoria_do_produto.Categoriadoproduto Categoriadoproduto, boolean alterar ) { 
        Categoriadoproduto = pegarDadosDoJPanelParaSalvar( Categoriadoproduto );
        
        if( verificarRepeticao( Categoriadoproduto ) == false ){
            
            DAOGenericoJPA DAOGenericoJPA = new DAOGenericoJPA(Categoriadoproduto, JPAUtil.em());
            DAOGenericoJPA.gravanovoOUatualizar();
            Categoria_do_Produto_New.Categoria_do_Produto_Home.Inicio.cancelar();
        }
        else{
            
            repetido();
        }
    }
   
   private void sem1() {
       JOPM JOptionPaneMod = new JOPM( 2, "NOME DA CATEGORIA DO PRODUTO, "
                        + "\nO Campo NOME DA CATEGORIA DO PRODUTO não pode ter menos que 4 caracteres"
                        + "\nInforme um NOME DA CATEGORIA DO PRODUTO com no mínimo 4 caracteres"
                        + "\n", "NOME DA CATEGORIA DO PRODUTO" );
   }
   
   private void repetido() {
       JOPM JOptionPaneMod = new JOPM( 2, "NOME DA CATEGORIA DO PRODUTO, "
                        + "\nO NOME DA CATEGORIA DO PRODUTO informado já existe cadastrado"
                        + "\nInforme um NOME DA CATEGORIA DO PRODUTO ainda não cadastrado"
                        + "\n", "NOME DA CATEGORIA DO PRODUTO" );
   }
   
   private boolean verificarRepeticao( categoria_do_produto.Categoriadoproduto Categoriadoproduto ) {  
       boolean retorno = false;
        try{
            
            Query q = JPAUtil.em().createNativeQuery( "SELECT * FROM SCHEMAJMARY.CATEGORIADOPRODUTO", categoria_do_produto.Categoriadoproduto.class );
            List<categoria_do_produto.Categoriadoproduto> list = q.getResultList();
            
            for (int i = 0; i < list.size(); i++){
                
                if( list.get(i).getId() != Categoriadoproduto.getId() ){
                    
                    if( list.get(i).getNomedacategoriadoproduto().equals( Categoriadoproduto.getNomedacategoriadoproduto() ) ){
                    
                        retorno = true;
                        break;                    
                    }
                }
            }

        }catch(Exception e ){} 
        
        return retorno;
    }
   
    private categoria_do_produto.Categoriadoproduto pegarDadosDoJPanelParaSalvar( categoria_do_produto.Categoriadoproduto Categoriadoproduto ) {          
        try{
            
            Categoriadoproduto.setNomedacategoriadoproduto(Categoria_do_Produto_New.tfNomeDaCategoriaDoProduto.getText().trim().toUpperCase() );

        }catch(Exception e ){} 
        
        return Categoriadoproduto;
    }
    
    public void setarDadosDoBancoNoJPanel( categoria_do_produto.Categoriadoproduto Categoriadoproduto ) {          
        try{
            
            Categoria_do_Produto_New.tfNomeDaCategoriaDoProduto.setText       ( Categoriadoproduto.getNomedacategoriadoproduto() );

        }catch(Exception e ){} 
    }
    
    public void desabilitarComponentesDoJPanel( boolean b ) {          
        try{
            
            Categoria_do_Produto_New.tfNomeDaCategoriaDoProduto       .setEditable(b);       

        }catch(Exception e ){} 
    }
    
}
