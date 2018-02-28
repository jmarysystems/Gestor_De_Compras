/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package login;

import br.com.jmary.home.HomeJApplet;
import home_usuario_logado.Usuario_Logado;
import java.util.List;
import javax.persistence.Query;
import jpa.JPAUtil;
import usuario.Usuario;
import utilidades.JOPM;

/**
 *
 * @author CARMAL
 */
public class Home_ControleThread extends Thread {  
    
    public Home_ControleThread( int ID2 ){   
        ID = ID2;
    } 
    
    int ID = 0;
    
    public void run(){  
        synchronized ( this ) {
            
            if( a( ID ) == true ){
                
                b( ID ); c(); 
            }
            else{
                semAcesso();
            }

        }  
    } 
    
    private boolean a( int ID ){  
        boolean retorno = false;
        
        synchronized(this) {
            
            try{
                
                Query q = JPAUtil.em().createNativeQuery( "SELECT * FROM SCHEMAJMARY.USUARIO WHERE ID = ?", Usuario.class );
                q.setParameter(1, ID );
                
                List<usuario.Usuario> list = q.getResultList();
                
                for (int i = 0; i < list.size(); i++){ 
                    
                    retorno = list.get(i).getPermitiracesso();
                }

            } catch( Exception e ){}
        } 
        
        return retorno;
    }
    
    private void b( int ID ){  
        synchronized(this) {
            
            Usuario_Logado.ID = ID;
        } 
    }
        
    public void c(){  
        synchronized ( this ) {
            HomeJApplet HomeJApplet = new HomeJApplet();
            HomeJApplet.iniciarJFrame();
        }
 
    } 
    
    private void semAcesso() {
       JOPM JOptionPaneMod = new JOPM( 2, "USUÁRIO sem permissão , "
                        + "\nO USUÁRIO informado não tem autorização"
                        + "\npara acessar o sistema."
                        + "\n"
                        + "\ninforme-se com o administrador"
                        + "\n", "USUÁRIO sem permissão" );
   }

    
    /******************Executar Teste*************************************
     * @param args************************
    public static void main(String[] args) {            
          
        ControleThread t1 = new ControleThread(); 
        
        t1.setName("Thread1");   
        
        t1.start();  
    }
    /******************Executar Teste*************************************/
    
}
