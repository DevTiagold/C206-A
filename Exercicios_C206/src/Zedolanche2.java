import java.util.Scanner;
public class Zedolanche2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        System.out.println("Digite:");
        int numero1 = entrada.nextInt();//quantidade de lanches primeira rodada
        int numero2 = entrada.nextInt();//quantidade de lanches segunda rodada
        int numero3 = entrada.nextInt();//quantidade de lanches terceira rodada

        entrada.close();
        int soma;
        float media;

         soma = numero1 + numero2 + numero3;
        System.out.println("Soma: " + soma);

         media = (float)soma/3;
        System.out.println("Media: " + media);
    }
}
