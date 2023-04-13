package Arkanoid.jogador;

import Arkanoid.bloco.Bloco;

public class Jogador{
    private int ponto = 0;


    public void destruirBloco(Bloco bloco){
        bloco.detruir();
        ponto++;
    }

    public int getPonto() {
        return ponto;
    }

    public void setPonto(int ponto) {
        this.ponto = ponto;
    }
}
