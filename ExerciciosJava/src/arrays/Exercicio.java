package arrays;

import java.util.Arrays;

public class Exercicio {
	
public static void main(String[] args) {
        
        double [] notasAlunoA = new double [4];
        
        notasAlunoA [0] = 7.9;
        notasAlunoA [1] = 8;
        notasAlunoA [2] = 6.7;
        notasAlunoA [3] = 9.7;
        
        // para imprimir os arrays usar o import java.util.arrays
        // usar o método ***Arrays.toString(NomeDoArray)***
        
        System.out.println("Notas Aluno A: " + Arrays.toString(notasAlunoA));
        
        // soma da nota para calculo da média 
        double totalAlunoA = 0;
        
        // Usar o tamanho do Array como referência para valor máximo de i
        // Usar o comando ****nomeDoArray.lengh****
        for(int i = 0; i<notasAlunoA.length; i++){
            totalAlunoA += notasAlunoA[i];
        }
        System.out.println("Total Aluno A: " + totalAlunoA);
        
        // calcular a média usando o comprimento do array  ***notasAlunoA.length***
        System.out.printf("Média Aluno A: %.2f \n\n", totalAlunoA/notasAlunoA.length);
        
        
        double [] notasAlunoB = {6.9, 8.9, 5.5, 10};
        
        System.out.println("Notas Aluno B: " + Arrays.toString(notasAlunoB));
        
        double totalAlunoB = 0;
        for (int i = 0; i < notasAlunoB.length; i++) {
            totalAlunoB += notasAlunoB[i];
        }
        System.out.println("Total Aluno B: " + totalAlunoB);
        System.out.printf("Média Aluno B: %.2f \n", totalAlunoB/notasAlunoB.length);
    }

}
