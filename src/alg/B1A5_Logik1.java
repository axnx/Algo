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
public class B1A5_Logik1 {

    public static void main(String[] args) {
        
        boolean einkaufenA, einkaufenB, einkaufenC;
        boolean streit = false;
        
        einkaufenA = IO.readBoolean("Soll Sohn A einkaufen? ");
        einkaufenB = IO.readBoolean("Soll Sohn B einkaufen? ");
        einkaufenC = IO.readBoolean("Soll Sohn C einkaufen? ");
        
//        //Bedingung 1
//        if(!(einkaufenA || einkaufenB || einkaufenC))
//            streit = true;
       
        //Bedingung 2
        if(einkaufenA && !einkaufenB)
            streit = true;
        
//        //Bedingung 3
//        if((einkaufenA && !einkaufenC) || (!einkaufenA && einkaufenC))
//            streit= true;
//        
//        //Bedingung 4
//        if(einkaufenB && einkaufenC)
//            streit = true;
        
        if(streit)
            IO.println("Es gibt Streit!");
        else
            IO.println("Es gibt keinen Streit!");
        
    }
}
