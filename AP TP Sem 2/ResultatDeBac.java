import java.util.Scanner;

class ResultatDeBac{
	public static void main(String[] args) {
		Scanner saisie = new Scanner(System.in);
		
		System.out.print("Merci de saisir la note du votre Bac : ");
		double noteBac = Double.parseDouble(saisie.nextLine());
		
		String mentionBac = "";
		
		if (noteBac<0 || noteBac >20){
			System.out.print("Moyenne Incorrect.");
		} else {
			if (noteBac < 8){
				mentionBac = "refusé";
			} else {
				if (noteBac < 10){
					mentionBac = "doit passer l'oral de rattrapage";
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
		
		
		System.out.println(mentionBac);
		
		double  noteBac_apresRattrapage = 0;
		String  mentionBac_apresRattrapage = "";
		
		if (mentionBac == "doit passer l'oral de rattrapage"){
			
			System.out.print("Merci de saisir la note FINALE du votre Bac apres le rattrapage : ");
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
