/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alg;
import AlgoTools.IO;

/**
 * Beispiel für Referenzen in Parameteraufrufen gerade bei Array ist vorsicht geboten!
 * @author User
 */
public class FiesePruefung {
 
  public static void berechne2(int c){
      c = 4;
  }
  
  public static void berechne(int[] v, int b){
      v[2] = 3;   
  }
    
  public static void main(String[] argv){
    int a[] = {1,8,7};
    int c = 2;
    berechne(a, a[1]);
    berechne2(9);
    
    IO.println(a[2]);
    IO.println(c);
  }
}
