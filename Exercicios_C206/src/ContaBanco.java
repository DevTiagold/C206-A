import java.util.Scanner;
public class ContaBanco {
    String nomeDoContratante;
    float saldoDaConta = 1000;

    int senhaDaConta = 1234;


    //configurando débito
    public void debito(float quantia){
        saldoDaConta += quantia;
    }
    public void saque(float quantia){
        saldoDaConta -= quantia;
    }
}
