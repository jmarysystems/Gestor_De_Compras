
package br.com.jmary.home;

import javax.swing.ImageIcon;
import javax.swing.JApplet;
import javax.swing.JFrame;
import javax.swing.JRootPane;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import utilidades_imagens.Imagens;

public class HomeJApplet extends JApplet {
    private static final long serialVersionUID = 1L;

    @Override
    public void init() {

        add( new Home() ); // BorderLayout.CENTER

    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {

            public void run() {
                try {
                    UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
                } catch (Exception e) {}
                
                JFrame frame = new JFrame( "BUENO MESSEJANA GESTOR DE COMPRAS - JMARYSYSTEMS - Suporte: 85 8623.8463", null );                 
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JApplet applet = new HomeJApplet();
        applet.init();
                
        frame.setContentPane( applet.getContentPane() );
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        frame.setIconImage(null);
                
        iconeDoPrograma( frame );
        telaCheia ( frame );

        applet.start();
            }
        });
    }
    
    public static void iniciarJFrame(){
        main(new String [2]);
    }
    
    private static void telaCheia( JFrame frame ) {
        try{ frame.setUndecorated(true);                                    } catch( Exception e ){}
        try{ frame.getRootPane().setWindowDecorationStyle(JRootPane.FRAME); } catch( Exception e ){}
        try{ frame.setExtendedState(JFrame.MAXIMIZED_BOTH);                 } catch( Exception e ){}
    }
    
    /* Início Setando O Ícone do Programa */
    private static void iconeDoPrograma( JFrame frame ) {     
        Class<Imagens> clazzHome = Imagens.class;
        try{ frame.setIconImage(new ImageIcon( clazzHome.getResource("logop.png")).getImage() ); }catch( Exception e ){}      
    }
    /* Fim Setando O Ícone do Programa */

}
