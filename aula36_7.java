import java.util.Scanner;
public class aula36_7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite um valor para o eixo X e outro para o eixo Y:");
	
		double x = sc.nextDouble();
		double y = sc.nextDouble();
	
		if (x == 0 && y == 0) {
			System.out.println("ORIGEM");
		}
		else if (x > 0 && y > 0 ) {
			System.out.println("Q1");
		}
		else if (x < 0 && y > 0) {
			System.out.println("Q2");
		}
		else if (x < 0 && y < 0) {
			System.out.println("Q3");
		}
		else {
			System.out.println("Q4");
		}
	
		sc.close();
	
	}

}
