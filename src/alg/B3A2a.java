/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alg;
import AlgoTools.IO;

/**
 *
 * @author User
 */
public class B3A2a {
   
   public static void main(String[] argv) {
    char[] zeichenfeld;
    char zeichen;
    zeichenfeld = liesZeichenfeldEin();
    zeichen = ermittleGroesstesZeichen(zeichenfeld);
    gibGroesstesZeichenAus(zeichen);
  }
  
  static char[] liesZeichenfeldEin() {                  
    return (IO.readChars("Zeichenfeld? "));                
  }
  
  static char ermittleGroesstesZeichen(char[] zeichenfeld) {
    char maxZeichen;
    int i;
    maxZeichen = zeichenfeld[0];
    
    for (i=1; i<zeichenfeld.length; i++)         // Zeichenfeld durchlaufen
        if (zeichenfeld[i]>maxZeichen)
            maxZeichen = zeichenfeld[i];
    
    return maxZeichen;                           // groesstes Zeichen
  }                                              // zurueckgeben
  
  static void gibGroesstesZeichenAus(char c) {
    IO.println("Groesstes Zeichen: "+c);
  }
  
  
}
