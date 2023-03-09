package Aula1;

import java.util.Random;
import java.util.Scanner;
public class exerc5 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        System.out.println("Digite um número e tente a sorte!!");
        Random rand = new  Random();
        int x = rand.nextInt(10)+1;
        System.out.println("O numero correto é: " + x);
        int valor;

        do {
            valor = entrada.nextInt();
            if(valor == x) {
                System.out.println("Você acertou! O número correto é " + x);
            }
            else{
                System.out.println("Você errou, continue tentando...");

            }

        }while(valor != x);


        //System.out.println(x);
    }
}
