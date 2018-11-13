/**
 SPÉCIFICATIONS:
 Le programme demandera à l'utilisateur d'entrer trois nombres entiers, puis il triera ces trois nombres en ordre croissant. **/

import java.util.Scanner;

class TrierTroisNombres{
		public static void main(String[] args) {
			
			Scanner saisie = new Scanner(System.in);
			
			int a, b ,c;
			
			int temp;
			
			System.out.print("a = ");
			a = Integer.parseInt(saisie.nextLine());
			
			System.out.print("b = ");
			b = Integer.parseInt(saisie.nextLine());
			
			System.out.print("c = ");
			c = Integer.parseInt(saisie.nextLine());
			
			if (a > b)
		    {
		        temp = a;
		        a =b;
		        b=temp;
		    }
		    if (b > c)
		    {
		    	temp = b;
		        b =c;
		        c=temp;
		    }
		    if (a > b)
		    {
		    	temp = a;
		        a =b;
		        b=temp;
		    }
		    
		    System.out.print(a + " - "+ b + " - " +c);
			
			}
		
		
		
		}