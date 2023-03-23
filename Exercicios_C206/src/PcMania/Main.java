package PcMania;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Scanner entrada = new Scanner(System.in);
        boolean flag = true;
        int opcao; // Promocao1 , promocao2, promocao3
        Computador[] c1 = new Computador[100];
        Computador[] c2 = new Computador[100];
        Computador[] c3 = new Computador[100];
        Computador comp1 = new Computador("Positivo", 2300, "Pentium core i3", 2200, 8, 500, "Sistema Operacional Linux Ubuntu", 32);
        Computador comp2 = new Computador("Acer", 5800, "Pentium core i5", 3370, 16, 1, "Sistema Operacional Windows 8", 64);
        Computador comp3 = new Computador("Vaio", 1800, "Pentium Core i7", 4500, 32, 2, "Sistema Operacional Windows 10", 64);

        System.out.println("--------------------------------------------------------------------------------------------------------------------");
        System.out.println("Bem vindo a melhor loja de Pcs da região, PC MANIA!!!");
        Thread.sleep(500);
        System.out.println("Estamos com algumas promoções, para agilizar vou mostrá-las pra você!!");
        Thread.sleep(500);
        System.out.println("--------------------------------------------------------------------------------------------------------------------");

        comp1.mostraPCConfigs1();
        System.out.println("--------------------------------------------------------------------------------------------------------------------");
        Thread.sleep(2000);

        comp2.mostraPCConfigs1();
        System.out.println("--------------------------------------------------------------------------------------------------------------------");
        Thread.sleep(2000);

        comp3.mostraPCConfigs1();
        System.out.println("--------------------------------------------------------------------------------------------------------------------");
        Thread.sleep(2000);

        System.out.println("Se interessou por alguma promoção?");
        System.out.println("1-Promcao 1");
        System.out.println("2-Promocao 2");
        System.out.println("3-Promocao 3");

        while(flag == true){
            System.out.print("Digite e aguarde: ");
            opcao = entrada.nextInt();
            //animacao pesquisando
            System.out.print("pesquisando.");
            Thread.sleep(500);
            System.out.print(".");
            Thread.sleep(500);
            System.out.println(".");
            Thread.sleep(500);

            switch (opcao){
                case 1:
                    comp1.mostraPCConfigs();
                    break;

                case 2:

                    comp2.mostraPCConfigs();
                    break;

                case 3:

                    comp3.mostraPCConfigs();
                    break;

                case 0:
                    flag = false;
                    System.out.print("Saindo da PC MANIA.");
                    Thread.sleep(500);
                    System.out.print(".");
                    Thread.sleep(500);
                    System.out.println(".");
                    Thread.sleep(500);
                    break;

                default:
                    System.out.println("Só temos 3 promoções, digite novamente!");
                    break;
            }
        }
    }
}
