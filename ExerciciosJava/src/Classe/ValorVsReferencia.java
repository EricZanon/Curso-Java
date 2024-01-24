package Classe;

public class ValorVsReferencia {
	
	public static void main(String[] args) {

        // Atribuição por valor
        double a = 2;
        double b = a;

        a++;
        b--;

        System.out.println(a + " e " + b);

        // atribuição por referência
        Data d1 = new Data(14, 12, 2023);
        Data d2 = d1;

        // ambos d1 e d2 são alterados pois é uma referência à um objeto
        d1.dia = 8;
        d2.mes = 03;

        System.out.println(d1.obterDataFormatada() + " e " + d2.obterDataFormatada());

        voltarDataPadrao(d1); // ambas as datas são alteradas

        System.out.println(d1.obterDataFormatada() + " e " + d2.obterDataFormatada());
        
        int c = 5;
        alterarPrimitivo(c);
        
        System.out.println(c);
    }
    // quando um objeto é passado como parâmetro de um método o que é alterado é a referência na memória e não o valor de cada objeto
    static void voltarDataPadrao(Data d) {
        d.dia = 1;
        d.mes = 1;
        d.ano = 1970;
    }
    
    static void alterarPrimitivo (int a) {
        a++;
    }

}
