import java.util.Scanner;

class PairEtImpair{
	
	public static void main(String[] args) {
		System.out.print("Merci de saisir une valeur :");
		Scanner scanner = new Scanner(System.in);
		int x = Integer.parseInt(scanner.nextLine());
		
		//pair ou impair:
		if (x%2 ==0){
			System.out.println("Ta valeur est paire.");
		} else {
			System.out.println("Ta valeur est impaire.");
		}
		
		//multiple de 3:
		if ((x%3 == 0) && (x >= 3)){
			System.out.println("Ta valeur est multiple de 3.");
		} else {
			System.out.println("Ta valeur est non multiple de 3.");
		}
		
		//multiple de 5:
		if ((x%5 == 0) && (x >= 5)){
			System.out.println("Ta valeur est multiple de 5.");
		} else {
			System.out.println("Ta valeur est non multiple de 5.");
		}
		
	}
}
