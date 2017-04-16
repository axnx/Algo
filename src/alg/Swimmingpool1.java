package alg;

import java.util.Scanner;

public class Swimmingpool1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("H�he(cm): ");
		int iHöhe = sc.nextInt();
		System.out.print("Breite(cm): ");
		int iBreite = sc.nextInt();
		//float floatNum = sc.nextFloat();
		
		int iPool = calcPoolQuadratisch(iHöhe, iBreite);
		System.out.println("Ergebnis(m2): " + iPool );
		
	}
	
	public static int calcPoolQuadratisch(int iHöhe, int iBreite){
		
		int Ergebniss;
		Ergebniss = iHöhe * iBreite; 
		
		return Ergebniss;				
	}
}
