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
public class B3A3 {
  
    public static void main(String argv[]) {

        final double MWST_SATZ = 0.19;               // Konstante fuer MwSt-Satz

        int anzahl;                                  // Anzahl Rechnungspositionen

        anzahl = IO.readInt("Anzahl Positionen: ? ");// Anzahl einlesen

        int[] artikelnr = new int[anzahl];           // Feld mit Artikelnummern
        int[] stueckzahl = new int[anzahl];          // Feld mit Stueckzahlen

        liesRechnungEin(artikelnr, stueckzahl);

        gibRechnungAus(artikelnr, stueckzahl, MWST_SATZ);

    }

  static void liesRechnungEin(int[] artikelnr,
                               int[] stueckzahl) {

    int i;
    
    for(i=1; i<=artikelnr.length; i++) {       // einzelne Positionen lesen
      IO.println();
                                                 // Artikelnummer lesen
      artikelnr[i-1]   = IO.readInt("Artikelnr. zu Position "+i+": ");
                                                 // Stueckzahl lesen
      stueckzahl[i-1]  = IO.readInt("Stueckzahl zu Position "+i+": ");

    }
    
  }
  
  static void gibRechnungAus(int[] artikelnr,
                              int[] stueckzahl,
                              double mwstSatz) {
    
    double[] positionen;                         // Feld mit Positionen
    double zwischensumme, rabatt, nettobetrag, bruttobetrag, mwst;
    int i;
    
    positionen = ermittleRechnungspositionen(artikelnr, stueckzahl);
    
    IO.println();                                // Kopf
    IO.println("Rechnung des Einzelhaendlers Meier");
    IO.println();
    IO.println("Lfd.    Artikel-     Einzel-");
    IO.println("Nr.     nummer       preis      Anzahl     Betrag");
    IO.println();

    zwischensumme = 0.0;
    for (i=0; i<artikelnr.length; i++) {         // FUER alle Positionen
      zwischensumme+=positionen[i];
      IO.print(i+1,3);                           // Gib Positionsnummer,
      IO.print(artikelnr[i],12);                 // Artikelnummer,
                                                 // Einzelpreis auf 2 Stellen,
      IO.print(ermittleEinzelpreis(artikelnr[i]-1),12,2);
      IO.print(stueckzahl[i],10);                // Stueckzahl,
      IO.println(positionen[i], 12,2);           // und Betrag fuer diese  
                                                 // Position aus.
    }

    rabatt = ermittleRabatt(zwischensumme);
    nettobetrag = zwischensumme - rabatt;        // Abziehen
    mwst = nettobetrag * mwstSatz;               // MwSt. berechnen
    bruttobetrag = nettobetrag + mwst;           // dazuzaehlen

    IO.println("__________________________________________________");
    IO.println();
    IO.print("Zwischensumme                          ");
    IO.println(zwischensumme,10,2);
    IO.print("- Rabatt                               ");
    IO.println(rabatt,10,2);
    IO.print("Rechnungsbetrag (Netto)                ");
    IO.println(nettobetrag,10,2);
    IO.print("+ Mehrwertsteuer                       ");
    IO.println(mwst,10,2);
    IO.print("Rechnungsbetrag (Brutto)               ");
    IO.println(bruttobetrag,10,2);
  
  }
  
  static double[] ermittleRechnungspositionen(int[] artikelnr,
                                              int[] stueckzahl) {
                                                
                                                 // Array anlegen
    double[] positionen = new double[artikelnr.length];
    int i;
    
    for(i=1; i<=artikelnr.length; i++)         // Positionen berechnen
      positionen[i-1]  = ermittleEinzelpreis(artikelnr[i-1]-1) * 
                         stueckzahl[i-1];

    return positionen;
    
  }

  static double ermittleEinzelpreis(int artNr) {
                                                 // Feld mit den Preisen nach
                                                 // Artikelnummern geordnet:
           // Artikelnummer      1     2      3     4      5
    double[] einzelpreis = {8.99, 5.86, 17.50, 2.11, 21.34};
    return einzelpreis[artNr];
  }  
    
  static double ermittleRabatt(double zwischensumme) {
      
    final double RABATT_1  = 0.03;               // 1. Rabattsatz
    final double RABATT_2  = 0.05;               // 2. Rabattsatz
      
    if (zwischensumme <= 500.0)                  // Rabatt gewaehren?
      return 0.0;
    else if (zwischensumme <= 1000.0)
      return (zwischensumme * RABATT_1);
    else
      return (zwischensumme * RABATT_2);
   
  }

}
