import java.util.Scanner;

class NombrePremier {
	public static void main(String[] args) {
		
		int diviseur;
		
		System.out.println("Saisissez un nombre entier :");
		Scanner saisie = new Scanner(System.in);
		int entier = Integer.parseInt(saisie.nextLine());
		
		boolean estPremier = false;
		
		for (diviseur = 2; diviseur < entier / 2; diviseur++) {
			if (entier%diviseur == 0) {
				estPremier = true;
			} else {
				estPremier = false;
			}
		}
		
		if(estPremier == true){
            System.out.println("Primier.");

        }else {
            System.out.println("Non premier.");
        }
		
		
	}
}