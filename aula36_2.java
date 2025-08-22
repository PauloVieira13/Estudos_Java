import java.util.Scanner;
public class aula36_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um número e descubra se ele é par ou  ímpar:");
		int n = sc.nextInt();
		
		if (n%2 == 0) {
			System.out.println("PAR!");
		}
		else {
			System.out.println("ÍMPAR!");
		}
		
		sc.close();
	}

}
