package ArraysDesafio;

import java.util.Arrays;
import java.util.Scanner;

public class Desafio {
	
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		double somaDasNotas = 0;
		double média = 0;

		System.out.println("Quantas notas serão inseridas? ");
		int qtdDeNotas = Integer.parseInt(scanner.nextLine());

		double[] notas = new double[qtdDeNotas];

		for (int i = 0; i < notas.length; i++) {
			System.out.println("\nDigite a nota " + (i + 1) + ":");
			notas[i] = Double.parseDouble(scanner.nextLine());

		}

		for (double nota : notas) {
			somaDasNotas += nota;
			média = somaDasNotas / notas.length;
		}

		System.out.println("\nAs notas do aluno foram: " + Arrays.toString(notas));
		System.out.printf("\nA média do aluno foi: %.2f\n", média);
		
		scanner.close();

	}

}
