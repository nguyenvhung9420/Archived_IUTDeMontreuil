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
				System.out.print("Merci de reverifier votre type de service.");
				System.exit(0);
			}
			
			if (poids > 100 ){
				System.out.print("Merci d'aller donc voir à la poste.");
				System.exit(0);
			} else {
				
				if (typeService == 1){
					prixTotal = servicePrioritaire(poids);
				}else {
					prixTotal = serviceEconomique(poids);
				}
				
				System.out.println("Le prix total est " + prixTotal + " Euro(s).");
				
			}
			
			
			
		}
		

	   /** returns the minimum of two numbers */
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
	   
	   /** returns the minimum of two numbers */
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