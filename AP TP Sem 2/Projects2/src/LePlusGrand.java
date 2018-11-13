/**
 SPÉCIFICATIONS:
 Le programme nécessitera que l’utilisateur saisisse trois nombres entiers, puis déterminera le plus grand nombre parmi eux. **/

import java.util.Scanner;
import java.util.Arrays;

class LePlusGrand{
	public static void main(String[] args) {
		
		int lePlusGrand;
		int x, y ,z;
		
		Scanner saisie = new Scanner(System.in);
		
		System.out.print("Merci de saisir x : ");
		x = Integer.parseInt(saisie.nextLine());
		
		System.out.print("Merci de saisir y : ");
		y = Integer.parseInt(saisie.nextLine());
		
		System.out.print("Merci de saisir z : ");
		z = Integer.parseInt(saisie.nextLine());
		
		if (x>y) {
			lePlusGrand = x;
		} else {
			lePlusGrand = y;
		}
		
		if (lePlusGrand < z) {
			lePlusGrand = z;
		}
		
		System.out.print("Le plus grand = " + lePlusGrand);
	}
}