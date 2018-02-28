/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package produto_search;

import home_usuario_logado.Usuario_Logado;
import java.awt.Color;
import java.util.List;
import javax.persistence.Query;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;
import jpa.JPAUtil;
import produto.Produto_Home;
import usuario.Usuario_Permissoes;
import utilidades.Alinhar_Tabela_Centro;
import utilidades.JOPM;

/**
 *
 * @author ana
 */
public class Tabela_Pesquisa_BD_Produto extends javax.swing.JPanel {
   
    private Produto_Home          Produto_Home;
    private Menu_Pesquisa_Produto Menu_Pesquisa;
        
    private List<produto.Produto> list;
    private ListSelectionModel               lsmPesquisa;
    public final DefaultTableModel          tmPesquisa = new DefaultTableModel( null, new String[]{ "     ID","CÓDIGO DO PRODUTO","DESCRIÇÃO DO PRODUTO", "CATEGORIA", "EMBALAGEM", "CÓDIGO DA EMBALAGEM", "EMBALAGEM COM", "VENDA EM 7 DIAS", "VENDA EM 30 DIAS"} );
    
    public Tabela_Pesquisa_BD_Produto( Produto_Home Produto_Home2 ) {
         
        Produto_Home      = Produto_Home2;
                
        initComponents();
                 
        tabelaInicio();                        
    }
    
    public void tabela(Menu_Pesquisa_Produto Menu_Pesquisa2){ 
                
        try {                
            Menu_Pesquisa = Menu_Pesquisa2;                                    
        } catch( Exception e ){ JOPM JOptionPaneMod = new JOPM( 2, "tabela, \n"
                + e.getMessage() + "\n", this.getClass().getSimpleName() ); }     
    }
    
    private void tabelaInicio(){
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
            
            Query q = JPAUtil.em().createNativeQuery( "SELECT * FROM SCHEMAJMARY.PRODUTO", produto.Produto.class );
            list = q.getResultList();
            mostrarLista( list );
            
        } catch( Exception e ){ JOPM JOptionPaneMod = new JOPM( 2, "tabelaInicio(), \n"
                + e.getMessage() + "\n", this.getClass().getSimpleName() ); } } }.start();              
    }
    
    private void tbPreferedSize(){        
        try{
            TableCellRenderer tcrC = new Alinhar_Tabela_Centro();
            
            tbPesquisa.getColumnModel().getColumn(0).setPreferredWidth(55);
            tbPesquisa.getColumnModel().getColumn(0).setResizable(false);
            tbPesquisa.getColumnModel().getColumn(0).setCellRenderer( tcrC );
            
            tbPesquisa.getColumnModel().getColumn(1).setPreferredWidth(145);
            tbPesquisa.getColumnModel().getColumn(1).setResizable(false);
            
            tbPesquisa.getColumnModel().getColumn(2).setPreferredWidth(330);
            tbPesquisa.getColumnModel().getColumn(2).setResizable(false);
            
            tbPesquisa.getColumnModel().getColumn(3).setPreferredWidth(120);
            tbPesquisa.getColumnModel().getColumn(3).setResizable(false);
            
            tbPesquisa.getColumnModel().getColumn(4).setPreferredWidth(85);
            tbPesquisa.getColumnModel().getColumn(4).setResizable(false);
            
            tbPesquisa.getColumnModel().getColumn(5).setPreferredWidth(155);
            tbPesquisa.getColumnModel().getColumn(5).setResizable(false);
            
            tbPesquisa.getColumnModel().getColumn(6).setPreferredWidth(115);
            tbPesquisa.getColumnModel().getColumn(6).setResizable(false);
            
            tbPesquisa.getColumnModel().getColumn(7).setPreferredWidth(115);
            tbPesquisa.getColumnModel().getColumn(7).setResizable(false);
            
            tbPesquisa.getColumnModel().getColumn(8).setPreferredWidth(120);
            tbPesquisa.getColumnModel().getColumn(8).setResizable(true);
            
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
            
        } catch( Exception e ){ JOPM JOptionPaneMod = new JOPM( 2, "tabelaInicio(), \n"
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
        
    public void mostrarLista( List<produto.Produto> listR ){  try {                    
            
            while ( tmPesquisa.getRowCount() > 0){ tmPesquisa.removeRow(0); }
            if ( listR.isEmpty() ){ //JOptionPane.showMessageDialog( null , "Nenhum dado encontrado!"); 
            }else{
                String [] campos = new String[] {null, null};
                for (int i = 0; i < listR.size(); i++){
                    tmPesquisa.addRow(campos);
                    
                    tmPesquisa.setValueAt( listR.get(i).getId()                                , i, 0);
                    tmPesquisa.setValueAt( listR.get(i).getCodigoproduto()                     , i, 1);
                    tmPesquisa.setValueAt( listR.get(i).getDescricaoproduto()                  , i, 2);
                    tmPesquisa.setValueAt( listR.get(i).getNomedacategoriadoproduto()          , i, 3);
                    tmPesquisa.setValueAt( listR.get(i).getNomedaembalagem()                   , i, 4);
                    tmPesquisa.setValueAt( listR.get(i).getCodigodaembalagem()                 , i, 5);
                    tmPesquisa.setValueAt( listR.get(i).getQuantidadedeitensnaembalagem()      , i, 6);
                        
                    Tabela_Pesquisa_BD_Produto_Venda_SysPdv t1 = new Tabela_Pesquisa_BD_Produto_Venda_SysPdv( this, i, listR.get(i).getCodigoproduto() );        
                    t1.setName("Tabela_Pesquisa_BD_Produto_Venda_SysPdv");         
                    t1.start();
                }
            }    
        } catch( Exception e ){ /*JOPM JOPM = new JOPM( 2, "mostrarLista( List<materias_control.Materia> list2 ), \n"
                + e.getMessage() + "\n", "Tabela_Pesquisa_BD_Usuario" );*/ } 
    }
    
    private void tbPesquisaLinhaSelecionada() { 
        try{
            
            if ( tbPesquisa.getSelectedRow() != -1){
                           
                Menu_Pesquisa.IDSELECIONADA = list.get( tbPesquisa.getSelectedRow() ).getId();
                                
                if( Usuario_Permissoes.booAlterarproduto( Usuario_Logado.ID ) == true ) { Menu_Pesquisa.btAlterar.setEnabled(true);  }

                if( Usuario_Permissoes.booExcluirproduto( Usuario_Logado.ID ) == true ) { Menu_Pesquisa.btExcluir    .setEnabled(true); }
                Menu_Pesquisa.btVisualizar.setEnabled(true);
                Menu_Pesquisa.btSelecionar.setEnabled(true);
            } else{
                      
                Menu_Pesquisa.IDSELECIONADA = -1;  
                
                Menu_Pesquisa.btAlterar   .setEnabled(false);
                Menu_Pesquisa.btExcluir   .setEnabled(false);
                Menu_Pesquisa.btVisualizar.setEnabled(false);
                Menu_Pesquisa.btSelecionar.setEnabled(false);
            }
        } catch( Exception e ) {}
    }
            
}
