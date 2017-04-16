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
public class B3A2c {
    
 static char[] liesZeichenfeldEin() {                  
    return (IO.readChars("Zeichenfeld? "));                
  }
  
  static char[] macheGross(char[] zeichenfeld) {
    int i;
    char[] erg = new char[zeichenfeld.length];   // Kopie anlegen
    
    // Zeichenweise kopieren
    for (i=0; i<zeichenfeld.length; i++) {
      // FALLS Kleinbuchstabe
      if(zeichenfeld[i] >= 'a' && zeichenfeld[i] <='z') {       
        // DANN Buchstaben umwandeln
        erg[i] = (char)(zeichenfeld[i]-32);  
      }
      else {
        // SONST ohne Umwandlung kopieren
        erg[i] = zeichenfeld[i];  
      }
    }
    // dabei kleine Buchstaben
    // durch grosse ersetzen
    return erg;
  }
  
  static void gibZeichenfeldAus(char[] zeichenfeld) {
    IO.print("Ergebnis: ");
    IO.println(zeichenfeld);
  }
  
  public static void main(String[] argv) {
    char[] zeichenfeld;
    char[] ergebnis;
    zeichenfeld = liesZeichenfeldEin();
    ergebnis = macheGross(zeichenfeld);
    gibZeichenfeldAus(ergebnis);    
    gibZeichenfeldAus(zeichenfeld);
  }
  
}
