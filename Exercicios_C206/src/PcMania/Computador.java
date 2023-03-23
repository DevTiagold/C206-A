package PcMania;

import java.sql.SQLOutput;

public class Computador {
    //atributos
    String marca;
    float preco;
    HardwareBasico hardwareBasico;
    SistemaOperacional sistemaOperacional;
    Computador[]  c1 = new Computador[100];

    public Computador(String marca, float preco, String nomeHardware,float clock, int memoriaRam, float capacidade, String nomeSistema, int tipo) {
        this.marca = marca;
        this.preco = preco;
        hardwareBasico = new HardwareBasico(nomeHardware, clock, memoriaRam, capacidade);
        sistemaOperacional = new SistemaOperacional(nomeSistema, tipo);
    }

    public void mostraPCConfigs1(){
        System.out.println("Marca: " + this.marca);
        System.out.println("Preco: R$" + this.preco);
        System.out.println("Processador: " + this.hardwareBasico.nomeHardware + " (" + this.hardwareBasico.clock + " Mhz)");
        System.out.println(this.hardwareBasico.memoriaRam + " Gb de Memória RAM");
        System.out.println(this.hardwareBasico.capacidade + " Gb de HD");
        System.out.println(this.sistemaOperacional.nomeSistema + "(" + this.sistemaOperacional.tipo + " bits)");
    }
   //Computador computador;
    public void mostraPCConfigs(){
        System.out.println("--------------------------------------------------------------------------------------------------------------------");
        System.out.println("Marca: " + this.marca);
        System.out.println("Preco: R$" + this.preco);
        System.out.println("Processador: " + this.hardwareBasico.nomeHardware + " (" + this.hardwareBasico.clock + " Mhz)");
        System.out.println(this.hardwareBasico.memoriaRam + " Gb de Memória RAM");
        System.out.println(this.hardwareBasico.capacidade + " Gb de HD");
        System.out.println(this.sistemaOperacional.nomeSistema + "(" + this.sistemaOperacional.tipo + " bits)");
        System.out.println("--------------------------------------------------------------------------------------------------------------------");

    }
    public void addMemoriaUSB(MemoriaUSB musb){

    }
}
