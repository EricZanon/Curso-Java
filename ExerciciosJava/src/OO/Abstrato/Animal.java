package OO.Abstrato;

public abstract class Animal {
	
	
	
	public String repirar(){
		return "usando H2O";
	}
	
	// abstrato pois ***mover*** varia de animal pra animal
	// só é possível ter método abstrato em classes abstratas
	public abstract String mover();
	
	//teste

}
