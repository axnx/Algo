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
public class B1A4_Kapital {

    public static void main(String[] args) {
        double kapitalAnfang, kapitalEnde, p;
        int i, t;
        
        kapitalAnfang = IO.readDouble("Anfangskapital ? ");
        p = IO.readDouble("Zinssatz(%) ");
        t = IO.readInt("Laufzeit (Jahre) ? ");
        
        kapitalEnde = kapitalAnfang;
        for(i=1; i<=t; i++){
            // Punkt vor Strichrechnung !
            kapitalEnde *= (1+p/100);
        }
        
        IO.println("Endkapital: " + kapitalEnde);
        
    }
}
