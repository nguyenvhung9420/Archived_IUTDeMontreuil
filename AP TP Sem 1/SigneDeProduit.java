import java.util.Scanner;

class SigneDeProduit {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Merci de saisir la première valeur : ");
		double v1 = Double.parseDouble(scanner.nextLine());
		
		System.out.print("Merci de saisir la deuxieme valeur : ");
		double v2 = Double.parseDouble(scanner.nextLine()); 
		
		if ((v1 == 0) ||(v2 == 0)) {
			System.out.println("L'une de tes valeurs est 0. Merci de les vérifier. Le programme va terminer maintenant.");
		} 
		
		if ((v1 < 0) ^ (v2 < 0)) {
			System.out.println("Le produit est negatif.");
		} else {
			System.out.println("Le produit est positif.");
		}	
			
		}
		
	} 
