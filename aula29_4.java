import java.util.Scanner;
import java.util.Locale;

public class aula29_4 {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	Locale.setDefault(Locale.US);
	
	System.out.println("Digite o código da peça 1 o seu valor e a quantidade:");
	
	int codigo = sc.nextInt();
	int quantidade = sc.nextInt();
	double valor = sc.nextDouble();
		
	System.out.println("Digite o código da peça 2 o seu valor e sua quantidade:");
	
	int codigo1 = sc.nextInt();
	int quantidade1 = sc.nextInt();
	double valor1 = sc.nextDouble();
	
	double resultado = (double) (quantidade * valor) + (quantidade1 * valor1);
	
	System.out.printf("Valor a pagar:R$%.2f %n" ,resultado);
	
	
	sc.close();

	}

}
