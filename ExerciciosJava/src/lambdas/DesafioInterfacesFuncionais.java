package lambdas;

import java.util.function.Function;
import java.util.function.UnaryOperator;

public class DesafioInterfacesFuncionais {
	
	public static void main(String[] args) {
		
		Produto p1 = new Produto("Ipad", 3235.89, 0.13);
		
		Function<Produto, Double> precoDesconto = p -> p.preco * (1 - p.desconto);
		System.out.println(precoDesconto.apply(p1));
		
		UnaryOperator<Double> impostoMunicipal = (preco) -> preco >= 2500.00 ? preco * 1.085 : preco;
		
		double valorComImposto = precoDesconto
				.andThen(impostoMunicipal)
				.apply(p1);
		
		System.out.println(valorComImposto);
		
		UnaryOperator<Double> frete = (preco) -> preco >= 3000.0 ? preco + 100 : preco + 50;
		double valorFrete = precoDesconto
				.andThen(impostoMunicipal)
				.andThen(frete)
				.apply(p1);
		
		System.out.println(valorFrete);
		
		/* 
		* 	                             ARREDONDAR UM VALOR DOUBLE PRA 2 CASAS DECIMAIS:
		* 
		* 			                     Double.parseDouble(String.format("%.2f", valor));
		* 
		* 														OU
		* 										Math.round(valor * 100.0) / 100.0
		*  O valor é multiplicado por 100.0 para que volte a ser um double, já que Math.round o converte para Long
		*  Se o valor original é 12.3456, multiplicar por 100.0 resulta em 1234.56.
		*  Em seguida, Math.round(1234.56) arredondará para 1235.
		*  Dividir o resultado por 100.0 novamente (1235 / 100.0) dá 12.35, que é o valor arredondado para duas casas decimais.
		*/
		
		UnaryOperator<Double> arredondar = (valor) -> Math.round(valor * 100.0) / 100.0;
		
		double valorArredondado = precoDesconto
				.andThen(impostoMunicipal)
				.andThen(frete)
				.andThen(arredondar)
				.apply(p1);
		
		System.out.println(valorArredondado);
		
		Function<Double, String> formatar = (valor) -> 
		("\nO total da compra com desconto,\nfrete e impostos foi: R$ " + valor).replace(".", ",");
		
		String valorFinal = precoDesconto
		.andThen(impostoMunicipal)
		.andThen(frete)
		.andThen(arredondar)
		.andThen(formatar)
		.apply(p1);
		
		System.out.println(valorFinal);
		
		}

}
