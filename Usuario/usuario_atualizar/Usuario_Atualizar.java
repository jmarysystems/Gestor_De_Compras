/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package usuario_atualizar;

import usuario.Usuario;
import usuario.Usuario_Home;
import usuario_new.Usuario_New;
import utilidades.JOPM;

/**
 *
 * @author pc
 */
public class Usuario_Atualizar {
    
    Usuario_Home  Usuario_Home;
    public Usuario Usuario;
    public Usuario_New Usuario_New;
    
    String alterar = "";
    
    public Usuario_Atualizar( Usuario_Home Usuario_Home2, Usuario Usuario2, String alterar2 ) {
        
        Usuario_Home = Usuario_Home2;
        Usuario      = Usuario2;
        alterar      = alterar2;
        
        Usuario_New = new Usuario_New( Usuario_Home );
        
        inicio();
    }
    
    Usuario_Atualizar Usuario_Atualizar;
    private void inicio(){
        
        Usuario_Atualizar = this;
        
        new Thread() {   @Override public void run() { try { Thread.sleep( 1 ); 
                     
            if( alterar.equals("Alterar") ){
                Usuario_Home.Home.ControleTabs.AddTabSemControleNovo( Usuario_Home.tabHome, alterar, "/utilidades_imagens/alterar.gif", Usuario_New );
            }
            else if( alterar.equals("Visualizar") ){
                Usuario_Home.Home.ControleTabs.AddTabSemControleNovo( Usuario_Home.tabHome, "Visualizar", "/utilidades_imagens/olho.png", Usuario_New );
            }
            Usuario_Atualizar_Inicio Usuario_Atualizar_Inicio = new Usuario_Atualizar_Inicio( Usuario_Atualizar );
            
        } catch( Exception e ){ JOPM JOptionPaneMod = new JOPM( 2, "inicio(), \n"
                + e.getMessage() + "\n", "Usuario_Atualizar" ); } } }.start();                 
    }
    
}
