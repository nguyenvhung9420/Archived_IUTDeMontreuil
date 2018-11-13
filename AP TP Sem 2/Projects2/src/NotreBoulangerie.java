/**
 * * SPÉCIFICATIONS:
 * Le programme demandera à l'utilisateur de saisir une heure (heure et minute)
 * pour que le programme identifie si la boulangerie ouvrira à ce moment-là ou pas.
 *  **/

import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.text.*;
import java.util.Calendar;
import java.util.List;
import java.util.Arrays;

class NotreBoulangerie {
	
	final static String HEURE_DEBUT_MATIN = "7:00";
	final static String HEURE_FIN_MATIN = "13:00";
	final static String HEURE_DEBUT_APRESMIDI = "16:00";
	final static String HEURE_FIN_APRESMIDI = "19:00";
	
    public static void main(String[] args) {
    	
    	Scanner saisie = new Scanner(System.in);
    	SimpleDateFormat sdf = new SimpleDateFormat("HH:mm");
    	
    	//Recupérer un jour :
    	int jour;
    	System.out.println("\n1-LUN 2-MAR 3-MER 4-JEU 5-VEN 6-SAM 7-DIM");
    	System.out.print("Saisissez le jour de la semaine en utilisant le NUMÉRO indiqué ci-dessus : ");
        
        jour = Integer.parseInt(saisie.nextLine().trim());
        
        if (jour >=1 && jour <=7) {
        	//Vérifier que l'utilisateur a entré le LUNDI ou pas ?
        	if (jour == 1) {
            	System.out.println("Nous sommes désolés; notre boulangerie n'est pas ouverte le lundi.");
            	System.exit(0);;
            }
        	
        }else {
        	System.out.println("Merci de reverifier votre jour saisi.");
        	System.exit(0);;
        }
        
        //Recupérer une date/time :
        System.out.print("Merci de saisir une heure en format HH:mm : ");
        
        String strDate = saisie.nextLine();
        strDate = strDate.trim();
        
        if (strDate.length() <= 2 && strDate.length() > 0){
        	System.out.println("Il semble que vous n’ayez entré que les chiffres d'heure, nous comprendrons que vous avez entré " + strDate);
	        System.out.println("Vous avez donc entré l'heure : " + strDate + ":00");
        	strDate = strDate + ":00";
        	
        }

        Date heure = new Date();
        
        try {
	        heure = sdf.parse(strDate);
        
	        boolean dansHeuresOuvresMatin = false;
	        dansHeuresOuvresMatin = (heure.compareTo(sdf.parse(HEURE_DEBUT_MATIN))>0 && heure.compareTo(sdf.parse(HEURE_FIN_MATIN))<0);
	        
	        boolean dansHeuresOuvresApresmidi;
	        dansHeuresOuvresApresmidi = false;
	        dansHeuresOuvresApresmidi = (heure.compareTo(sdf.parse(HEURE_DEBUT_APRESMIDI))>0 && heure.compareTo(sdf.parse(HEURE_FIN_APRESMIDI))<0);
	        
	        if (dansHeuresOuvresMatin == false && dansHeuresOuvresApresmidi == false) {
	        	System.out.println("Nous sommes désolés; notre boulangerie n'est pas ouverte.");
	        } else {
	        
	        //La boulangerie est ouverte LE MATIN ?
	        if (dansHeuresOuvresMatin == true) {
	        		System.out.println("Notre boulangerie est ouverte.");
	        } else {
	        	System.out.println();
	        }
	        
	        //La boulangerie est ouverte L'APRES-MIDI ?
	        if (dansHeuresOuvresApresmidi == true) {
	        	//System.out.println("dansHeuresOuvresApresmidi = true");
	        	
	        	
	        		if (jour == 7){
		        		System.out.println("Nous sommes désolés; notre boulangerie n'est pas ouverte le dimanche après-midi.");
		        	}else {
		        		System.out.println("Notre boulangerie est ouverte.");
		        	}
	        	
	        	
	        } else {
	        	System.out.println();
	        }
	        }
        
        } catch (ParseException e) {
            System.out.println("Votre date/heure saisie ne respecte pas le bon format, veuillez relancer le programme et réessayer.");}
    }
}