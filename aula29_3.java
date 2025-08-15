import java.util.Scanner;
import java.util.Locale;

public class aula29_3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		Locale.setDefault(Locale.US);
		
		System.out.println("Digite o seu número:");
		int funcionario = sc.nextInt();
		
		System.out.println("Digite o número de horas trabalhadas:");
		int hora = sc.nextInt();
		
		System.out.println("Digite o valor por hora trablhada:");
		double valorh = sc.nextDouble();
		
		double resultado = (double) hora*valorh;
		
		System.out.printf("NÚMERO = %d %nSALARIO = R$%.2f",funcionario ,resultado);
		
		sc.close();
	}

}
