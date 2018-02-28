/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package utilidades;

import login.LoginDerby;

/**
 *
 * @author pc
 */
public class DB_Conexao extends javax.swing.JPanel {
    
    LoginDerby LoginDerby;
    
    /**
     * Creates new form DB_Conexao
     * @param LoginDerby2
     */
    public DB_Conexao( LoginDerby LoginDerby2 ) {
        initComponents();
        LoginDerby = LoginDerby2;
        LoginDerby.btConectar.setEnabled( false );
        
        tipoDeConexao( "Alone" );
    }
    
    private void tipoDeConexao( String tipo_de_conexao ){
        switch( tipo_de_conexao ) {
            case "Alone": tfIp.setVisible( false ); 
                          lbIp.setVisible( false ); 
                          tfPorta.setVisible( false ); 
                          lbPorta.setVisible( false ); 
                          tfEnderecoBanco.setVisible( true ); 
                          lbEnderecoBanco.setVisible( true ); 
                          rbUser.setVisible( true ); 
                          rbHome.setVisible( true );                           
                          break; 
            case "Network": tfIp.setVisible( true ); 
                          lbIp.setVisible( true ); 
                          tfPorta.setVisible( true ); 
                          lbPorta.setVisible( true ); 
                          tfEnderecoBanco.setVisible( false ); 
                          lbEnderecoBanco.setVisible( false ); 
                          rbUser.setVisible( false ); 
                          rbHome.setVisible( false );                           
                          break;  
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpStatus = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        lbIp = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lbPorta = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        lbEnderecoBanco = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        cbTipoConexao = new javax.swing.JComboBox();
        tfNomeBanco = new javax.swing.JTextField();
        tfSenha = new javax.swing.JTextField();
        tfEnderecoBanco = new javax.swing.JTextField();
        tfUsuario = new javax.swing.JTextField();
        tfPorta = new javax.swing.JTextField();
        cbDriver = new javax.swing.JComboBox();
        tfIp = new javax.swing.JTextField();
        cbTipoBanco = new javax.swing.JComboBox();
        rbUser = new javax.swing.JRadioButton();
        rbHome = new javax.swing.JRadioButton();

        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setPreferredSize(new java.awt.Dimension(585, 458));

        jpStatus.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 0, 0, 0, new java.awt.Color(201, 239, 237)));

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/utilidades_imagens/salvar.gif"))); // NOI18N
        jButton3.setText("Salvar");
        jButton3.setPreferredSize(new java.awt.Dimension(91, 27));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpStatusLayout = new javax.swing.GroupLayout(jpStatus);
        jpStatus.setLayout(jpStatusLayout);
        jpStatusLayout.setHorizontalGroup(
            jpStatusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpStatusLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jpStatusLayout.setVerticalGroup(
            jpStatusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpStatusLayout.createSequentialGroup()
                .addGap(0, 12, Short.MAX_VALUE)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jLabel1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel1.setText("Configuração de conexão com banco de dados");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("Informe o nome de usuário.: ");
        jLabel6.setPreferredSize(new java.awt.Dimension(210, 26));

        lbIp.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbIp.setForeground(new java.awt.Color(0, 0, 255));
        lbIp.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbIp.setText("Informe o ip do servidor.: ");
        lbIp.setPreferredSize(new java.awt.Dimension(210, 26));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Escolha o driver do banco.: ");
        jLabel4.setPreferredSize(new java.awt.Dimension(210, 26));

        lbPorta.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbPorta.setForeground(new java.awt.Color(0, 0, 255));
        lbPorta.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbPorta.setText("Informe a porta do servidor.: ");
        lbPorta.setPreferredSize(new java.awt.Dimension(210, 26));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel7.setText("Informe a senha.: ");
        jLabel7.setPreferredSize(new java.awt.Dimension(210, 26));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Escolha o tipo de conexão.: ");
        jLabel2.setPreferredSize(new java.awt.Dimension(210, 26));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Escolha o tipo de banco.: ");
        jLabel3.setPreferredSize(new java.awt.Dimension(210, 26));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("Informe o nome do banco.: ");
        jLabel5.setPreferredSize(new java.awt.Dimension(210, 26));

        lbEnderecoBanco.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbEnderecoBanco.setForeground(new java.awt.Color(0, 0, 255));
        lbEnderecoBanco.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbEnderecoBanco.setText("Informe o endereço do banco.: ");
        lbEnderecoBanco.setPreferredSize(new java.awt.Dimension(210, 26));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 211, Short.MAX_VALUE)
                                                    .addGap(19, 19, 19))
                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addContainerGap()))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addContainerGap()))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addContainerGap()))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addContainerGap()))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addContainerGap()))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(lbIp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addContainerGap()))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addComponent(lbPorta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addContainerGap()))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(lbEnderecoBanco, javax.swing.GroupLayout.DEFAULT_SIZE, 211, Short.MAX_VALUE)
                        .addContainerGap())))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jLabel2, jLabel3, jLabel4, jLabel5, jLabel6, jLabel7, lbEnderecoBanco, lbIp, lbPorta});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbIp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbPorta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbEnderecoBanco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(39, Short.MAX_VALUE))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jLabel2, jLabel3, jLabel4, jLabel5, jLabel6, jLabel7, lbEnderecoBanco, lbIp, lbPorta});

        cbTipoConexao.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        cbTipoConexao.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Alone", "Network" }));
        cbTipoConexao.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(201, 239, 237), 1, true));
        cbTipoConexao.setPreferredSize(new java.awt.Dimension(212, 23));
        cbTipoConexao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbTipoConexaoActionPerformed(evt);
            }
        });

        tfNomeBanco.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        tfNomeBanco.setText("db_fonema_e_letra");
        tfNomeBanco.setPreferredSize(new java.awt.Dimension(130, 24));

        tfSenha.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        tfSenha.setText("admin");
        tfSenha.setPreferredSize(new java.awt.Dimension(130, 24));

        tfEnderecoBanco.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        tfEnderecoBanco.setPreferredSize(new java.awt.Dimension(265, 24));
        tfEnderecoBanco.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tfEnderecoBancoKeyReleased(evt);
            }
        });

        tfUsuario.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        tfUsuario.setText("admin");
        tfUsuario.setPreferredSize(new java.awt.Dimension(130, 24));

        tfPorta.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        tfPorta.setText("1527");
        tfPorta.setPreferredSize(new java.awt.Dimension(130, 24));

        cbDriver.setEditable(true);
        cbDriver.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        cbDriver.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "org.apache.derby.jdbc.EmbeddedDriver", "org.apache.derby.jdbc.ClientDriver", "oracle.jdbc.driver.OracleDriver", "com.microsoft.sqlserver.jdbc.SQLServerDriver", "org.postgresql.Driver", "org.firebirdsql.jdbc.FBDriver", "com.mysql.jdbc.Driver", "sun.jdbc.odbc.JdbcOdbcDriver" }));
        cbDriver.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(201, 239, 237), 1, true));
        cbDriver.setPreferredSize(new java.awt.Dimension(265, 23));
        cbDriver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbDriverActionPerformed(evt);
            }
        });

        tfIp.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        tfIp.setText("127.0.0.1");
        tfIp.setPreferredSize(new java.awt.Dimension(130, 24));

        cbTipoBanco.setEditable(true);
        cbTipoBanco.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        cbTipoBanco.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "derby", "oracle", "sqlserver", "postgresql", "firebirdsql", "mysql", "odbc" }));
        cbTipoBanco.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(201, 239, 237), 1, true));
        cbTipoBanco.setPreferredSize(new java.awt.Dimension(130, 24));

        rbUser.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        rbUser.setText("user.dir");
        rbUser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                rbUserMouseReleased(evt);
            }
        });

        rbHome.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        rbHome.setSelected(true);
        rbHome.setText("user.home");
        rbHome.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                rbHomeMouseReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(rbUser)
                        .addGap(18, 18, 18)
                        .addComponent(rbHome))
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(cbTipoConexao, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(cbTipoBanco, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(tfNomeBanco, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(tfUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(tfSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(tfIp, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(tfPorta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(cbDriver, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(tfEnderecoBanco, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cbTipoConexao, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbTipoBanco, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbDriver, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfNomeBanco, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfIp, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfPorta, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfEnderecoBanco, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbHome)
                    .addComponent(rbUser))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {cbDriver, cbTipoBanco, cbTipoConexao, tfEnderecoBanco, tfIp, tfNomeBanco, tfPorta, tfSenha, tfUsuario});

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(202, 202, 202))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jpStatus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(36, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jpStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        criarConfiguracoesDB();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void rbUserMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rbUserMouseReleased
        rbHome.setSelected(false);
        //rbUser.setSelected(false);
        tfEnderecoBanco.setText("");
    }//GEN-LAST:event_rbUserMouseReleased

    private void rbHomeMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rbHomeMouseReleased
         //rbHome.setSelected(false);
         rbUser.setSelected(false);
         tfEnderecoBanco.setText("");
    }//GEN-LAST:event_rbHomeMouseReleased

    private void cbTipoConexaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbTipoConexaoActionPerformed
        String tipoC = cbTipoConexao.getSelectedItem().toString().trim();
        tipoDeConexao( tipoC );
    }//GEN-LAST:event_cbTipoConexaoActionPerformed

    private void cbDriverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbDriverActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbDriverActionPerformed

    private void tfEnderecoBancoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfEnderecoBancoKeyReleased
        rbHome.setSelected(false);
        rbUser.setSelected(false);
    }//GEN-LAST:event_tfEnderecoBancoKeyReleased

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JComboBox cbDriver;
    public javax.swing.JComboBox cbTipoBanco;
    public javax.swing.JComboBox cbTipoConexao;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jpStatus;
    private javax.swing.JLabel lbEnderecoBanco;
    private javax.swing.JLabel lbIp;
    private javax.swing.JLabel lbPorta;
    private javax.swing.JRadioButton rbHome;
    private javax.swing.JRadioButton rbUser;
    private javax.swing.JTextField tfEnderecoBanco;
    private javax.swing.JTextField tfIp;
    private javax.swing.JTextField tfNomeBanco;
    private javax.swing.JTextField tfPorta;
    private javax.swing.JTextField tfSenha;
    private javax.swing.JTextField tfUsuario;
    // End of variables declaration//GEN-END:variables

    String tipo_de_conexao = "";
    String tipoDeBanco     = "";       
    String driver          = "";              
    String nomeDoBanco     = "";                       
    String usuario         = "";                            
    String senha           = "";                                   
    String ip_do_servidor  = "";                              
    String porta_servidor  = "";   
    String endereco_db     = "";
    public void criarConfiguracoesDB(){
        
        new Thread() {   @Override public void run() { try { Thread.sleep( 1 ); 
        
              tipo_de_conexao = cbTipoConexao.getSelectedItem().toString().trim() ; 
              tipoDeBanco     = cbTipoBanco.getSelectedItem().toString().trim() ;       
              driver          =  cbDriver.getSelectedItem().toString().trim();              
              nomeDoBanco     = tfNomeBanco.getText().trim() ;                         
              usuario         = tfUsuario.getText().trim() ;                                
              senha           = tfSenha.getText().trim() ;                                    
              ip_do_servidor  = tfIp.getText().trim() ;                              
              porta_servidor  = tfPorta.getText().trim() ;  
    
              try { 
                  if( rbHome.isSelected() ) {
                      endereco_db = System.getProperty("user.home") + System.getProperty("file.separator") + "JMarySystems";          
                      criarArquivo();
                  } 
                  else if( rbUser.isSelected() ) {
                      endereco_db = System.getProperty("user.dir") + System.getProperty("file.separator") + "JMarySystems";          
                      criarArquivo();
                  }
                  else{
                      endereco_db = tfEnderecoBanco.getText().trim();         
                      criarArquivo();
                  }
              } catch( Exception e ){}
              
              
        
              LoginDerby.btConectar.setEnabled( true );
              LoginDerby.fecharFrameConf();
              LoginDerby.setVisible(true);
       
        } catch( Exception e ){ JOPM JOptionPaneMod = new JOPM( 2, "criarConfiguracoesDB(), \n"
                + e.getMessage() + "\n", "DB_Conexao" ); } } }.start();
    }
    
    private void criarArquivo(){
        
        Arquivo_Ou_Pasta.criarPasta( System.getProperty("user.home"), "JMarySystems" );
                
        new Thread() {   @Override public void run() { try { Thread.sleep( 1 );                   
            
            Arquivo_Ou_Pasta.criar_Arquivo_Iso( System.getProperty("user.home") + System.getProperty("file.separator") + "JMarySystems" + System.getProperty("file.separator") + "db_conf" + ".properties", 
                    "tipo_de_conexao" + " = " + tipo_de_conexao + "\r\n" +
                    "tipoDeBanco"     + " = " + tipoDeBanco     + "\r\n" +
                    "driver"          + " = " + driver          + "\r\n" +        
                    "nomeDoBanco"     + " = " + nomeDoBanco     + "\r\n" +                
                    //"usuario"         + " = " + usuario         + "\r\n" +                      
                    //"senha"           + " = " + senha           + "\r\n" +                                 
                    "ip_do_servidor"  + " = " + ip_do_servidor  + "\r\n" +                           
                    "porta_servidor"  + " = " + porta_servidor  + "\r\n"  + 
                    "endereco_db"     + " = " + endereco_db
            );
            
        } catch( Exception e ){ JOPM JOptionPaneMod = new JOPM( 2, "criarArquivo(), \n"
                + e.getMessage() + "\n", "DB_Conexao" ); } } }.start();
    }
}
