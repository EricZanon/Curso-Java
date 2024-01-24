package OO.Composicao;

public class Motor {
	
	final Carro carro;
	
	boolean ligado = false;
	double fatorInjecao = 1;
	
	// relação bidirecional
	// para construir um motor é necessário passar um motor como parâmetro
	
	Motor (Carro carro){
		this.carro = carro;
	}
	
	int giros() {
		if (ligado == false) {
			return 0;
		} else {
			return (int)Math.round(fatorInjecao * 3000);
		}
	}
}
