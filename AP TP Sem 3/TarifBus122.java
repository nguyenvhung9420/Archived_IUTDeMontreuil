/*  - 0,25 euros pour les moins de 3 ans (inclus) ;
    - 0,80 euros pour les moins de 20 ans (exclus) et les plus de 65 ans (inclus) ;
    - 1,20 euros pour les autres.
Les habitants de Montreuil ont sur ce tarif une réduction de 30%.*/

package TPSem3;

import java.util.Scanner;

class TarifBus122 {
	
	public final static double TAUX_REDUCTION = 0.3;
	
	public static void main(String[] args) {
		
		Scanner saisie = new Scanner(System.in);
		
		System.out.print("Merci de saisir votre âge : ");
		int age = Integer.parseInt(saisie.nextLine());
		
		System.out.print("Vous etes habitant montreuillois ? (Y/N) ");
		String str_habitantMontreuil = saisie.nextLine();
		//System.out.print(str_habitantMontreuil);
		
		boolean habitantMontreuil = false;
		if (str_habitantMontreuil.toLowerCase().equals("y")){
			habitantMontreuil = true;
		};
		
		//System.out.println(habitantMontreuil);
		
		double prixFinal;
		
		if (age <= 3){
			prixFinal = 0.25;
		}else {
			if (age < 20 || age >= 65){
				prixFinal = 0.8;
			} else {
				prixFinal = 1.2;
			}
		}
		
		if (habitantMontreuil == true){
			prixFinal *= (1- TAUX_REDUCTION);
		}
		
		//System.out.print(prixFinal);
		int partieInt = (int)prixFinal;
		//System.out.print(partieInt);
		int partieDeci = (int)Math.round(Math.abs(prixFinal - partieInt)*100);
		//System.out.print(partieDeci);
		
		System.out.println("Votre tarif = " + partieInt + " euro " + partieDeci + " centime(s)." );
		
	}
}