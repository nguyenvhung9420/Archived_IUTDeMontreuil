import java.util.Scanner;

//static final double PI = 3.14;

class CalculCirconderenceEtAire {
	
	static final double PI = 3.14;

	public static void main(String[] args) {
		
		
		//calculer et afficher la circonférence (2*PI*r) et l'aire (PI*r*r) de ce cercle:
		
		double circon;
		double aire;
		double r;
		
		System.out.print("Merci de saisir le rayon :");
		Scanner scanner = new Scanner(System.in);
		r = Double.parseDouble(scanner.nextLine());
		
		if (r < 0){
			System.out.println("Vous avez saisi un rayon négatif. Le programme va prendre sa valeur absolue qui est " + Math.abs(r));
			r = Math.abs(r);
		}
		
		circon = 2*PI*r;
		aire = PI*r*r;
		
		System.out.println("La circonférence = " + circon);
		System.out.println("L'aire = " + aire);
		
	}
}