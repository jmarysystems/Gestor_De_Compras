/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package gestor_search;

import gestor.Gestor_Home;
import home_usuario_logado.Usuario_Logado;
import java.awt.Color;
import java.text.SimpleDateFormat;
import java.util.List;
import javax.persistence.Query;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;
import jpa.JPAUtil;
import usuario.Usuario_Permissoes;
import utilidades.Alinhar_Tabela_Centro;
import utilidades.JOPM;

/**
 *
 * @author ana
 */
public class Tabela_Pesquisa_BD_Gestor extends javax.swing.JPanel {
   
    private Gestor_Home                          Gestor_Home;
    private Menu_Pesquisa_Gestor                 Menu_Pesquisa;
        
    private List<gestor.Gestordecompras>         list;
    private List<gestor.Gestordecomprasprodutos> list2;
    private ListSelectionModel                   lsmPesquisa;
    public final DefaultTableModel              tmPesquisa = new DefaultTableModel( null, new String[]{ "GESTOR_P","     DATA","      NOME OU RAZÃO SOCIAL ","NOME FANTASIA","NOME DO VENDEDOR","TELEFONE VENDEDOR","NOME DO SUPERVISOR","TELEFONE SUPERVISOR" } );
    
    public Tabela_Pesquisa_BD_Gestor( Gestor_Home Gestor_Home2 ) {
         
        Gestor_Home      = Gestor_Home2;
                
        initComponents();
                 
        tabelaInicio();                        
    }
    
