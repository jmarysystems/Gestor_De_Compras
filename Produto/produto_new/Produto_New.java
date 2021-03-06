/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package produto_new;

import java.awt.Color;
import produto.Produto_Home;

/**
 *
 * @author pc
 */
public class Produto_New extends javax.swing.JPanel {
    
    Produto_Home              Produto_Home;
    public Produto_New_Inicio Inicio;

    /**
     * Creates new form Fornecedor_New
     */
    public Produto_New(Produto_Home Produto_Home2) {
        initComponents();
        
        Produto_Home       = Produto_Home2;
        Inicio = new Produto_New_Inicio( this );
        
    }
    
    ///////////////////////////////////////////////////////////////////////////
    public produto.Produto Produto;
    public Produto_New(Produto_Home Produto_Home2, produto.Produto Produto2 ) {
        initComponents();
        
        Produto_Home       = Produto_Home2;
        
        Produto = Produto2;
        
        Inicio = new Produto_New_Inicio( this, Produto2 );
        
    }
    ///////////////////////////////////////////////////////////////////////////

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jpStatus1 = new javax.swing.JPanel();
        btSalvar = new javax.swing.JButton();
        btAtualizar = new javax.swing.JButton();
        jpPermitirAcesso = new javax.swing.JPanel();
        tfDescricaoDoProduto = new javax.swing.JTextField();
        cbCategoriaDoProduto = new javax.swing.JComboBox();
        tfCodigoDeBarra = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jpPermitirAcesso1 = new javax.swing.JPanel();
        tfCodigoDaEmbalagem = new javax.swing.JTextField();
        cbEmbalagem = new javax.swing.JComboBox();
        tfQuantidadeDeItensNaEmbalagem = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        jLabel1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel1.setText("Dados do Produto");

