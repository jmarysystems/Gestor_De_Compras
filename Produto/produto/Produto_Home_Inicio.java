/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package produto;

import gestor_new.Gestor_New;
import home_usuario_logado.Usuario_Logado;
import java.awt.BorderLayout;
import javax.swing.JPanel;
import produto_new.Produto_New;
import produto_por_fornecedor_new.Produto_Por_Fornecedor_New;
import produto_search.Menu_Pesquisa_Produto;
import produto_search.Tabela_Pesquisa_BD_Produto;
import usuario.Usuario_Permissoes;
import utilidades.JOPM;

/**
 *
 * @author pc
 */
public class Produto_Home_Inicio {
        
    Produto_Home Produto_Home;//Materias_Home; 
    
    public Produto_Home_Inicio( Produto_Home Produto_Home2 ) {
        
        Produto_Home = Produto_Home2;
         
        new Thread() {   @Override public void run() { try { Thread.sleep( 1 ); 
        
            Produto_Home.pnHome.setLayout( new BorderLayout() );    
        
            Produto_Home.pnHome.add( Produto_Home.Conjunto_Botoes        , BorderLayout.NORTH  );
            Produto_Home.pnHome.add( Produto_Home.tabHome                , BorderLayout.CENTER );    
        
            addAbaPesquisa();
            
        } catch( Exception e ){ JOPM JOptionPaneMod = new JOPM( 2, "inicio(), \n"
                + e.getMessage() + "\n", this.getClass().getSimpleName() ); } } }.start(); 
    }
    
    //////////////////////////////////////////////////////
    public Produto_Home_Inicio( Produto_Home Produto_Home2, Produto_Por_Fornecedor_New Produto_Por_Fornecedor_New2 ) {
        
        Produto_Home = Produto_Home2;
        
        try { Thread.sleep( 1 ); 
        
            Produto_Home.pnHome.setLayout( new BorderLayout() );    
        
            /**/Produto_Home.tabHome = Produto_Home.Produto_Por_Fornecedor_New.Produto_Por_Fornecedor_Home.tabHome;
            //////////////////
            Menu_Pesquisa_Produto      Menu_Pesquisa                 = new Menu_Pesquisa_Produto( Produto_Home, Produto_Home.Produto_Por_Fornecedor_New );
            Tabela_Pesquisa_BD_Produto Tabela_Pesquisa_BD_Fornecedor = new Tabela_Pesquisa_BD_Produto( Produto_Home );
            
            Menu_Pesquisa.tabela(Tabela_Pesquisa_BD_Fornecedor  );
            Tabela_Pesquisa_BD_Fornecedor.tabela( Menu_Pesquisa );
                                             
            JPanel jp = new JPanel();
            jp.setLayout( new BorderLayout() );  
            jp.add      ( Menu_Pesquisa, BorderLayout.NORTH  );
            jp.add      ( Tabela_Pesquisa_BD_Fornecedor, BorderLayout.CENTER  );
            ///////////////////
            
            /**/Produto_Home.pnHome.add( jp               , BorderLayout.CENTER );    
            
        } catch( Exception e ){ JOPM JOptionPaneMod = new JOPM( 2, "inicio(), \n"
                + e.getMessage() + "\n", this.getClass().getSimpleName() ); } 
    }
    ////////////////////////////////////////////////////////
    
