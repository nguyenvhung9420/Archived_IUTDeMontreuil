/* 
 * QuelquesCalculs.java
 * Ce programme permet d'essayer quelques opérations arithmétiques. 
 */
import java.util.Scanner;

class QuelquesCalculs {
	

	public static void main (String args[]) {

		Scanner saisie = new Scanner(System.in);

		int a;
		int b;
		double x;
		double y;
		
		a = 12;
		b = 5;
		

		System.out.print("x = ");
		x = Double.parseDouble(saisie.nextLine());
		
		System.out.print("y = ");
		y = Double.parseDouble(saisie.nextLine());
		
		// affichage des deux entiers et de leur somme
		System.out.println("a vaut " + a + ", b vaut " + b);
		System.out.println("a + b = " + (a + b));
		System.out.println("a - b = " + (a - b));
		System.out.println("a x b = " + (a * b));
		
		double a_divise_b = a/b;
		System.out.println("a / b = " + (a_divise_b));

		System.out.println("a % b = " + (a % b));
		
		// affichage des deux réels et du résultat de leur division
		System.out.println("x vaut " + x + ", y vaut " + y);

		// verifier x pair/impair:
		if (x%2==0){
			System.out.println("x est pair");
		}
		else{System.out.println("x est impair");}

		// verifier y pair/impair:
		if (y%2!=0){
			System.out.println("y est impair");
		}
		else{System.out.println("y est pair");}

		System.out.println("x / y =  + (x / y) = " + Math.abs(x / y));
		
		System.out.println();  // c'est un saut de ligne
		
		if (x>0) {
			System.out.println("x est positif");
		}

		System.out.println();
		
		if (x*y<0){
			System.out.print("Le produit de x par y est négatif ");
			System.out.println("donc soit x est négatif soit y est négatif.");}
		
}
}
