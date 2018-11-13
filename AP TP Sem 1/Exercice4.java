import java.util.Scanner;

class Exercice4{

	public static void main (String[] args){

		String pseudo1 = "";
		String pseudo2 = "";

		Scanner saisie = new Scanner(System.in);

		System.out.print("Entrez votre pseudo1 : ");
		pseudo1 = saisie.nextLine();
		
		System.out.print("Entrez votre pseudo2 : ");
		pseudo2 = saisie.nextLine();

		System.out.println("Le joueur 1 s'appelle : " + pseudo1);
		System.out.println("Le joueur 2 s'appelle : " + pseudo2);
		
		if (pseudo1.equals(pseudo2)){
			System.out.println("Le pseudo1 semble identitique au pseudo2. Merci de les vérifier. Le programme va se terminer maintenant.");
		} else {

			if (pseudo1.length() < pseudo2.length()) {
				System.out.println("C\'est " + pseudo2 +" qui gagne !");
			}
			else{
				if (pseudo1.length() > pseudo2.length()){
					System.out.println("C\'est " + pseudo1 +" qui gagne !");
				}
				else{
					System.out.println("C\'est tous les deux qui gagnent !");
				}
			}
		}
}}
