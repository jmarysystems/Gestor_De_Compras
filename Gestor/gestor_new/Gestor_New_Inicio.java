/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package gestor_new;

import java.awt.event.MouseListener;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import javax.persistence.Query;
import jpa.DAOGenericoJPA;
import jpa.JPAUtil;
import produto.Produto;
import utilidades.JOPM;

/**
 *
 * @author pc
 */
public class Gestor_New_Inicio {
        
    Gestor_New Gestor_New;//Materias_Home; 
    
    public Gestor_New_Inicio( Gestor_New Gestor_New2 ) {
        
        Gestor_New = Gestor_New2;

        inicio();
    }
    
    ///////////////////////////////////////////////////////////////////////////
    public Gestor_New_Inicio( Gestor_New Gestor_New2, gestor.Gestordecompras Gestordecompras2, List<gestor.Gestordecomprasprodutos> list_Gestordecomprasprodutos2 ) {
        
        Gestor_New = Gestor_New2;
          
        setarDadosDoBancoNoJPanel( Gestor_New.Gestordecompras, Gestor_New.list_Gestordecomprasprodutos );
        
        //Eventos
        try{
            MouseListener[] MouseListener = Gestor_New.btSalvar.getMouseListeners();
            for ( MouseListener MouseListener1 : MouseListener) {
                Gestor_New.btSalvar.removeMouseListener( MouseListener1 );
            }
        
            Gestor_New.btSalvar.addMouseListener(new java.awt.event.MouseAdapter() {
                @Override
                 public void mousePressed(java.awt.event.MouseEvent evt) {

                    salvar( Gestor_New.Gestordecompras, Gestor_New.list_Gestordecomprasprodutos, true );
                }
            });    
        }catch(Exception e ){} 
        Gestor_New.btSalvar.setEnabled(true);
        
    }
    ///////////////////////////////////////////////////////////////////////////
        
    private void inicio(){
        
        new Thread() {   @Override public void run() { try { Thread.sleep( 1 ); 
                                    
        } catch( Exception e ){ JOPM JOptionPaneMod = new JOPM( 2, "inicio(), \n"+ e.getMessage() + "\n", "Subcategorias_New_Inicio" ); } } }.start();                 
    }
    
    private void alteracoesExternas( gestor.Gestordecompras Gestordecompras, gestor.Gestordecomprasprodutos Gestordecomprasprodutos ){
        try {           
            
            

        } catch( Exception e ){ JOPM JOptionPaneMod = new JOPM( 2, "alteracoesExternas, \n"
                + e.getMessage() + "\n", this.getClass().getSimpleName() ); }   
        
    }
    
    
    //Salvar
    public void salvar( gestor.Gestordecompras Gestordecompras, List<gestor.Gestordecomprasprodutos> list, boolean alterar ) {
        if( Gestor_New.btSalvar.isEnabled() ) {
            
            if( !Gestor_New.tfFornecedor.getText().trim().equals( "" )  ){
                
                if( Gestor_New.Tabela_New_Pesquisa.tmPesquisa.getRowCount() > 0  ){
                    
                    confirmarSalvar( Gestordecompras, list, alterar );
                }
                else{ sem2(); }
                
            }
            else{ sem1(); }
        }
    } 
            
    public void confirmarSalvar( gestor.Gestordecompras Gestordecompras, List<gestor.Gestordecomprasprodutos> list, boolean alterar ) {
        Gestordecompras = pegarDadosDoJPanelParaSalvar1( Gestordecompras, alterar );
        
        if( verificarRepeticao( Gestordecompras ) == false ){
            
            try{
                
                DAOGenericoJPA DAOGenericoJPA = new DAOGenericoJPA( Gestordecompras, JPAUtil.em()); 
                gestor.Gestordecompras GestordecomprasSalvo = DAOGenericoJPA.gravanovoOUatualizarGestor( Gestordecompras );
                
                //System.out.println( "Verificar ID - " + GestordecomprasSalvo );
                pegarDadosDoJPanelParaSalvar2( GestordecomprasSalvo, list, alterar );
                
            }catch( Exception e ){}
            
            Gestor_New.Gestor_Home.Inicio.cancelar();
            
        } else{ repetido(); }
    }
   
   private void sem1() {
       JOPM JOptionPaneMod = new JOPM( 2, "FORNECEDOR, "
                        + "\nO FORNECEDOR não foi selecionado "
                        + "\nSelecine um FORNECEDOR para continuar"
                        + "\n", "FORNECEDOR" );
   }
   
   private void sem2() {
       JOPM JOptionPaneMod = new JOPM( 2, "PRODUTO, "
                        + "\nNenhum PRODUTO foi Adicionado ao Gestor"
                        + "\nAdicione ao menos um PRODUTO para continuar"
                        + "\n", "PRODUTO" );
   }
   
