/** 
 * SPECIFICATIONS
 * L'utilisateur saisira l'heure actuelle (heure et minutes)
 * et le programme déterminera le prochain départ du bus 122. **/

import java.util.Scanner;
import java.util.Date;
import java.text.*;
import java.util.Calendar;

class Bus122 {
	
    public static void main(String[] args) {
    	
    	Scanner saisie = new Scanner(System.in);
    	
    	System.out.print("Merci d'entrer une heure (en format de 24 heures avec deux point \":\") : ");
    	String stringHeure = saisie.nextLine();
    	
    	SimpleDateFormat sdf = new SimpleDateFormat("HH:mm"); 
    	
    	Calendar cal = Calendar.getInstance();
    	
        try {
			cal.setTime(sdf.parse(stringHeure));
			
	        Calendar _5h = Calendar.getInstance();
	        _5h.setTime(sdf.parse("05:00"));
	        
	        Calendar _8h = Calendar.getInstance();
	        _8h.setTime(sdf.parse("08:00"));
	        
	        Calendar _19h30 = Calendar.getInstance();
	        _19h30.setTime(sdf.parse("19:30"));
	        
	        Calendar _21h = Calendar.getInstance();
	        _21h.setTime(sdf.parse("21:00"));
        
	        int minutesRecupere;
	        minutesRecupere = cal.get(Calendar.MINUTE);
	        
	        int minutesAAjouter;
	        minutesAAjouter = (((int)(minutesRecupere/10))*10 + 10) - minutesRecupere;
	        
	        //Justement pout déboggage :
	        //System.out.print("Minutes à ajouter: " +  minutesAAjouter + " --> ");
	        
	        cal.add(Calendar.MINUTE, minutesAAjouter);
	        
	        //Justement pout déboggage :
	        //System.out.println("Temps mis à jour : " +  sdf.format(cal.getTime()));
	        
	        boolean periodBase10min = (cal.compareTo(_5h) >=0  && cal.compareTo(_5h) <=0) || (cal.compareTo(_19h30) >=0  && cal.compareTo(_21h) <=0);
	        boolean periodeAucunService = (cal.compareTo(_21h) >=0  || cal.compareTo(_5h) <=0);
	        boolean tempsApresMidi = (cal.compareTo(_8h)) >=0  && (cal.compareTo(_19h30) <=0) ;
	        
	        //Dans les périodes basées sur la base de 10 minutes :
	        if (periodBase10min == true  ) {
	        	if (minutesRecupere%10 == 0) {
	        		System.out.println("Départ imminent.");
	        	} else {
	        		System.out.println("Depart dans 10 min. Le prochain départ est à " + sdf.format(cal.getTime()));}
	        }  else {
	        
	        	//Dans les périodes basées sur la base de 6 minutes:
		        if (tempsApresMidi == true ) {
		        		cal.setTime(sdf.parse(stringHeure));
		        		minutesRecupere = cal.get(Calendar.MINUTE);
		        		
		        		if (minutesRecupere%6 == 0) {
			        		System.out.println("Départ imminent.");
			        	} else {
		        		
			        		minutesAAjouter = (((int)(minutesRecupere/6))*6 + 6) - minutesRecupere;
			        		cal.add(Calendar.MINUTE, minutesAAjouter);
			        		System.out.println("Depart dans 06 min. Le prochain départ est à " + sdf.format(cal.getTime()));}
		        } else {
	        		
//		        	//Dans les périodes pas de services :
			        if (periodeAucunService == true) {
			        		System.out.println("Pas de service.");
			 }}}
	        
        } catch (ParseException e) {
			System.out.print("Heure incorrecte, merci de vérifier votre heure saisie.");
			System.exit(0);
		}
        
        }
        
       
    }
