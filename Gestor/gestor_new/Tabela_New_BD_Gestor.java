/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package gestor_new;

import gestor.Gestor_Home;
import java.awt.Color;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Query;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;
import utilidades.Alinhar_Tabela_Centro;
import utilidades.Alinhar_Tabela_Direita;
import utilidades.JOPM;

/**
 *
 * @author ana
 */
public class Tabela_New_BD_Gestor extends javax.swing.JPanel {
   
    private Gestor_Home   Gestor_Home;
    private Gestor_New    Gestor_New;
        
    private List<gestor.Gestordecomprasprodutos> list = new ArrayList(); 
    private ListSelectionModel               lsmPesquisa;
                                                                                                                                                                                             // 
    public final DefaultTableModel          tmPesquisa = new DefaultTableModel( null, new String[]{ "     ID","CÓDIGO DO PRODUTO","DESCRIÇÃO DO PRODUTO","CUSTO","VENDA","ESTOQUE","PEDIDO","DATA 1","CUSTO 1","VENDA 1","ESTOQUE 1","PEDIDO 1","DATA 2","CUSTO 2","VENDA 2","ESTOQUE 2","PEDIDO 2","DATA 3","CUSTO 3","VENDA 3","ESTOQUE 3","PEDIDO 3" } ) {
        
        Class[] types = new Class [] {
            java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Double.class, java.lang.Object.class,
            java.lang.Integer.class, java.lang.Integer.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class,
            java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class,
            java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class,
            java.lang.Object.class, java.lang.Object.class
        };
        
        boolean[] canEdit = new boolean [] {
            false, false, false, true, false, 
            true, true, false, false, false, 
            false, false, false, false, false, 
            false, false, false, false, false,
            false, false
        };
        
        public Class getColumnClass(int columnIndex) {
            return types [columnIndex];
        }
        
        public boolean isCellEditable(int rowIndex, int columnIndex) {
            return canEdit [columnIndex];
        }
    };
    
    public Tabela_New_BD_Gestor( Gestor_Home Gestor_Home2, Gestor_New Gestor_New2 ) {
        
        Gestor_Home      = Gestor_Home2;
        Gestor_New       = Gestor_New2;
                
        initComponents();
        
        new Thread() {   @Override public void run() { try { Thread.sleep( 1 ); 
                    
            tbPesquisa.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
            lsmPesquisa = tbPesquisa.getSelectionModel();
            lsmPesquisa.addListSelectionListener(new ListSelectionListener() {
                public void valueChanged(ListSelectionEvent e) {
                    if (! e.getValueIsAdjusting()){
                        tbPesquisaLinhaSelecionada();
                    }
                }
            });
                                    
            tbPreferedSize();
            tabelaInicio(); 
            
        } catch( Exception e ){ /*JOPM JOPM = new JOPM( 2, "tabelaInicio(), \n"
                + e.getMessage() + "\n", this.getClass().getSimpleName() );*/ } } }.start();                                        
    }
    
    ///////////////////////////////////////////////////////////////////////////
    public fornecedor.Fornecedor                             Fornecedor4;
    public List<produto_por_fornecedor.Produtoporfornecedor> list4;
    public Tabela_New_BD_Gestor( Gestor_Home Gestor_Home2, Gestor_New Gestor_New2, fornecedor.Fornecedor Fornecedor44, List<produto_por_fornecedor.Produtoporfornecedor> list44 ) {
        
        Gestor_Home      = Gestor_Home2;
        Gestor_New       = Gestor_New2;
                
        list4       = list44;
        Fornecedor4 = Fornecedor44;
                
        //System.out.println(Fornecedor4.getNomeourazaosocial());
                
        initComponents();
        
        new Thread() {   @Override public void run() { try { Thread.sleep( 1 ); 
                    
            tbPesquisa.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
            lsmPesquisa = tbPesquisa.getSelectionModel();
            lsmPesquisa.addListSelectionListener(new ListSelectionListener() {
                public void valueChanged(ListSelectionEvent e) {
                    if (! e.getValueIsAdjusting()){
                        tbPesquisaLinhaSelecionada();
                    }
                }
            });
                                    
            tbPreferedSize();
            
            Gestor_New.setarNoJPanelFornecedorSelecionado( Fornecedor4 );
            
            List<gestor.Gestordecomprasprodutos> listF = new ArrayList(); 
            
            for (int i = 0; i < list4.size(); i++){
                
                gestor.Gestordecomprasprodutos GestordecomprasprodutosF = new gestor.Gestordecomprasprodutos();                
                GestordecomprasprodutosF.setIdProduto(        list4.get(i).getIdProduto() );
                GestordecomprasprodutosF.setCodigoproduto(    list4.get(i).getCodigoproduto() );
                GestordecomprasprodutosF.setDescricaoproduto( list4.get(i).getDescricaoproduto() );
                
                listF.add( GestordecomprasprodutosF );
            }
            
            mostrarLista( listF );
            
        } catch( Exception e ){ /*JOPM JOPM = new JOPM( 2, "tabelaInicio(), \n"
                + e.getMessage() + "\n", this.getClass().getSimpleName() );*/ } } }.start();                                        
    }
    ////////////////////////////////////////////////////////////////////////////
    
