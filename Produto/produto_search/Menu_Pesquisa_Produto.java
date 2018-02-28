/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package produto_search;

import java.awt.Color;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.List;
import javax.persistence.Query;
import jpa.JPAUtil;
import produto.Produto;
import produto.Produto_Home;
import produto_new.BookInfoCategoriaDoProduto;
import produto_new.Produto_New;
import produto_por_fornecedor_new.Produto_Por_Fornecedor_New;
import derby.DB;
import gestor_new.Gestor_New;
import java.awt.event.MouseListener;
import jpa.DAOGenericoJPA;
import utilidades.JOPM;

/**
 *
 * @author AnaMariana
 */
public class Menu_Pesquisa_Produto extends javax.swing.JPanel {

    Produto_Home Produto_Home;
    public  int   IDSELECIONADA; 
    public Tabela_Pesquisa_BD_Produto Tabela_Pesquisa_BD_Produto;
     
    /**
     * Creates new form Cliente
     */
    public Menu_Pesquisa_Produto( Produto_Home Produto_Home2 ) {
        initComponents();
        
        Produto_Home = Produto_Home2;
        
        inicioCBS();
        btSelecionar.setVisible( false );
    }
    
    //////////////////////////////////////////////////////////////////////
     public Menu_Pesquisa_Produto( Produto_Home Produto_Home2, Produto_Por_Fornecedor_New Produto_Por_Fornecedor_New2 ) {
        initComponents();
        
        Produto_Home = Produto_Home2;
        
        inicioCBS();
        
        btSelecionar.setVisible( true );
        btSelecionar.setEnabled(false );
    }
    //////////////////////////////////////////////////////////////////////
     
     //////////////////////////////////////////////////////////////////////
     public Menu_Pesquisa_Produto( Produto_Home Produto_Home2, Gestor_New Gestor_New2 ) {
        initComponents();
        
        Produto_Home = Produto_Home2;
        
        inicioCBS();
        
        btSelecionar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/utilidades_imagens/selecionar_produto.png"))); // NOI18N
        btSelecionar.setVisible( true );
        btSelecionar.setEnabled(false );
        
        //Eventos
        try{
            MouseListener[] MouseListener = btSelecionar.getMouseListeners();
            for ( MouseListener MouseListener1 : MouseListener) {
                btSelecionar.removeMouseListener( MouseListener1 );
            }
        
            btSelecionar.addMouseListener(new java.awt.event.MouseAdapter() {
                @Override
                 public void mousePressed(java.awt.event.MouseEvent evt) {

                     new Thread() {   @Override public void run() { try { Thread.sleep( 1 ); 
                    ////////////////////////////
                     if( btSelecionar.isEnabled() ) {            
                         if( IDSELECIONADA > 0 ) {
                    
                             Produto Produto = new Produto();

                             Query q = JPAUtil.em().createNativeQuery( "SELECT * FROM SCHEMAJMARY.PRODUTO WHERE ID = ?", Produto.class );
                             q.setParameter(1, IDSELECIONADA);   
                    
                             List<produto.Produto> list = q.getResultList();
                    
                             for (int i = 0; i < list.size(); i++){
                                 Produto = list.get(i);
                             }
                    
                             Produto_Home.Gestor_New.setarNoJPanelProdutoSelecionado( Produto );
                         }
                         else{
                             JOPM JOptionPaneMod = new JOPM( 2, "Fornecedor Selecionado, \n"
                                     + "Nenhum Fornecedor Selecionado"
                                     + "\nPara continuar Selecione um Fornecedor"
                                     + "\nNa Tabela Abaixo, clicando no botão Pesquisar"    
                                     + "\n", "Fornecedor Selecionado" );
                             tfPesquisa.requestFocus();
                         }
                     }
                    //////////////////////////// 
                     } catch( Exception e ){ JOPM JOptionPaneMod = new JOPM( 2, "Menu_Pesquisa_Produto( Produto_Home Produto_Home2, Gestor_New Gestor_New2 ), \n"
                             + e.getMessage() + "\n", this.getClass().getSimpleName() ); } } }.start();
                }
            });    
        }catch(Exception e ){}
    }
    //////////////////////////////////////////////////////////////////////
    
