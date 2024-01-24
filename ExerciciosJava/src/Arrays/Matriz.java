package Arrays;

import java.util.Scanner;

public class Matriz {
	
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Quantos alunos: ");
		int qtdAlunos = scan.nextInt();

		System.out.println("Quantos notas por aluno: ");
		int qtdNotas = scan.nextInt();

		double[][] notasDaTurma = new double[qtdAlunos][qtdNotas];

		double total = 0;
		for (int a = 0; a < notasDaTurma.length; a++) { // percorre os alunos
			for (int n = 0; n < notasDaTurma[a].length; n++) { // percorre as notas

				System.out.printf("Informe a nota %d do aluno %d: ", n + 1, a + 1);
				notasDaTurma[a][n] = scan.nextDouble();
				total += notasDaTurma[a][n];
			}
		}

		double média = total / (qtdAlunos * qtdNotas);
		System.out.printf("a média é %.2f", média);

		scan.close();
	}

}