    public void tabela(Gestor_New Gestor_New2){ 
                
        try {              
            Gestor_New = Gestor_New2;                                    
        } catch( Exception e ){ JOPM JOptionPaneMod = new JOPM( 2, "tabela, \n"
                + e.getMessage() + "\n", this.getClass().getSimpleName() ); }     
    }
    
    private void tabelaInicio(){
        new Thread() {   @Override public void run() { try { Thread.sleep( 1 ); 
                    
            /*
            Query q = JPAUtil.em().createNativeQuery( "SELECT * FROM SCHEMAJMARY.GESTORDECOMPRAS", gestor.Gestordecompras.class );
            list = q.getResultList();
            
            mostrarLista( list );*/
            
        } catch( Exception e ){ /*JOPM JOPM = new JOPM( 2, "tabelaInicio(), \n"
                + e.getMessage() + "\n", this.getClass().getSimpleName() );*/ } } }.start();              
    }
    
    private void tbPreferedSize(){        
        try{
            TableCellRenderer tcrC = new Alinhar_Tabela_Centro();
            TableCellRenderer tcrD = new Alinhar_Tabela_Direita();
            
            tbPesquisa.getColumnModel().getColumn(0).setPreferredWidth(80);
            tbPesquisa.getColumnModel().getColumn(0).setResizable(false);
            tbPesquisa.getColumnModel().getColumn(0).setCellRenderer( tcrC );
            
            tbPesquisa.getColumnModel().getColumn(1).setPreferredWidth(145);
            tbPesquisa.getColumnModel().getColumn(1).setResizable(false);
            
            tbPesquisa.getColumnModel().getColumn(2).setPreferredWidth(310);
            tbPesquisa.getColumnModel().getColumn(2).setResizable(false);
            
            tbPesquisa.getColumnModel().getColumn(3).setPreferredWidth(80);
            tbPesquisa.getColumnModel().getColumn(3).setResizable(false);
            tbPesquisa.getColumnModel().getColumn(3).setCellRenderer( tcrD );
            
            tbPesquisa.getColumnModel().getColumn(4).setPreferredWidth(80);
            tbPesquisa.getColumnModel().getColumn(4).setResizable(false);
            tbPesquisa.getColumnModel().getColumn(4).setCellRenderer( tcrD );
            
            tbPesquisa.getColumnModel().getColumn(5).setPreferredWidth(80);
            tbPesquisa.getColumnModel().getColumn(5).setResizable(false);
            tbPesquisa.getColumnModel().getColumn(5).setCellRenderer( tcrD );
            
            tbPesquisa.getColumnModel().getColumn(6).setPreferredWidth(80);
            tbPesquisa.getColumnModel().getColumn(6).setResizable(false);
            tbPesquisa.getColumnModel().getColumn(6).setCellRenderer( tcrD );
            
            tbPesquisa.getColumnModel().getColumn(7).setPreferredWidth(90);
            tbPesquisa.getColumnModel().getColumn(7).setResizable(false);
            tbPesquisa.getColumnModel().getColumn(7).setCellRenderer( tcrC );
            
            tbPesquisa.getColumnModel().getColumn(8).setPreferredWidth(80);
            tbPesquisa.getColumnModel().getColumn(8).setResizable(false);
            tbPesquisa.getColumnModel().getColumn(8).setCellRenderer( tcrD );
            
            tbPesquisa.getColumnModel().getColumn(9).setPreferredWidth(80);
            tbPesquisa.getColumnModel().getColumn(9).setResizable(false);
            tbPesquisa.getColumnModel().getColumn(9).setCellRenderer( tcrD );
            
            tbPesquisa.getColumnModel().getColumn(10).setPreferredWidth(80);
            tbPesquisa.getColumnModel().getColumn(10).setResizable(false);
            tbPesquisa.getColumnModel().getColumn(10).setCellRenderer( tcrD );
            
            tbPesquisa.getColumnModel().getColumn(11).setPreferredWidth(80);
            tbPesquisa.getColumnModel().getColumn(11).setResizable(false);
            tbPesquisa.getColumnModel().getColumn(11).setCellRenderer( tcrD );
            
            tbPesquisa.getColumnModel().getColumn(12).setPreferredWidth(90);
            tbPesquisa.getColumnModel().getColumn(12).setResizable(false);
            tbPesquisa.getColumnModel().getColumn(12).setCellRenderer( tcrC );
            
            tbPesquisa.getColumnModel().getColumn(13).setPreferredWidth(80);
            tbPesquisa.getColumnModel().getColumn(13).setResizable(false);
            tbPesquisa.getColumnModel().getColumn(13).setCellRenderer( tcrD );
            
            tbPesquisa.getColumnModel().getColumn(14).setPreferredWidth(80);
            tbPesquisa.getColumnModel().getColumn(14).setResizable(false);
            tbPesquisa.getColumnModel().getColumn(14).setCellRenderer( tcrD );
            
            tbPesquisa.getColumnModel().getColumn(15).setPreferredWidth(80);
            tbPesquisa.getColumnModel().getColumn(15).setResizable(false);
            tbPesquisa.getColumnModel().getColumn(15).setCellRenderer( tcrD );
            
            tbPesquisa.getColumnModel().getColumn(16).setPreferredWidth(80);
            tbPesquisa.getColumnModel().getColumn(16).setResizable(false);
            tbPesquisa.getColumnModel().getColumn(16).setCellRenderer( tcrD );
            
            tbPesquisa.getColumnModel().getColumn(17).setPreferredWidth(90);
            tbPesquisa.getColumnModel().getColumn(17).setResizable(false);
            tbPesquisa.getColumnModel().getColumn(17).setCellRenderer( tcrC );
            
            tbPesquisa.getColumnModel().getColumn(18).setPreferredWidth(80);
            tbPesquisa.getColumnModel().getColumn(18).setResizable(false);
            tbPesquisa.getColumnModel().getColumn(18).setCellRenderer( tcrD );
            
            tbPesquisa.getColumnModel().getColumn(19).setPreferredWidth(80);
            tbPesquisa.getColumnModel().getColumn(19).setResizable(false);
            tbPesquisa.getColumnModel().getColumn(19).setCellRenderer( tcrD );
            
            tbPesquisa.getColumnModel().getColumn(20).setPreferredWidth(80);
            tbPesquisa.getColumnModel().getColumn(20).setResizable(false);
            tbPesquisa.getColumnModel().getColumn(20).setCellRenderer( tcrD );
            
            tbPesquisa.getColumnModel().getColumn(21).setPreferredWidth(80);
            tbPesquisa.getColumnModel().getColumn(21).setResizable(true);
            tbPesquisa.getColumnModel().getColumn(21).setCellRenderer( tcrD );
                    
            tbPesquisa.setRowHeight(30);
            tbPesquisa.setSelectionBackground(Color.YELLOW);
            tbPesquisa.setSelectionForeground(Color.BLUE);
            
            tbPesquisa.getTableHeader().setReorderingAllowed(false);
            tbPesquisa.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
            
        } catch( Exception e ){}
    }
    
