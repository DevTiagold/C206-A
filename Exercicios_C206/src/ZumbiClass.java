public class ZumbiClass {
    double vida;
    String nome;

    double mostraVida(){
        System.out.println(vida);
        return 0;
    }

    boolean transfereVida(ZumbiClass zumbialvo, double quantia){
        if(vida > quantia){
            vida -= quantia;
            zumbialvo.vida += quantia;
            return false;
        }
        else{
            return true;
        }

    }
}
