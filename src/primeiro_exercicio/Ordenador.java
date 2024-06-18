package primeiro_exercicio;

import java.util.Locale;

public class Ordenador {

	public static void main(String[] args) {
		
		String product1 = "Computer";
		String product2 = "Office Desk";
		
		int age = 30;
		int code = 5290;
		char gender = 'f';
		
		double price1 = 2100.0;
		double price2 = 650.0;
		double measure = 53.234567;
		
		
		System.out.println("Products: ");
        System.out.println(product1 + " Which price is $" + price1);
        System.out.println(product2 + " Which price is $" + price2);
        
        System.out.println("Record: " + age + " years old, code" + code + " and gender:" + gender );
        
        System.out.println("Measure with eight decimal places: " + measure);
        System.out.printf("Rounded (Three decimal places) " + "%.3f%n", measure );
       
        Locale.setDefault(Locale.US);
        System.out.printf("US Decimal point: " + "%.3f%n", measure);
        
	}

}
