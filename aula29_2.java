import java.util.Scanner;
import java.util.Locale;
public class aula29_2 {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	Locale.setDefault(Locale.US);
	
	System.out.printf("Digit equatro valores abaixo para saber a diferença do produto de A e B %npelo no produto de C e D segundo a formula: DIFERENÇA=(A*B-C*D) %n");
	
	int a = sc.nextInt();
	int b = sc.nextInt();
	int c = sc.nextInt();
	int d = sc.nextInt();
	int diferenca = (a*b)-(c*d);
	
	System.out.printf("A diferença dos produtos é igual a: %d",diferenca);	
	
	
	sc.close();
	}

}
