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
public class FiesePruefung3 {
 
  public static void main(String[] argv){
    
    //byte[] b = {0x33, 0x44, 0x55};
    int i;
    
    System.out.println(i);
    //IO.println(i);
    /*
    byte b = (byte) 16;
    b = (byte) (b >> 4);
    */
    //byte b = (byte) 256;
    byte b = (byte)0x0F; // 0000 0000 0000 1111  = 15
    b = (byte) (b >> 1); // 0000 0000 0000 0111 = 7
    
    b = (byte) (b << 2);   // 0000 0000 0001 1100 = 28
    //b = (byte) (b >> 4); // 0000 0000 0000 0000
    
    IO.println(b);
  }
}
