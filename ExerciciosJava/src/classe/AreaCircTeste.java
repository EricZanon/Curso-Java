package classe;

public class AreaCircTeste {
	
	public static void main(String[] args) {

        AreaCirc a1 = new AreaCirc(5);
        AreaCirc.pi = 3.1415; // variaveis de instancia são alteradas usando o nome da classe iniclamente (areaCirc.pi)
        System.out.println(a1.area());

        AreaCirc a2 = new AreaCirc(10);
        AreaCirc.pi = 5;
        System.out.println(a2.area());

    }

}
