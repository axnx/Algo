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
public class B3A2b {
    
  static char[] liesZeichenfeldEin() {                  
    return (IO.readChars("Zeichenfeld? "));                
  }
  
  static void macheGross(char[] zeichenfeld) {    
    int i;
    for (i=0; i<zeichenfeld.length; i++)         // Zeichenfeld durchlaufen
      if(zeichenfeld[i] >= 'a' && zeichenfeld[i] <='z') {       
                                                 // Buchstaben austauschen
        zeichenfeld[i] = (char)(zeichenfeld[i]-32);  
      }
  }
    
  static void gibZeichenfeldAus(char[] zeichenfeld) {
    IO.print("Ergebnis: ");
    IO.println(zeichenfeld);
  }
  
  public static void main(String[] argv) {
    char[] zeichenfeld1;
    zeichenfeld1 = liesZeichenfeldEin();
    macheGross(zeichenfeld1);
    gibZeichenfeldAus(zeichenfeld1);
  }

  
}
