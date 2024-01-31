package classe;

public class Data {
	    
	int dia;
	int mes;
	int ano;
	final String formato = "%d/%d/%d";

	// this() = usado para chamar um construtor dentro de outro construtor
	public Data() {
		this(1, 1, 1970);
	}
	
	// this. = usado para acessar e alterar uma variavel de ***instancia***
	public Data(int dia, int mes, int ano) {
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}

	String obterDataFormatada() {
		return String.format(formato, this.dia, this.mes, this.ano);
	}

	void imprimirData() {
		System.out.println(this.obterDataFormatada());
	}

}
