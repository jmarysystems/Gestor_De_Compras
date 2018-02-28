/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package produto_new;

import java.awt.Color;
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
public class Produto_New_Inicio {
        
    Produto_New Produto_New;//Materias_Home; 
    
    public Produto_New_Inicio( Produto_New Produto_New2 ) {
        
        Produto_New = Produto_New2;

        inicio();
    }
    
    ///////////////////////////////////////////////////////////////////////////
    public Produto_New_Inicio( Produto_New Produto_New2, produto.Produto Produto ) {
        
        Produto_New = Produto_New2;

        inicioCBS();
          
        setarDadosDoBancoNoJPanel( Produto );
        
        //Eventos
        try{
            MouseListener[] MouseListener = Produto_New.btSalvar.getMouseListeners();
            for ( MouseListener MouseListener1 : MouseListener) {
                Produto_New.btSalvar.removeMouseListener( MouseListener1 );
            }
        
            Produto_New.btSalvar.addMouseListener(new java.awt.event.MouseAdapter() {
                @Override
                 public void mousePressed(java.awt.event.MouseEvent evt) {

                    salvar( Produto_New.Produto, true );
                    alteracoesExternas( Produto_New.Produto );
                }
            });    
        }catch(Exception e ){} 
        Produto_New.btSalvar.setEnabled(true);
        
    }
    ///////////////////////////////////////////////////////////////////////////
    
    private void inicio(){
        
        new Thread() {   @Override public void run() { try { Thread.sleep( 1 ); 
        
            inicioCBS();
            
            setarCategorias( new categoria_do_produto.Categoriadoproduto() );
            setarEmbalagens( new embalagem.Embalagem() );
                                    
        } catch( Exception e ){ JOPM JOptionPaneMod = new JOPM( 2, "inicio(), \n"
                + e.getMessage() + "\n", "Subcategorias_New_Inicio" ); } } }.start();                 
    }
    
    private void inicioCBS(){        
        Produto_New.cbEmbalagem.setBackground( new Color( 255, 255, 255 ) );     
        Produto_New.cbCategoriaDoProduto.setBackground( new Color( 255, 255, 255 ) );           
    }
    
    public void setarCategorias(categoria_do_produto.Categoriadoproduto Categoriadoproduto){  
        
        try{            
            Query q = JPAUtil.em().createNativeQuery( "SELECT * FROM SCHEMAJMARY.CATEGORIADOPRODUTO", categoria_do_produto.Categoriadoproduto.class );
            List<categoria_do_produto.Categoriadoproduto> list = q.getResultList();
        
            if( Produto_New.cbCategoriaDoProduto.getItemCount() > 0 ) { Produto_New.cbCategoriaDoProduto.removeAllItems(); }           
            
            int select = 0;
            for (int i = 0; i < list.size(); i++){ 
                
                if( list.get(i).getId() == Categoriadoproduto.getId() ) {
                    select = i;
                }
                                                             
                Produto_New.cbCategoriaDoProduto.addItem( new BookInfoCategoriaDoProduto( 
                        list.get(i).getId(), 
                        list.get(i).getNomedacategoriadoproduto()
                )
                );    
            }      
            
            Produto_New.cbCategoriaDoProduto.setSelectedIndex( select );
        }catch(Exception e ){} 
    }
    
    public void setarEmbalagens(embalagem.Embalagem Embalagem){  
        
        try{            
            Query q = JPAUtil.em().createNativeQuery( "SELECT * FROM SCHEMAJMARY.EMBALAGEM", embalagem.Embalagem.class );
            List<embalagem.Embalagem> list = q.getResultList();
        
            if( Produto_New.cbEmbalagem.getItemCount() > 0 ) { Produto_New.cbEmbalagem.removeAllItems(); }           
            
            int select = 0;
            for (int i = 0; i < list.size(); i++){ 
                
                if( list.get(i).getId() == Embalagem.getId() ) {
                    select = i;
                }
                                                             
                Produto_New.cbEmbalagem.addItem( new BookInfoEmbalagem( 
                        list.get(i).getId(), 
                        list.get(i).getNomedaembalagem()
                )
                );    
            }      
            
            Produto_New.cbEmbalagem.setSelectedIndex( select );
        }catch(Exception e ){} 
    }
    
