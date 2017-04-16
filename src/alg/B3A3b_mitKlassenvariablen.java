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
public class B3A3b_mitKlassenvariablen {
  
  static final double MWST_SATZ = 0.19;               // Konstante fuer MwSt-Satz
  static final double RABATT_1  = 0.03;               // 1. Rabattsatz
  static final double RABATT_2  = 0.05;               // 2. Rabattsatz
  
  // Feld mit den Preisen nach
  // Artikelnummern geordnet:
  // Artikelnummer                1     2      3     4      5
  static double[] einzelpreis = {8.99, 5.86, 17.50, 2.11, 21.34};
  
  static double[] positionen;                         // Feld m. Rechnungspositionen
  static int[] artikelnr;                             // Feld mit Artikelnummern
  static int[] stueckzahl;                            // Feld mit Stueckzahlen
  
  public static void eingabe() {
    int anzahl;                                  // Anzahl Rechnungspositionen
    
    anzahl = IO.readInt("Anzahl Positionen: ? ");// Anzahl einlesen
    
    positionen  = new double[anzahl];            // passendes Feld anlegen
    artikelnr   = new int[anzahl];               // passendes Feld anlegen
    stueckzahl  = new int[anzahl];               // passendes Feld anlegen
    
    int i;
    
    for(i=1; i<=anzahl; i++) {                    // einzelne Positionen lesen
      IO.println();
      // Artikelnummer lesen
      artikelnr[i-1]   = IO.readInt("Artikelnr. zu Position "+i+": ");
      // Stueckzahl lesen
      stueckzahl[i-1]  = IO.readInt("Stueckzahl zu Position "+i+": ");
      
      // Arrayindizes beginnen
      // bei Null!
      positionen[i-1]  = einzelpreis[artikelnr[i-1]-1] * stueckzahl[i-1];
    }
  }
  
  public static double zwischensumme() {
    int i;
    double zwischensumme = 0.0;                  // bisher null Betraege
    
    int anzahl = positionen.length;
    
    for (i=0; i<anzahl; i++) {                   // FUER alle Positionen
      zwischensumme += positionen[i];            // addiere akt. Positionen
    }
    
    return zwischensumme;
  }
  
  public static double rabatt(double zwischensumme) {
    double rabatt;
    
    if (zwischensumme <= 500.0)                  // Rabatt gewaehren?
        rabatt = 0.0;
    else if (zwischensumme <= 1000.0)
        rabatt = zwischensumme * RABATT_1;
    else
        rabatt = zwischensumme * RABATT_2;
    
    return rabatt;
  }
  
  public static void ausgabeKopf() {
    IO.println();                                // Kopf
    IO.println("Rechnung des Einzelhaendlers Meier");
    IO.println();
    IO.println("Lfd.    Artikel-     Einzel-");
    IO.println("Nr.     nummer       preis      Anzahl     Betrag");
    IO.println();    
  } 
  
  public static void ausgabePositionen() {
    int i;    
    int anzahl = positionen.length;
    
    for (i=0; i<anzahl; i++) {                   // FUER alle Positionen
      IO.print(i+1,3);                           // Gib Positionsnummer,
      IO.print(artikelnr[i],12);                 // Artikelnummer,
      IO.print(einzelpreis[artikelnr[i]-1],12,2);// Einzelpreis auf 2 Stellen,
      IO.print(stueckzahl[i],10);                // Stueckzahl,
      IO.println(positionen[i], 12,2);           // und Betrag fuer diese 
      // Position aus.
    }
  }
  
  
  public static void ausgabe(double z, double r, double n, double m, double b) {
    ausgabeKopf();
    ausgabePositionen();
    
    // Schlussausgabe
    IO.println("__________________________________________________");
    IO.println();
    IO.print("Zwischensumme                          ");
    IO.println(z,10,2);
    IO.print("- Rabatt                               ");
    IO.println(r,10,2);
    IO.print("Rechnungsbetrag (Netto)                ");
    IO.println(n,10,2);
    IO.print("+ Mehrwertsteuer                       ");
    IO.println(m,10,2);
    IO.print("Rechnungsbetrag (Brutto)               ");
    IO.println(b,10,2);
    
  }
  
  public static void main(String argv[]) {
    double zwischensumme, rabatt, nettobetrag, bruttobetrag, mwst;
    
    eingabe();
              
    zwischensumme = zwischensumme();
    rabatt = rabatt(zwischensumme);
    nettobetrag = zwischensumme - rabatt;        // Abziehen
    mwst = nettobetrag * MWST_SATZ;              // MwSt. berechnen
    bruttobetrag = nettobetrag + mwst;           // dazuzaehlen
    
    ausgabe(zwischensumme, rabatt, nettobetrag, mwst, bruttobetrag);    
    
  }

}
