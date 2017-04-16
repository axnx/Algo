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
public class B2A3c {
   
   public static void main(String argv[]) {

    final char X = 'x';                          // Zeichen fuer 1. Spieler
    final char O = 'o';                          // Zeichen fuer 2. Spieler
    final char U = ' ';                          // unbelegtes Feld

    char spieler;                                // aktueller Spieler

                                                 // 3x3 Spielfeld gefuellt mit
                                                 // Leerzeichen
    char[][] feld = {{ U, U, U}, {U, U, U},{U, U, U}};

    int zaehler;                                 // Zaehlt die Zuege 1-9
    int z;                                       // Zeilenindex
    int s;                                       // Spaltenindex
 
    IO.println("   1 2 3");                      // Leeres Spielfeld ausgeben
    IO.println("  +-+-+-+");
    for(z=0; z<3; z++) {
      IO.print((z+1) +" ");
      for(s=0; s<3; s++) {
        IO.print("|"+feld[z][s]);
      }
      IO.println("|");
      IO.println("  +-+-+-+");
    }

    for(zaehler=0; zaehler < 9; zaehler++) {     // 9 Zuege durchlaufen
      if(zaehler % 2 == 0) {                     // gerader Zug? => 'x'
        spieler = X;
      }
      else {                                     // ungerader Zug? => 'o'
        spieler = O;
      }
     
      IO.println("Spieler "+spieler+" ist dran:");

      do {                                       // leeres Feld erzwingen
        IO.println("Bitte waehlen Sie ein leeres Feld!");
        do{                                      // sinnvolle Zeile erzwingen
          z = IO.readInt("Zeile  (1-3)? ");
        } while((z < 1) || (z > 3));

        do{                                      // sinnvolle Zeile erzwingen
          s = IO.readInt("Spalte (1-3)? ");
        } while((s < 1) || (s > 3));
      } while(feld[z-1][s-1] != U);              // SOLANGE Feld nicht leer

      feld[z-1][s-1] = spieler;                  // Wert im Feld setzen

      IO.println("   1 2 3");                    // aktuellen Zustand ausgeben
      IO.println("  +-+-+-+");
      for(z=0; z<3; z++) {
        IO.print((z+1) +" ");
        for(s=0; s<3; s++) {
          IO.print("|"+feld[z][s]);
        }
        IO.println("|");
        IO.println("  +-+-+-+");
      } // fuer jede Zeile
                                                 // Alle Kombinationen testen
      for(z=0; z<3; z++) {                       // 3 gleiche in einer Zeile?
        if((feld[z][0] != U) &&                  // dreimal ' ' vermeiden
           (feld[z][0] == feld[z][1]) &&         // 1. = 2. Spalte?
           (feld[z][1] == feld[z][2])) {         // 2. = 3. Spalte?
          IO.println("Spieler "+feld[z][0]+" hat gewonnen!");
          zaehler = 10;                          // Schleife fuer Zuege beenden
        }
      }

      for(s=0; s<3; s++) {                       // 3 gleiche in einer Spalte?
        if((feld[0][s] != U) &&                  // dreimal ' ' vermeiden
           (feld[0][s] == feld[1][s]) &&         // 1. = 2. Zeile?
           (feld[1][s] == feld[2][s])) {         // 2. = 3. Zeile?
          IO.println("Spieler "+feld[0][s]+" hat gewonnen!");
          zaehler = 10;                          // Schleife fuer Zuege beenden
        }
      }
                                                 // Hauptdiagonale
      if((feld[0][0] != U) &&                    // dreimal ' ' vermeiden
         (feld[0][0] == feld[1][1]) &&           // links oben = mitte?
         (feld[1][1] == feld[2][2])) {           // mitte = rechts unten?
        IO.println("Spieler "+feld[0][0]+" hat gewonnen!");
        zaehler = 10;                            // Schleife fuer Zuege beenden
      }
                                                 // Nebendiagonale
      if((feld[2][0] != U) &&                    // dreimal ' ' vermeiden
         (feld[2][0] == feld[1][1]) &&           // oben rechts = mitte?
	 (feld[1][1] == feld[0][2])) {           // mitte = links unten?
        IO.println("Spieler "+feld[2][0]+" hat gewonnen!");
        zaehler = 10;                            // Schleife fuer Zuege beenden
      }
    } // fuer jeden Zug
    if(zaehler == 9)
      IO.println("unentschieden!");
  }
    
}
