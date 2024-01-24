package OO.Composicao;

public class CarroTeste {
	
	public static void main(String[] args) {
		
		Carro c1 = new Carro();
		
		System.out.println(c1.estaLigado());
		
		c1.ligar();
		System.out.println(c1.estaLigado());
		
		System.out.println(c1.motor.giros());
		
		c1.acelerar();
		System.out.println(c1.motor.giros());
		
		c1.frear();
		c1.frear();
		c1.frear();
		c1.frear();
		c1.frear();
		c1.frear();
		c1.frear();
		System.out.println(c1.motor.giros());	
		
		
		// é possível fazer este tipo de coisa por conta da relação bidirecional entre motor e carro;
		c1.motor.carro.motor.carro.motor.carro.motor.carro.acelerar();
		System.out.println(c1.motor.giros());

	}

}


