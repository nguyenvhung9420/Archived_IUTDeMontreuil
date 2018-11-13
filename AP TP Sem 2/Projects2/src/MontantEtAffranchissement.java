/**
 * SPECIFICATIONS:
 * Le programme exige que l'utilisateur saisisse le poids de son colis et le type de
 * service qu'il souhaite, puis génère le montant que le client doit payer pour la poste. **/

import java.util.Scanner;

class MontantEtAffranchissement{
		public static void main(String[] args) {
			
			Scanner saisie = new Scanner(System.in);
			
			int poids ;
			System.out.print("Merci de saisir le poids (toujours entier) en gramme : ");
			poids = Integer.parseInt(saisie.nextLine());
			
			double prixTotal;
			
			int typeService;
			System.out.print("Merci de saisir le type de service : tapez 1 pour le Service Prioritaire, tapez 2 pour le Service Economique : ");
			typeService = Integer.parseInt(saisie.nextLine());
			
			if (typeService != 1 && typeService != 2 ){
				System.out.print("Merci de re-vérifier votre type de service.");
			} else {
			
				if (poids <= 100 ){
					
					if (typeService == 1){
						prixTotal = servicePrioritaire(poids);
					}else {
						prixTotal = serviceEconomique(poids);
					}
					
					System.out.println("Le prix total est " + prixTotal + " Euro(s).");
					
				} else {
					
					System.out.print("Merci d'aller donc voir à la poste.");
					
				}
			}
		}
		

	   /** Fonction pour calculer le prix pour le Service Priroritaire */
	   public static double servicePrioritaire(int poids) {
	      double prix_final;
	      
	      if (poids < 20){
	    	  prix_final = 0.6;
	      } else {
	    	  if (poids < 50){
		    	  prix_final = 1;
		      } else {
		    	  prix_final = 1.45;
		      }
	      }
	      return prix_final; 
	   }
	   
	   /** Fonction pour calculer le prix pour le Service Economique */
	   public static double serviceEconomique(int poids) {
		   double prix_final;
		      
		      if (poids < 20){
		    	  prix_final = 0.55;
		      } else {
		    	  if (poids < 50){
			    	  prix_final = 0.78;
			      } else {
			    	  prix_final = 1;
			      }
		      }
		      return prix_final;
	   }
}