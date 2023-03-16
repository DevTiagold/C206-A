package ArraysAula;

import java.sql.SQLOutput;

public class Cantina {
    String nome = "Cantina Inatel";
    Salgado salgados[] = new Salgado[3];

    public void addSalgado(Salgado novoSalgado){
        for(int i = 0; i < salgados.length; i++){
                if(salgados[i] == null) {
                    salgados[i] = novoSalgado;
                    break;
                }
        }

    }
    public void mostrandoInfo(){
        System.out.println("Cardápio: ");
        for(int i = 0; i < salgados.length; i++){
            if(salgados[i] != null){
                System.out.println("-" + salgados[i].nomeSalgado);
            }
        }

    }
}
