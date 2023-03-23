package PcMania;

public class Cliente {
    //atributos
    String nome;
    long cpf;
    Computador[] computadors = new Computador[100];

    public Cliente(String nome, long cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    //metodos
     float calculaTotalCompra(){

         return 1;
     }
}
