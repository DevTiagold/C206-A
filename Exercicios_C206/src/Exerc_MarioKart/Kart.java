package Exerc_MarioKart;

public class Kart {
    //Membros da classe
    String nome;
    Motor motor;
    //Resgatando piloto em Kart
    Piloto corredor;
    //Métodos
    void pular(){
        System.out.println(nome + ", pulou!");
    }
    public Kart() {
        motor  =  new Motor();
    }
    void soltarTurbo(){
        System.out.println(nome + ", saltou!");
    }
    void fazerDrif(){
        System.out.println(nome + ", fez um driftt Incrível!");
    }
}
