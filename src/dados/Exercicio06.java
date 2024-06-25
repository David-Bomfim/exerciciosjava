package dados;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double a, b, c, triangulo, circulo, trapezio, quadrado, retangulo, pi = 3.14159;

		a = sc.nextDouble();
		b = sc.nextDouble();
		c = sc.nextDouble();

		triangulo = a * c / 2;
		circulo = pi * c * c;
		trapezio = (a + b) * c / 2;
		quadrado = b * b;
		retangulo = a * b;

		System.out.printf("Triangulo: %.3f%n ", triangulo);
		System.out.printf("Circulo: %.3f%n", circulo);
		System.out.printf("Trapezio: %.3f%n", trapezio);
		System.out.printf("Quadrado: %.3f%n", quadrado);
		System.out.printf("Retangulo: %.3f%n", retangulo);

		sc.close();

	}

}
