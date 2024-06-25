package dados;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		double raio;
		double pi = 3.14159;

		System.out.println("Digite o valor do Raio de um Círculo: ");
		raio = sc.nextDouble();

		double elevacao = Math.pow(raio, 2);
		double resultado = pi * elevacao;

		System.out.printf("%.4f%n", resultado);

		sc.close();

	}

}
