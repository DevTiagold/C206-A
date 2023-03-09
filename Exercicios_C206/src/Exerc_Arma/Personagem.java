package Exerc_Arma;

public class Personagem {
    String nome;
    int pontos;//vida
    Arma arma;//agragacao
    void usarArma(){
        arma.resistencia -= 2;
    }
    void tomarDado(){
        pontos -= 5;
    }

}
