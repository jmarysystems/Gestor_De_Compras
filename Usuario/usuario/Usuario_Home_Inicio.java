/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package usuario;

import java.awt.BorderLayout;
import javax.swing.JPanel;
import usuario_new.Usuario_New;
import usuario_search.Menu_Pesquisa_Usuario;
import usuario_search.Tabela_Pesquisa_BD_Usuario;
import utilidades.JOPM;

/**
 *
 * @author pc
 */
public class Usuario_Home_Inicio {
        
    Usuario_Home Usuario_Home;//Materias_Home; 
    
    public Usuario_Home_Inicio( Usuario_Home Usuario_Home2 ) {
        
        Usuario_Home = Usuario_Home2;
        
        inicio();
    }
    
    private void inicio(){
        
        new Thread() {   @Override public void run() { try { Thread.sleep( 1 ); 
        
            iniciar();
            
        } catch( Exception e ){ JOPM JOptionPaneMod = new JOPM( 2, "inicio(), \n"
                + e.getMessage() + "\n", this.getClass().getSimpleName() ); } } }.start(); 
                
    }
    
    private void iniciar(){

        Usuario_Home.pnHome.setLayout( new BorderLayout() );    
        
        Usuario_Home.pnHome.add( Usuario_Home.Conjunto_Botoes        , BorderLayout.NORTH  );
        Usuario_Home.pnHome.add( Usuario_Home.tabHome                , BorderLayout.CENTER );    
        
        //if( Bean_Usuario_Logado.PERMITIRACESSO == true ) {
            
            addAbaPesquisa();
            //Usuario_Home.Home.ControleTabs.AddTabSemControleNovo( Usuario_Home.tabHome, " Pesquisar ", "/imagens/pesquisar.gif", new Menu_Pesquisa_Usuario( Usuario_Home ) );
        //}
                 
    }  
    
    // Aba Novo 
    public void addAbaNovo(){        
        new Thread() {   @Override public void run() { try { Thread.sleep( 1 ); 
           
            //if( Bean_Usuario_Logado.PERMITIRACESSO == true ) {
            Usuario_Home.Home.ControleTabs.AddTabSemControleNovo( Usuario_Home.tabHome, "Novo", "/utilidades_imagens/novo.gif", new Usuario_New(Usuario_Home) );
            //}
        
        } catch( Exception e ){ JOPM JOptionPaneMod = new JOPM( 2, "addAbaNovo, \n"
                + e.getMessage() + "\n", "Materias_Home_Inicio" ); } } }.start();         
    }
    
    // Cancelar Aba Selecionada
    public void cancelar() {                                           
        new Thread() {   @Override public void run() { try { Thread.sleep( 1 );                   
            
            Usuario_Home.Home.ControleTabs.removerTabSemControleSelecionado( Usuario_Home.tabHome );
            
        } catch( Exception e ){ JOPM JOptionPaneMod = new JOPM( 2, "cancelar(), \n"
                + e.getMessage() + "\n", this.getClass().getSimpleName() ); } } }.start();     
    }
    
    // Aba Pesquisar
    public void addAbaPesquisa(){        
        new Thread() {   @Override public void run() { try { Thread.sleep( 1 ); 
        
            Menu_Pesquisa_Usuario Menu_Pesquisa                           = new Menu_Pesquisa_Usuario( Usuario_Home );
            Tabela_Pesquisa_BD_Usuario Tabela_Pesquisa_BD_Usuario = new Tabela_Pesquisa_BD_Usuario( Usuario_Home );
            
            Menu_Pesquisa.tabela(Tabela_Pesquisa_BD_Usuario  );
            Tabela_Pesquisa_BD_Usuario.tabela( Menu_Pesquisa );
                                             
            JPanel jp = new JPanel();
            jp.setLayout( new BorderLayout() );  
            jp.add      ( Menu_Pesquisa, BorderLayout.NORTH  );
            jp.add      ( Tabela_Pesquisa_BD_Usuario, BorderLayout.CENTER  );
                                    
            Usuario_Home.Home.ControleTabs.AddTabSemControleNovo( Usuario_Home.tabHome, "Pesquisar", "/utilidades_imagens/pesquisar.gif", jp );
            
        } catch( Exception e ){ JOPM JOptionPaneMod = new JOPM( 2, "addAbaPesquisa(), \n"
                + e.getMessage() + "\n", this.getClass().getSimpleName() ); } } }.start();                 
    }
         
}
