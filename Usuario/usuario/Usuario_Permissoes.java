/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package usuario;

import java.util.List;
import javax.persistence.Query;
import jpa.JPAUtil;

/**
 *
 * @author pc
 */

public class Usuario_Permissoes { 
    
    // CADASTRAR
    public static boolean booCadastrarusuario( int ID ){ boolean retorno = false; try{
        Query q = JPAUtil.em().createNativeQuery( "SELECT * FROM SCHEMAJMARY.USUARIO WHERE ID = ?", Usuario.class );
        q.setParameter(1, ID );
        
        List<usuario.Usuario> list = q.getResultList();
        for (int i = 0; i < list.size(); i++){ 
            retorno = list.get(i).getCadastrarusuario();
        }
    } catch( Exception e ){}    return retorno; }
    
    public static boolean booCadastrarfornecedor( int ID ){ boolean retorno = false; try{
        Query q = JPAUtil.em().createNativeQuery( "SELECT * FROM SCHEMAJMARY.USUARIO WHERE ID = ?", Usuario.class );
        q.setParameter(1, ID );
        
        List<usuario.Usuario> list = q.getResultList();
        for (int i = 0; i < list.size(); i++){ 
            retorno = list.get(i).getCadastrarfornecedor();
        }
    } catch( Exception e ){}    return retorno; }
    
    public static boolean booCadastrarproduto( int ID ){ boolean retorno = false; try{
        Query q = JPAUtil.em().createNativeQuery( "SELECT * FROM SCHEMAJMARY.USUARIO WHERE ID = ?", Usuario.class );
        q.setParameter(1, ID );
        
        List<usuario.Usuario> list = q.getResultList();
        for (int i = 0; i < list.size(); i++){ 
            retorno = list.get(i).getCadastrarproduto();
        }
    } catch( Exception e ){}    return retorno; }
    
    public static boolean booCadastrarprodutoporfornecedor( int ID ){ boolean retorno = false; try{
        Query q = JPAUtil.em().createNativeQuery( "SELECT * FROM SCHEMAJMARY.USUARIO WHERE ID = ?", Usuario.class );
        q.setParameter(1, ID );
        
        List<usuario.Usuario> list = q.getResultList();
        for (int i = 0; i < list.size(); i++){ 
            retorno = list.get(i).getCadastrarprodutoporfornecedor();
        }
    } catch( Exception e ){}    return retorno; }
    
    public static boolean booCadastrargestordecompras( int ID ){ boolean retorno = false; try{
        Query q = JPAUtil.em().createNativeQuery( "SELECT * FROM SCHEMAJMARY.USUARIO WHERE ID = ?", Usuario.class );
        q.setParameter(1, ID );
        
        List<usuario.Usuario> list = q.getResultList();
        for (int i = 0; i < list.size(); i++){ 
            retorno = list.get(i).getCadastrargestordecompras();
        }
    } catch( Exception e ){}    return retorno; }
    // CADASTRAR
    
    // ALTERAR
    public static boolean booAlterarusuario( int ID ){ boolean retorno = false; try{
        Query q = JPAUtil.em().createNativeQuery( "SELECT * FROM SCHEMAJMARY.USUARIO WHERE ID = ?", Usuario.class );
        q.setParameter(1, ID );
        
        List<usuario.Usuario> list = q.getResultList();
        for (int i = 0; i < list.size(); i++){ 
            retorno = list.get(i).getAlterarusuario();
        }
    } catch( Exception e ){}    return retorno; }
    
    public static boolean booAlterarfornecedor( int ID ){ boolean retorno = false; try{
        Query q = JPAUtil.em().createNativeQuery( "SELECT * FROM SCHEMAJMARY.USUARIO WHERE ID = ?", Usuario.class );
        q.setParameter(1, ID );
        
        List<usuario.Usuario> list = q.getResultList();
        for (int i = 0; i < list.size(); i++){ 
            retorno = list.get(i).getAlterarfornecedor();
        }
    } catch( Exception e ){}    return retorno; }
    
    public static boolean booAlterarproduto( int ID ){ boolean retorno = false; try{
        Query q = JPAUtil.em().createNativeQuery( "SELECT * FROM SCHEMAJMARY.USUARIO WHERE ID = ?", Usuario.class );
        q.setParameter(1, ID );
        
        List<usuario.Usuario> list = q.getResultList();
        for (int i = 0; i < list.size(); i++){ 
            retorno = list.get(i).getAlterarproduto();
        }
    } catch( Exception e ){}    return retorno; }
    
