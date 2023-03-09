package Aula1;

import java.util.Scanner;
public class exerc3 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        System.out.println("Digite sua NPA: ");
        int NPA = entrada.nextInt();

        if(NPA >= 60){
            System.out.println("Aluno aprovado");
        }
        else {
            System.out.println("Nota NP3:");
            int NP3 = entrada.nextInt();
            int soma = NPA + NP3;
            float media = (float) soma / 2;

            if (media >= 50) {
                System.out.println("Nota: " + media);
                System.out.println("Aluno aprovado");
            } else {
                System.out.println("Nota: " + media);
                System.out.println("Aluno reprovado");
            }
        }

        entrada.close();
    }


}
