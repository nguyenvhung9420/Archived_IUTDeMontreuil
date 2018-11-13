package TPSem3;

import java.util.Scanner;
import java.util.List;
import java.util.Arrays; 

class DateCorrecteouIncorrecte {
public static void main(String[] args) {
	Scanner saisie = new Scanner(System.in);
	
	boolean jourCorrect = false;
	boolean dateCorrect = false;
	boolean moisCorrect = false;
	
	System.out.print("Merci de saisir votre annee : ");
	int annee = Integer.parseInt(saisie.nextLine());
	
	String[] str_mois = {"jan","fev","mar","avr","mai","juin","juil","aout","sep","oct","nov","dec"};
	int[] dureeMois = {31,28,31,30,31,30,31,31,30,31,30,31};
	
	//System.out.print(str_mois.length);
	
	System.out.print("Merci de saisir votre mois : ");
	int int_mois = Integer.parseInt(saisie.nextLine()); 
	
	System.out.print("Merci de saisir votre date : ");
	int date = Integer.parseInt(saisie.nextLine()); 
	
	if (int_mois <= str_mois.length) {
		moisCorrect = true;
	}
	
	if (int_mois == 2 ){
		if (anneeBissextiles(annee)==true && date<=29){
			jourCorrect = true;
		} else {
			jourCorrect = false;
		}
	} else {
		if (date <= dureeMois[int_mois-1]){
			jourCorrect = true;
		} else {
			jourCorrect = false;
		}
	}
	
	if (moisCorrect==true && jourCorrect==true) {
		dateCorrect = true;
		System.out.print("Date correct : " + date + " " + str_mois[int_mois-1] + " " + annee);
	} else {
		System.out.print("Date incorrect.");
	}
	
	
}

public static boolean anneeBissextiles(int annee){
	
	boolean bool_anneeBissextiles = false;
	
	if ((annee%4 ==0 && annee%100 != 0) || annee%400 == 0){
		bool_anneeBissextiles = true;
	}
	
	System.out.println(annee + " est une annee bissextile.");
	return bool_anneeBissextiles;
	
}

}