    Query q;
    public void pesquisa(Query q2){
        q = q2;
        new Thread() {   @Override public void run() { try { Thread.sleep( 1 ); 
            
            list = q.getResultList();                        
            mostrarLista( list );
            
        } catch( Exception e ){ JOPM JOptionPaneMod = new JOPM( 2, "pesquisa(Query q2), \n"
                + e.getMessage() + "\n", this.getClass().getSimpleName() ); } } }.start();              
    }
                
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tbPesquisa = new javax.swing.JTable();

        jScrollPane1.setBorder(null);

        tbPesquisa.setModel(tmPesquisa);
        jScrollPane1.setViewportView(tbPesquisa);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 314, Short.MAX_VALUE)
                .addGap(3, 3, 3))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 106, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JTable tbPesquisa;
    // End of variables declaration//GEN-END:variables
        
    public void mostrarLista( List<gestor.Gestordecomprasprodutos> listR ){  try {  
        
            list = listR;
            
            while ( tmPesquisa.getRowCount() > 0){ tmPesquisa.removeRow(0); }
            if ( listR.isEmpty() ){ //JOptionPane.showMessageDialog( null , "Nenhum dado encontrado!"); 
            }else{
                String [] campos = new String[] {null, null};
                for (int i = 0; i < listR.size(); i++){
                    tmPesquisa.addRow(campos);
                    
                    tmPesquisa.setValueAt( listR.get(i).getIdProduto()          , i, 0);
                    tmPesquisa.setValueAt( listR.get(i).getCodigoproduto()      , i, 1);
                    tmPesquisa.setValueAt( listR.get(i).getDescricaoproduto()   , i, 2);
                    
                    try{ tmPesquisa.setValueAt( listR.get(i).getCusto()         , i, 3); } catch( Exception e ){}
                    
                    Tabela_Pesquisa_BD_Gestor_New_Venda t = new Tabela_Pesquisa_BD_Gestor_New_Venda( this, i, listR.get(i).getCodigoproduto() );        
                    t.setName("Tabela_Pesquisa_BD_Gestor_New_Venda");         
                    t.start();
                    
                    try{ tmPesquisa.setValueAt( listR.get(i).getEstoque()       , i, 5); } catch( Exception e ){}
                    try{ tmPesquisa.setValueAt( listR.get(i).getPedido()        , i, 6); } catch( Exception e ){}
                    
                    Tabela_Pesquisa_BD_Gestor_New_Extras t1 = new Tabela_Pesquisa_BD_Gestor_New_Extras( this, i, listR.get(i).getCodigoproduto() );        
                    t1.setName("Tabela_Pesquisa_BD_Gestor_New_Extras");         
                    t1.start();
                    
                }
            }    
        } catch( Exception e ){ /*JOPM JOPM = new JOPM( 2, "mostrarLista( List<materias_control.Materia> list2 ), \n"
                + e.getMessage() + "\n", "Tabela_Pesquisa_BD_Usuario" );*/ } 
    }
    
    public void mostrarLista2( produto.Produto Produto2 ){ try {                    

        int nCols = tmPesquisa.getColumnCount();
        Object[] linha = new Object[nCols] ;  
        
        int i = tmPesquisa.getRowCount();
        
        //System.out.println( "nLinhas - " + i);
        try{ tmPesquisa.getRowCount(); } catch( Exception e ){}
        
        tmPesquisa.addRow( linha ); 
        
        tmPesquisa.setValueAt( Produto2.getId()                 , i, 0);                    
        tmPesquisa.setValueAt( Produto2.getCodigoproduto()      , i, 1);                    
        tmPesquisa.setValueAt( Produto2.getDescricaoproduto()   , i, 2);                  
                                        
        Tabela_Pesquisa_BD_Gestor_New_Venda t = new Tabela_Pesquisa_BD_Gestor_New_Venda( this, i, Produto2.getCodigoproduto() );                          
        t.setName("Tabela_Pesquisa_BD_Gestor_New_Venda");         
        t.start();
                    
        //try{ tmPesquisa.setValueAt( Produto2.getEstoque()       , i, 5); } catch( Exception e ){}
        //try{ tmPesquisa.setValueAt( Produto2.getPedido()        , i, 6); } catch( Exception e ){}
                
        Tabela_Pesquisa_BD_Gestor_New_Extras t1 = new Tabela_Pesquisa_BD_Gestor_New_Extras( this, i, Produto2.getCodigoproduto() );        
        t1.setName("Tabela_Pesquisa_BD_Gestor_New_Extras");         
        t1.start();
        
        } catch( Exception e ){} 
    }
    
    private void tbPesquisaLinhaSelecionada() {
        new Thread() {   @Override public void run() { try {  

            if ( tbPesquisa.getSelectedRow() != -1){
                                                           
                Gestor_New.IDSELECIONADA = list.get( tbPesquisa.getSelectedRow() ).getId();
                                
                //if( Usuario_Permissoes.booAlterarprodutoporfornecedor(Usuario_Logado.ID ) == true ) { Gestor_New.btAlterar.setEnabled(true);  }

                //if( Usuario_Permissoes.booExcluirprodutoporfornecedor( Usuario_Logado.ID ) == true ) { Gestor_New.btExcluir    .setEnabled(true); }
                
            } else{
                      
                Gestor_New.IDSELECIONADA = -1;  
                /*
                Gestor_New.btAlterar   .setEnabled(false);
                Gestor_New.btExcluir   .setEnabled(false);*/
            }                  
        } catch( Exception e ){} } }.start();   
    }
        
}
