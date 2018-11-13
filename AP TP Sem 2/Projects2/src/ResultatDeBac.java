/**
 * SPÉCIFICATIONS:
 * Le programme demandera à l'utilisateur de saisir sa note de baccalauréat et il imprimera ensuite la mention du bac.
 * Dans certains cas, l'utilisateur devra saisir à nouveau son rattrapage
 * si la note originale ne satisfait pas aux exigences. **/

import java.util.Scanner;

class ResultatDeBac{
	public static void main(String[] args) {
		Scanner saisie = new Scanner(System.in);
		
		System.out.print("Merci de saisir la note du votre Bac : ");
		double noteBac = Double.parseDouble(saisie.nextLine());
		
		String mentionBac = "";
		boolean doitPasserRattrapage = false;
		
		//Prendre des décisions en fonction de la note:
		if (noteBac<0 || noteBac >20){
			System.out.print("Moyenne Incorrect.");
		} else {
			if (noteBac < 8){
				mentionBac = "refusé";
			} else {
				if (noteBac < 10){
					mentionBac = "doit passer l'oral de rattrapage";
					doitPasserRattrapage = true;
				}else{
					if (noteBac < 12){
						mentionBac = "admis mention passable";
					}else {
						if (noteBac < 14){
							mentionBac = "admis mention assez bien";
						} else {
							if (noteBac < 16){
								mentionBac = "admis mention bien";
							} else {
								mentionBac = "admis mention très bien";
						}}
					}
				}
			}
		}
		
		
		//Imprimer la mention du Bac sur l'écran:
		System.out.println(mentionBac);
		
		
		//Saisir le rattrapage et prendre à nouveau des décisions:
		double  noteBac_apresRattrapage = 0;
		String  mentionBac_apresRattrapage = "";
		
		if (doitPasserRattrapage == true){
			
			System.out.print("Merci de saisir la note FINALE du votre Bac après le rattrapage : ");
			noteBac_apresRattrapage = Double.parseDouble(saisie.nextLine());
			
			if (noteBac_apresRattrapage < 10){
				mentionBac_apresRattrapage = "refusé";
			} else {
				mentionBac_apresRattrapage = "admis mention passable";
			}
			
			System.out.println(mentionBac_apresRattrapage);
			
		} else {
			//rien faire
		}
    }
		
		
	}
