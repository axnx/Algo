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
public class B1A2_Name2b {

    public static void main(String[] args) {
        int i, max;
        max = IO.readInt("Wie oft soll ihr Name ausgegeben werden?");
        for(i = 1; i <= max; i++ ){
            IO.println(i + " Holger");
        }
    }

}
