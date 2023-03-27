package CampoMinado;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Random rand = new Random();
        int [][] matriz = new int[2][2];
        int x = rand.nextInt(2);
        int y = rand.nextInt(2);
        int i, j;
        System.out.println("Posiçao bomba: " + x + " " + y);

        System.out.print("Entre com a posiçao x e y: ");// 0 e 1
        int posX = entrada.nextInt();//de 0-1
        int posY = entrada.nextInt();

        for(i = 0; i<matriz.length; i++){
            for(j=0; j<matriz[i].length; j++){
                if(posX == x && posY == y){
                    System.out.println("caiu na bomba!");
                    break;
                }
            }
            break;
        }

    }
}
