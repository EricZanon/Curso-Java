package lambdas;

import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class DesafioInterfacesFuncionais {
	
	public static void main(String[] args) {
		
		Produto p = new Produto("Ipad", 3235.89, 0.1);
		
		BinaryOperator<Double> precoDesconto = (preco, desconto) -> preco * (1 - desconto);
		System.out.println(precoDesconto.apply(p.preco, p.desconto));
		
		UnaryOperator<Double> impostoMunicipal = (preco) -> preco >= 2500.00 ? preco * (1 + 0.085) : preco;
		System.out.println(impostoMunicipal.apply(p.preco));
		
		double valorComImposto = precoDesconto
				.andThen(impostoMunicipal)
				.apply(p.preco, p.desconto);
		
		System.out.println(valorComImposto);
		
		UnaryOperator<Double> frete = (preco) -> preco >= 3000.0 ? preco + 100 : preco + 50;
		double valorFrete = precoDesconto
				.andThen(impostoMunicipal)
				.andThen(frete)
				.apply(p.preco, p.desconto);
		
		System.out.println(valorFrete);
		
		/* 
		* 	                      ARREDONDAR UM VALOR DOUBLE PRA 2 CASAS DECIMAIS:
		* 
		*  O valor é multiplicado por 100.0 para que volte a ser um double, já que Math.round o converte para Long
		*  Se o valor original é 12.3456, multiplicar por 100.0 resulta em 1234.56.
		*  Em seguida, Math.round(1234.56) arredondará para 1235.
		*  Dividir o resultado por 100.0 novamente (1235 / 100.0) dá 12.35, que é o valor arredondado para duas casas decimais.
		*/
		
		UnaryOperator<Double> arredondar = (valor) -> Math.round((valor) * 100.00) / 100.00;
		
		double valorArredondado = precoDesconto
				.andThen(impostoMunicipal)
				.andThen(frete)
				.andThen(arredondar)
				.apply(p.preco, p.desconto);
		
		System.out.println(valorArredondado);
		
		Function<Double, String> formatar = (valor) -> "\nO total da compra com desconto,\nfrete e impostos foi: R$ " + valor;
		
		String valorFinal = precoDesconto
		.andThen(impostoMunicipal)
		.andThen(frete)
		.andThen(arredondar)
		.andThen(formatar)
		.apply(p.preco, p.desconto);
		
		System.out.println(valorFinal);
		
		
		
		
		
		
		
		
		
		
		

		
		
		
	}

}