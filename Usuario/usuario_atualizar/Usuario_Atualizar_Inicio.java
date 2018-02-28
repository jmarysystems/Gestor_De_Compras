/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package usuario_atualizar;

import java.awt.event.MouseListener;
import usuario.Usuario;
import usuario_new.Usuario_New;
import utilidades.JOPM;

/**
 *
 * @author pc
 */
public class Usuario_Atualizar_Inicio extends Thread { 
    
    Usuario_Atualizar  Usuario_Atualizar;
    Usuario            Usuario;
    Usuario_New        Usuario_New;
    
    public Usuario_Atualizar_Inicio( Usuario_Atualizar Usuario_Atualizar2 ) {
        
        Usuario_Atualizar = Usuario_Atualizar2;
        
        Usuario     = Usuario_Atualizar.Usuario;
        Usuario_New = Usuario_Atualizar.Usuario_New;
        
        inicio();
    }
    
    private void inicio(){
        
        new Thread() {   @Override public void run() { try { Thread.sleep( 1 ); 

            synchronized ( this ) {
                atualizar_Conf();
                atualizar_Eventos();
                
                Usuario_New.btSalvar.setEnabled(true);
            }
            
        } catch( Exception e ){ JOPM JOptionPaneMod = new JOPM( 2, "inicio(), \n"
                + e.getMessage() + "\n", "Categorias_Atualizar_Inicio" ); } } }.start();                 
    }
    
    private void atualizar_Conf(){
        try{
            
            Usuario_New.tfLogin.setText( Usuario.getLogin() );
            Usuario_New.tfSenha.setText( Usuario.getSenha() );
            Usuario_New.tfRepetirSenha.setText( Usuario.getSenha() );
            Usuario_New.chPermitirAcessar.setSelected( Usuario.getPermitiracesso() );
            
            Usuario_New.chUsuarioCadastrar.setSelected( Usuario.getCadastrarusuario() );
            Usuario_New.chFornecedorCadastrar.setSelected( Usuario.getCadastrarfornecedor() );
            Usuario_New.chProdutoCadastrar.setSelected( Usuario.getCadastrarproduto() );
            Usuario_New.chProdutoXFornecedorCadastrar.setSelected( Usuario.getCadastrarprodutoporfornecedor() );
            Usuario_New.chGestorCadastrar.setSelected( Usuario.getCadastrargestordecompras() );
            
            Usuario_New.chUsuarioAlterar.setSelected( Usuario.getAlterarusuario() );
            Usuario_New.chFornecedorAlterar.setSelected( Usuario.getAlterarfornecedor() );
            Usuario_New.chProdutoAlterar.setSelected( Usuario.getAlterarproduto() );
            Usuario_New.chProdutoXFornecedorAlterar.setSelected( Usuario.getAlterarprodutoporfornecedor() );
            Usuario_New.chGestorAlterar.setSelected( Usuario.getAlterargestordecompras() );
            
            Usuario_New.chGestorAlterarEspCusto.setSelected( Usuario.getAlterargestordecomprascusto() );
            Usuario_New.chGestorAlterarEspVenda.setSelected( Usuario.getAlterargestordecomprasvenda() );
            Usuario_New.chGestorAlterarEspEstoque.setSelected( Usuario.getAlterargestordecomprasestoque() );
            Usuario_New.chGestorAlterarEspPedido.setSelected( Usuario.getAlterargestordecompraspedido() );
            
            Usuario_New.chUsuarioExcluir.setSelected( Usuario.getExcluirusuario() );
            Usuario_New.chFornecedorExcluir.setSelected( Usuario.getExcluirfornecedor() );
            Usuario_New.chProdutoExcluir.setSelected( Usuario.getExcluirproduto() );
            Usuario_New.chProdutoXFornecedorExcluir.setSelected( Usuario.getExcluirprodutoporfornecedor() );
            Usuario_New.chGestorExcluir.setSelected( Usuario.getExcluirgestordecompras() );
            
            Usuario_New.chUsuarioPesquisar.setSelected( Usuario.getPesquisarusuario() );
            Usuario_New.chFornecedorPesquisar.setSelected( Usuario.getPesquisarfornecedor() );
            Usuario_New.chProdutoPesquisar.setSelected( Usuario.getPesquisarproduto() );
            Usuario_New.chProdutoXFornecedorPesquisar.setSelected( Usuario.getPesquisarprodutoporfornecedor() );
            Usuario_New.chGestorPesquisar.setSelected( Usuario.getPesquisargestordecompras() );

        }catch(Exception e ){} 
    }   
    
    private void atualizar_Eventos() {  
         
        MouseListener[] MouseListener = Usuario_New.btSalvar.getMouseListeners();
        for ( MouseListener MouseListener1 : MouseListener) {
            Usuario_New.btSalvar.removeMouseListener( MouseListener1 );
        }
        
        Usuario_New.btSalvar.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mousePressed(java.awt.event.MouseEvent evt) {

                if( Usuario.getId() == 1 ){
                    JOPM JOptionPaneMod = new JOPM( 2, "USUÁRIO NATIVO, "
                            + "\nUSUÁRIO NATIVO NÃO PODE SER ALTERADO"
                            + "\nINFORME-SE COM O ADMINISTRADOR"
                            + "\n", "USUÁRIO NATIVO" );
                }
                else{
                    Usuario_New.Usuario_New_Inicio.salvar(Usuario);
                }
            }
        });                  
    }
             
}
