
import java.util.Scanner;
public class exerc4{
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        System.out.println("Digite um numero de alunos:");
        int nalunos = entrada.nextInt();

        switch (nalunos){
            case 10:
            case 20:
                System.out.println("A sala de aula será I-16");
                break;
            case 30:
                System.out.println("deve ser utilizada a sala 22");
                break;
            default:
                System.out.println("Não temos aula, sinto muito!! IUUUUHUUUU");
                break;
        }
    }
}
