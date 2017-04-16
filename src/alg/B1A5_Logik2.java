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
public class B1A5_Logik2 {

    public static void main(String[] args) {
        
        boolean einkaufenA, einkaufenB, einkaufenC;
        boolean streit = false;
        
        einkaufenA = IO.readBoolean("Soll Sohn A einkaufen? ");
        einkaufenB = IO.readBoolean("Soll Sohn B einkaufen? ");
        einkaufenC = IO.readBoolean("Soll Sohn C einkaufen? ");
        
        //Bedingung 1
        streit = streit || (!(einkaufenA || einkaufenB || einkaufenC));
       
        //Bedingung 2
        streit = streit ||(einkaufenA && !einkaufenB);
        
        //Bedingung 3
        streit = streit ||((einkaufenA && !einkaufenC) || (!einkaufenA && einkaufenC));
        
        //Bedingung 4
        streit = streit ||(einkaufenA && einkaufenB);
        
        if(streit)
            IO.println("Es gibt Streit!");
        else
            IO.println("Es gibt keinen Streit!");
        
    }
}
