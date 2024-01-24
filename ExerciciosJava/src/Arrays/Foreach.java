package Arrays;

public class Foreach {
	
	 public static void main(String[] args) {
	     
	        double [] notas = {9.9, 8.7, 7.2, 9.4};
	        
	        double soma = 0;
	        // para cada repetição o valor de "notas vai apontar para um dos elementos do array
	        // não é possível operar os valores dos arrays com o foreach
	        for(double nota: notas){
	            System.out.println(nota + "\n");
	        }
	        
	        // é a simplificação do comando abaixo
	        for(int i = 0; i < notas.length; i ++){
	            soma += notas[i];
	            System.out.println(notas[i]);
	            System.out.println(soma);
	        }
	        
	    }

}
