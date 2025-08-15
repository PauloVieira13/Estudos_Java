import java.util.Locale;

public class exercicio01_aula24 {

	public static void main(String[] args) {
		String product1 = "Computer";
		String product2 = "Office desk";
		int age = 30;
		int code = 5290;
		char gender = 'F';
		double price1 = 2100.0;
		double price2 = 650.50;
		double measure = 53.234567;
		System.out.printf("Products: %n %s, which price is $%.2f %n %s, which price is $%.2f %n ", product1, price1, product2, price2);
		System.out.printf("Record: %n %d years old, code %d and gender: %c %n", age, code, gender);  
		Locale.setDefault(Locale.US);
		System.out.printf("Mause with eigth decimal places: %.8f %n Rouded (three decimal places): %.3f %n US decimal point: %.3f", measure, measure, measure);
	}

}