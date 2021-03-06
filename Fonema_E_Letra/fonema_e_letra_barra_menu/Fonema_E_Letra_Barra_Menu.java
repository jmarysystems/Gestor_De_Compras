/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package fonema_e_letra_barra_menu;

import fonema_e_letra.Fonema_E_Letra_Home;
import fornecedor.Fornecedor_Home;
import javax.swing.plaf.basic.BasicInternalFrameUI;

/**
 *
 * @author AnaMariana
 */
public class Fonema_E_Letra_Barra_Menu extends javax.swing.JPanel {
    private static final long serialVersionUID = 1L;
    
    Fonema_E_Letra_Home  Fonema_E_Letra_Home;
    
    Alterar_Seta_Submenu Alterar_Seta_Submenu;

    /**
     * Creates new form PnHomeDesigner
     * @param Fonema_E_Letra_Home2
     */
    public Fonema_E_Letra_Barra_Menu( Fonema_E_Letra_Home Fonema_E_Letra_Home2 ) {
        initComponents();
        ((BasicInternalFrameUI)Fonema_E_Letra_Frame_Interno.getUI()).setNorthPane(null); //retirar o painel superior 
        
        Fonema_E_Letra_Home  = Fonema_E_Letra_Home2;
        
        //Habilita troca de seta
        Alterar_Seta_Submenu = new Alterar_Seta_Submenu( Fonema_E_Letra_Home );
                        
        inicio();
    }
    
    private void inicio(){
        
        Fonema_E_Letra_Home.Home.Home_Frame_Interno.setJMenuBar( Fonema_E_Letra_Barra_Menu );               
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Fonema_E_Letra_Frame_Interno = new javax.swing.JInternalFrame();
        Fonema_E_Letra_Barra_Menu = new javax.swing.JMenuBar();
        menu_seta = new javax.swing.JMenu();
        menu_Ajuda = new javax.swing.JMenu();
        menu_Ajuda1 = new javax.swing.JMenu();
        menu_Ajuda2 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem6 = new javax.swing.JMenuItem();
        jSeparator4 = new javax.swing.JPopupMenu.Separator();
        jMenuItem5 = new javax.swing.JMenuItem();

        setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        Fonema_E_Letra_Frame_Interno.setBorder(null);
        Fonema_E_Letra_Frame_Interno.setVisible(true);

        menu_seta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fonema_e_letra_imagens/seta_para_cima.png"))); // NOI18N
        menu_seta.setToolTipText("Ocultar Submenu");
        menu_seta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                menu_setaMousePressed(evt);
            }
        });
        Fonema_E_Letra_Barra_Menu.add(menu_seta);

        menu_Ajuda.setText("Ajuda");
        Fonema_E_Letra_Barra_Menu.add(menu_Ajuda);

        menu_Ajuda1.setText("Fornecedor");
        menu_Ajuda1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                menu_Ajuda1MousePressed(evt);
            }
        });
        Fonema_E_Letra_Barra_Menu.add(menu_Ajuda1);

        menu_Ajuda2.setText("Produtos");
        menu_Ajuda2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                menu_Ajuda2MousePressed(evt);
            }
        });

        jMenuItem1.setText("Categorias");
        jMenuItem1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jMenuItem1MousePressed(evt);
            }
        });
        menu_Ajuda2.add(jMenuItem1);
        menu_Ajuda2.add(jSeparator1);

        jMenuItem2.setText("Embalagens");
        jMenuItem2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jMenuItem2MousePressed(evt);
            }
        });
        menu_Ajuda2.add(jMenuItem2);

        Fonema_E_Letra_Barra_Menu.add(menu_Ajuda2);

        jMenu1.setText("Configurações");
        jMenu1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jMenu1MousePressed(evt);
            }
        });

        jMenuItem6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fonema_e_letra_imagens/usuario.png"))); // NOI18N
        jMenuItem6.setText("Usuários");
        jMenuItem6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jMenuItem6MousePressed(evt);
            }
        });
        jMenu1.add(jMenuItem6);
        jMenu1.add(jSeparator4);

        jMenuItem5.setText("Banco de Dados");
        jMenu1.add(jMenuItem5);

        Fonema_E_Letra_Barra_Menu.add(jMenu1);

        Fonema_E_Letra_Frame_Interno.setJMenuBar(Fonema_E_Letra_Barra_Menu);

        javax.swing.GroupLayout Fonema_E_Letra_Frame_InternoLayout = new javax.swing.GroupLayout(Fonema_E_Letra_Frame_Interno.getContentPane());
        Fonema_E_Letra_Frame_Interno.getContentPane().setLayout(Fonema_E_Letra_Frame_InternoLayout);
        Fonema_E_Letra_Frame_InternoLayout.setHorizontalGroup(
            Fonema_E_Letra_Frame_InternoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 398, Short.MAX_VALUE)
        );
        Fonema_E_Letra_Frame_InternoLayout.setVerticalGroup(
            Fonema_E_Letra_Frame_InternoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 18, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Fonema_E_Letra_Frame_Interno)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Fonema_E_Letra_Frame_Interno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 88, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void menu_setaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menu_setaMousePressed
        Alterar_Seta_Submenu.tabJanelaSubmenu( this.menu_seta );
    }//GEN-LAST:event_menu_setaMousePressed

    private void menu_Ajuda1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menu_Ajuda1MousePressed
        Fonema_E_Letra_Home.Home.ControleTabs.AddTabsAoHome( "Fornecedor", "/fonema_e_letra_imagens/livroTp.gif", new Fornecedor_Home( Fonema_E_Letra_Home.Home ) ); 
    }//GEN-LAST:event_menu_Ajuda1MousePressed

    private void menu_Ajuda2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menu_Ajuda2MousePressed

    }//GEN-LAST:event_menu_Ajuda2MousePressed

    private void jMenu1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu1MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenu1MousePressed

    private void jMenuItem6MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuItem6MousePressed
         Fonema_E_Letra_Home.Home.ControleTabs.AddTabsAoHome( "Usuários", "/fonema_e_letra_imagens/livroTp.gif", new usuario.Usuario_Home( Fonema_E_Letra_Home.Home ) ); 
    }//GEN-LAST:event_jMenuItem6MousePressed

    private void jMenuItem1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuItem1MousePressed
        Fonema_E_Letra_Home.Home.ControleTabs.AddTabsAoHome( "Categoria", "/fonema_e_letra_imagens/livroTp.gif", new categoria_do_produto.Categoria_do_Produto_Home( Fonema_E_Letra_Home.Home ) ); 
    }//GEN-LAST:event_jMenuItem1MousePressed

    private void jMenuItem2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuItem2MousePressed
        Fonema_E_Letra_Home.Home.ControleTabs.AddTabsAoHome( "Embalagem", "/fonema_e_letra_imagens/livroTp.gif", new embalagem.Embalagem_Home( Fonema_E_Letra_Home.Home ) ); 
    }//GEN-LAST:event_jMenuItem2MousePressed

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar Fonema_E_Letra_Barra_Menu;
    private javax.swing.JInternalFrame Fonema_E_Letra_Frame_Interno;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator4;
    private javax.swing.JMenu menu_Ajuda;
    private javax.swing.JMenu menu_Ajuda1;
    private javax.swing.JMenu menu_Ajuda2;
    private javax.swing.JMenu menu_seta;
    // End of variables declaration//GEN-END:variables
            
}
