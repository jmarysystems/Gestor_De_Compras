/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package home_db;

import home_db.tabelas.CategoriaDoProduto;
import home_db.tabelas.Embalagem;
import home_db.tabelas.Fornecedor;
import home_db.tabelas.GestorDeCompras;
import home_db.tabelas.GestorDeComprasProdutos;
import home_db.tabelas.Produto;
import home_db.tabelas.ProdutoPorFornecedor;
import home_db.tabelas.Teste;
import home_db.tabelas.TestePovoar;
import home_db.tabelas.Usuario;
import home_db.tabelas.UsuarioPovoar;
import home_db.tabelas.VerificarBanco;
import utilidades.JOPM;

/**
 *
 * @author Ana
 */
public class ControleThread_db extends Thread { 
    
    String endereco_db;
    
    public ControleThread_db( String endereco_db2 ){   
        endereco_db = endereco_db2;
    } 
            
    public void run(){  
        synchronized ( this ) {
            
            verificarsedbexiste(); 
        }  
    }  
    
    public void verificarsedbexiste(){  
        synchronized(this) {  
            if ( VerificarBanco.criar() == true ) {
    
                
            } else{ 
            
                a(); b(); c(); d(); e(); f(); g(); gpovoar(); 
                h(); i(); j(); k();  
                l(); m(); n(); 
            }          
        }  
    } 
  
    public void a(){  
        synchronized(this) {  
            if ( CriarBancoDeDados.criar( endereco_db ) == true ) {              
                
            } else{ 
            
                JOPM JOptionPaneMod = new JOPM( 2, "Não foi possível estabelecer \n"
                + "Comunicação com o banco de dados, \n"
                + "Verificar se a pasta lib está junto com o arquivo JAR"        
                + "\n", "ControleThread_db" );
            }          
        }  
    }  
    
    public void b(){  
        synchronized(this){      
            if ( RequererAutenticacao.criar() == true ) {
                System.out.println( "b" );              
                
            } else{ 
                
            } 
        }
    }
  
    public void c(){  
        synchronized(this){ 
            if ( CriarSchema.criar() == true ) {
                System.out.println( "c" );
                
            } else{ 
           
            } 
        }
    } 
    
    public void d(){  
        synchronized(this){          
            if ( TestarUsuarioESenha.criar() == true ) {
                System.out.println( "d" );
                                
            } else{ 
                
            }   
        }  
    }
    
    public void e(){  
        synchronized(this){   
            if ( Teste.criar() == true ) {
                System.out.println( "e" );
                                              
            } else{ 
            }  
        }  
    }
    
    public void f(){  
        synchronized(this){       
            if ( TestePovoar.criar() == true ) {
                System.out.println( "f" );
                
            } else{ 
            }  
        }  
    }    
        
    public void g(){  
        synchronized(this){   
            if ( Usuario.criar() == true ) {
                System.out.println( "g" );
                                              
            } else{ 
            }  
        }  
    }        
    
    public void gpovoar(){  
        synchronized(this){   
            if ( UsuarioPovoar.criar() == true ) {
                System.out.println( "gpovoar" );
                                              
            } else{ 
            }  
        }  
    }
    
    public void h(){  
        synchronized(this){   
            if ( Fornecedor.criar() == true ) {
                System.out.println( "H" );
                                              
            } else{ 
            }  
        }  
    }
    
    public void i(){  
        synchronized(this){   
            if ( CategoriaDoProduto.criar() == true ) {
                System.out.println( "I" );
                                              
            } else{ 
            }  
        }  
    }
    
    public void j(){  
        synchronized(this){   
            if ( Embalagem.criar() == true ) {
                System.out.println( "J" );
                                              
            } else{ 
            }  
        }  
    }
    
    public void k(){  
        synchronized(this){   
            if ( Produto.criar() == true ) {
                System.out.println( "K" );
                                              
            } else{ 
            }  
        }  
    }
    
    public void l(){  
        synchronized(this){   
            if ( ProdutoPorFornecedor.criar() == true ) {
                System.out.println( "L" );
                                              
            } else{ 
            }  
        }  
    }
    
    public void m(){  
        synchronized(this){   
            if ( GestorDeCompras.criar() == true ) {
                System.out.println( "M" );
                                              
            } else{ 
            }  
        }  
    }
    
    public void n(){  
        synchronized(this){   
            if ( GestorDeComprasProdutos.criar() == true ) {
                System.out.println( "N" );
                                              
            } else{ 
            }  
        }  
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