    private void inicioCBS(){        
        cbTipoDePesquisa.setBackground( new Color( 255, 255, 255 ) );   
        cbCategoriaDoProduto.setBackground( new Color( 255, 255, 255 ) ); 
        
        setarCategorias( new categoria_do_produto.Categoriadoproduto() );
        
        lbCategoria.setVisible(false);
        cbCategoriaDoProduto.setVisible(false);
    }
            
    public void tabela(Tabela_Pesquisa_BD_Produto Tabela_Pesquisa_BD_Produto2){ 
                
        try {                
            Tabela_Pesquisa_BD_Produto = Tabela_Pesquisa_BD_Produto2;                                    
        } catch( Exception e ){ e.printStackTrace(); JOPM JOptionPaneMod = new JOPM( 2, "tabela, \n"
                + e.getMessage() + "\n", this.getClass().getSimpleName() ); }     
    }
                
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        cbTipoDePesquisa = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        cbCategoriaDoProduto = new javax.swing.JComboBox();
        lbCategoria = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        btPesquisar = new javax.swing.JButton();
        tfPesquisa = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        btExcluir = new javax.swing.JButton();
        btVisualizar = new javax.swing.JButton();
        btAlterar = new javax.swing.JButton();
        btSelecionar = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel1.setText("Dados do Produto");

        jPanel5.setBackground(new java.awt.Color(253, 254, 247));

        jPanel6.setBackground(new java.awt.Color(253, 254, 247));

