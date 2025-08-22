import java.util.Scanner;
public class aula36_5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("CÓDIGO | ESPECIFICAÇÃO   | PREÇO "
				+ " %n1      | Cachorro quente | R$ 4,00"
				+ " %n2      | X-Salada        | R$ 4,50"
				+ " %n3      | X-Bacon         | R$ 5,00"
				+ " %n4      | Torrada simples | R$ 2,00"
				+ " %n5      | Refrigerante    | R$ 1,50%n"	);
		
		System.out.println("Digite o código do produto e sua quantidade:");
		
		int codigo = sc.nextInt();
		int quantidade = sc.nextInt();
		
		double total;
		
		if (codigo == 1) {
			total = quantidade * 4;
		}
		else if(codigo == 2) {
			total = quantidade * 4.5;
		}
		else if(codigo == 3) {
			total = quantidade * 5;
		}
		else if (codigo == 4) {
			total = quantidade * 2;
		}
		else {
			total = quantidade * 1.5;
		}
		System.out.printf("TOTAL: %.2f%n",total);
		
		sc.close();

	}

}
