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
public class B3A_Einführung {
  
   static void ausgabe() {                        // ohne R=FCckgabewert
    IO.println("Ich bin eine Methode!");         // ohne Parameter
  }
  
  static void ausgabe(int anzahl) {              // mit Parameter
    int i=1;                                     // ohne R=FCckgabewert
    for (i=1; i<=anzahl; i++)
      ausgabe();
  }
  
  static float summe(float a, float b) {         // mit Parameter
    return (a+b);                                // mit R=FCckgabewert
  }
  
  static double maximum(double a, double b) {    // mit Parameter
    if (a>b)                                     // mit R=FCckgabewert
      return a;
    else
      return b;
  }

  static int maximum(int a, int b) {             // mit Parameter
    if (a>b)                                     // mit R=FCckgabewert
      return a;
    else
      return b;
  }
  
  public static void main(String[] argv) {       // kleines Hauptprogramm
    float sum;
    double doubleMax;                            // zum Test
    int intMax;
    ausgabe();
    ausgabe(4);
    sum = summe(10.3f, 24.5f);
    doubleMax = maximum(10.3f, 4.6f);
    IO.println("Summe     : "+sum);
    IO.println("MaxDouble  : "+doubleMax);
    intMax = maximum(3,5);
    IO.println("MaxInt    : "+intMax);
  }

}