    public static boolean booAlterarprodutoporfornecedor( int ID ){ boolean retorno = false; try{
        Query q = JPAUtil.em().createNativeQuery( "SELECT * FROM SCHEMAJMARY.USUARIO WHERE ID = ?", Usuario.class );
        q.setParameter(1, ID );
        
        List<usuario.Usuario> list = q.getResultList();
        for (int i = 0; i < list.size(); i++){ 
            retorno = list.get(i).getAlterarprodutoporfornecedor();
        }
    } catch( Exception e ){}    return retorno; }
    
    public static boolean booAlterargestordecompras( int ID ){ boolean retorno = false; try{
        Query q = JPAUtil.em().createNativeQuery( "SELECT * FROM SCHEMAJMARY.USUARIO WHERE ID = ?", Usuario.class );
        q.setParameter(1, ID );
        
        List<usuario.Usuario> list = q.getResultList();
        for (int i = 0; i < list.size(); i++){ 
            retorno = list.get(i).getAlterargestordecompras();
        }
    } catch( Exception e ){}    return retorno; }
    
    public static boolean booAlterargestordecomprascusto( int ID ){ boolean retorno = false; try{
        Query q = JPAUtil.em().createNativeQuery( "SELECT * FROM SCHEMAJMARY.USUARIO WHERE ID = ?", Usuario.class );
        q.setParameter(1, ID );
        
        List<usuario.Usuario> list = q.getResultList();
        for (int i = 0; i < list.size(); i++){ 
            retorno = list.get(i).getAlterargestordecomprascusto();
        }
    } catch( Exception e ){}    return retorno; }
    
    public static boolean booAlterargestordecomprasvenda( int ID ){ boolean retorno = false; try{
        Query q = JPAUtil.em().createNativeQuery( "SELECT * FROM SCHEMAJMARY.USUARIO WHERE ID = ?", Usuario.class );
        q.setParameter(1, ID );
        
        List<usuario.Usuario> list = q.getResultList();
        for (int i = 0; i < list.size(); i++){ 
            retorno = list.get(i).getAlterargestordecomprasvenda();
        }
    } catch( Exception e ){}    return retorno; }
    
    public static boolean booAlterargestordecomprasestoque( int ID ){ boolean retorno = false; try{
        Query q = JPAUtil.em().createNativeQuery( "SELECT * FROM SCHEMAJMARY.USUARIO WHERE ID = ?", Usuario.class );
        q.setParameter(1, ID );
        
        List<usuario.Usuario> list = q.getResultList();
        for (int i = 0; i < list.size(); i++){ 
            retorno = list.get(i).getAlterargestordecomprasestoque();
        }
    } catch( Exception e ){}    return retorno; }
    
    public static boolean booAlterargestordecompraspedido( int ID ){ boolean retorno = false; try{
        Query q = JPAUtil.em().createNativeQuery( "SELECT * FROM SCHEMAJMARY.USUARIO WHERE ID = ?", Usuario.class );
        q.setParameter(1, ID );
        
        List<usuario.Usuario> list = q.getResultList();
        for (int i = 0; i < list.size(); i++){ 
            retorno = list.get(i).getAlterargestordecompraspedido();
        }
    } catch( Exception e ){}    return retorno; }
    
    public static boolean booExcluirusuario( int ID ){ boolean retorno = false; try{
        Query q = JPAUtil.em().createNativeQuery( "SELECT * FROM SCHEMAJMARY.USUARIO WHERE ID = ?", Usuario.class );
        q.setParameter(1, ID );
        
        List<usuario.Usuario> list = q.getResultList();
        for (int i = 0; i < list.size(); i++){ 
            retorno = list.get(i).getExcluirusuario();
        }
    } catch( Exception e ){}    return retorno; }
    
    public static boolean booExcluirfornecedor( int ID ){ boolean retorno = false; try{
        Query q = JPAUtil.em().createNativeQuery( "SELECT * FROM SCHEMAJMARY.USUARIO WHERE ID = ?", Usuario.class );
        q.setParameter(1, ID );
        
        List<usuario.Usuario> list = q.getResultList();
        for (int i = 0; i < list.size(); i++){ 
            retorno = list.get(i).getExcluirfornecedor();
        }
    } catch( Exception e ){}    return retorno; }
    
