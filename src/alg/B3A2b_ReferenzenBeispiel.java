/*
 * Gutes Beispiel für Integer Array Referenzen
 * 
 */
package alg;
import AlgoTools.IO;

/**
 *
 * @author User
 */
public class B3A2b_ReferenzenBeispiel {
    
    public static void liesEin(int[] _iWerte){
        
        int i;
    
        for(i=1; i<=_iWerte.length; i++) {       
          IO.println();
          _iWerte[i-1]   = IO.readInt("Wert "+i+": ");
        }
    }
    
    public static void schreibeWas(int[] _iWerte){
        
        for(int i=1; i<=_iWerte.length; i++) {   
          IO.println();
          _iWerte[i-1] += 10 ;
        }
    }
    
     public static void gibAus(int[] _iWerte){
       for(int i=1; i<=_iWerte.length; i++) {    
          IO.println(_iWerte[i-1]);
        }
    }
    
  public static void main(String[] argv) {
    
    int anzahl;                                  
    anzahl = IO.readInt("Anzahl Werte: ? ");
    int[] iWerte = new int[anzahl];
    
    liesEin(iWerte);
    schreibeWas(iWerte);
    gibAus(iWerte);
  }

  
}