    //////////////////////////////////////////////////////
    public Produto_Home_Inicio( Produto_Home Produto_Home2, Gestor_New Gestor_New2 ) {
        
        Produto_Home = Produto_Home2;
        
        try { Thread.sleep( 1 ); 
        
            Produto_Home.pnHome.setLayout( new BorderLayout() );    
        
            /**/Produto_Home.tabHome = Produto_Home.Gestor_New.Gestor_Home.tabHome;
            //////////////////
            Menu_Pesquisa_Produto      Menu_Pesquisa                 = new Menu_Pesquisa_Produto( Produto_Home, Produto_Home.Gestor_New );
            Tabela_Pesquisa_BD_Produto Tabela_Pesquisa_BD_Fornecedor = new Tabela_Pesquisa_BD_Produto( Produto_Home );
            
            Menu_Pesquisa.tabela(Tabela_Pesquisa_BD_Fornecedor  );
            Tabela_Pesquisa_BD_Fornecedor.tabela( Menu_Pesquisa );
                                             
            JPanel jp = new JPanel();
            jp.setLayout( new BorderLayout() );  
            jp.add      ( Menu_Pesquisa, BorderLayout.NORTH  );
            jp.add      ( Tabela_Pesquisa_BD_Fornecedor, BorderLayout.CENTER  );
            ///////////////////
            
            /**/Produto_Home.pnHome.add( jp               , BorderLayout.CENTER );    
            
        } catch( Exception e ){ JOPM JOptionPaneMod = new JOPM( 2, "inicio(), \n"
                + e.getMessage() + "\n", this.getClass().getSimpleName() ); } 
    }
    ////////////////////////////////////////////////////////
    
    // Aba Novo 
    public void addAbaNovo(){      
        new Thread() {   @Override public void run() { try { Thread.sleep( 1 ); 
           
            if( Usuario_Permissoes.booCadastrargestordecompras( Usuario_Logado.ID ) == true ) {
                         
                Produto_Home.Home.ControleTabs.AddTabSemControleNovo( Produto_Home.tabHome, "Novo", "/utilidades_imagens/novo.gif", new Produto_New(Produto_Home) );
            }     
            else{
                JOPM JOPM = new JOPM( 2, "USUÁRIO SEM AUTORIZAÇÂO, \n"+ "O USUÁRIO LOGADO NÃO TEM PERMISSÃO PARA REALIZAR ESTA AÇÃO" + "\n", this.getClass().getSimpleName() );
            }
                    
        } catch( Exception e ){ JOPM JOptionPaneMod = new JOPM( 2, "addAbaNovo, \n"
                + e.getMessage() + "\n", this.getClass().getSimpleName() ); } } }.start();         
    }
    
    // Cancelar Aba Selecionada
    public void cancelar() {                                           
        new Thread() {   @Override public void run() { try { Thread.sleep( 1 );                   
            
            Produto_Home.Home.ControleTabs.removerTabSemControleSelecionado( Produto_Home.tabHome );
            
        } catch( Exception e ){ JOPM JOptionPaneMod = new JOPM( 2, "cancelar(), \n"
                + e.getMessage() + "\n", this.getClass().getSimpleName() ); } } }.start();     
    }
    
    // Aba Pesquisar
    public void addAbaPesquisa(){        
        new Thread() {   @Override public void run() { try { Thread.sleep( 1 ); 
        
            Menu_Pesquisa_Produto Menu_Pesquisa           = new Menu_Pesquisa_Produto( Produto_Home );
            Tabela_Pesquisa_BD_Produto Tabela_Pesquisa_BD = new Tabela_Pesquisa_BD_Produto( Produto_Home );
            
            Menu_Pesquisa.tabela(Tabela_Pesquisa_BD  );
            Tabela_Pesquisa_BD.tabela( Menu_Pesquisa );
                                             
            JPanel jp = new JPanel();
            jp.setLayout( new BorderLayout() );  
            jp.add      ( Menu_Pesquisa, BorderLayout.NORTH  );
            jp.add      ( Tabela_Pesquisa_BD, BorderLayout.CENTER  );
                                    
            Produto_Home.Home.ControleTabs.AddTabSemControleNovo( Produto_Home.tabHome, "Pesquisar", "/utilidades_imagens/pesquisar.gif", jp );
            
        } catch( Exception e ){ JOPM JOptionPaneMod = new JOPM( 2, "addAbaPesquisa(), \n"
                + e.getMessage() + "\n", this.getClass().getSimpleName() ); } } }.start();                 
    }
         
}
