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
public class B3A1a {
   
  public static int a, b, summe;

  static void liesEin() {
    a = IO.readInt("Bitte die erste Zahl: ");
    b = IO.readInt("Bitte die zweite Zahl: ");
  }

  static void berechneSumme() {
    summe = a+b;
  }

  static void gibAus() {
    IO.println("Summe: "+ summe);
  }

  public static void main(String[] argv) {
    liesEin();
    berechneSumme();
    gibAus();
  }
    
}
