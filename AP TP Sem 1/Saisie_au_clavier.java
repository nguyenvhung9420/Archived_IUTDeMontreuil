import java.util.Scanner;

class Saisie_au_clavier{

	public static void main (String[] args){

		System.out.print("Entrez votre nom : ");
		Scanner saisie = new Scanner(System.in);
		String nomUtilisateur;
			nomUtilisateur = saisie.nextLine();
		System.out.println("Bonjour " + nomUtilisateur + " !");

}}
