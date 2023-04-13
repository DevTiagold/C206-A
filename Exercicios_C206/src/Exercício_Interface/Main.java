package Exercício_Interface;

public class Main {
    public static void main(String[] args) {

        Lontra lontra = new Lontra("Kleusa", 100);
        Cachorro dog = new Cachorro("Linda", 100);
        Boi b1 = new Boi("Bandido", 100);

        b1.emitirSom();
        b1.mostraInfo();
        System.out.println("-------------------------------------------------------");
        dog.emitirSom();
        dog.mostraInfo();
        System.out.println("-------------------------------------------------------");
        lontra.emitirSom();
        lontra.nadar();
        lontra.mostraInfo();
        System.out.println("-------------------------------------------------------");



    }
}
