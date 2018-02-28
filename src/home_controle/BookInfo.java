/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package home_controle;

import java.net.URL;

/**
 *
 * @author AnaMariana
 */
public class BookInfo {
    
        public String bookName;
        public URL bookURL;
        public String bookImprimir; 
        
        public String treeRoot;
        public String treePastaNoExpande;
        public String treePastaExpande;
        public String treeNod;
        public String tree1Nod;

        public BookInfo(String nomeDeExibição, String filename, String root, String pastaNoExpande, String pastaExpande, String nod, String nodTree1 ) {
            bookName = nomeDeExibição;
            bookURL = getClass().getResource(filename);
            bookImprimir = filename;
            
            treeRoot = root;
            treePastaNoExpande = pastaNoExpande;
            treePastaExpande = pastaExpande;
            treeNod = nod;
            tree1Nod = nodTree1;
            
            if (bookURL == null) {
                System.err.println("Não foi possível encontrar o arquivo: "
                                   + filename);
            }
        }
        
        @Override
        public String toString() {
            return bookName;
        }

}
