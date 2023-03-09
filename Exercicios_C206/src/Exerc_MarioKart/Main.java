package Exerc_MarioKart;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;
public class Main {
    public static void main(String[] args) throws InterruptedException {
        Scanner entrada = new Scanner(System.in);
        Kart kart = new Kart();
        Piloto p1 = new Piloto();

        //Relacionando por integração piloto p1 a Kart
        kart.corredor = p1;
        //costomizando o Kart e o motor
        System.out.println("Vamos iniciar a incrição do seu kart no campeonato do Mário Cup!!!");
        System.out.println("Vamos começar pelo seu possante! Me fala qual o nome do Kart: ");
        kart.nome = entrada.nextLine();
        System.out.print("Quanto de potência terá o "+kart.nome+" em cilindradas: ");
        kart.motor.cilindradas = entrada.nextInt();
        if(kart.motor.cilindradas > 200)
            System.out.println("Parece muito potente, dará trabalho pros competidores!!!");
        System.out.print("Qual a velocidade máxima marcada: ");
        kart.motor.velocidadeMaxima = entrada.nextFloat();
        if(kart.motor.velocidadeMaxima > 150)
            System.out.println("UAUUU, isso é muito veloz!!!");
        System.out.println("Bom, tudo pronto com relação a seu kart! Só vamos fazer uma avaliação de requisitos mínimos.");
        System.out.println("Avaliando...");

        Thread. sleep(5000);

        if(kart.motor.velocidadeMaxima > 100 && kart.motor.cilindradas > 125){
            System.out.println("Seu kart está inscrito com sucesso!");
            kart.motor.mostraInfo(kart.nome);
        }
        else{
            System.out.println("Lamento, seu kart não atende aos requisitos minimos da competição!");
            System.out.println("A velocidade tem que ser maior que 100km/h e a potencia maior que 125cc");
            System.out.println("Abaixo suas informações!!");
            kart.motor.mostraInfo(kart.nome);
        }





    }
}
