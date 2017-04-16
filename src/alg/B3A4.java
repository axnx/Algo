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
public class B3A4 {
  
 public static void main (String [] argv) {
    
    int[] a;                                         // Feld fuer Zahlenfolge
    int x, position;
    
    a = IO.readInts("Bitte sortierte Zahlenfolge: ");// suche in sortierter Folge
    x = IO.readInt ("Bitte zu suchende Zahl:      ");// ein bestimmtes Element 
    
    position = binSearch(a, x, 0, a.length-1);
    
    if (position == -1) {
      IO.println("Nicht gefunden");// gib Ergebnis bekannt
    }
    else {
      IO.println("Gefunden an Position " + position);
    }
  }

  public static int binSearch(int[] a, int x, int links, int rechts) {
    int mitte = (links+rechts)/2;
    
    if(links > rechts) {
      return -1;
    }
    else {
      if(a[mitte]==x) {
        return mitte;
      }
      else {
        if(a[mitte] < x) {
          return binSearch(a, x, mitte+1, rechts);
        }
        else {
          return binSearch(a, x, links, mitte -1);
        }
      }
    }
  }
    
}