    private void alteracoesExternas( produto.Produto Produto ){
        try {           
            
            Query q2 = JPAUtil.em().createNativeQuery( "SELECT * FROM SCHEMAJMARY.PRODUTOPORFORNECEDOR WHERE ID_PRODUTO = ?", produto_por_fornecedor.Produtoporfornecedor.class );
            q2.setParameter(1, Produto.getId() ); 
            
            List<produto_por_fornecedor.Produtoporfornecedor> list = q2.getResultList();
            for (int i = 0; i < list.size(); i++){
                
                produto_por_fornecedor.Produtoporfornecedor Produtoporfornecedor = list.get(i);
                
                //if( !list.get(i).getNomedaembalagem().trim().equals( Produto.getNomedaembalagem().trim() ) ) {
                
                    Produtoporfornecedor.setDescricaoproduto            ( Produto.getDescricaoproduto() );
                    Produtoporfornecedor.setCodigoproduto               ( Produto.getCodigoproduto() );
                    
                    Produtoporfornecedor.setIdCategoriadoproduto        ( Produto.getIdCategoriadoproduto() );
                    Produtoporfornecedor.setNomedacategoriadoproduto    ( Produto.getNomedacategoriadoproduto() );
                    
                    Produtoporfornecedor.setIdEmbalagem                 ( Produto.getIdEmbalagem() );
                    Produtoporfornecedor.setNomedaembalagem             ( Produto.getNomedaembalagem() );                    
                    Produtoporfornecedor.setCodigodaembalagem           ( Produto.getCodigodaembalagem() );                            
                    Produtoporfornecedor.setQuantidadedeitensnaembalagem( Produto.getQuantidadedeitensnaembalagem() );        
                                    
                    DAOGenericoJPA DAOGenericoJPA = new DAOGenericoJPA( Produtoporfornecedor, JPAUtil.em() );
                    DAOGenericoJPA.gravanovoOUatualizar();
                //}
                //else{
                    
                //    break;
                //}
            }
            
        } catch( Exception e ){ JOPM JOptionPaneMod = new JOPM( 2, "alteracoesExternas, \n"
                + e.getMessage() + "\n", this.getClass().getSimpleName() ); }         
    }
    
    //Salvar
    public void salvar( produto.Produto Produto, boolean alterar ) {
        if( Produto_New.btSalvar.isEnabled() ) {
            
            if( Produto_New.tfDescricaoDoProduto.getText().trim().length() > 3 ) {
                
                if( Produto_New.cbCategoriaDoProduto.getSelectedItem() != null ) {
                    
                    if( !Produto_New.tfCodigoDeBarra.getText().trim().equals( "" )  ){
                        
                        confirmarSalvar( Produto, alterar );
                    }
                    else{ sem3(); }
                }
                else{ sem2(); }
                
            }
            else{ sem1(); }
        }
    } 
    
    public void confirmarSalvar( produto.Produto Produto, boolean alterar ) {
        Produto = pegarDadosDoJPanelParaSalvar( Produto );

        if( verificarRepeticao( Produto ) == false ){
                            
            DAOGenericoJPA DAOGenericoJPA = new DAOGenericoJPA(Produto, JPAUtil.em());
            DAOGenericoJPA.gravanovoOUatualizar();
            Produto_New.Produto_Home.Inicio.cancelar();
        }
        else{
            
            repetido();
        }
    }
   
   private void sem1() {
       JOPM JOptionPaneMod = new JOPM( 2, "DESCRIÇÃO DO PRODUTO, "
                        + "\nO Campo DESCRIÇÃO DO PRODUTO não pode ter menos que 4 caracteres"
                        + "\nInforme uma DESCRIÇÃO DO PRODUTO com no mínimo 4 caracteres"
                        + "\n", "DESCRIÇÃO DO PRODUTO" );
   }
   private void sem2() {
       JOPM JOptionPaneMod = new JOPM( 2, "CATEGORIA DO PRODUTO, "
                        + "\nO Campo CATEGORIA DO PRODUTO não pode ser nulo"
                        + "\nInforme uma CATEGORIA DO PRODUTO"
                        + "\n", "CATEGORIA DO PRODUTO" );
   }
   private void sem3() {
       JOPM JOptionPaneMod = new JOPM( 2, "CÓDIGO DE BARRAS DO PRODUTO, "
                        + "\nO Campo CÓDIGO DE BARRAS DO PRODUTO não pode ser nulo"
                        + "\nInforme um CÓDIGO DE BARRAS DO PRODUTO"
                        + "\n", "DESCRIÇÃO DO PRODUTO" );
   }
   
