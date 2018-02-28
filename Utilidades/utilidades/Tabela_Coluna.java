/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package utilidades;

import javax.swing.ImageIcon;
import javax.swing.table.DefaultTableCellRenderer;

/**
 *
 * @author Cleilson
 */
public class Tabela_Coluna extends DefaultTableCellRenderer {

    public Tabela_Coluna(Object value) {
	if (value instanceof ImageIcon) {
            if (value != null) {
                ImageIcon d = (ImageIcon) value;
                setIcon(d);
                setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
            } else {
                setText("");
                setIcon(null);
            }
        } else {
            super.setValue(value);
        }
  }




}
