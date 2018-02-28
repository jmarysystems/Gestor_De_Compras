/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package gestor;

import gestor_new.Gestor_New;
import gestor_search.Menu_Pesquisa_Gestor;
import gestor_search.Tabela_Pesquisa_BD_Gestor;
import home_usuario_logado.Usuario_Logado;
import java.awt.BorderLayout;
import java.awt.event.MouseListener;
import java.util.List;
import javax.swing.JPanel;
import usuario.Usuario_Permissoes;
import utilidades.Conjunto_Botoes;
import utilidades.JOPM;

/**
 *
 * @author pc
 */
public class Gestor_Home_Inicio {
        
    Conjunto_Botoes   Conjunto_Botoes;
    Gestor_Home       Gestor_Home;//Materias_Home; 
    
    public Gestor_Home_Inicio( Gestor_Home Gestor_Home2 ) {
        
        Gestor_Home = Gestor_Home2;
        
        new Thread() {   @Override public void run() { try { Thread.sleep( 1 ); 
        
            Gestor_Home.pnHome.setLayout( new BorderLayout() );  
            
            Conjunto_Botoes = new Conjunto_Botoes( Gestor_Home.Home );
            eventoBotaoNovo();
            eventoBotaoCancelar();
            eventoBotaoPesquisar();
            
            Gestor_Home.pnHome.add( Conjunto_Botoes        , BorderLayout.NORTH  );
            Gestor_Home.pnHome.add( Gestor_Home.tabHome    , BorderLayout.CENTER );    
            addAbaPesquisa();
            
        } catch( Exception e ){ JOPM JOptionPaneMod = new JOPM( 2, "inicio(), \n"
                + e.getMessage() + "\n", this.getClass().getSimpleName() ); } } }.start(); 
    }
    
    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    public fornecedor.Fornecedor                             Fornecedor4;
    public List<produto_por_fornecedor.Produtoporfornecedor> list4;
    public Gestor_Home_Inicio( Gestor_Home Gestor_Home2, fornecedor.Fornecedor Fornecedor44, List<produto_por_fornecedor.Produtoporfornecedor> list44 ) {
        
        Gestor_Home = Gestor_Home2;
        
        list4       = list44;
        Fornecedor4 = Fornecedor44;
        
        new Thread() {   @Override public void run() { try { Thread.sleep( 1 ); 
        
            Gestor_Home.pnHome.setLayout( new BorderLayout() );  
            
            Conjunto_Botoes = new Conjunto_Botoes( Gestor_Home.Home );
            eventoBotaoNovo();
            eventoBotaoCancelar();
            eventoBotaoPesquisar();
            
            Gestor_Home.pnHome.add( Conjunto_Botoes        , BorderLayout.NORTH  );
            Gestor_Home.pnHome.add( Gestor_Home.tabHome    , BorderLayout.CENTER );    
            
            new Thread() {   @Override public void run() { try { Thread.sleep( 1 ); 
           
                Gestor_Home.Home.ControleTabs.AddTabSemControleNovo( Gestor_Home.tabHome, "Novo", "/utilidades_imagens/novo.gif", new Gestor_New(Gestor_Home, Gestor_Home.Fornecedor4, Gestor_Home.list4) );
        
            } catch( Exception e ){ JOPM JOptionPaneMod = new JOPM( 2, "addAbaNovo, \n"
                    + e.getMessage() + "\n", this.getClass().getSimpleName() ); } } }.start(); 
            
        } catch( Exception e ){ JOPM JOptionPaneMod = new JOPM( 2, "inicio(), \n"
                + e.getMessage() + "\n", this.getClass().getSimpleName() ); } } }.start(); 
    }
    /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    
    // Aba Novo 
    public void addAbaNovo(){      
        new Thread() {   @Override public void run() { try { Thread.sleep( 1 ); 
           
            Gestor_Home.Home.ControleTabs.AddTabSemControleNovo( Gestor_Home.tabHome, "Novo", "/utilidades_imagens/novo.gif", new Gestor_New(Gestor_Home) );
        
        } catch( Exception e ){ JOPM JOptionPaneMod = new JOPM( 2, "addAbaNovo, \n"
                + e.getMessage() + "\n", this.getClass().getSimpleName() ); } } }.start();         
    }
    
    // Cancelar Aba Selecionada
    public void cancelar() {                                           
        new Thread() {   @Override public void run() { try { Thread.sleep( 1 );                   
            
            Gestor_Home.Home.ControleTabs.removerTabSemControleSelecionado( Gestor_Home.tabHome );
            
        } catch( Exception e ){ JOPM JOptionPaneMod = new JOPM( 2, "cancelar(), \n"
                + e.getMessage() + "\n", this.getClass().getSimpleName() ); } } }.start();     
    }
    
    // Aba Pesquisar
    public void addAbaPesquisa(){        
        new Thread() {   @Override public void run() { try { Thread.sleep( 1 ); 
        
            Menu_Pesquisa_Gestor      Menu_Pesquisa      = new Menu_Pesquisa_Gestor( Gestor_Home );
            Tabela_Pesquisa_BD_Gestor Tabela_Pesquisa_BD = new Tabela_Pesquisa_BD_Gestor( Gestor_Home );
            
            Menu_Pesquisa.tabela     ( Tabela_Pesquisa_BD  );
            Tabela_Pesquisa_BD.tabela( Menu_Pesquisa       );
                                             
            JPanel jp = new JPanel();
            jp.setLayout( new BorderLayout() );  
            jp.add      ( Menu_Pesquisa, BorderLayout.NORTH  );
            jp.add      ( Tabela_Pesquisa_BD, BorderLayout.CENTER  );
                                    
            Gestor_Home.Home.ControleTabs.AddTabSemControleNovo( Gestor_Home.tabHome, "Pesquisar", "/utilidades_imagens/pesquisar.gif", jp );
           
        } catch( Exception e ){ JOPM JOptionPaneMod = new JOPM( 2, "addAbaPesquisa(), \n"
                + e.getMessage() + "\n", this.getClass().getSimpleName() ); } } }.start();                 
    }
    
    
    ////////////////////////////////////////////////////////////////////////////////////////////////
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

                     if( Usuario_Permissoes.booCadastrargestordecompras( Usuario_Logado.ID ) == true ) {
                         
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