        cbTipoDePesquisa.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        cbTipoDePesquisa.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "CÓDIGO DO PRODUTO", "DESCRIÇÃO DO PRODUTO", "CATEGORIA DO PRODUTO" }));
        cbTipoDePesquisa.setSelectedIndex(1);
        cbTipoDePesquisa.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(201, 239, 237), 1, true));
        cbTipoDePesquisa.setPreferredSize(new java.awt.Dimension(212, 23));
        cbTipoDePesquisa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbTipoDePesquisaActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel3.setText("Pesquisar por:");

        cbCategoriaDoProduto.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        cbCategoriaDoProduto.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(201, 239, 237), 1, true));
        cbCategoriaDoProduto.setPreferredSize(new java.awt.Dimension(212, 23));
        cbCategoriaDoProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbCategoriaDoProdutoActionPerformed(evt);
            }
        });

        lbCategoria.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lbCategoria.setText("Categoria");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cbTipoDePesquisa, 0, 233, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cbCategoriaDoProduto, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(lbCategoria)
                        .addGap(5, 5, 5)
                        .addComponent(cbCategoriaDoProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(5, 5, 5)
                        .addComponent(cbTipoDePesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.setBackground(new java.awt.Color(253, 254, 247));

        btPesquisar.setText("Pesquisar");
        btPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btPesquisarActionPerformed(evt);
            }
        });

        tfPesquisa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tfPesquisaKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tfPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(tfPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(btPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        btExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/utilidades_imagens/exluir.gif"))); // NOI18N
        btExcluir.setText("Excluir");
        btExcluir.setEnabled(false);
        btExcluir.setPreferredSize(new java.awt.Dimension(97, 25));
        btExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btExcluirActionPerformed(evt);
            }
        });

        btVisualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/utilidades_imagens/olho.png"))); // NOI18N
        btVisualizar.setText("Visualizar");
        btVisualizar.setEnabled(false);
        btVisualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btVisualizarActionPerformed(evt);
            }
        });

        btAlterar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/utilidades_imagens/alterar.gif"))); // NOI18N
        btAlterar.setText("Alterar");
        btAlterar.setEnabled(false);
        btAlterar.setPreferredSize(new java.awt.Dimension(97, 27));
        btAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAlterarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(btAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(btVisualizar)
        );

        jPanel2Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btAlterar, btExcluir, btVisualizar});

        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(btAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btVisualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btAlterar, btVisualizar});

        btSelecionar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/utilidades_imagens/selecionar.png"))); // NOI18N
        btSelecionar.setText("Selecionar");
        btSelecionar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btSelecionar.setPreferredSize(new java.awt.Dimension(96, 25));
        btSelecionar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btSelecionarMousePressed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btSelecionar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(btSelecionar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void tfPesquisaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfPesquisaKeyReleased
        pesquisar();
    }//GEN-LAST:event_tfPesquisaKeyReleased

    private void btExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btExcluirActionPerformed
        excluir();
    }//GEN-LAST:event_btExcluirActionPerformed

    private void btPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPesquisarActionPerformed
        pesquisar();  
    }//GEN-LAST:event_btPesquisarActionPerformed

    private void btAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAlterarActionPerformed
        new Thread() {   @Override public void run() { try { Thread.sleep( 1 ); 
             alterarOuVisualizar( "Alterar" );    
        } catch( Exception e ){      } } }.start();       
    }//GEN-LAST:event_btAlterarActionPerformed

    private void btVisualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btVisualizarActionPerformed
        new Thread() {   @Override public void run() { try { Thread.sleep( 1 ); 
             alterarOuVisualizar( "Visualizar" );  
        } catch( Exception e ){      } } }.start(); 
    }//GEN-LAST:event_btVisualizarActionPerformed

    private void cbTipoDePesquisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbTipoDePesquisaActionPerformed
        try{
            if( cbTipoDePesquisa.getSelectedItem() != null ) {

                if( cbTipoDePesquisa.getSelectedItem().toString().trim().equals("CATEGORIA DO PRODUTO") ){
                    lbCategoria.setVisible(true);
                    cbCategoriaDoProduto.setVisible(true);
                }
                else{
                    lbCategoria.setVisible(false);
                    cbCategoriaDoProduto.setVisible(false);
                }
            }
            pesquisar();  
        }
        catch( Exception e ){}
    }//GEN-LAST:event_cbTipoDePesquisaActionPerformed

    private void cbCategoriaDoProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbCategoriaDoProdutoActionPerformed
        pesquisar();  
    }//GEN-LAST:event_cbCategoriaDoProdutoActionPerformed

    private void btSelecionarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btSelecionarMousePressed
        try {            
            if( btSelecionar.isEnabled() ) {            
                if( IDSELECIONADA > 0 ) {
                    
                    Produto Produto = new Produto();
                    
                    Query q = JPAUtil.em().createNativeQuery( "SELECT * FROM SCHEMAJMARY.PRODUTO WHERE ID = ?", Produto.class );
                    q.setParameter(1, IDSELECIONADA);   
                    
                    List<produto.Produto> list = q.getResultList();
                    
                    for (int i = 0; i < list.size(); i++){
                        Produto = list.get(i);
                    }
                    
                    Produto_Home.Produto_Por_Fornecedor_New.setarNoJPanelProdutoSelecionado( Produto );
                    
                    Produto_Home.Home.ControleTabs.removerTabSemControleSelecionado( Produto_Home.tabHome );
                }
                else{
                    JOPM JOptionPaneMod = new JOPM( 2, "Produto Selecionado, \n"
                        + "Nenhum Produto Selecionado"
                        + "\nPara continuar Selecione um Produto"
                        + "\nNa Tabela Abaixo, clicando no botão Pesquisar"    
                        + "\n", "Produto Selecionado" );
                
                    tfPesquisa.requestFocus();
                }
            }
            
        } catch( Exception e ){ JOPM JOptionPaneMod = new JOPM( 2, "alterar(), \n"
                + e.getMessage() + "\n", this.getClass().getSimpleName() ); } //} }.start();         
    }//GEN-LAST:event_btSelecionarMousePressed

    private void pesquisar() {       
        new Thread() {   @Override public void run() { try { Thread.sleep( 1 ); 
            
            String tf = "";
            if( !tfPesquisa.getText().trim().equals("") ){
                tf = tfPesquisa.getText().trim();
            }
            Query q = null;
            
            if( cbTipoDePesquisa.getSelectedItem() != null ) {
                
                if( cbTipoDePesquisa.getSelectedItem().toString().trim().equals("CATEGORIA DO PRODUTO") ){
                                
                    //MeuObjeto obj = (MeuObjeto) combobox.getSelectedItem();
                    BookInfoCategoriaDoProduto obj = (BookInfoCategoriaDoProduto) cbCategoriaDoProduto.getSelectedItem();
                    //System.out.println( "obj.ID "+obj.ID );
                    q = JPAUtil.em().createNativeQuery( "SELECT * FROM SCHEMAJMARY.PRODUTO WHERE ID_CATEGORIADOPRODUTO = ? AND DESCRICAOPRODUTO LIKE ?", produto.Produto.class );
                    q.setParameter(1, obj.ID );
                    q.setParameter(2, "%"+tf.toUpperCase()+"%");
                }
                else if( cbTipoDePesquisa.getSelectedItem().toString().trim().equals("CÓDIGO DO PRODUTO") ){

                    q = JPAUtil.em().createNativeQuery( "SELECT * FROM SCHEMAJMARY.PRODUTO WHERE CODIGOPRODUTO LIKE ?", produto.Produto.class );
                    q.setParameter(1, tf.toUpperCase() );
                }
                else if( cbTipoDePesquisa.getSelectedItem().toString().trim().equals("DESCRIÇÃO DO PRODUTO") ){
                    
                    q = JPAUtil.em().createNativeQuery( "SELECT * FROM SCHEMAJMARY.PRODUTO WHERE DESCRICAOPRODUTO LIKE ?", produto.Produto.class );
                    q.setParameter(1, "%"+tf.toUpperCase()+"%");
                }
            }
            
            if(q != null) { Tabela_Pesquisa_BD_Produto.pesquisa(q); }
                                    
        } catch( Exception e ){ /*JOPM JOPM = new JOPM( 2, "pesquisar(), \n"
                + e.getMessage() + "\n", "Menu_Pesquisa" );*/ } } }.start(); 
    }    
    
    private void excluir() {  
        new Thread() {   @Override public void run() { try { Thread.sleep( 1 ); 
            
            if( btExcluir.isEnabled() ) {
            
                if( IDSELECIONADA > 0 ) {
                    
                    //////////////////////////////////////////////////////////////////////////////////////////
                    produto.Produto Produto = new produto.Produto();
                    
                    Query q = JPAUtil.em().createNativeQuery( "SELECT * FROM SCHEMAJMARY.PRODUTO WHERE ID = ?", produto.Produto.class );
                    q.setParameter(1, IDSELECIONADA);   
                    
                    List<produto.Produto> list = q.getResultList();
                    
                    for (int i = 0; i < list.size(); i++){
                        Produto = list.get(i);
                    }  
                    
                    DAOGenericoJPA DAOGenericoJPA = new DAOGenericoJPA( Produto, JPAUtil.em()); 
                    DAOGenericoJPA.excluir();
                    //////////////////////////////////////////////////////////////////////////////////////////
 
                    btAlterar   .setEnabled(false);
                    btExcluir   .setEnabled(false);
                    btVisualizar.setEnabled(false);
                    pesquisar();
                }
                else{
                    JOPM JOptionPaneMod = new JOPM( 2, "ID SELECIONADA, "
                            + "\nNenhuma matéria selecionada"
                            + "\nSelecione uma matéria"
                            + "\n", "Matéria selecionada" );
                
                    tfPesquisa.requestFocus();
                }
            }
            
        } catch( Exception e ){ JOPM JOptionPaneMod = new JOPM( 2, "excluir(), \n"
                + e.getMessage() + "\n", this.getClass().getSimpleName() ); } } }.start(); 
    }
    
    private void alterarOuVisualizar(String str) {
        try {            
            if( btAlterar.isEnabled() ) {            
                if( IDSELECIONADA > 0 ) {
                    
                    produto.Produto Produto = new produto.Produto();
                    
                    Query q = JPAUtil.em().createNativeQuery( "SELECT * FROM SCHEMAJMARY.PRODUTO WHERE ID = ?", produto.Produto.class );
                    q.setParameter(1, IDSELECIONADA);   
                    
                    List<produto.Produto> list = q.getResultList();
                    
                    for (int i = 0; i < list.size(); i++){
                        Produto = list.get(i);
                    }
                    
                    if( str.equals( "Visualizar") ){
                        
                        Produto_New Produto_New = new Produto_New( Produto_Home, Produto );
                        Produto_Home.Home.ControleTabs.AddTabSemControleNovo( Produto_Home.tabHome, "Visualizar", "/utilidades_imagens/olho.png", Produto_New );
                        Produto_New.btSalvar   .setVisible(false);
                        Produto_New.btAtualizar.setVisible(false);
                    }
                    else if( str.equals( "Alterar") ){
                        
                        Produto_New Produto_New = new Produto_New( Produto_Home, Produto );
                        Produto_Home.Home.ControleTabs.AddTabSemControleNovo( Produto_Home.tabHome, "Alterar", "/utilidades_imagens/alterar.gif", Produto_New );
                    }
                }
                else{
                    JOPM JOptionPaneMod = new JOPM( 2, "ID SELECIONADA, "
                            + "\nNenhuma USUÁRIO selecionada"
                            + "\nSelecione uma matéria"
                            + "\n", "Matéria selecionada" );
                
                    tfPesquisa.requestFocus();
                }
            }
            
        } catch( Exception e ){ JOPM JOptionPaneMod = new JOPM( 2, "alterar(), \n"
                + e.getMessage() + "\n", this.getClass().getSimpleName() ); } //} }.start(); 
    }

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btAlterar;
    public javax.swing.JButton btExcluir;
    private javax.swing.JButton btPesquisar;
    public javax.swing.JButton btSelecionar;
    public javax.swing.JButton btVisualizar;
    public javax.swing.JComboBox cbCategoriaDoProduto;
    public javax.swing.JComboBox cbTipoDePesquisa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JLabel lbCategoria;
    public static javax.swing.JTextField tfPesquisa;
    // End of variables declaration//GEN-END:variables
    
    public void setarCategorias(categoria_do_produto.Categoriadoproduto Categoriadoproduto){  
        
        try{            
            Query q = JPAUtil.em().createNativeQuery( "SELECT * FROM SCHEMAJMARY.CATEGORIADOPRODUTO", categoria_do_produto.Categoriadoproduto.class );
            List<categoria_do_produto.Categoriadoproduto> list = q.getResultList();
        
            if( cbCategoriaDoProduto.getItemCount() > 0 ) { cbCategoriaDoProduto.removeAllItems(); }           
            
            int select = 0;
            for (int i = 0; i < list.size(); i++){ 
                
                if( list.get(i).getId() == Categoriadoproduto.getId() ) {
                    select = i;
                }
                                                             
                cbCategoriaDoProduto.addItem( new BookInfoCategoriaDoProduto( 
                        list.get(i).getId(), 
                        list.get(i).getNomedacategoriadoproduto()
                )
                );    
            }      
            
            cbCategoriaDoProduto.setSelectedIndex( select );
        }catch(Exception e ){} 
    }
    
}
