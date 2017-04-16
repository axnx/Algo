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
public class B2A1d {

  public static void main(String[] argv) {
    char[] kette;                                // Nimmt die Zeichenkette auf
    int index;                                   // indiziert 1 Zeichen in
                                                 // der Zeichenkette
    boolean palindrom=true;      // optimistischer Start

    kette = IO.readChars("Bitte Zeichenkette: ");// Einlesen
                                                 // Ausgabe der Laenge
    IO.println("Die Zeichenkette enthaelt "+ kette.length + " Buchstaben!");

    IO.print("Die Zeichenkette lautet: >>>");    // Ausgabe der Zeichenkette
                                                 // FUER jedes Zeichen
    for(index =0; index < kette.length; index++) {
      IO.print(kette[index]);                    // gib es aus
    }

    IO.println("<<<");

                                                 // Ausgabe Rueckwaerts
    IO.print("Die Zeichenkette lautet rueckwaerts: >>>");
                                                 // Beginnend beim letzten ...
    for(index = kette.length - 1; index >= 0; index--) {
      IO.print(kette[index]);                    // gib jedes Zeichen aus
    }
    
    IO.println("<<<");
    
    for(index=0; index<kette.length; index++) {  // durchlaufe ganze kette
                 // Falls index-tes Zeichen
             // von vorn und von hinten
             // nicht identisch
      if(kette[index]!=kette[kette.length-1-index]) {
        palindrom = false;       // kette ist kein Palindrom
      }
    }
    IO.print("Die Zeichenkette ist ");     // Ausgabe
    if(!palindrom) {         // Falls kein Palindrom
      IO.print("k");         // gib "k" aus
    }
    IO.println("ein Palindrom!");                // gib Wortrest aus

  }
}
