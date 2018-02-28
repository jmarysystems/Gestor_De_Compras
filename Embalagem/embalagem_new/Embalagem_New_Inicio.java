/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package embalagem_new;

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
public class Embalagem_New_Inicio {
        
    Embalagem_New Embalagem_New;//Materias_Home; 
    
    public Embalagem_New_Inicio( Embalagem_New Embalagem_New2 ) {
        
        Embalagem_New = Embalagem_New2;

        inicio();
    }
    
    ///////////////////////////////////////////////////////////////////////////
    public Embalagem_New_Inicio( Embalagem_New Embalagem_New2, embalagem.Embalagem Embalagem ) {
        
        Embalagem_New = Embalagem_New2;
          
        setarDadosDoBancoNoJPanel( Embalagem );
        
        //Eventos
        try{
            MouseListener[] MouseListener = Embalagem_New.btSalvar.getMouseListeners();
            for ( MouseListener MouseListener1 : MouseListener) {
                Embalagem_New.btSalvar.removeMouseListener( MouseListener1 );
            }
        
            Embalagem_New.btSalvar.addMouseListener(new java.awt.event.MouseAdapter() {
                @Override
                 public void mousePressed(java.awt.event.MouseEvent evt) {

                    salvar( Embalagem_New.Embalagem, true );
                    alteracoesExternas( Embalagem_New.Embalagem );
                    alteracoesExternas2( Embalagem_New.Embalagem );
                }
            });    
        }catch(Exception e ){} 
        Embalagem_New.btSalvar.setEnabled(true);
        
    }
    ///////////////////////////////////////////////////////////////////////////
    
    private void inicio(){
        
        new Thread() {   @Override public void run() { try { Thread.sleep( 1 ); 
        
            
                        
        } catch( Exception e ){ JOPM JOptionPaneMod = new JOPM( 2, "inicio(), \n"
                + e.getMessage() + "\n", "Subcategorias_New_Inicio" ); } } }.start();                 
    }
    
    private void alteracoesExternas( embalagem.Embalagem Embalagem ){
        try {           
            
            Query q = JPAUtil.em().createNativeQuery( "SELECT * FROM SCHEMAJMARY.PRODUTO WHERE ID_EMBALAGEM = ?", produto.Produto.class );
            q.setParameter(1, Embalagem.getId() ); 
            
            List<produto.Produto> list = q.getResultList();
            for (int i = 0; i < list.size(); i++){
                
                produto.Produto Produto = list.get(i);
                
                if( !list.get(i).getNomedaembalagem().trim().equals( Embalagem.getNomedaembalagem().trim() ) ) {
                    
                    Produto.setNomedaembalagem(Embalagem.getNomedaembalagem() );
                
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
    
    private void alteracoesExternas2( embalagem.Embalagem Embalagem ){
        try {           
            
            Query q2 = JPAUtil.em().createNativeQuery( "SELECT * FROM SCHEMAJMARY.PRODUTOPORFORNECEDOR WHERE ID_EMBALAGEM = ?", produto_por_fornecedor.Produtoporfornecedor.class );
            q2.setParameter(1, Embalagem.getId() ); 
            
            List<produto_por_fornecedor.Produtoporfornecedor> list2 = q2.getResultList();
            for (int i = 0; i < list2.size(); i++){
                
                produto_por_fornecedor.Produtoporfornecedor Produtoporfornecedor = list2.get(i);
                
                if( !list2.get(i).getNomedaembalagem().trim().equals( Embalagem.getNomedaembalagem().trim() ) ) {
                    
                    Produtoporfornecedor.setNomedaembalagem( Embalagem.getNomedaembalagem() );
                
                    DAOGenericoJPA DAOGenericoJPA = new DAOGenericoJPA( Produtoporfornecedor, JPAUtil.em() );
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
    public void salvar( embalagem.Embalagem Embalagem, boolean alterar ) {  
        if( Embalagem_New.btSalvar.isEnabled() ) {
            
            if( Embalagem_New.tfNomeDaCategoriaDoProduto.getText().trim().length() > 1 ) {
                
               confirmarSalvar( Embalagem, alterar );                                          
                
            }
            else{ sem1(); }
        }
    } 
    
    public void confirmarSalvar( embalagem.Embalagem Embalagem, boolean alterar ) { 
        Embalagem = pegarDadosDoJPanelParaSalvar( Embalagem );
        
        if( verificarRepeticao( Embalagem ) == false ){
            
            DAOGenericoJPA DAOGenericoJPA = new DAOGenericoJPA(Embalagem, JPAUtil.em());
            DAOGenericoJPA.gravanovoOUatualizar();
            Embalagem_New.Embalagem_Home.Inicio.cancelar();
        }
        else{
            
            repetido();
        }
    }
   
   private void sem1() {
       JOPM JOptionPaneMod = new JOPM( 2, "NOME DA EMBALAGEM DO PRODUTO, "
                        + "\nO Campo NOME DA EMBALAGEM não pode ter menos que 2 caracteres"
                        + "\nInforme um NOME DE EMBALAGEM com no mínimo 4 caracteres"
                        + "\n", "NOME DA EMBALAGEM DO PRODUTO" );
   }
   
   private void repetido() {
       JOPM JOptionPaneMod = new JOPM( 2, "NOME DA EMBALAGEM DO PRODUTO, "
                        + "\nO NOME DA EMBALAGEM DO PRODUTO informado já existe cadastrado"
                        + "\nInforme um NOME DE EMBALAGEM DO PRODUTO ainda não cadastrado"
                        + "\n", "NOME DA EMBALAGEM DO PRODUTO" );
   }
   
   private boolean verificarRepeticao( embalagem.Embalagem Embalagem ) {  
       boolean retorno = false;
        try{
            
            Query q = JPAUtil.em().createNativeQuery( "SELECT * FROM SCHEMAJMARY.EMBALAGEM", embalagem.Embalagem.class );
            List<embalagem.Embalagem> list = q.getResultList();
            
            for (int i = 0; i < list.size(); i++){
                
                if( list.get(i).getId() != Embalagem.getId() ){
                    
                    if( list.get(i).getNomedaembalagem().equals( Embalagem.getNomedaembalagem() ) ){
                    
                        retorno = true;
                        break;                    
                    }
                }
            }

        }catch(Exception e ){} 
        
        return retorno;
    }
   
    private embalagem.Embalagem pegarDadosDoJPanelParaSalvar( embalagem.Embalagem Embalagem ) {          
        try{
            
            Embalagem.setNomedaembalagem(Embalagem_New.tfNomeDaCategoriaDoProduto.getText().trim().toUpperCase() );

        }catch(Exception e ){} 
        
        return Embalagem;
    }
    
    public void setarDadosDoBancoNoJPanel( embalagem.Embalagem Embalagem ) {          
        try{
            
            Embalagem_New.tfNomeDaCategoriaDoProduto.setText       ( Embalagem.getNomedaembalagem() );

        }catch(Exception e ){} 
    }
    
    public void desabilitarComponentesDoJPanel( boolean b ) {          
        try{
            
            Embalagem_New.tfNomeDaCategoriaDoProduto       .setEditable(b);       

        }catch(Exception e ){} 
    }
    
}
