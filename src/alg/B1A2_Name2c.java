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
public class B1A2_Name2c {

    public static void main(String[] args) {
        int i;
        boolean nochmal;
        do {
            IO.println(" Holger");
            // readBoolean nimmt folgende werte an t,f, y,n j,n, yes,no , ja, nein true, false
            nochmal = IO.readBoolean("nochmal? ");
        } while(nochmal);

    }
}
