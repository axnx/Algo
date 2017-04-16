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
public class B3A_F {
  
  public static int f;                    // klassenbezogene Variable f

  public static void f(){                 // Klassenmethode f (ohne Parameter)  
    f = 42;                               // referiert klassenbezogene Variable
  }
  
  public static int f(int n) {            // Klassenmethode f (1 Prameter)
    int f=1;                              // lokale Variable f
                                          // verdeckt klassenbezogenes f 
    for (int i=1; i<=n; i++) f = f*i;     // berechnet Fakultaet 
    return f;
  }

  public static int f(int x, int y){      // Klassenmethode f (2 Parameter)
    while (x != y)                        // berechnet ggt von x und y
      if (x>y) x = x-y; else y=y-x; 
    return x;
  }

  public static void setze(int k){        // Klassenmethode setze
    f = k;
  }
  
  public static int hole() {              // Klassenmethode hole
    return f;
  }

  public static void main(String[] argv){
    int f=5;                              // lokale Varibale f
    f();                                  // Aufruf von f ohne Parameter
    f = f(f);                             // Aufruf von f mit 1 Parameter
    f = f(f,f);                           // Aufruf von f mit 2 Parametern
    setze(45);                            // deponiere in Klassenvariable 
    IO.println(hole());                   // hole von Klassenvariable
  }
}
