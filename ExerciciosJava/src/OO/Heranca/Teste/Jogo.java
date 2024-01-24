package OO.Heranca.Teste;

import OO.Heranca.Direcao;
import OO.Heranca.Heroi;
import OO.Heranca.Jogador;
import OO.Heranca.Monstro;

public class Jogo {

	public static void main(String[] args) {

		Jogador monstro = new Monstro();
		monstro.x = 2;
		monstro.y = 2;
		monstro.nome = "ogro";
		
		Jogador heroi = new Heroi(10, 11);
		heroi.x = 3;
		heroi.y = 4;
		heroi.nome = "perseu";
		
		monstro.andar(Direcao.NORTE);
		monstro.andar(Direcao.NORTE);
		monstro.andar(Direcao.SUL);
		monstro.andar(Direcao.NORTE);
		monstro.andar(Direcao.OESTE);
		monstro.andar(Direcao.LESTE);
		monstro.andar(Direcao.LESTE);
		monstro.andar(Direcao.LESTE);
		
		heroi.posicao();
		monstro.posicao();
		
		System.out.println();
		
		heroi.atacar(monstro);
		monstro.atacar(heroi);
		
		heroi.exibirVida();
		monstro.exibirVida();
		
		System.out.println();
		
		heroi.atacar(monstro);
		monstro.atacar(heroi);
		
		heroi.exibirVida();
		monstro.exibirVida();
		
		System.out.println();
		
		monstro.andar(Direcao.SUL);
		heroi.atacar(monstro);
		monstro.atacar(heroi);
		
		heroi.exibirVida();
		monstro.exibirVida();
		
		System.out.println();
		
		heroi.andar(Direcao.SUL);
		heroi.atacar(monstro);
		monstro.atacar(heroi);
		
		heroi.exibirVida();
		monstro.exibirVida();
		
		
		
		
		
		
	}

}
