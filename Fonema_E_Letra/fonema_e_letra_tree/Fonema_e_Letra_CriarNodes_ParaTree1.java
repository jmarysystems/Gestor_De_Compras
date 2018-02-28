
package fonema_e_letra_tree;

import fonema_e_letra_Designer.JPHtmlPrincipal;
import fonema_e_letra_Designer.JPHtmlPrincipal_Inicio;
import fonema_e_letra_iconestrees.IconesTrees;
import home_controle.BookInfo;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;

public class Fonema_e_Letra_CriarNodes_ParaTree1 {
    
    public Fonema_e_Letra_CriarNodes_ParaTree1( JPHtmlPrincipal JPHtml ) {
        
        JPHtmlPrincipal = JPHtml;
        paginaIncial();
        matematica_Simbologia_Administrador_CriarNodes( true ); // true para Adicionar a lista do BookInfo
    }
    
    JPHtmlPrincipal JPHtmlPrincipal;
        
    DefaultMutableTreeNode fonema = new DefaultMutableTreeNode( "Fonema" );
                                                     //getClass().getResource( "/br/com/jmary/acordoOrtografico/tree/Acordo_Ortografico_HomeInt.html" )
    private void paginaIncial(){ 
        try {
            JPHtmlPrincipal_Inicio setarJEditorPane_Inicio = new JPHtmlPrincipal_Inicio( getClass().getResource("/fonema_e_letra_Html/fonema_e_letra.html").toString(), JPHtmlPrincipal );
            JPHtmlPrincipal.bookImprimir = "/fonema_e_letra_Html/fonema_e_letra.html";
        } catch ( Exception e ) {}
    }
            
    private void matematica_Simbologia_Administrador_CriarNodes( boolean adicionarList ) {
        
        BookInfo fonemaRoot = new BookInfo( "Português", "/fonema_e_letra/Fonema_e_Letra_Home.html", IconesTrees.root, IconesTrees.pastaFechada, IconesTrees.pastaAberta, IconesTrees.nod, IconesTrees.nodPastaAberta );
            fonema = new DefaultMutableTreeNode( fonemaRoot );
            
        BookInfo fonema_1 = new BookInfo( "Fonema", "/fonema_e_letra_Html/fonema_indice.html", IconesTrees.root, IconesTrees.pastaFechada, IconesTrees.pastaAberta, IconesTrees.nod, IconesTrees.nodPastaAberta );    
            DefaultMutableTreeNode fonema_11 = new DefaultMutableTreeNode( fonema_1 );
            fonema.add( fonema_11 );  
        
        //Simbologia_CriarNodes_ParaTree1 Simbologia_ParaTree1 = new Simbologia_CriarNodes_ParaTree1( JPHtmlPrincipal, fonema, adicionarList ); 
        
        /* JTree Customization node */
        DefaultTreeModel treeModel = new DefaultTreeModel( fonema );
        JPHtmlPrincipal.tree1.setModel(treeModel); 
    }
}