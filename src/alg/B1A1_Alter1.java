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
public class B1A1_Alter1 {

    public static void main(String[] args) {
        short alter; 
        IO.println("Guten Tag");
        alter = IO.readShort("Wie alt sind Sie (in Jahren) ?");
        IO.println("Sie sind " + alter + " Jahre alt!");
    }

}
