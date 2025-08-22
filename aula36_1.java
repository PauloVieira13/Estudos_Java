import java.util.Scanner;
import java.util.Locale;

public class aula36_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		System.out.println("Digite um número inteiro e descubra se ele é negativo ou não:");
		int n = sc.nextInt();
		
		if (n < 0 ) {
			System.out.println("Negativo!");
		}
		else {
			if(n == 0) {
				System.out.println("Número neutro!");
			}
			else {
				System.out.println("Não negativo!");
			}
		}
		
		sc.close();
	}

}
