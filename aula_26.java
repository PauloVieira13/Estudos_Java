import java.util.Locale;
import java.util.Scanner;

public class aula_26 {

	public static void main(String[] args) {
	Locale.setDefault(Locale.US);
	Scanner sc = new Scanner (System.in);
	
	System.out.printf("Para números inteiros usa-se x=(nome da variavel).nextInt(); %nDigite um número inteiro abaixo e aperte Enter.");
	int x;
	x = sc.nextInt();
	System.out.println("Voce digitou:" + x);
	System.out.printf("Para números com ponto flutuante usa-se x=(nome da variavel).nextDouble(); %nDigite um número com ponto(Use '.') e aperte Enter");
	double y;
	y = sc.nextDouble();
	System.out.printf("Voce digitou: %.2f%n" , y);
	System.out.printf("Para ler um caractere usa-se x=(nome da variavel).next().charAt(0); %nDigite qualquer coisa e aperte Enter para mostrar o primeiro caractere");
	char z;
	z = sc.next().charAt(0);
	System.out.println("O primeiro caractere é:" + z);
	System.out.printf("Para ler uma string usa-se x=(nome da variavel).next(); %nDigite uma string:");
	String s;
	s= sc.next();
	System.out.println("Voce digitou: "+ s);
	System.out.printf("Para ler uma linha inteira usa-se x=(nome da variavel).nextLine(); %nDigite uma frase: ");
	String f;
	f= sc.nextLine();
	sc.nextLine();
	
	sc.close();

	}

}
