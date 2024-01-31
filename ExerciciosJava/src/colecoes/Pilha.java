package colecoes;

import java.util.ArrayDeque;
import java.util.Deque;

public class Pilha {
	
	public static void main(String[] args) {
		
		Deque<String> Livros = new ArrayDeque<String>();
		
		Livros.add("O pequeno prncipe");
		Livros.push("Rei leão"); // retorna uma excessão caso a pilha esteja cheia
		Livros.push("O hobbit");
		
		for (String l: Livros) {
			System.out.println(l);
		}  
		
		System.out.println(Livros.peek());
		System.out.println(Livros.element());
		
		System.out.println(Livros.size());
		System.out.println(Livros.contains("O hobbit"));
	
		System.out.println(Livros.poll());
		System.out.println(Livros.pop()); // assim como o remove, lança uma excessão caso não haja elemento para ser removido
		System.out.println(Livros.poll());
		System.out.println(Livros.poll()); // retorna nulo caso não tenha elementos para remover
			
	}

}
