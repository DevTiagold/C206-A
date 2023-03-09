package Aula2;

public class MainZ{
    public static void main(String[] args) {
        Zumbi c = new Zumbi();
        c.nome = "Chris";
        if(c.alimentado == true){
            System.out.println("O zumbi " + c.nome + " está alimentado");
        }
        if(c.vida > 0){
            System.out.println("O zumbi " + c.nome + " está vivo");
        }

        Zumbi tiago = new Zumbi();
        tiago.vida = 30;

    }
}