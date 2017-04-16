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
public class B2A1a {

    public static void main(String[] args) {
    
        // nimmt die Zeichenkette auf
        char[] kette; 
        // Einlesen
        kette = IO.readChars("Bitte Zeichenkette: ");
        // Ausgabe
        IO.println("Die Zeichenkette enthaelt "+ kette.length + " Buchstaben!");
        
    }
}