   private void repetido() {
       JOPM JOptionPaneMod = new JOPM( 2, "PRODUTO JÁ CADASTRADO PARA O FORNECEDOR, "
                        + "\nO PRODUTO informado já existe cadastrado para este fornecedor"
                        + "\nInforme um PRODUTO ainda não cadastrado para o fornecedor"
                        + "\n", "PRODUTO JÁ CADASTRADO PARA O FORNECEDOR" );
   }
   
   private boolean verificarRepeticao( gestor.Gestordecompras Gestordecompras ) {  
       boolean retorno = false;
        try{
           
        }catch(Exception e ){} 
        
        return retorno;
    }
   
    private gestor.Gestordecompras pegarDadosDoJPanelParaSalvar1( gestor.Gestordecompras Gestordecompras, boolean alterar ) {          
        try{
       
            Gestordecompras.setNomeourazaosocial   ( Gestor_New.Fornecedor.getNomeourazaosocial() );            
            Gestordecompras.setNomefantasia        ( Gestor_New.Fornecedor.getNomefantasia().trim().toUpperCase() );
            
            Gestordecompras.setNomesupervisor      ( Gestor_New.Fornecedor.getNomesupervisor().trim().toUpperCase() );
            Gestordecompras.setTelefonesupervisor  ( Gestor_New.Fornecedor.getTelefonesupervisor().trim().toUpperCase() );
            
            Gestordecompras.setNomevendedor        ( Gestor_New.Fornecedor.getNomevendedor().trim().toUpperCase() );
            Gestordecompras.setTelefonevendedor    ( Gestor_New.Fornecedor.getTelefonevendedor().trim().toUpperCase() );
            
            Gestordecompras.setPrazodeentrega      ( Gestor_New.Fornecedor.getPrazodeentrega().trim().toUpperCase() );
            Gestordecompras.setPrazodepagamento    ( Gestor_New.Fornecedor.getPrazodepagamento().trim().toUpperCase() );
            
            Gestordecompras.setTipodepessoa        ( Gestor_New.Fornecedor.getTipodepessoa().trim().toUpperCase() );
            Gestordecompras.setCnpj                ( Gestor_New.Fornecedor.getCnpj().trim().toUpperCase() );
            
            if( alterar == false ){
                
                GregorianCalendar gc = new GregorianCalendar();
                Date dataHoje = gc.getTime();
                
                Gestordecompras.setData             ( dataHoje );
            }
            
            Gestordecompras.setIdFornecedor         ( Gestor_New.Fornecedor.getId() );
                      
        }catch(Exception e ){} 
        
        return Gestordecompras;
    }
    
    private List<gestor.Gestordecomprasprodutos> pegarDadosDoJPanelParaSalvar2( gestor.Gestordecompras Gestordecompras, List<gestor.Gestordecomprasprodutos> list, boolean alterar ) {          
        try{

            for (int i = 0; i < Gestor_New.Tabela_New_Pesquisa.tmPesquisa.getRowCount(); i++){
                    
                if( Gestor_New.Tabela_New_Pesquisa.tbPesquisa.getValueAt( i, 3 ) != null ){
                        
                    if( Gestor_New.Tabela_New_Pesquisa.tbPesquisa.getValueAt( i, 5 ) != null ){
                            
                        if( Gestor_New.Tabela_New_Pesquisa.tbPesquisa.getValueAt( i, 6 ) != null ){
                                  
                            pegarDadosDoJPanelParaSalvar22( i, Gestordecompras, list, alterar );
                        }                            
                    }   
                }
            }                           
                      
        }catch(Exception e ){} 
        
        return list;
    }
    
