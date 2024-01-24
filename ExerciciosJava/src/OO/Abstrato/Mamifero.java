package OO.Abstrato;

public abstract class Mamifero extends Animal {
	
	@Override
	// um método final não pode ser sobrescrito nas suas subclassesS
	public final String mover() {
		return "saindo do lugar";
	}
	
	public abstract String mamar();

}
