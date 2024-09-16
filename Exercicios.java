// package Java_Learning;

public class Exercicios {

	public static void main(String[] args) {
		// Exercicios
		//1
		String product1 = "Computer";
		String product2 = " Office desk";
		
		int age = 30;
		int code = 5290;
		char gender = 'F';
		
		double price1 = 2100.0;
		double price2 = 650.50;
		double measure = 53.234567;
		
		System.out.printf("Products:\n %s,which price is $ %.2f\n%s, which price is $ %.2f", 
				product1, price1, product2, price2);
		System.out.printf("\nRecord: %d years old, code %d and gender: %s", age, code, gender);
		System.out.printf("\n Measue with eight decimal places: %f \nRouded(three decimal places): %.3f", 
				measure, measure);
		
	}

}


