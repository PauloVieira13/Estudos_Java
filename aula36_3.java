import java.util.Scanner;
public class aula36_3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite dois números e descubra se eles são múltiplos:");
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		if (a%b == 0 || b%a ==0) {
			System.out.println("São Múltiplos!");
		}
		else {
			System.out.println("Não São Múltiplos!");
		}
		
		
		
	}
}
