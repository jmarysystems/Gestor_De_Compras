/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package fonema_e_letra;

import fonema_e_letra_barra_menu.Fonema_E_Letra_Barra_Menu;
import fonema_e_letra_submenus.Submenu1;
import utilidades.JOPM;

/**
 *
 * @author pc
 */
public class Fonema_E_Letra_Home_Inicio {
    
    Fonema_E_Letra_Home Fonema_E_Letra_Home;
    
    public Fonema_E_Letra_Home_Inicio( Fonema_E_Letra_Home Fonema_E_Letra_Home2 ) {
        
        Fonema_E_Letra_Home = Fonema_E_Letra_Home2;
        
        inicio();
    }
    
    private void inicio(){
        
        new Thread() {   @Override public void run() { try { Thread.sleep( 1 ); 
        
            // Trocar Menu do Home pelo Menu Fonema_E_Letra_Barra_Menu
            Fonema_E_Letra_Barra_Menu Fonema_E_Letra_Barra_Menu = new Fonema_E_Letra_Barra_Menu( Fonema_E_Letra_Home );
            Fonema_E_Letra_Home.adicionarSubmenu( new Submenu1( Fonema_E_Letra_Home ) );
            
        } catch( Exception e ){ JOPM JOptionPaneMod = new JOPM( 2, "inicio(), \n"
                + e.getMessage() + "\n", "Fonema_E_Letra_Home_Inicio" ); } } }.start(); 
                
    }
    
}
