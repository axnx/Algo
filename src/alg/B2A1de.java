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
public class B2A1de {
    
    public static void main(String[] argv) {
                                                 // Feld mit Alphabet
    char[] alphabet = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j',
                       'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't',
                       'u', 'v', 'w', 'x', 'y', 'z'};
    int alpha_idx;                               // indiziert die Buchstaben
                                                 // des Alphabets
    int anzahl;                                  // Haeufigkeit akt. Buchst.

    char[] kette;                                // Nimmt die Zeichenkette auf
    int kette_idx;                               // indiziert 1 Zeichen in
                                                 // der Zeichenkette

    kette = IO.readChars("Bitte Zeichenkette: ");// Einlesen
                                                 // Ausgabe der Laenge
    IO.println("Die Zeichenkette enthaelt "+ kette.length + " Buchstaben!");

    IO.print("Die Zeichenkette lautet: >>>");    // Ausgabe der Zeichenkette
                                                 // FUER jedes Zeichen
    for(kette_idx =0; kette_idx < kette.length; kette_idx++) {
      IO.print(kette[kette_idx]);                // gib es aus
    }

    IO.println("<<<");

                                                 // Ausgabe Rueckwaerts
    IO.print("Die Zeichenkette lautet rueckwaerts: >>>");
                                                 // Beginnend beim letzten ...
    for(kette_idx = kette.length - 1; kette_idx >= 0; kette_idx--) {
      IO.print(kette[kette_idx]);                // gib jedes Zeichen aus
    }

    IO.println("<<<");

    IO.println("Buchstabenhaeufigkeit:");        // Haeufigkeit jedes Buchsta-
                                                 // bens im Alphabet ermitteln
    for(alpha_idx =0; alpha_idx < 26; alpha_idx++) {
      anzahl = 0;                                // Buchstabe kommt zunaechst 
                                                 // Null Mal vor.
                                                 // Durch kette laufen...
      for(kette_idx = 0; kette_idx < kette.length; kette_idx++) {
                                                 // ... und vergleichen
        if(kette[kette_idx] == alphabet[alpha_idx]) {
          anzahl ++;                             // identisch: Anzahl erhoehen
        }
      } 

      if(anzahl != 0) {                          // Kommt akt. Buchstabe vor?
                                                 // Wenn ja: Ausgabe
        IO.print("Der Buchstabe " + alphabet[alpha_idx]);
        IO.println(" kam " + anzahl + " Mal vor.");
      }
    } // Fuer jeden Buchstaben des Alphabets
  }
  
}
