package Arkanoid.bloco;

public class Bloco {
    private static int numBlocos = 0;

    public Bloco() {
        numBlocos++;
    }
    public void detruir(){
        System.out.println("Bloco sendo destrído...");
        numBlocos--;
    }

    public static int getNumBlocos() {
        return numBlocos;
    }

}
