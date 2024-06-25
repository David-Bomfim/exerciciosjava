package dados;

import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int p1, p2, qnt, qnt1;
		double valor, valor1;
		double total = 0;
		double total1 = 0;
		double preco = 0;

		System.out.println("Digite o código da primeira peça, a quantidade e o valor: ");
		p1 = sc.nextInt();
		qnt = sc.nextInt();
		valor = sc.nextDouble();

		total = qnt * valor;

		System.out.println("Digite o código da segunda peça, a quantidade e o valor: ");
		p2 = sc.nextInt();
		qnt1 = sc.nextInt();
		valor1 = sc.nextDouble();

		total1 = qnt1 * valor1;

		preco = total + total1;

		System.out.printf("Valor a pagar: R$ %.2f%n", preco);

	}

}
