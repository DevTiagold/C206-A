package Arkanoid;

import Arkanoid.bloco.Bloco;
import Arkanoid.conversor.Conversor;
import Arkanoid.jogador.Jogador;

public class Main {
    public static void main(String[] args) {
        Bloco bloco1 = new Bloco();//numBlocos = 1
        Bloco bloco2 = new Bloco();//numBlocos = 2
        Bloco bloco3 = new Bloco();//numBlocos = 3
        Bloco bloco4 = new Bloco();//numBlocos = 4
        Bloco bloco5 = new Bloco();//numBlocos = 5

        System.out.println("===========================INICIANDO ARKANOID===================================");
        System.out.println("Blocos em jogo: " + Bloco.getNumBlocos());
        System.out.println("================================================================================");
        Jogador j1 = new Jogador();
        System.out.println("Blocos em jogo: " + Bloco.getNumBlocos());
        System.out.println("Pontos do jogador " + j1.getPonto());
        System.out.println("--------------------------------------------------------------------------------");

        j1.destruirBloco(bloco1);
        System.out.println("Blocos em jogo: " + Bloco.getNumBlocos());
        System.out.println("Pontos do jogador " + j1.getPonto());
        System.out.println("--------------------------------------------------------------------------------");

        j1.destruirBloco(bloco2);
        System.out.println("Blocos em jogo: " + Bloco.getNumBlocos());
        System.out.println("Pontos do jogador " + j1.getPonto());
        System.out.println("--------------------------------------------------------------------------------");

        j1.destruirBloco(bloco3);
        System.out.println("Blocos em jogo: " + Bloco.getNumBlocos());
        System.out.println("Pontos do jogador " + j1.getPonto());
        System.out.println("--------------------------------------------------------------------------------");

        j1.destruirBloco(bloco4);
        System.out.println("Blocos em jogo: " + Bloco.getNumBlocos());
        System.out.println("Pontos do jogador " + j1.getPonto());
        System.out.println("--------------------------------------------------------------------------------");

        j1.destruirBloco(bloco5);
        System.out.println("Blocos em jogo: " + Bloco.getNumBlocos());
        System.out.println("Pontos do jogador " + j1.getPonto());
        System.out.println("--------------------------------------------------------------------------------");

        Conversor.converter(j1.getPonto());
    }
}