    public static boolean booExcluirproduto( int ID ){ boolean retorno = false; try{
        Query q = JPAUtil.em().createNativeQuery( "SELECT * FROM SCHEMAJMARY.USUARIO WHERE ID = ?", Usuario.class );
        q.setParameter(1, ID );
        
        List<usuario.Usuario> list = q.getResultList();
        for (int i = 0; i < list.size(); i++){ 
            retorno = list.get(i).getExcluirproduto();
        }
    } catch( Exception e ){}    return retorno; }
    
    public static boolean booExcluirprodutoporfornecedor( int ID ){ boolean retorno = false; try{
        Query q = JPAUtil.em().createNativeQuery( "SELECT * FROM SCHEMAJMARY.USUARIO WHERE ID = ?", Usuario.class );
        q.setParameter(1, ID );
        
        List<usuario.Usuario> list = q.getResultList();
        for (int i = 0; i < list.size(); i++){ 
            retorno = list.get(i).getExcluirprodutoporfornecedor();
        }
    } catch( Exception e ){}    return retorno; }
    
    public static boolean booExcluirgestordecompras( int ID ){ boolean retorno = false; try{
        Query q = JPAUtil.em().createNativeQuery( "SELECT * FROM SCHEMAJMARY.USUARIO WHERE ID = ?", Usuario.class );
        q.setParameter(1, ID );
        
        List<usuario.Usuario> list = q.getResultList();
        for (int i = 0; i < list.size(); i++){ 
            retorno = list.get(i).getExcluirgestordecompras();
        }
    } catch( Exception e ){}    return retorno; }
    
    public static boolean booPesquisarusuario( int ID ){ boolean retorno = false; try{
        Query q = JPAUtil.em().createNativeQuery( "SELECT * FROM SCHEMAJMARY.USUARIO WHERE ID = ?", Usuario.class );
        q.setParameter(1, ID );
        
        List<usuario.Usuario> list = q.getResultList();
        for (int i = 0; i < list.size(); i++){ 
            retorno = list.get(i).getPesquisarusuario();
        }
    } catch( Exception e ){}    return retorno; }
    
    public static boolean booPesquisarfornecedor( int ID ){ boolean retorno = false; try{
        Query q = JPAUtil.em().createNativeQuery( "SELECT * FROM SCHEMAJMARY.USUARIO WHERE ID = ?", Usuario.class );
        q.setParameter(1, ID );
        
        List<usuario.Usuario> list = q.getResultList();
        for (int i = 0; i < list.size(); i++){ 
            retorno = list.get(i).getPesquisarfornecedor();
        }
    } catch( Exception e ){}    return retorno; }
    
    public static boolean booPesquisarproduto( int ID ){ boolean retorno = false; try{
        Query q = JPAUtil.em().createNativeQuery( "SELECT * FROM SCHEMAJMARY.USUARIO WHERE ID = ?", Usuario.class );
        q.setParameter(1, ID );
        
        List<usuario.Usuario> list = q.getResultList();
        for (int i = 0; i < list.size(); i++){ 
            retorno = list.get(i).getPesquisarproduto();
        }
    } catch( Exception e ){}    return retorno; }
    
    public static boolean booPesquisarprodutoporfornecedor( int ID ){ boolean retorno = false; try{
        Query q = JPAUtil.em().createNativeQuery( "SELECT * FROM SCHEMAJMARY.USUARIO WHERE ID = ?", Usuario.class );
        q.setParameter(1, ID );
        
        List<usuario.Usuario> list = q.getResultList();
        for (int i = 0; i < list.size(); i++){ 
            retorno = list.get(i).getPesquisarprodutoporfornecedor();
        }
    } catch( Exception e ){}    return retorno; }
    
    public static boolean booPesquisargestordecompras( int ID ){ boolean retorno = false; try{
        Query q = JPAUtil.em().createNativeQuery( "SELECT * FROM SCHEMAJMARY.USUARIO WHERE ID = ?", Usuario.class );
        q.setParameter(1, ID );
        
        List<usuario.Usuario> list = q.getResultList();
        for (int i = 0; i < list.size(); i++){ 
            retorno = list.get(i).getPesquisargestordecompras();
        }
    } catch( Exception e ){}    return retorno; }
        
}
