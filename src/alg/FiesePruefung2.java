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
public class FiesePruefung2 {
 
  public static void main(String[] argv){
    
    double d = 4.12345f;
    IO.println(d);
    
    //float f = (float)4.12345;
    float f = 4.12345; //richtig oder falsch ?
    IO.println(f);
    
    //char abc = "abc"
    char[] abc = {'a','b','c','d'};
    
    //wie oft läuft die Schleife ?
    int a = 1;
    for (int i1=2; a<100; a++){ 
        IO.println(a);
    }
  }
}