        jpStatus1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(201, 239, 237)));

        btSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/utilidades_imagens/salvar.gif"))); // NOI18N
        btSalvar.setText("Salvar");
        btSalvar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btSalvar.setPreferredSize(new java.awt.Dimension(91, 27));
        btSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSalvarActionPerformed(evt);
            }
        });

        btAtualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/utilidades_imagens/atualizar.png"))); // NOI18N
        btAtualizar.setText("Atualizar");
        btAtualizar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btAtualizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btAtualizarMousePressed(evt);
            }
        });

        javax.swing.GroupLayout jpStatus1Layout = new javax.swing.GroupLayout(jpStatus1);
        jpStatus1.setLayout(jpStatus1Layout);
        jpStatus1Layout.setHorizontalGroup(
            jpStatus1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpStatus1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btAtualizar)
                .addContainerGap())
        );
        jpStatus1Layout.setVerticalGroup(
            jpStatus1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpStatus1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jpStatus1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btAtualizar)))
        );

        tfDescricaoDoProduto.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tfDescricaoDoProduto.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(201, 239, 237), 1, true));
        tfDescricaoDoProduto.setPreferredSize(new java.awt.Dimension(212, 23));
        tfDescricaoDoProduto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                tfDescricaoDoProdutoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                tfDescricaoDoProdutoMouseExited(evt);
            }
        });
        tfDescricaoDoProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfDescricaoDoProdutoActionPerformed(evt);
            }
        });
        tfDescricaoDoProduto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tfDescricaoDoProdutoKeyReleased(evt);
            }
        });

        cbCategoriaDoProduto.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        cbCategoriaDoProduto.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(201, 239, 237), 1, true));
        cbCategoriaDoProduto.setPreferredSize(new java.awt.Dimension(212, 23));
        cbCategoriaDoProduto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                cbCategoriaDoProdutoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                cbCategoriaDoProdutoMouseExited(evt);
            }
        });
        cbCategoriaDoProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbCategoriaDoProdutoActionPerformed(evt);
            }
        });

        tfCodigoDeBarra.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tfCodigoDeBarra.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(201, 239, 237), 1, true));
        tfCodigoDeBarra.setPreferredSize(new java.awt.Dimension(212, 23));
        tfCodigoDeBarra.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                tfCodigoDeBarraMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                tfCodigoDeBarraMouseExited(evt);
            }
        });
        tfCodigoDeBarra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfCodigoDeBarraActionPerformed(evt);
            }
        });
        tfCodigoDeBarra.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tfCodigoDeBarraKeyReleased(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel4.setText("Código de Barras");

        jLabel3.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel3.setText("Categoria");

        jLabel2.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel2.setText("Descrição ");

        javax.swing.GroupLayout jpPermitirAcessoLayout = new javax.swing.GroupLayout(jpPermitirAcesso);
        jpPermitirAcesso.setLayout(jpPermitirAcessoLayout);
        jpPermitirAcessoLayout.setHorizontalGroup(
            jpPermitirAcessoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpPermitirAcessoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpPermitirAcessoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbCategoriaDoProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpPermitirAcessoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(tfCodigoDeBarra, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(249, Short.MAX_VALUE))
            .addGroup(jpPermitirAcessoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jpPermitirAcessoLayout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(jpPermitirAcessoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 449, Short.MAX_VALUE)
                        .addComponent(tfDescricaoDoProduto, javax.swing.GroupLayout.DEFAULT_SIZE, 449, Short.MAX_VALUE))
                    .addContainerGap(251, Short.MAX_VALUE)))
        );
        jpPermitirAcessoLayout.setVerticalGroup(
            jpPermitirAcessoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpPermitirAcessoLayout.createSequentialGroup()
                .addContainerGap(67, Short.MAX_VALUE)
                .addGroup(jpPermitirAcessoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpPermitirAcessoLayout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(1, 1, 1)
                        .addGroup(jpPermitirAcessoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cbCategoriaDoProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfCodigoDeBarra, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel4))
                .addContainerGap())
            .addGroup(jpPermitirAcessoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jpPermitirAcessoLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLabel2)
                    .addGap(2, 2, 2)
                    .addComponent(tfDescricaoDoProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(66, Short.MAX_VALUE)))
        );

        tfCodigoDaEmbalagem.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tfCodigoDaEmbalagem.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(201, 239, 237), 1, true));
        tfCodigoDaEmbalagem.setPreferredSize(new java.awt.Dimension(212, 23));
        tfCodigoDaEmbalagem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                tfCodigoDaEmbalagemMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                tfCodigoDaEmbalagemMouseExited(evt);
            }
        });
        tfCodigoDaEmbalagem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfCodigoDaEmbalagemActionPerformed(evt);
            }
        });
        tfCodigoDaEmbalagem.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tfCodigoDaEmbalagemKeyReleased(evt);
            }
        });

        cbEmbalagem.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        cbEmbalagem.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(201, 239, 237), 1, true));
        cbEmbalagem.setPreferredSize(new java.awt.Dimension(212, 23));
        cbEmbalagem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                cbEmbalagemMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                cbEmbalagemMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                cbEmbalagemMousePressed(evt);
            }
        });
        cbEmbalagem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbEmbalagemActionPerformed(evt);
            }
        });

        tfQuantidadeDeItensNaEmbalagem.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tfQuantidadeDeItensNaEmbalagem.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(201, 239, 237), 1, true));
        tfQuantidadeDeItensNaEmbalagem.setPreferredSize(new java.awt.Dimension(212, 23));
        tfQuantidadeDeItensNaEmbalagem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                tfQuantidadeDeItensNaEmbalagemMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                tfQuantidadeDeItensNaEmbalagemMouseExited(evt);
            }
        });
        tfQuantidadeDeItensNaEmbalagem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfQuantidadeDeItensNaEmbalagemActionPerformed(evt);
            }
        });
        tfQuantidadeDeItensNaEmbalagem.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tfQuantidadeDeItensNaEmbalagemKeyReleased(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel5.setText("Quantidade de ítens na Embalagem");

        jLabel6.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel6.setText("Embalagem ");

        jLabel7.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel7.setText("Código da Embalagem");

        javax.swing.GroupLayout jpPermitirAcesso1Layout = new javax.swing.GroupLayout(jpPermitirAcesso1);
        jpPermitirAcesso1.setLayout(jpPermitirAcesso1Layout);
        jpPermitirAcesso1Layout.setHorizontalGroup(
            jpPermitirAcesso1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpPermitirAcesso1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpPermitirAcesso1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbEmbalagem, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpPermitirAcesso1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(tfCodigoDaEmbalagem, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpPermitirAcesso1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(tfQuantidadeDeItensNaEmbalagem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(31, Short.MAX_VALUE))
        );

        jpPermitirAcesso1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {tfCodigoDaEmbalagem, tfQuantidadeDeItensNaEmbalagem});

        jpPermitirAcesso1Layout.setVerticalGroup(
            jpPermitirAcesso1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpPermitirAcesso1Layout.createSequentialGroup()
                .addGroup(jpPermitirAcesso1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jpPermitirAcesso1Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(2, 2, 2)
                        .addComponent(tfCodigoDaEmbalagem, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jpPermitirAcesso1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(2, 2, 2)
                        .addComponent(tfQuantidadeDeItensNaEmbalagem, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jpPermitirAcesso1Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(1, 1, 1)
                        .addComponent(cbEmbalagem, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 42, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jpStatus1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jpPermitirAcesso1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(jpPermitirAcesso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 25, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jpStatus1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jpPermitirAcesso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jpPermitirAcesso1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(29, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSalvarActionPerformed
        Inicio.salvar( new produto.Produto(), false );
    }//GEN-LAST:event_btSalvarActionPerformed

    private void tfDescricaoDoProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfDescricaoDoProdutoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfDescricaoDoProdutoActionPerformed

    private void tfCodigoDeBarraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfCodigoDeBarraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfCodigoDeBarraActionPerformed

    private void btAtualizarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btAtualizarMousePressed
        if( btAtualizar.isEnabled() == true ){
            
            Inicio.setarCategorias( new categoria_do_produto.Categoriadoproduto() );
            Inicio.setarEmbalagens( new embalagem.Embalagem() );
        }
    }//GEN-LAST:event_btAtualizarMousePressed

    private void tfDescricaoDoProdutoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfDescricaoDoProdutoKeyReleased
      
    }//GEN-LAST:event_tfDescricaoDoProdutoKeyReleased

    private void cbCategoriaDoProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbCategoriaDoProdutoActionPerformed
        try{
            if( cbCategoriaDoProduto.getSelectedItem() != null ) {
                //MeuObjeto obj = (MeuObjeto) combobox.getSelectedItem();
                BookInfoCategoriaDoProduto obj = (BookInfoCategoriaDoProduto) cbCategoriaDoProduto.getSelectedItem();
                //System.out.println( "obj.ID "+obj.ID );                
            }
          
        }
        catch( Exception e ){}
    }//GEN-LAST:event_cbCategoriaDoProdutoActionPerformed

    private void tfCodigoDeBarraKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfCodigoDeBarraKeyReleased
        String caracteres="0987654321";
        if(!caracteres.contains(evt.getKeyChar()+"")){
            tfCodigoDeBarra.setText("");
        }
        
    }//GEN-LAST:event_tfCodigoDeBarraKeyReleased

    private void tfDescricaoDoProdutoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tfDescricaoDoProdutoMouseEntered
        mouseEntra( tfDescricaoDoProduto );
    }//GEN-LAST:event_tfDescricaoDoProdutoMouseEntered

    private void tfDescricaoDoProdutoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tfDescricaoDoProdutoMouseExited
        mouseSai( tfDescricaoDoProduto );
    }//GEN-LAST:event_tfDescricaoDoProdutoMouseExited

    private void cbCategoriaDoProdutoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cbCategoriaDoProdutoMouseEntered
        mouseEntra( cbCategoriaDoProduto );
    }//GEN-LAST:event_cbCategoriaDoProdutoMouseEntered

    private void cbCategoriaDoProdutoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cbCategoriaDoProdutoMouseExited
        mouseSai( cbCategoriaDoProduto );
    }//GEN-LAST:event_cbCategoriaDoProdutoMouseExited

    private void tfCodigoDeBarraMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tfCodigoDeBarraMouseEntered
        mouseEntra( tfCodigoDeBarra );
    }//GEN-LAST:event_tfCodigoDeBarraMouseEntered

    private void tfCodigoDeBarraMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tfCodigoDeBarraMouseExited
        mouseSai( tfCodigoDeBarra );
    }//GEN-LAST:event_tfCodigoDeBarraMouseExited

    private void tfCodigoDaEmbalagemMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tfCodigoDaEmbalagemMouseEntered
        mouseEntra( tfCodigoDaEmbalagem );
    }//GEN-LAST:event_tfCodigoDaEmbalagemMouseEntered

    private void tfCodigoDaEmbalagemMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tfCodigoDaEmbalagemMouseExited
        mouseSai( tfCodigoDaEmbalagem );
    }//GEN-LAST:event_tfCodigoDaEmbalagemMouseExited

    private void tfCodigoDaEmbalagemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfCodigoDaEmbalagemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfCodigoDaEmbalagemActionPerformed

    private void tfCodigoDaEmbalagemKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfCodigoDaEmbalagemKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_tfCodigoDaEmbalagemKeyReleased

    private void cbEmbalagemMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cbEmbalagemMouseEntered
        mouseEntra( cbEmbalagem );
    }//GEN-LAST:event_cbEmbalagemMouseEntered

    private void cbEmbalagemMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cbEmbalagemMouseExited
        mouseSai( cbEmbalagem );
    }//GEN-LAST:event_cbEmbalagemMouseExited

    private void cbEmbalagemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbEmbalagemActionPerformed
      
    }//GEN-LAST:event_cbEmbalagemActionPerformed

    private void tfQuantidadeDeItensNaEmbalagemMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tfQuantidadeDeItensNaEmbalagemMouseEntered
        mouseEntra( tfQuantidadeDeItensNaEmbalagem );
    }//GEN-LAST:event_tfQuantidadeDeItensNaEmbalagemMouseEntered

    private void tfQuantidadeDeItensNaEmbalagemMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tfQuantidadeDeItensNaEmbalagemMouseExited
        mouseSai( tfQuantidadeDeItensNaEmbalagem );
    }//GEN-LAST:event_tfQuantidadeDeItensNaEmbalagemMouseExited

    private void tfQuantidadeDeItensNaEmbalagemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfQuantidadeDeItensNaEmbalagemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfQuantidadeDeItensNaEmbalagemActionPerformed

    private void tfQuantidadeDeItensNaEmbalagemKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfQuantidadeDeItensNaEmbalagemKeyReleased
        String caracteres="0987654321";
        if(!caracteres.contains(evt.getKeyChar()+"")){
            tfQuantidadeDeItensNaEmbalagem.setText("");
        }
    }//GEN-LAST:event_tfQuantidadeDeItensNaEmbalagemKeyReleased

    private void cbEmbalagemMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cbEmbalagemMousePressed
        
    }//GEN-LAST:event_cbEmbalagemMousePressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btAtualizar;
    public javax.swing.JButton btSalvar;
    public javax.swing.JComboBox cbCategoriaDoProduto;
    public javax.swing.JComboBox cbEmbalagem;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jpPermitirAcesso;
    private javax.swing.JPanel jpPermitirAcesso1;
    private javax.swing.JPanel jpStatus1;
    public javax.swing.JTextField tfCodigoDaEmbalagem;
    public javax.swing.JTextField tfCodigoDeBarra;
    public javax.swing.JTextField tfDescricaoDoProduto;
    public javax.swing.JTextField tfQuantidadeDeItensNaEmbalagem;
    // End of variables declaration//GEN-END:variables

    private void mouseEntra(javax.swing.JComponent c) {                                                  
        try{
            c.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
            c.setForeground(new java.awt.Color(0, 0, 204));

            c.setBackground(Color.YELLOW);
            c.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 0, 0), 1, true));
        }catch(Exception e ){}
    }
    
    private void mouseSai(javax.swing.JComponent c) {                                                  
        try{
            c.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
            c.setForeground(new java.awt.Color(0, 0, 0));

            c.setBackground(Color.WHITE);
            c.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(201, 239, 237), 1, true));
        }catch(Exception e ){}
    }
    
}