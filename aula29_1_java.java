import java.util.Scanner;
import java.util.Locale;
public class aula29_1_java {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		System.out.println("Digite o valor do raio abaixo:");
		double raio =sc.nextDouble();
		double area = 3.14159 * Math.pow(raio, 2); ;
		
		System.out.printf("Se o raio for %.2f a area do circulo vale %.4f" ,raio,area);
		
		sc.close();
	}

}
