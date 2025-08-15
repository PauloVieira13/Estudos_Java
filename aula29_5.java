import java.util.Scanner;
import java.util.Locale;
public class aula29_5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		System.out.println("Digite três valores e descubra a area de varias formas:");
		
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		double c = sc.nextDouble();
		
		double triangulo = (a*c)/2;
		double circulo = Math.pow(c, 2) * 3.14159;
		double trapezio = ((a+b)*c)/2;
		double quadrado = Math.pow(b,2);
		double retangulo = a*b;
		  
		System.out.printf("TRIANGULO: %.3f %nCIRCULO: %.3f %nTRAPEZIO: %.3f %nQUADRADO: %.3f "
		+ "%nRETANGULO: %.3f %n",triangulo ,circulo ,trapezio ,quadrado ,retangulo);
		
		sc.close();

	}

}
