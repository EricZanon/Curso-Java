package OO.Composicao;

public class Carro {
	
	// intanciando o motor que pertence ao carro
	final Motor motor;
	
	// relação bidirecional
	// o objeto atual é o carro que será usado para construir o motor
	// desta forma, o carro tem um motor e o motor tem um carro
	Carro(){
		this.motor = new Motor(this);
	}	
	
	void acelerar() {
		if (motor.fatorInjecao < 2.5) {
		motor.fatorInjecao += 0.4;
		} else {
			System.out.println("operação indisponivel");
		}
	}	
	void frear() {
		if(motor.fatorInjecao > 0.5) {
		motor.fatorInjecao -= 0.4;
		} else {
			System.out.println("operação indisponivel");
		}
		
	}
	void ligar() {
		motor.ligado = true;
	}
	void desligar() {
		motor.ligado = false;
	}
	String estaLigado() {
		if (motor.ligado == true) {
			return "o motor está ligado";
		} else {
			return "o motor está desligado";
		}
	}

}