    public void tabela(Menu_Pesquisa_Gestor Menu_Pesquisa2){ 
                
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
            
            Query q = JPAUtil.em().createNativeQuery( "SELECT * FROM SCHEMAJMARY.GESTORDECOMPRAS ORDER BY ID DESC", gestor.Gestordecompras.class );
            list = q.getResultList();
            
            mostrarLista( list, "inicio" );
            
            try{
                //
            } catch( Exception e ){}

            
            
        } catch( Exception e ){ /*JOPM JOPM = new JOPM( 2, "tabelaInicio(), \n"
                + e.getMessage() + "\n", this.getClass().getSimpleName() );*/ } } }.start();              
    }
    
    private void tbPreferedSize(){        
        try{
            TableCellRenderer tcrC = new Alinhar_Tabela_Centro();
            
            tbPesquisa.getColumnModel().getColumn(0).setPreferredWidth(80);
            tbPesquisa.getColumnModel().getColumn(0).setResizable(false);
            tbPesquisa.getColumnModel().getColumn(0).setCellRenderer( tcrC );
            
            tbPesquisa.getColumnModel().getColumn(1).setPreferredWidth(80);
            tbPesquisa.getColumnModel().getColumn(1).setResizable(false);
            
            tbPesquisa.getColumnModel().getColumn(2).setPreferredWidth(230);
            tbPesquisa.getColumnModel().getColumn(2).setResizable(false);
            
            tbPesquisa.getColumnModel().getColumn(3).setPreferredWidth(150);
            tbPesquisa.getColumnModel().getColumn(3).setResizable(false);
            
            tbPesquisa.getColumnModel().getColumn(4).setPreferredWidth(160);
            tbPesquisa.getColumnModel().getColumn(4).setResizable(false);
            
            tbPesquisa.getColumnModel().getColumn(5).setPreferredWidth(160);
            tbPesquisa.getColumnModel().getColumn(5).setResizable(false);
            
            tbPesquisa.getColumnModel().getColumn(6).setPreferredWidth(160);
            tbPesquisa.getColumnModel().getColumn(6).setResizable(false);
            
            tbPesquisa.getColumnModel().getColumn(7).setPreferredWidth(160);
            tbPesquisa.getColumnModel().getColumn(7).setResizable(true);
            
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
            mostrarLista( list, "pesquisa(Query q2)" );
            
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
        
    public void mostrarLista( List<gestor.Gestordecompras> listR, String local ){  try {   list = listR;
            SimpleDateFormat out = new SimpleDateFormat("dd.MM.yyyy");
                                    
            while ( tmPesquisa.getRowCount() > 0){ tmPesquisa.removeRow(0); }
            if ( listR.isEmpty() ){ //JOptionPane.showMessageDialog( null , "Nenhum dado encontrado!"); 
            }else{
                String [] campos = new String[] {null, null};
                for (int i = 0; i < listR.size(); i++){ //System.out.println( "I - " + i + " - " +local);
                    tmPesquisa.addRow(campos);
                    
                    try { tmPesquisa.setValueAt( listR.get(i).getId()                 , i, 0); } catch( Exception e ){}
                    try { tmPesquisa.setValueAt( out.format( listR.get(i).getData() ) , i, 1); } catch( Exception e ){}
                    try { tmPesquisa.setValueAt( listR.get(i).getNomeourazaosocial()  , i, 2); } catch( Exception e ){}
                    try { tmPesquisa.setValueAt( listR.get(i).getNomefantasia()       , i, 3); } catch( Exception e ){}
                    try { tmPesquisa.setValueAt( listR.get(i).getNomevendedor()       , i, 4); } catch( Exception e ){}
                    try { tmPesquisa.setValueAt( listR.get(i).getTelefonevendedor()   , i, 5); } catch( Exception e ){}
                    try { tmPesquisa.setValueAt( listR.get(i).getNomesupervisor()     , i, 6); } catch( Exception e ){}
                    try { tmPesquisa.setValueAt( listR.get(i).getTelefonesupervisor() , i, 7); } catch( Exception e ){}
                    
                }
            }    
        } catch( Exception e ){ /*JOPM JOPM = new JOPM( 2, "mostrarLista( List<materias_control.Materia> list2 ), \n"
                + e.getMessage() + "\n", "Tabela_Pesquisa_BD_Usuario" );*/ } 
    }
    /*
    public void mostrarLista2( gestor.Gestordecompras Gestordecompras ){ try {    
        SimpleDateFormat out = new SimpleDateFormat("dd.MM.yyyy");

        int nCols = tmPesquisa.getColumnCount();
        Object[] linha = new Object[nCols] ;  
        
        int i = tmPesquisa.getRowCount();
        
        //System.out.println( "nLinhas - " + i);
        try{ tmPesquisa.getRowCount(); } catch( Exception e ){}
        
        tmPesquisa.addRow( linha ); 

            try { tmPesquisa.setValueAt( Gestordecompras.getId()                 , i, 0); } catch( Exception e ){}
            try { tmPesquisa.setValueAt( out.format( Gestordecompras.getData() ) , i, 1); } catch( Exception e ){}
            try { tmPesquisa.setValueAt( Gestordecompras.getNomeourazaosocial()  , i, 2); } catch( Exception e ){}
            try { tmPesquisa.setValueAt( Gestordecompras.getNomefantasia()       , i, 3); } catch( Exception e ){}
            try { tmPesquisa.setValueAt( Gestordecompras.getNomevendedor()       , i, 4); } catch( Exception e ){}
            try { tmPesquisa.setValueAt( Gestordecompras.getTelefonevendedor()   , i, 5); } catch( Exception e ){}
            try { tmPesquisa.setValueAt( Gestordecompras.getNomesupervisor()     , i, 6); } catch( Exception e ){}
            try { tmPesquisa.setValueAt( Gestordecompras.getTelefonesupervisor() , i, 7); } catch( Exception e ){}
        
        } catch( Exception e ){} 
    }   */
        
    private void tbPesquisaLinhaSelecionada() { 
        
        new Thread() {   @Override public void run() { try { Thread.sleep( 1 ); 
            
            if ( tbPesquisa.getSelectedRow() != -1){
                           
                Menu_Pesquisa.IDSELECIONADA = list.get( tbPesquisa.getSelectedRow() ).getId();
                                
                if( Usuario_Permissoes.booAlterargestordecompras(Usuario_Logado.ID ) == true ) { Menu_Pesquisa.btAlterar.setEnabled(true);  }

                if( Usuario_Permissoes.booExcluirgestordecompras( Usuario_Logado.ID ) == true ) { Menu_Pesquisa.btExcluir    .setEnabled(true); }
                Menu_Pesquisa.btVisualizar.setEnabled(true);
                
                Menu_Pesquisa.btVisualizarImpressao.setVisible( true);
                Menu_Pesquisa.btVisualizarImpressao1.setVisible( true);
            } else{
                      
                Menu_Pesquisa.IDSELECIONADA = -1;  
                
                Menu_Pesquisa.btAlterar   .setEnabled(false);
                Menu_Pesquisa.btExcluir   .setEnabled(false);
                Menu_Pesquisa.btVisualizar.setEnabled(false);
                
                Menu_Pesquisa.btVisualizarImpressao.setVisible( false );
                Menu_Pesquisa.btVisualizarImpressao1.setVisible( false );
            }
            
        } catch( Exception e ){ /*JOPM JOPM = new JOPM( 2, "pesquisa(Query q2), \n"
                + e.getMessage() + "\n", this.getClass().getSimpleName() );*/ } } }.start(); 

    }
            
}
