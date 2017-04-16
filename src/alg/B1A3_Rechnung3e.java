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
public class B1A3_Rechnung3e {

    public static void main(String[] args) {
        
        //Konstanten können später nicht geändert werden
        final double MWST_SATZ = 0.19; 
        final double RABATT_1 = 0.03; 
        final double RABATT_2 = 0.05; 
        
        double nettobetrag, bruttobetrag, mwst, zwischensumme, rabatt, betrag;
        int i, anzahl;
        
        anzahl = IO.readInt("Anzahl Positionen: ? ");
        zwischensumme = 0.0;
        betrag = IO.readDouble("Betrag Rechnungsposition ? ");
        zwischensumme += betrag;
        
        for(i=1; i<anzahl; i++){
            betrag = IO.readDouble("Betrag Rechnungsposition ? ");  
            zwischensumme += betrag;
        }
        
        if(zwischensumme <= 500.0)
            rabatt = 0;
        else
            if (zwischensumme <= 1000.0)
                rabatt = zwischensumme * RABATT_1;
            else 
                rabatt = zwischensumme * RABATT_2;
        
        nettobetrag = zwischensumme - rabatt;
        mwst = nettobetrag * MWST_SATZ;
        bruttobetrag = nettobetrag + mwst;
        
        IO.println("Zwischensumme           : " + zwischensumme);
        IO.println("-Rabatt                 : " + rabatt);
        IO.println("Rechnungsbetrag (Netto) : " + nettobetrag);
        IO.println("+ Mehrwertsteuer        : " + mwst);
        IO.println("Rechnungsbetrag (Brutto): " + bruttobetrag);

    }
}
