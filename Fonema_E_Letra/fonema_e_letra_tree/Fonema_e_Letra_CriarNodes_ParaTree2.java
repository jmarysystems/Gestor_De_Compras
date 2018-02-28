package fonema_e_letra_tree;

import fonema_e_letra_Designer.JPHtmlPrincipal;
import fonema_e_letra_iconestrees.IconesTrees;
import home_controle.BookInfo;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;

public class Fonema_e_Letra_CriarNodes_ParaTree2 {
    
    public Fonema_e_Letra_CriarNodes_ParaTree2( JPHtmlPrincipal JPHtml ) {
        
        JPHtmlPrincipal = JPHtml;
        Fonema_e_Letra_Administrador_CriarNodes_Inicial(); // true para Adicionar a lista do BookInfo        
    }
    
    JPHtmlPrincipal JPHtmlPrincipal;    
    DefaultMutableTreeNode fonema = new DefaultMutableTreeNode( "Português" );
    
    private void Fonema_e_Letra_Administrador_CriarNodes_Inicial() {
        
        Fonema_e_Letra_Administrador_CriarNodes();
        //criarListaDeNodesTree2( "Fonema" );
    }
        
    //Simbologia_CriarNodes_ParaTree2 Simbologia_ParaTree2;
    
    public void Fonema_e_Letra_Administrador_CriarNodes() {
        
        BookInfo fonemaRoot = new BookInfo( "Fonema", "/fonema_e_letra_Html/fonema.html", IconesTrees.root, IconesTrees.pastaFechada, IconesTrees.pastaAberta, IconesTrees.nod, IconesTrees.nodPastaAberta );
            fonema = new DefaultMutableTreeNode( fonemaRoot );
        
        BookInfo fonema_1 = new BookInfo( "Fonema e Letra", "/fonema_e_letra_Html/fonema_e_letra.html", IconesTrees.root, IconesTrees.pastaFechada, IconesTrees.pastaAberta, IconesTrees.nod, IconesTrees.nodPastaAberta );
            DefaultMutableTreeNode fonema_11 = new DefaultMutableTreeNode( fonema_1 );
            fonema.add( fonema_11 );
            
        BookInfo fonema_2 = new BookInfo( "Vídeo Aula Fonema e Letra", "/fonema_e_letra_Html/fonema_e_letra_video.html", IconesTrees.root, IconesTrees.pastaFechada, IconesTrees.pastaAberta, IconesTrees.nod, IconesTrees.nodPastaAberta );
            DefaultMutableTreeNode fonema_22 = new DefaultMutableTreeNode( fonema_2 );
            fonema.add( fonema_22 );   
            
        BookInfo fonema_3 = new BookInfo( "Os 4 Fonemas do X", "/fonema_e_letra_Html/fonema_e_letra_video_sons_do_x.html", IconesTrees.root, IconesTrees.pastaFechada, IconesTrees.pastaAberta, IconesTrees.nod, IconesTrees.nodPastaAberta );
            DefaultMutableTreeNode fonema_33 = new DefaultMutableTreeNode( fonema_3 );
            fonema.add( fonema_33 );     
        
        BookInfo fonema_4 = new BookInfo( "S no início de palavras", "/fonema_e_letra_Html/fonema_e_letra_video_s_no_inicio.html", IconesTrees.root, IconesTrees.pastaFechada, IconesTrees.pastaAberta, IconesTrees.nod, IconesTrees.nodPastaAberta );
            DefaultMutableTreeNode fonema_44 = new DefaultMutableTreeNode( fonema_4 );
            fonema.add( fonema_44 ); 
            
        BookInfo fonema_5 = new BookInfo( "O Fonema Z", "/fonema_e_letra_Html/fonema_e_letra_video_sons_do_z.html", IconesTrees.root, IconesTrees.pastaFechada, IconesTrees.pastaAberta, IconesTrees.nod, IconesTrees.nodPastaAberta );
            DefaultMutableTreeNode fonema_55 = new DefaultMutableTreeNode( fonema_5 );
            fonema.add( fonema_55 );    
        
        /* JTree Customization node */
        DefaultTreeModel treeModel = new DefaultTreeModel( fonema );
        JPHtmlPrincipal.tree2.setModel(treeModel); 
    }
    
    public void criarListaDeNodesTree2( String assuntoDoTree1Selecionado ) {
        
        switch( assuntoDoTree1Selecionado ) {
            
            case "Português":  Fonema_e_Letra_CriarNodes_ParaTree22 Fonema_e_LetraTree22 = new Fonema_e_Letra_CriarNodes_ParaTree22( JPHtmlPrincipal ); break; // Quem usa true é o TabPortuguêsSelecionado(); logo acima p/ add a lista Da Class BookInfo
                case "Fonema": Fonema_e_Letra_CriarNodes_ParaTree2 Fonema_e_LetraTree2 = new Fonema_e_Letra_CriarNodes_ParaTree2( JPHtmlPrincipal ); break;
                
        }
        
    }
}