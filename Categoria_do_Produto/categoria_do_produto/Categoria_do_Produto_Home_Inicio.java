/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package categoria_do_produto;

import categoria_do_produto_new.Categoria_do_Produto_New;
import categoria_do_produto_search.Menu_Pesquisa_Categoria_do_Produto;
import categoria_do_produto_search.Tabela_Pesquisa_BD_Categoria_do_Produto;
import home_usuario_logado.Usuario_Logado;
import java.awt.BorderLayout;
import java.awt.event.MouseListener;
import javax.swing.JPanel;
import usuario.Usuario_Permissoes;
import utilidades.Conjunto_Botoes;
import utilidades.JOPM;

/**
 *
 * @author pc
 */
public class Categoria_do_Produto_Home_Inicio {
        
    Conjunto_Botoes           Conjunto_Botoes;
    Categoria_do_Produto_Home Categoria_do_Produto_Home;//Materias_Home; 
    
    public Categoria_do_Produto_Home_Inicio( Categoria_do_Produto_Home Categoria_do_Produto_Home2 ) {
        
        Categoria_do_Produto_Home = Categoria_do_Produto_Home2;
        
        inicio();
    }
    
    private void inicio(){
        
        new Thread() {   @Override public void run() { try { Thread.sleep( 1 ); 
        
            iniciar();
            
        } catch( Exception e ){ JOPM JOptionPaneMod = new JOPM( 2, "inicio(), \n"
                + e.getMessage() + "\n", this.getClass().getSimpleName() ); } } }.start(); 
                
    }
    
    private void iniciar(){

        Categoria_do_Produto_Home.pnHome.setLayout( new BorderLayout() );   
        
        Conjunto_Botoes = new Conjunto_Botoes( Categoria_do_Produto_Home.Home );
        eventoBotaoNovo();
        eventoBotaoCancelar();
        eventoBotaoPesquisar();
        
        Categoria_do_Produto_Home.pnHome.add( Conjunto_Botoes                      , BorderLayout.NORTH  );
        Categoria_do_Produto_Home.pnHome.add( Categoria_do_Produto_Home.tabHome    , BorderLayout.CENTER );    
        
        addAbaPesquisa();
                 
    }  
    
    // Aba Novo 
    public void addAbaNovo(){      
        new Thread() {   @Override public void run() { try { Thread.sleep( 1 ); 
           
            Categoria_do_Produto_Home.Home.ControleTabs.AddTabSemControleNovo( Categoria_do_Produto_Home.tabHome, "Novo", "/utilidades_imagens/novo.gif", new Categoria_do_Produto_New(Categoria_do_Produto_Home) );
        
        } catch( Exception e ){ JOPM JOptionPaneMod = new JOPM( 2, "addAbaNovo, \n"
                + e.getMessage() + "\n", this.getClass().getSimpleName() ); } } }.start();         
    }
    
    // Cancelar Aba Selecionada
    public void cancelar() {                                           
        new Thread() {   @Override public void run() { try { Thread.sleep( 1 );                   
            
            Categoria_do_Produto_Home.Home.ControleTabs.removerTabSemControleSelecionado( Categoria_do_Produto_Home.tabHome );
            
        } catch( Exception e ){ JOPM JOptionPaneMod = new JOPM( 2, "cancelar(), \n"
                + e.getMessage() + "\n", this.getClass().getSimpleName() ); } } }.start();     
    }
    
