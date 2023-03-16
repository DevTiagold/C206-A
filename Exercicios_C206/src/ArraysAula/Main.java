package ArraysAula;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Salgado[] salgados = new Salgado[3];
        Cantina cantina = new Cantina();
        boolean flag = true;

        while(flag){
            System.out.println("1-add salgado 2-Ver salgados 3-Sair da cantina");
            int opcao = entrada.nextInt();
            if(opcao == 1){
                System.out.print("Adicione um salgado: ");
                entrada.nextLine();
                String nome = entrada.nextLine();
                Salgado nSalgado = new Salgado(nome);
                cantina.addSalgado(nSalgado);
            }
            if(opcao == 2){

                cantina.mostrandoInfo();
            }
            if(opcao == 3){
                flag = false;
            }
        }

    }
}
