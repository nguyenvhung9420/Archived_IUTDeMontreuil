

import java.util.Scanner;

class CestQuoiCa {

	public final static double X2=15397462.648967;	
	
	public static void main(String[] args) {

		double X;

		Scanner saisie = new Scanner(System.in);

		System.out.print("Entrez un nombre : ");
		
		X = Double.parseDouble(saisie.nextLine());		
		
		if (X>=0) {
			X2 = X;
		}else {
			X2 = -X;
		}
		
		System.out.println("Le résultat est : " + X2);
	}
}
