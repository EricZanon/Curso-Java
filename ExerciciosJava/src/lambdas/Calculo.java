package lambdas;

// uma interface funcional pode receber apenas um único método

@FunctionalInterface
public interface Calculo {
	
	public abstract double executar(double a, double b);
//	public abstract double teste();
	
	// é possível implemetar métodos default em uma interface funcional
	default String legal() {
		return "legal";
	}
	
	// tbm é possível implemetar métodos default em uma interface
	static String muitoLegal() {
		return "muito legal";
	}

}