    // Aba Pesquisar
    public void addAbaPesquisa(){        
        new Thread() {   @Override public void run() { try { Thread.sleep( 1 ); 
        
            Menu_Pesquisa_Categoria_do_Produto Menu_Pesquisa           = new Menu_Pesquisa_Categoria_do_Produto( Categoria_do_Produto_Home );
            Tabela_Pesquisa_BD_Categoria_do_Produto Tabela_Pesquisa_BD = new Tabela_Pesquisa_BD_Categoria_do_Produto( Categoria_do_Produto_Home );
            
            Menu_Pesquisa.tabela(Tabela_Pesquisa_BD  );
            Tabela_Pesquisa_BD.tabela( Menu_Pesquisa );
                                             
            JPanel jp = new JPanel();
            jp.setLayout( new BorderLayout() );  
            jp.add      ( Menu_Pesquisa, BorderLayout.NORTH  );
            jp.add      ( Tabela_Pesquisa_BD, BorderLayout.CENTER  );
                                    
            Categoria_do_Produto_Home.Home.ControleTabs.AddTabSemControleNovo( Categoria_do_Produto_Home.tabHome, "Pesquisar", "/utilidades_imagens/pesquisar.gif", jp );
            
        } catch( Exception e ){ JOPM JOptionPaneMod = new JOPM( 2, "addAbaPesquisa(), \n"
                + e.getMessage() + "\n", this.getClass().getSimpleName() ); } } }.start();                 
    }
    
    
    ////////////////////////
    private void eventoBotaoNovo(){         
        /*new Thread() {   @Override public void run() {*/ try {     
            //Eventos
            MouseListener[] MouseListener = Conjunto_Botoes.btNovo.getMouseListeners();
            for ( MouseListener MouseListener1 : MouseListener) {
                Conjunto_Botoes.btNovo.removeMouseListener( MouseListener1 );
            }
            Conjunto_Botoes.btNovo.addMouseListener(new java.awt.event.MouseAdapter() {
                @Override
                 public void mousePressed(java.awt.event.MouseEvent evt) {

                    if( Usuario_Permissoes.booCadastrarproduto( Usuario_Logado.ID ) == true ) {
                         
                         addAbaNovo();
                     }     
                     else{
                         JOPM JOPM = new JOPM( 2, "USUÁRIO SEM AUTORIZAÇÂO, \n"+ "O USUÁRIO LOGADO NÃO TEM PERMISSÃO PARA REALIZAR ESTA AÇÃO" + "\n", this.getClass().getSimpleName() );
                     }
                }
            });   
            
        } catch( Exception e ){ JOPM JOptionPaneMod = new JOPM( 2, "eventoBotaoNovo(), \n"
                + e.getMessage() + "\n", this.getClass().getSimpleName() ); } //} }.start(); 
    }
    
    private void eventoBotaoCancelar(){         
        /*new Thread() {   @Override public void run() {*/ try {     
            //Eventos
            MouseListener[] MouseListener = Conjunto_Botoes.btCancelar.getMouseListeners();
            for ( MouseListener MouseListener1 : MouseListener) {
                Conjunto_Botoes.btCancelar.removeMouseListener( MouseListener1 );
            }
            Conjunto_Botoes.btCancelar.addMouseListener(new java.awt.event.MouseAdapter() {
                @Override
                 public void mousePressed(java.awt.event.MouseEvent evt) {

                    cancelar();
                }
            });   
            
        } catch( Exception e ){ JOPM JOptionPaneMod = new JOPM( 2, "eventoBotaoCancelar(), \n"
                + e.getMessage() + "\n", this.getClass().getSimpleName() ); } //} }.start(); 
    }
    
    private void eventoBotaoPesquisar(){         
        /*new Thread() {   @Override public void run() {*/ try {     
            //Eventos
            MouseListener[] MouseListener = Conjunto_Botoes.btPesquisar.getMouseListeners();
            for ( MouseListener MouseListener1 : MouseListener) {
                Conjunto_Botoes.btPesquisar.removeMouseListener( MouseListener1 );
            }
            Conjunto_Botoes.btPesquisar.addMouseListener(new java.awt.event.MouseAdapter() {
                @Override
                 public void mousePressed(java.awt.event.MouseEvent evt) {

                    addAbaPesquisa();
                }
            });   
            
        } catch( Exception e ){ JOPM JOptionPaneMod = new JOPM( 2, "eventoBotaoPesquisar(), \n"
                + e.getMessage() + "\n", this.getClass().getSimpleName() ); } //} }.start(); 
    }
         
}
