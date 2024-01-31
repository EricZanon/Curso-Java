package colecoes;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Mapa {
	
	public static void main(String[] args) {
		
		// percorre um mapa de id e nome de usuarios
		Map<Integer, String> usuarios = new HashMap<Integer, String>();
		
		usuarios.put(1, "Roberto"); // para o map se usa o put para adicionar
		usuarios.put(1, "Ricardo"); // o método *put* além de adicionar também altera elementos já existentes
		usuarios.put(1, "Eric");
		
		System.out.println(usuarios.size()); // só tem 1 dde tamanho pq os elementos estão sendo substituidos
		
		usuarios.put(2, "Ricardo");
		usuarios.put(3, "Rafaela");
		usuarios.put(4, "Rebeca");
		
		System.out.println(usuarios.size());
		
		System.out.println(usuarios.isEmpty());
		System.out.println(usuarios.keySet()); // mostra o conjunto das chaves
		System.out.println(usuarios.values()); // mostra apenas os valores
		System.out.println(usuarios.entrySet()); // mostra chave e valor ao mesmo tempo
		
		System.out.println();
		
		System.out.println(usuarios.containsKey(3)); // verifica se a chave está contida no map
		
		System.out.println();
		
		System.out.println(usuarios.containsValue("Eric")); // verifica se o valor está contido no map
		
		System.out.println();
		
		System.out.println(usuarios.get(1)); // obtem o valor do elemento a partir da chave dele
		System.out.println(usuarios.remove(3)); // você pode remover a partir da chave e terá o resultado do usuario removido
		
		
		// percorrendo os elementos pela chave
		for (int chave: usuarios.keySet()) {
			System.out.println(chave);
		}
		System.out.println();
		// percorrendo os elementos pelo valor
		
		for (String valor: usuarios.values()) {
			System.out.println(valor);
		}
		System.out.println();
		
		//percorrendo o map por inteiro
		for (Entry<Integer, String> registro: usuarios.entrySet()) {
			System.out.println(registro);
		}
		System.out.println();
	}

}
 