package Coleções;

import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class ConjuntoComportado {
	
	 public static void main(String[] args) {
	        
	        /* 
	        * lista obrigatória do tipo string
	        * com Hashset ele não mantem a ordem de inserção
	        * Set<String> listaAprovados = new HashSet<>();
	        */
	                
	        // o TreeSet garante a ordem de inserção
	        // SortedSet deixa você definir uma order de inserção que vc configura
	        
	        SortedSet<String> listaAprovados = new TreeSet<>();
	        
	        listaAprovados.add("Ana");
	        listaAprovados.add("Carlos");
	        listaAprovados.add("Luca");
	        listaAprovados.add("Pedro");
	        
	        // usar foreach para imprimir a collection
	        for(String candidato: listaAprovados){
	            System.out.println(candidato);
	        }
	        
	        Set<Integer> nums = new HashSet<>();
	        
	        nums.add(1);
	        nums.add(6);
	        nums.add(3);
	        nums.add(4);
	        
	        // usar foreach para imprimir a collection
	        for(int n: nums){
	            System.out.println(n);
	        }
	    }

}
