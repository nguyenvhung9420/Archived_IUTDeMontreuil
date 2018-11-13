import java.util.Scanner;

class MontantEtReduction{
	final static int SEUIL = 100;
	final static double TAUX_REDUCTION = 0.05;
	public static void main(String[] args) {
		System.out.print("Merci de saisir un montant :");
		Scanner scanner = new Scanner(System.in);
		double montant = Double.parseDouble(scanner.nextLine());
		
		double montantfinal;
		
		if (montant < 100){
			//ne rien faire:
			montantfinal = montant;
		} else {
			montantfinal = montant * (1 - TAUX_REDUCTION);}
		
		System.out.println("Le montant final est : " + montantfinal);
		
	}
}