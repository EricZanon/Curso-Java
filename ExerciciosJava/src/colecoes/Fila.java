package colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {
	
	public static void main(String[] args) {
		
		Queue<String> fila = new LinkedList<>();
		
		fila.add("Ana"); // lança uma excessão caso a fila esteja cheia
		fila.offer("Bia"); // retorna um false caso a fila cheia
		
	}
}