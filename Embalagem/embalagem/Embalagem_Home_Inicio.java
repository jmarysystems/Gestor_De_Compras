/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package embalagem;

import embalagem_new.Embalagem_New;
import embalagem_search.Menu_Pesquisa_Embalagem;
import embalagem_search.Tabela_Pesquisa_BD_Embalagem;
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
public class Embalagem_Home_Inicio {
        
    Conjunto_Botoes Conjunto_Botoes;
    Embalagem_Home  Embalagem_Home;//Materias_Home; 
    
    public Embalagem_Home_Inicio( Embalagem_Home Embalagem_Home2 ) {
        
        Embalagem_Home = Embalagem_Home2;
        
        inicio();
    }
    
    private void inicio(){
        
        new Thread() {   @Override public void run() { try { Thread.sleep( 1 ); 
        
            iniciar();
            
        } catch( Exception e ){ JOPM JOptionPaneMod = new JOPM( 2, "inicio(), \n"
                + e.getMessage() + "\n", this.getClass().getSimpleName() ); } } }.start(); 
                
    }
    
    private void iniciar(){

        Embalagem_Home.pnHome.setLayout( new BorderLayout() );   
        
        Conjunto_Botoes = new Conjunto_Botoes( Embalagem_Home.Home );
        eventoBotaoNovo();
        eventoBotaoCancelar();
        eventoBotaoPesquisar();
        
        Embalagem_Home.pnHome.add( Conjunto_Botoes           , BorderLayout.NORTH  );
        Embalagem_Home.pnHome.add( Embalagem_Home.tabHome    , BorderLayout.CENTER );    
        
        addAbaPesquisa();
                 
    }  
    
    // Aba Novo 
    public void addAbaNovo(){      
        new Thread() {   @Override public void run() { try { Thread.sleep( 1 ); 
           
            Embalagem_Home.Home.ControleTabs.AddTabSemControleNovo( Embalagem_Home.tabHome, "Novo", "/utilidades_imagens/novo.gif", new Embalagem_New(Embalagem_Home) );
        
        } catch( Exception e ){ JOPM JOptionPaneMod = new JOPM( 2, "addAbaNovo, \n"
                + e.getMessage() + "\n", this.getClass().getSimpleName() ); } } }.start();         
    }
    
    // Cancelar Aba Selecionada
    public void cancelar() {                                           
        new Thread() {   @Override public void run() { try { Thread.sleep( 1 );                   
            
            Embalagem_Home.Home.ControleTabs.removerTabSemControleSelecionado( Embalagem_Home.tabHome );
            
        } catch( Exception e ){ JOPM JOptionPaneMod = new JOPM( 2, "cancelar(), \n"
                + e.getMessage() + "\n", this.getClass().getSimpleName() ); } } }.start();     
    }
    
    // Aba Pesquisar
    public void addAbaPesquisa(){        
        new Thread() {   @Override public void run() { try { Thread.sleep( 1 ); 
        
            Menu_Pesquisa_Embalagem Menu_Pesquisa           = new Menu_Pesquisa_Embalagem( Embalagem_Home );
            Tabela_Pesquisa_BD_Embalagem Tabela_Pesquisa_BD = new Tabela_Pesquisa_BD_Embalagem( Embalagem_Home );
            
            Menu_Pesquisa.tabela( Tabela_Pesquisa_BD  );
            Tabela_Pesquisa_BD.tabela( Menu_Pesquisa );
                                             
            JPanel jp = new JPanel();
            jp.setLayout( new BorderLayout() );  
            jp.add      ( Menu_Pesquisa, BorderLayout.NORTH  );
            jp.add      ( Tabela_Pesquisa_BD, BorderLayout.CENTER  );
                                    
            Embalagem_Home.Home.ControleTabs.AddTabSemControleNovo( Embalagem_Home.tabHome, "Pesquisar", "/utilidades_imagens/pesquisar.gif", jp );
            
        } catch( Exception e ){ JOPM JOptionPaneMod = new JOPM( 2, "addAbaPesquisa(), \n"
                + e.getMessage() + "\n", this.getClass().getSimpleName() ); } } }.start();                 
    }
    
    
    /////////////////////////////////////////////////////////////////////////////////////
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

                    if( Usuario_Permissoes.booCadastrarproduto(Usuario_Logado.ID ) == true ) {
                         
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
