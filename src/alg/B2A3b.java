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
public class B2A3b {
   
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

    for(zaehler=1; zaehler <= 9; zaehler++) {    // 9 Zuege durchlaufen
      if(zaehler % 2 != 0) {                     // ungerader Zug? => 'x'
        spieler = X;
      }
      else {                                     // gerader Zug? => 'o'
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
      } while(feld[z-1][s-1] != U);              // bis Feld UNBELEGT  

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
    } // fuer jeden Zug
  }
    
}
