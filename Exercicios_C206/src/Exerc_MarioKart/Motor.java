package Exerc_MarioKart;

public class Motor {

    int cilindradas;
    float velocidadeMaxima;

    void mostraInfo(String nome){
        System.out.println("Kart: "+nome);
        System.out.println("-"+cilindradas+"cc de potência");
        System.out.println("-"+velocidadeMaxima+"km/h de velocidade máxima");
    }
}
