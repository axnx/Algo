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
public class B1A3_Rechnung3a {

    public static void main(String[] args) {
        
        final double MWST_SATZ = 0.19;
        double nettobetrag, bruttobetrag, mwst;
        
        nettobetrag = IO.readDouble("Rechnungsbetrag (Netto) = ");
        
        mwst = nettobetrag * MWST_SATZ;
        bruttobetrag = nettobetrag + mwst;
        
        IO.println("Mehrwertsteuer: " + mwst);
        IO.println("Rechnungsbetrag (Brutto) " + bruttobetrag);

    }
}
