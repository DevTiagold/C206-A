import java.util.Scanner;

public class MainZumbiClass {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        float quantia;
        int decisao;
        ZumbiClass z1 = new ZumbiClass();
        ZumbiClass z2 = new ZumbiClass();
        boolean recebe = false;

        //zumbi 1
        z1.nome = "Tih";
        System.out.print("Vida z1: ");
        z1.vida = entrada.nextDouble();
        //zumbi 2
        z2.nome = "Stef";
        System.out.print("Vida z2: ");
        z2.vida =  entrada.nextDouble();

        System.out.println("Mostrando vida do zumbi " + z1.nome);
        z1.mostraVida();
        System.out.println("Mostrando vida do zumbi " + z2.nome);
        z2.mostraVida();

        //tranferindo vida de z1 para z2
        System.out.print("De qual zumbi deseja transferir? 1/z1-z2 2/z2-z1");
        decisao = entrada.nextInt();

        if(decisao == 1) {
            System.out.print("Quanto de vida? ");
            quantia = entrada.nextFloat();
            recebe = z1.transfereVida(z2, quantia);
            if(recebe == true){
                System.out.println("Tranferência de vida negada");
            }
            else
                System.out.println("Tranferência de vida concluida");
        }
        if(decisao == 2){
            System.out.print("Quanto de vida? ");
            quantia = entrada.nextFloat();
            recebe = z2.transfereVida(z1, quantia);
            if(recebe == true){
                System.out.println("Tranferência de vida negada");
            }
            else
                System.out.println("Tranferência de vida concluida");

        }

        System.out.println("Vida de  "+z1.nome +": "+z1.vida);
        System.out.println("Vida de  "+z2.nome +": "+z2.vida);




    }
}
