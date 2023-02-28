import java.util.Random;
import java.util.Scanner;
public class exerc6 {
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
            else if(valor < x){
                System.out.println("O valor sorteado é maior, continue tentando...");
            }
            else if(valor > x){
                System.out.println("O valor sorteado é menor, continue tentando...");
            }

        }while(valor != x);


        //System.out.println(x);
    }
}
