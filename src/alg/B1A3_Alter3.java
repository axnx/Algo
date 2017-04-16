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
public class B1A3_Alter3 {

    public static void main(String[] args) {
        short alter; 
        char geschlecht;
        
        //Begrüssung asugeben
        IO.println("Guten Tag");
        
        //Alter und Geschlecht einlesen
        alter = IO.readShort("Wie alt sind Sie (in Jahren) ?");
        geschlecht = IO.readChar("Was ist ihr Geschlecht (m/w)?");
        
        IO.println("Sie sind " + alter + " Jahre alt!");
        
        //Entscheidung über Status treffen
        //Flass der USer ein kleines m oder ein großes M eingegeben hat 
        // und mindestens 65 ist, ...
        if( ((geschlecht=='m') || (geschlecht=='M')) && (alter >= 65)){
            //... DANN erfolgt die passende Ausgabe
            IO.println("Sie sind Rentner!");
        }
        if((geschlecht=='w') && (alter >= 60)) {
            IO.println("Sie sind Rentnerin");
        }
        
    }

}
