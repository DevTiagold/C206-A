package Exercício_Interface;

public class Lontra extends Mamifero implements Aquatico{

    public Lontra(String nome, double vida) {
        super(nome, vida);
    }

    @Override
    public void emitirSom() {
        System.out.println("Lontro está emitindo som!");
    }

    @Override
    public void nadar() {
        System.out.println("Lontra nadando!");
    }
}
