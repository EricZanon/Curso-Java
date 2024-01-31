package classe;

public class AreaCirc {
	
	double raio;
    static double pi = 3.14; // static identifica que pi é uma variavel de classe estatica

    public AreaCirc(double raio) {
        this.raio = raio;
        
    }
    
    double area(){
        return Math.pow(raio, 2) * pi;
        
    }

}
