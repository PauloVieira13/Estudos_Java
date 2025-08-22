import java.util.Scanner;
public class aula36_4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("Digite a hora que você começou a jogar e quando %nparou e descubra quanto tempo o jogo duro:%n");
		int hi = sc.nextInt();
		int hf = sc.nextInt();
		
		int duracao;
		
		if (hi < hf) {
			duracao = hf - hi;
		}
		else {
			duracao = 24 - hi + hf;
		}
		
		System.out.println("O JOGO DUROU " + duracao + " HORA(S)");
				
		sc.close();

	}

}
