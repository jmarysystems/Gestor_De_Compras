/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package usuario_new;

import jpa.DAOGenericoJPA;
import jpa.JPAUtil;
import usuario.Usuario;
import utilidades.JOPM;

/**
 *
 * @author pc
 */
public class Usuario_New_Inicio {
        
    Usuario_New Usuario_New;//Materias_Home; 
    
    public Usuario_New_Inicio( Usuario_New Usuario_New2 ) {
        
        Usuario_New = Usuario_New2;

        inicio();
    }
    
    private void inicio(){
        
        new Thread() {   @Override public void run() { try { Thread.sleep( 1 ); 
        
            Usuario_New.configurarCbPermitirAcesso();
                        
        } catch( Exception e ){ JOPM JOptionPaneMod = new JOPM( 2, "inicio(), \n"
                + e.getMessage() + "\n", "Subcategorias_New_Inicio" ); } } }.start();                 
    }
   
   //Salvar
   public void salvar( usuario.Usuario Usuario ) {  
        if( Usuario_New.btSalvar.isEnabled() ) {
            
            if( Usuario_New.tfLogin.getText().trim().length() > 3 ) {
                
                if( Usuario_New.tfSenha.getText().trim().length() > 3 ) {
                    
                    if( Usuario_New.tfSenha.getText().trim().equals( Usuario_New.tfRepetirSenha.getText().trim() ) ) { 
                        
                        Usuario = setarUsuarioParaSalvar( Usuario );

                        DAOGenericoJPA DAOGenericoJPA = new DAOGenericoJPA(Usuario, JPAUtil.em());
                        DAOGenericoJPA.gravanovoOUatualizar();
                        
                        Usuario_New.btSalvar.setEnabled( false );
                        Usuario_New.tfLogin.setText("");
                        Usuario_New.Usuario_Home.Inicio.cancelar();
                        
                    }else{ semSenhaIgual(); }
                    
                }else{ semSenha(); }                                             
                
            }
            else{ semLogin(); }
        }
    } 
   
   public void semLogin() {
       JOPM JOptionPaneMod = new JOPM( 2, "LOGIN, "
                        + "\nO Campo LOGIN não pode ter menos que 4 caracteres"
                        + "\nInforme um LOGIN com no mínimo 4 caracteres"
                        + "\n", "LOGIN" );
   }
   public void semSenha() {
       JOPM JOptionPaneMod = new JOPM( 2, "SENHA, "
                        + "\nO Campo SENHA não pode ter menos que 4 caracteres"
                        + "\nInforme uma SENHA com no mínimo 4 caracteres"
                        + "\n", "SENHA" );
   }
   public void semSenhaIgual() {
       JOPM JOptionPaneMod = new JOPM( 2, "SENHAS diferentes, "
                        + "\nO Campo SENHA e confirmação não estão iguais"
                        + "\nInforme uma SENHA e uma confirmação igual"
                        + "\n", "SENHAS diferentes" );
   }
   
    public Usuario setarUsuarioParaSalvar( usuario.Usuario Usuario ) {          
        try{
            
            Usuario.setLogin( Usuario_New.tfLogin.getText().trim() );
            Usuario.setSenha( Usuario_New.tfSenha.getText().trim() );
            Usuario.setPermitiracesso( Usuario_New.chPermitirAcessar.isSelected() );
            
            Usuario.setCadastrarusuario                ( Usuario_New.chUsuarioCadastrar.isSelected() );
            Usuario.setCadastrarfornecedor             ( Usuario_New.chFornecedorCadastrar.isSelected() );
            Usuario.setCadastrarproduto                ( Usuario_New.chProdutoCadastrar.isSelected() );
            Usuario.setCadastrarprodutoporfornecedor   ( Usuario_New.chProdutoXFornecedorCadastrar.isSelected() );
            Usuario.setCadastrargestordecompras        ( Usuario_New.chGestorCadastrar.isSelected() );
            
            Usuario.setAlterarusuario                ( Usuario_New.chUsuarioAlterar.isSelected() );
            Usuario.setAlterarfornecedor             ( Usuario_New.chFornecedorAlterar.isSelected() );
            Usuario.setAlterarproduto                ( Usuario_New.chProdutoAlterar.isSelected() );
            Usuario.setAlterarprodutoporfornecedor   ( Usuario_New.chProdutoXFornecedorAlterar.isSelected() );
            Usuario.setAlterargestordecompras        ( Usuario_New.chGestorAlterar.isSelected() );
            
            Usuario.setAlterargestordecomprascusto   ( Usuario_New.chGestorAlterarEspCusto.isSelected() );
            Usuario.setAlterargestordecomprasvenda   ( Usuario_New.chGestorAlterarEspVenda.isSelected() );
            Usuario.setAlterargestordecomprasestoque   ( Usuario_New.chGestorAlterarEspEstoque.isSelected() );
            Usuario.setAlterargestordecompraspedido   ( Usuario_New.chGestorAlterarEspPedido.isSelected() );
            
            Usuario.setExcluirusuario                ( Usuario_New.chUsuarioExcluir.isSelected() );
            Usuario.setExcluirfornecedor             ( Usuario_New.chFornecedorExcluir.isSelected() );
            Usuario.setExcluirproduto                ( Usuario_New.chProdutoExcluir.isSelected() );
            Usuario.setExcluirprodutoporfornecedor   ( Usuario_New.chProdutoXFornecedorExcluir.isSelected() );
            Usuario.setExcluirgestordecompras        ( Usuario_New.chGestorExcluir.isSelected() );
            
            Usuario.setPesquisarusuario                ( Usuario_New.chUsuarioPesquisar.isSelected() );
            Usuario.setPesquisarfornecedor             ( Usuario_New.chFornecedorPesquisar.isSelected() );
            Usuario.setPesquisarproduto                ( Usuario_New.chProdutoPesquisar.isSelected() );
            Usuario.setPesquisarprodutoporfornecedor   ( Usuario_New.chProdutoXFornecedorPesquisar.isSelected() );
            Usuario.setPesquisargestordecompras        ( Usuario_New.chGestorPesquisar.isSelected() );

        }catch(Exception e ){} 
        
        return Usuario;
    }
    
}
