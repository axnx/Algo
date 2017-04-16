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
public class B2A1b {

    public static void main(String[] args) {
    
    char[] kette;                                // Nimmt die Zeichenkette auf
    int index;                                   // indiziert 1 Zeichen in
                                                // der Zeichenkette

    kette = IO.readChars("Bitte Zeichenkette: ");// Einlesen
                                                 // Ausgabe der Laenge
    IO.println("Die Zeichenkette enthaelt "+ kette.length + " Buchstaben!");

    IO.print("Die Zeichenkette lautet: >>>");    // Ausgabe der Zeichenkette
                                                 // FUER jedes Zeichen
    for(index=0; index < kette.length; index++) {
      IO.print(kette[index]);                    // gib es aus
    }

    IO.println("<<<");
    
    //Alternative
    IO.println("Die Zeichenkette '" + String.valueOf(kette) + "' enthaelt "+ kette.length + " Buchstaben!");
        
    }
}
