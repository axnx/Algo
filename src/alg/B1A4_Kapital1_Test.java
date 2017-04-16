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
public class B1A4_Kapital1_Test {

    public static void main(String[] args) {
        double zins;
        double kapital = 100;
        double kapitalEnde;
        zins = IO.readDouble("zins:");
        IO.println((1+zins)/100);
        kapitalEnde = kapital * ((1+zins)/100);
        
       
        IO.println("Endkapital: " + kapitalEnde);
        
    }
}
