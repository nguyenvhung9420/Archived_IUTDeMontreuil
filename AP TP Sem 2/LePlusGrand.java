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
		
		int entiersArr[] = {x,y,z};
		
		Arrays.sort(entiersArr);
		
		for (int i = entiersArr.length -1; i>=0;i++) {
	         System.out.print(" " + entiersArr[i]);
	      }
		
		
	}
}