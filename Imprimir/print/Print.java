/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package print;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.Shape;
import java.awt.print.PageFormat;
import java.awt.print.Printable;
import java.awt.print.PrinterJob;
import javax.print.attribute.PrintRequestAttributeSet;
import javax.swing.JEditorPane;
import javax.swing.text.View;
import utilidades.JOPM;

/**
 *
 * @author i
 */
public class Print implements Printable {
    PrinterJob pJob2;
    PrintRequestAttributeSet aset2;
    
    protected JEditorPane jeditorPane;
    protected int         páginaCorrente = -1;
    protected double      páginaFinalY   = 0;                
    protected double      páginaInicialY = 0;

    public Print( JEditorPane pane, PrinterJob pJob, PrintRequestAttributeSet aset ) { try { 
        
        this.pJob2       = pJob; 
        this.aset2       = aset; 
        this.jeditorPane = pane;                

    } catch( Exception e ){ e.printStackTrace(); JOPM JOPM = new JOPM( 2, "Imprimir( JEditorPane pane, PrinterJob pJob, PrintRequestAttributeSet aset, boolean boo, String nomeDoc ), \n"+ e.getMessage() + "\n", this.getClass().getSimpleName() ); } /*} }.start();*/ }
    
    @Override
    public int print( Graphics graphics, PageFormat pFormat, int pageIndex ) {  //System.out.println( pageIndex );
        try{ 
            pFormat = pJob2.getPageFormat( aset2 );
            /*pFormat.setPaper( Imprimir.papertamanhoDoPapelEMargens );*/ } catch ( Exception e ) {} //System.out.println( margemSuperior + " - " + margemEsquerda + " - " + tmPapelMenosMargemDireita+ " - " + tmPapelMenosMargemInferior+ " - " +tamanhoPapelHorizontal + " - " + tamanhoPapelVertical );
        
        double escala = 1;
        Graphics2D graphics2D = (Graphics2D) graphics;                                          
        //jeditorPane.setSize( (int) tmPapelMenosMargemDireita, ( int ) tmPapelMenosMargemInferior ); 
    
        if ( jeditorPane.getMinimumSize().getWidth() > Imprimir.tmPapelMenosMargemDireita ) {      // Se a Largura Não Couber Na Folha Muda A Escala            
            escala = Imprimir.tmPapelMenosMargemDireita / jeditorPane.getMinimumSize().getWidth(); 
            graphics2D.scale( escala, escala );
        }

        graphics2D.setClip((int) ( Imprimir.margemEsquerda / escala ), (int) ( Imprimir.margemSuperior / escala),  
                (int) ( Imprimir.tmPapelMenosMargemDireita / escala ), (int) ( Imprimir.tmPapelMenosMargemInferior / escala ) );
    
        if ( pageIndex > páginaCorrente) { 
            páginaCorrente = pageIndex;
            páginaInicialY += páginaFinalY;
            páginaFinalY = graphics2D.getClipBounds().getHeight();
        }

        graphics2D.translate( graphics2D.getClipBounds().getX(), graphics2D.getClipBounds().getY() );
        Rectangle allocation = new Rectangle( 0, (int) -páginaInicialY, (int) ( jeditorPane.getMinimumSize().getWidth() ),
                (int) ( jeditorPane.getPreferredSize().getHeight()));
        View rootView = jeditorPane.getUI().getRootView( jeditorPane );
    
        if ( printView( graphics2D, allocation, rootView ) ) {  
            return Printable.PAGE_EXISTS;
        }
        else {
            páginaInicialY = 0;
            páginaFinalY = 0;
            páginaCorrente = -1;
            return Printable.NO_SUCH_PAGE;
        }
    
  }

  protected boolean printView( Graphics2D graphics2D, Shape allocation, View view) { 
      boolean pageExists = false;
      Rectangle clipRectangle = graphics2D.getClipBounds(); 
      Shape childAllocation;
      View childView;
 
      if ( view.getViewCount() > 0 && !view.getElement().getName().equalsIgnoreCase("td") ) {
          
          for ( int i = 0; i < view.getViewCount(); i++ ) {                                           
              childAllocation = view.getChildAllocation( i, allocation );  
              if ( childAllocation != null ) {
                  childView = view.getView( i ); 
                  if ( printView( graphics2D, childAllocation, childView ) ) {
                      
                      pageExists = true; 
                  }
              }
          }
      } else { 

          if ( allocation.getBounds().getMaxY() >= clipRectangle.getY() ) {
              
              
              if ( (allocation.getBounds().getHeight() > clipRectangle.getHeight() ) && ( allocation.intersects( clipRectangle ) ) ) {
                  view.paint(graphics2D,allocation);
                  pageExists = true; //System.out.println( cont++ );
              } else {
                  
                  if (allocation.getBounds().getY() >= clipRectangle.getY()) {
                      if (allocation.getBounds().getMaxY() <= clipRectangle.getMaxY()) {
                          view.paint(graphics2D,allocation);
                          pageExists = true; 
                      } else {

                          if (allocation.getBounds().getY() < páginaFinalY) {
                              páginaFinalY = allocation.getBounds().getY(); 
                              pageExists = true; 
                          }
                      }
                  }
              }
          }
      }
    return pageExists;
  }

    
}