   private void repetido() {
       JOPM JOptionPaneMod = new JOPM( 2, "CÓDIGO DE BARRAS DO PRODUTO, "
                        + "\nO CÓDIGO DE BARRAS DO PRODUTO informado já existe cadastrado"
                        + "\nInforme um CÓDIGO DE BARRAS DO PRODUTO ainda não cadastrado"
                        + "\n", "CÓDIGO DE BARRAS DO PRODUTO" );
   }
   
   private boolean verificarRepeticao( produto.Produto Produto ) {  
       boolean retorno = false;
        try{
            
            Query q = JPAUtil.em().createNativeQuery( "SELECT * FROM SCHEMAJMARY.PRODUTO", produto.Produto.class );
            List<produto.Produto> list = q.getResultList();
            
            for (int i = 0; i < list.size(); i++){
                
                if( list.get(i).getId() != Produto.getId() ){
                    
                    if( list.get(i).getCodigoproduto().equals( Produto.getCodigoproduto() ) ){
                    
                        retorno = true;
                        break;                    
                    }
                }
            }

        }catch(Exception e ){} 
        
        return retorno;
    }
     
    private produto.Produto pegarDadosDoJPanelParaSalvar( produto.Produto Produto ) {          
        try{
            
            Produto.setDescricaoproduto        (Produto_New.tfDescricaoDoProduto.getText().trim().toUpperCase() );
            Produto.setCodigoproduto           (Produto_New.tfCodigoDeBarra.getText().trim().toUpperCase() );
            
            try{
                //MeuObjeto obj = (MeuObjeto) combobox.getSelectedItem();
                BookInfoCategoriaDoProduto obj = (BookInfoCategoriaDoProduto) Produto_New.cbCategoriaDoProduto.getSelectedItem();
                //System.out.println( "obj.ID "+obj.ID );
                Produto.setIdCategoriadoproduto    ( obj.ID );
                Produto.setNomedacategoriadoproduto( obj.NOME );
            }
            catch( Exception e ){}
            
            try{
                //MeuObjeto obj = (MeuObjeto) combobox.getSelectedItem();
                BookInfoEmbalagem obj = (BookInfoEmbalagem) Produto_New.cbEmbalagem.getSelectedItem();
                //System.out.println( "obj.ID "+obj.ID );
                Produto.setIdEmbalagem    ( obj.ID );
                Produto.setNomedaembalagem( obj.NOME );
            }
            catch( Exception e ){}
            
            try{ Produto.setCodigodaembalagem( Produto_New.tfCodigoDaEmbalagem.getText().trim().toUpperCase() ); }catch( Exception e ){}
            
            try{ Produto.setQuantidadedeitensnaembalagem( Integer.parseInt( Produto_New.tfQuantidadeDeItensNaEmbalagem.getText().trim() ) ); }catch( Exception e ){}
            

        }catch(Exception e ){} 
        
        return Produto;
    }
    
    public void setarDadosDoBancoNoJPanel( produto.Produto Produto ) {          
        try{
            
            Produto_New.tfDescricaoDoProduto.setText   ( Produto.getDescricaoproduto() );
            Produto_New.tfCodigoDeBarra.setText        ( Produto.getCodigoproduto() );
            
            try{
                
                categoria_do_produto.Categoriadoproduto Categoriadoproduto = new categoria_do_produto.Categoriadoproduto();
                Categoriadoproduto.setId( Produto.getIdCategoriadoproduto() );
                
                setarCategorias( Categoriadoproduto );
            }
            catch( Exception e ){}
            
            try{
                embalagem.Embalagem Embalagem = new embalagem.Embalagem();
                Embalagem.setId( Produto.getIdEmbalagem() );
                
                setarEmbalagens( Embalagem );
            }
            catch( Exception e ){}
            
            try{ 
                Produto_New.tfCodigoDaEmbalagem.setText( Produto.getCodigodaembalagem() ); 
            }catch( Exception e ){}
            
            try{ 
                Produto_New.tfQuantidadeDeItensNaEmbalagem.setText( String.valueOf( Produto.getQuantidadedeitensnaembalagem() ) ); 
            }catch( Exception e ){}

        }catch(Exception e ){} 
    }
    
    public void desabilitarComponentesDoJPanel( boolean b ) {          
        try{
            
            Produto_New.tfDescricaoDoProduto       .setEditable(b);       

        }catch(Exception e ){} 
    }
    
}
