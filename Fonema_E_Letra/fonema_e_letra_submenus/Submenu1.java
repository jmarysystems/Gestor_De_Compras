/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package fonema_e_letra_submenus;

import fonema_e_letra.Fonema_E_Letra_Home;
import fornecedor.Fornecedor_Home;
import gestor.Gestor_Home;
import produto.Produto_Home;
import produto_por_fornecedor.Produto_Por_Fornecedor_Home;

/**
 *
 * @author ana
 */
public class Submenu1 extends javax.swing.JPanel {

    Fonema_E_Letra_Home Fonema_E_Letra_Home;
        
    public Submenu1( Fonema_E_Letra_Home Fonema_E_Letra_Home2 ) {
        Fonema_E_Letra_Home = Fonema_E_Letra_Home2;
        
        initComponents();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jToolBar2 = new javax.swing.JToolBar();
        jSeparator7 = new javax.swing.JToolBar.Separator();
        btExercicios3 = new javax.swing.JButton();
        jSeparator13 = new javax.swing.JToolBar.Separator();
        btExercicios = new javax.swing.JButton();
        jSeparator10 = new javax.swing.JToolBar.Separator();
        btExercicios1 = new javax.swing.JButton();
        jSeparator11 = new javax.swing.JToolBar.Separator();
        brProdutoXFornecedor = new javax.swing.JButton();
        jSeparator14 = new javax.swing.JToolBar.Separator();
        btExercicios2 = new javax.swing.JButton();
        jSeparator12 = new javax.swing.JToolBar.Separator();

        setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 0, new java.awt.Color(0, 0, 0)));

        jPanel1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 0, new java.awt.Color(0, 0, 0)));

        jToolBar2.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 0, new java.awt.Color(0, 0, 0)));
        jToolBar2.setFloatable(false);
        jToolBar2.setRollover(true);
        jToolBar2.setPreferredSize(new java.awt.Dimension(658, 71));

        jSeparator7.setSeparatorSize(new java.awt.Dimension(12, 0));
        jToolBar2.add(jSeparator7);

        btExercicios3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fonema_e_letra_imagens/home.png"))); // NOI18N
        btExercicios3.setText("Home");
        btExercicios3.setFocusable(false);
        btExercicios3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btExercicios3.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btExercicios3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btExercicios3MousePressed(evt);
            }
        });
        jToolBar2.add(btExercicios3);

        jSeparator13.setSeparatorSize(new java.awt.Dimension(12, 0));
        jToolBar2.add(jSeparator13);

        btExercicios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fonema_e_letra_imagens/fornecedor.png"))); // NOI18N
        btExercicios.setText("Fornecedor");
        btExercicios.setActionCommand("");
        btExercicios.setFocusable(false);
        btExercicios.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btExercicios.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btExercicios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btExerciciosMousePressed(evt);
            }
        });
        jToolBar2.add(btExercicios);

        jSeparator10.setSeparatorSize(new java.awt.Dimension(12, 0));
        jToolBar2.add(jSeparator10);

        btExercicios1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fonema_e_letra_imagens/produtos.png"))); // NOI18N
        btExercicios1.setText("Produtos");
        btExercicios1.setFocusable(false);
        btExercicios1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btExercicios1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btExercicios1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btExercicios1MousePressed(evt);
            }
        });
        jToolBar2.add(btExercicios1);

        jSeparator11.setSeparatorSize(new java.awt.Dimension(15, 0));
        jToolBar2.add(jSeparator11);

        brProdutoXFornecedor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fonema_e_letra_imagens/produtoporfornecedor.png"))); // NOI18N
        brProdutoXFornecedor.setText("Produto X Fornecedor");
        brProdutoXFornecedor.setFocusable(false);
        brProdutoXFornecedor.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        brProdutoXFornecedor.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        brProdutoXFornecedor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                brProdutoXFornecedorMousePressed(evt);
            }
        });
        jToolBar2.add(brProdutoXFornecedor);

        jSeparator14.setSeparatorSize(new java.awt.Dimension(12, 0));
        jToolBar2.add(jSeparator14);

        btExercicios2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fonema_e_letra_imagens/os.png"))); // NOI18N
        btExercicios2.setText("Gestor de Compras");
        btExercicios2.setFocusable(false);
        btExercicios2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btExercicios2.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btExercicios2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btExercicios2MousePressed(evt);
            }
        });
        jToolBar2.add(btExercicios2);

        jSeparator12.setSeparatorSize(new java.awt.Dimension(12, 0));
        jToolBar2.add(jSeparator12);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jToolBar2, javax.swing.GroupLayout.DEFAULT_SIZE, 448, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jToolBar2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btExerciciosMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btExerciciosMousePressed
        Fonema_E_Letra_Home.Home.ControleTabs.AddTabsAoHome( "Fornecedor", "/fonema_e_letra_imagens/livroTp.gif", new Fornecedor_Home( Fonema_E_Letra_Home.Home ) ); 
    }//GEN-LAST:event_btExerciciosMousePressed

    private void btExercicios3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btExercicios3MousePressed
        Fonema_E_Letra_Home.Home.tabHome.setSelectedIndex( 0 );
    }//GEN-LAST:event_btExercicios3MousePressed

    private void btExercicios1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btExercicios1MousePressed
        Fonema_E_Letra_Home.Home.ControleTabs.AddTabsAoHome( "Produtos", "/fonema_e_letra_imagens/livroTp.gif", new Produto_Home( Fonema_E_Letra_Home.Home ) ); 
    }//GEN-LAST:event_btExercicios1MousePressed

    private void brProdutoXFornecedorMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_brProdutoXFornecedorMousePressed
        Fonema_E_Letra_Home.Home.ControleTabs.AddTabsAoHome( "Produtos X Fornecedor", "/fonema_e_letra_imagens/livroTp.gif", new Produto_Por_Fornecedor_Home( Fonema_E_Letra_Home.Home ) ); 
    }//GEN-LAST:event_brProdutoXFornecedorMousePressed

    private void btExercicios2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btExercicios2MousePressed
        Fonema_E_Letra_Home.Home.ControleTabs.AddTabsAoHome( "Gestor de Compras", "/fonema_e_letra_imagens/livroTp.gif", new Gestor_Home( Fonema_E_Letra_Home.Home ) ); 
    }//GEN-LAST:event_btExercicios2MousePressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton brProdutoXFornecedor;
    private javax.swing.JButton btExercicios;
    private javax.swing.JButton btExercicios1;
    private javax.swing.JButton btExercicios2;
    private javax.swing.JButton btExercicios3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JToolBar.Separator jSeparator10;
    private javax.swing.JToolBar.Separator jSeparator11;
    private javax.swing.JToolBar.Separator jSeparator12;
    private javax.swing.JToolBar.Separator jSeparator13;
    private javax.swing.JToolBar.Separator jSeparator14;
    private javax.swing.JToolBar.Separator jSeparator7;
    private javax.swing.JToolBar jToolBar2;
    // End of variables declaration//GEN-END:variables
}
