/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package usuario_visualizar;

import usuario.Usuario;
import usuario.Usuario_Home;
import usuario_atualizar.Usuario_Atualizar;

/**
 *
 * @author pc
 */
public class Usuario_Visualizar extends Usuario_Atualizar{

    public Usuario_Visualizar( Usuario_Home Usuario_Home2, Usuario Usuario2) {
        super(Usuario_Home2, Usuario2, "Visualizar");
        
        
        Usuario_New.btSalvar.setVisible(false);
        Usuario_New.btAtualizar.setVisible(false);
                
    }
    
}
