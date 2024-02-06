package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class CriandoStreams {
	
	public static void main(String[] args) {
		
		// *** stream = sequência de dados que suporta operações sequênciais ou paralelas ***
		// uma stream é criada a partir de uma collection
		
		Consumer<String> print = System.out::print; 
		Consumer<Integer> printIntln = System.out::println;
		
		Stream<String> langs = Stream.of("java ", "Lua ", "JS\n");
		langs.forEach(print);
		
		// é possível criar uma Stream usando um **array** como fonte de dados
		String [] maisLangs = { "Python ", "Lisp ", "Perl ", "Go\n" };		
		Stream.of(maisLangs).forEach(print);
		
		//tbm é possível fazer isso a partir da classe **Arrays** e usando o método .stream
		Arrays.stream(maisLangs).forEach(print);
		
		//tbm é possível no método .stream passar o indice dos arrays que você quer que a stream percorra, 
		//sendo que o ultimo elemento não será incluso
		Arrays.stream(maisLangs, 1,4).forEach(print);
		
		List<String> outrasLangs = Arrays.asList("C ", "php ", "Kotlin\n");
		outrasLangs.stream().forEach(print);
		
		// como o stream é paralelo, os dados não vão ser processados necessáriamente na sequência do array
		outrasLangs.parallelStream().forEach(print);
		
		// .generate recebe um suplier como parâmetro e gera uma stream infinita e ***desordenada***
		Stream.generate(() -> "a\n").forEach(print);
		
		
		// .iterate recebe um valor inicial do tipo Int e um UnaryOperator como parâmetros e gera uma Stream infinita ***ordenada***
		Stream.iterate(0, n -> n+1).forEach(printIntln);
		
	
	}

}
