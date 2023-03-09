package Exerc_Arma;

public class MainExer5 {
    public static void main(String[] args) {
        Personagem tiago = new Personagem();
        tiago.nome = "Tiago";
        tiago.pontos = 100;

        Arma arma_tiago = new Arma();
        arma_tiago.resistencia = 100;
        arma_tiago.descricao = "Lança missil";
        arma_tiago.poder = 1000;

        tiago.arma = arma_tiago;

        System.out.println("Vida: " + tiago.pontos);
        tiago.tomarDado();
        System.out.println("Vida: " + tiago.pontos);

        System.out.println("-informações da arma: ");
        arma_tiago.mostraArma();
        tiago.usarArma();
        System.out.println("-informações da arma: ");
        arma_tiago.mostraArma();
    }
}
