import java.util.Scanner;
import java.util.Locale;
public class aula36_6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
		System.out.println("Digite um valor e descubra a qual intervalo ele pertence:");
	
		double numero = sc.nextDouble();
	
		if (numero < 0 || numero > 100) {
			System.out.println("FORA DE INTERVALO");
		}
		else if (numero <=50) {
			System.out.println("INTERVLO [25,50]");
		}
		else if (numero <= 75) {
			System.out.println("INNTERVALO [50,75]");
		}
		else if (numero <= 100) {
			System.out.println("INTERVALO[75,100]");
		}
		else {
			System.out.println("INTERVALO [0,25]");
		}
	
	
		sc.close();
	}

}
