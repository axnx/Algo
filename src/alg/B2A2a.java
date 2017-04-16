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
public class B2A2a {
    
   public static void main(String argv[]) {

    final double MWST_SATZ = 0.19;               // Konstante fuer MwSt-Satz
    final double RABATT_1  = 0.03;               // 1. Rabattsatz
    final double RABATT_2  = 0.05;               // 2. Rabattsatz

    double zwischensumme, rabatt, nettobetrag, bruttobetrag, mwst;
    int i;
    int anzahl;                                  // Anzahl Rechnungspositionen
    double[] positionen;                         // Feld m. Rechnungspositionen

    anzahl = IO.readInt("Anzahl Positionen: ? ");// Anzahl einlesen

    positionen = new double[anzahl];             // passendes Feld anlegen

    for(i=1; i<=anzahl; i++) {                    // einzelne Positionen lesen
      positionen[i-1] = IO.readDouble("Rechnungsposition Nr. "+i+": ");
    }

    IO.println();                                // Kopf
    IO.println("Rechnung des Einzelhaendlers Meier");
    IO.println();

    zwischensumme = 0.0;                         // bisher null Betraege
    for (i=0; i<anzahl; i++) {                   // FUER alle Positionen
      zwischensumme += positionen[i];            // addiere akt. Positionen
      IO.print("Position ");                     // Rechnungszeile in 3 
      IO.print(i+1,2);                           // Schritten ausgeben
      IO.println("             : " + positionen[i]);
      
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
    IO.println ("Zwischensumme           : " + zwischensumme);
    IO.println ("- Rabatt                : " + rabatt);
    IO.println ("Rechnungsbetrag (Netto) : " + nettobetrag);
    IO.println ("+ Mehrwertsteuer        : " + mwst);
    IO.println ("Rechnungsbetrag (Brutto): " + bruttobetrag);

  } 
}
