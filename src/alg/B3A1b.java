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
public class B3A1b {
   
    static int[] liesEin(int n) {
    int[] a = new int[n];
    int i;
    for (i=0; i < n ; i++) {
      a[i] = IO.readInt("Bitte die "+(i+1)+". Zahl: ");
    } // end of for
    return a;
  }
  
  static int berechneSumme(int a[]) {
    int i;
    int summe=0;
    for (i=0; i<a.length; i++) {
      summe = summe + a[i];
    } // end of for
    return summe;
  }
  
  static void gibAus(int a) {
    IO.println("Summe: "+ a);
  }
  
  public static void main(String[] argv) {
    // die kürzeste Formulierung von Main lautet folgendermaßen:
    gibAus(berechneSumme(liesEin(2)));
  }
  
    
}