    private List<gestor.Gestordecomprasprodutos> pegarDadosDoJPanelParaSalvar22( int i, gestor.Gestordecompras Gestordecompras, List<gestor.Gestordecomprasprodutos> list, boolean alterar ) {          
        try{ 
                   
            gestor.Gestordecomprasprodutos GestordecomprasprodutosNew = new gestor.Gestordecomprasprodutos();
            
            //ID_GESTORDECOMPRASPRODUTOS
            if( alterar == true ){
                try{ 
                    int id_GestorComprasProdutosX = (int) Gestor_New.Tabela_New_Pesquisa.tbPesquisa.getValueAt( i, 0 );
                    GestordecomprasprodutosNew.setId( id_GestorComprasProdutosX ); 
                }catch(Exception e ){}            
            }
            //ID_GESTORDECOMPRASPRODUTOS
            
            //PRODUTO X  --- AO CRIAR UM NOVO VISUALIZA-SE O ID DO PRODUTO MAIS AO ALTERAR É MOSTRADO O ID DO GESTOR DE COMPRAS
            Produto Produto = new Produto();
            try{            
                String codigoProdutoX = (String) Gestor_New.Tabela_New_Pesquisa.tbPesquisa.getValueAt( i, 1 );
                
                Query q = JPAUtil.em().createNativeQuery( "SELECT * FROM SCHEMAJMARY.PRODUTO WHERE CODIGOPRODUTO LIKE ?", Produto.class );
                q.setParameter( 1, codigoProdutoX.trim() );   
                List<produto.Produto> list6 = q.getResultList();
                for (int h = 0; h < list6.size(); h++){
                    Produto = list6.get(h);
                }
            }catch(Exception e ){ e.printStackTrace(); System.out.println( "PRODUTO X - " + Gestor_New.Tabela_New_Pesquisa.tbPesquisa.getValueAt( i, 1 ) ); }
            //PRODUTO X
                   
            //PRODUTO 
            try{ GestordecomprasprodutosNew.setIdProduto       ( Produto.getId() );               }catch(Exception e ){}
            try{ GestordecomprasprodutosNew.setCodigoproduto   ( Produto.getCodigoproduto() );    }catch(Exception e ){}
            try{ GestordecomprasprodutosNew.setDescricaoproduto( Produto.getDescricaoproduto() ); }catch(Exception e ){}
            //PRODUTO     
            
            //DADOS
            try{ GestordecomprasprodutosNew.setCusto           ( (Double) Gestor_New.Tabela_New_Pesquisa.tbPesquisa.getValueAt( i, 3 ) ); }catch(Exception e ){}
            try{ 
                int n = 0;
                String s = String.valueOf( Gestor_New.Tabela_New_Pesquisa.tbPesquisa.getValueAt( i, 4 ) );
                try{ n = Integer.parseInt(s); }catch(Exception e ){}
                //System.out.println( "Venda - " + Gestor_New.Tabela_New_Pesquisa.tbPesquisa.getValueAt( i, 4 ));
                
                GestordecomprasprodutosNew.setVenda ( n );
            }catch(Exception e ){}
            try{ GestordecomprasprodutosNew.setEstoque         ( (int)    Gestor_New.Tabela_New_Pesquisa.tbPesquisa.getValueAt( i, 5 ) ); }catch(Exception e ){}
            try{ GestordecomprasprodutosNew.setPedido          ( (int)    Gestor_New.Tabela_New_Pesquisa.tbPesquisa.getValueAt( i, 6 ) ); }catch(Exception e ){}
            //DADOS
            
            //DATA
            try{ GestordecomprasprodutosNew.setData( Gestordecompras.getData() ); }catch(Exception e ){}                                             
            //DATA
            
            //ID_GESTOR
            try{ GestordecomprasprodutosNew.setIdGestordecompras( Gestordecompras.getId() ); }catch(Exception e ){ System.out.println( "Gestordecompras.getId() - " + Gestordecompras.getId() );}
            //ID_GESTOR
            
            //CATEGORIA PRODUTO 
            try{
                
                GestordecomprasprodutosNew.setIdCategoriadoproduto( Produto.getIdCategoriadoproduto() );
            }catch(Exception e ){}
            //CATEGORIA PRODUTO
            
            //ID_FORNECEDOR
            GestordecomprasprodutosNew.setIdFornecedor        ( Gestordecompras.getIdFornecedor() );
            //ID_FORNECEDOR
            
            DAOGenericoJPA DAOGenericoJPA = new DAOGenericoJPA( GestordecomprasprodutosNew, JPAUtil.em());
            DAOGenericoJPA.gravanovoOUatualizar();
                      
        }catch(Exception e ){ e.printStackTrace(); } 
        
        return list;
    }

    public void setarDadosDoBancoNoJPanel( gestor.Gestordecompras Gestordecompras, List<gestor.Gestordecomprasprodutos> list_Gestordecomprasprodutos ) {          
        try{
            
            Gestor_New.Fornecedor.setId( Gestordecompras.getIdFornecedor() ); 
            Gestor_New.Fornecedor.setNomeourazaosocial( Gestordecompras.getNomeourazaosocial() );
            
            Gestor_New.tfFornecedor.setText( Gestordecompras.getNomeourazaosocial() );                           
            
            Gestor_New.Tabela_New_Pesquisa.mostrarLista( list_Gestordecomprasprodutos );
      
        }catch(Exception e ){} 
    }
    
    public void desabilitarComponentesDoJPanel( boolean b ) {          
        try{
            
            //Produto_Por_Fornecedor_New.tfDescricaoDoProduto       .setEditable(b);       

        }catch(Exception e ){} 
    }
    
}
