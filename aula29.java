import java.util.Scanner;
public class aula29 {

	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
		
		System.out.println("Digite dois valores abaixo para receber a soma deles:");
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		int soma = n1 + n2;
		
		System.out.printf("A soma de %d mais %d é igual a %d " , n1, n2, soma);
		
		
		sc.close();
	}

}
