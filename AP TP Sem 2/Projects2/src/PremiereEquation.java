/**
 * SPÉCIFICATIONS:
 * Le programme résoudra l'équation du premier degré en demandant à l'utilisateur
 * de saisir a et b. Le programme affichera le résultat de la variable x. **/

import java.util.Scanner;
import java.text.DecimalFormat;
import java.text.NumberFormat;

class PremiereEquation {
	
	public static void main(String[] args) {
		
		Scanner saisie = new Scanner(System.in);
		
		System.out.println("Vous êtes sur le point de résoudre une équation de premier degré de ax + b = 0.");
		
		//Récupérer les coefficients a et b
		System.out.print("Merci de saisir le coefficient a = ");
		double a = Double.parseDouble(saisie.nextLine());
		
		System.out.print("Merci de saisir le coefficient b = ");
		double b = Double.parseDouble(saisie.nextLine());
		
		double x;
		
		System.out.println(String.format("\nVotre équation est %sx + %s = 0", a, b));
		
		//Resoudre l'équation
		if (a == 0) { //Dans le cas a = 0
			
			if (b!=0) { //Le cas a = 0 mais b != 0
				System.out.print("L'équation est sans solution parce que a = 0.");
			} else { //Le cas a = b = 0
				System.out.print("Les solutions sont appartenues à l'ensemble R.");
			}
			
		}else { //Dans le cas a != 0
			
			if (b != 0) { //Le cas b != 0
				
				x = -(b/a); 
				System.out.println("La solution est x = " + x);
				
			} else { //Le cas b = 0 --> Plus d'explications pour l'utilisateur:
				System.out.print("(La solution de cette équation est 0 parce que b = 0)") ;
			}
		}
		
		
	}
}