package dados;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int funcionario, horas;
		double valor, salario;

		System.out.println(
				"Digite o número do respectivo funcionário, suas horas trabalhadas e o valor que ele recebe por hora");
		funcionario = sc.nextInt();
		horas = sc.nextInt();
		valor = sc.nextDouble();

		salario = valor * horas;

		System.out.println("Numero: " + funcionario);
		System.out.printf("Salário = U$ %.2f%n", salario);

		sc.close();

	}

}
