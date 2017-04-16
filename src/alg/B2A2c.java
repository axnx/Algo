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
public class B2A2c {
   
    public static void main(String argv[]) {

        final double MWST_SATZ = 0.19;               // Konstante fuer MwSt-Satz
        final double RABATT_1  = 0.03;               // 1. Rabattsatz
        final double RABATT_2  = 0.05;               // 2. Rabattsatz

        double zwischensumme, rabatt, nettobetrag, bruttobetrag, mwst;
        int i;
        int anzahl;                                  // Anzahl Rechnungspositionen
        double[] positionen;                         // Feld m. Rechnungspositionen
        int[] artikelnr;                             // Feld mit Artikelnummern
        int[] stueckzahl;                            // Feld mit Stueckzahlen
        double[] einzelpreis;                        // Feld mit Preisen pro Stueck

        anzahl = IO.readInt("Anzahl Positionen: ? ");// Anzahl einlesen

        positionen = new double[anzahl];             // passendes Feld anlegen
        einzelpreis = new double[anzahl];            // passendes Feld anlegen
        artikelnr = new int[anzahl];                 // passendes Feld anlegen
        stueckzahl = new int[anzahl];                // passendes Feld anlegen

        for(i=1; i<=anzahl; i++) {                    // einzelne Positionen lesen
          IO.println();
          artikelnr[i-1] = IO.readInt("Artikelnr. zu Position "+i+": ");
          einzelpreis[i-1] = IO.readDouble("Einzelpreis zu Position "+i+": ");
          stueckzahl[i-1] = IO.readInt("Stueckzahl zu Position "+i+": ");
          positionen[i-1] = einzelpreis[i-1]*stueckzahl[i-1];
        }

        IO.println();                                // Kopf
        IO.println("Rechnung des Einzelhaendlers Meier");
        IO.println();
        IO.println("Lfd.    Artikel-     Einzel-");
        IO.println("Nr.     nummer       preis      Anzahl     Betrag");
        IO.println();

        zwischensumme = 0.0;                         // bisher null Betraege
        for (i=0; i<anzahl; i++) {                   // FUER alle Positionen
          zwischensumme += positionen[i];            // addiere akt. Positionen
          IO.print(i+1,3);                           // Gib Positionsnummer,
          IO.print(artikelnr[i],12);                 // Artikelnummer,
          IO.print(einzelpreis[i],12,2);             // Einzelpreis auf 2 Stellen,
          IO.print(stueckzahl[i],10);                // Stueckzahl,
          IO.println(positionen[i], 12,2);           // und Betrag fuer diese 
                                                     // Position aus.
        }

        if (zwischensumme <= 500.0)                  // Rabatt gewaehren?
          rabatt = 0.0;
        else if (zwischensumme <= 1000.0)
          rabatt = zwischensumme * RABATT_1;
        else
          rabatt = zwischensumme * RABATT_2;
        nettobetrag = zwischensumme - rabatt;        // Abziehen

        mwst = nettobetrag * MWST_SATZ;              // MwSt. berechnen
        bruttobetrag = nettobetrag + mwst;           // dazuzaehlen


                                                     // Schlussausgabe
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
}
