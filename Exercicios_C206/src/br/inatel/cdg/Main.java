package br.inatel.cdg;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        br.inatel.cdg.jogador.Nave jogadores = new br.inatel.cdg.jogador.Nave("Millenion Falcon", 100, "laser");
        br.inatel.cdg.inimigo.Asteroide inimigo = new br.inatel.cdg.inimigo.Asteroide("Pedra que vem do céu", "Grandão");

        //Sout e informações
        System.out.println("-----------------------------------------------------------------------------------------");
        System.out.println("Infos nave: ");
        System.out.println("Nome da nave: " + jogadores.getNome());
        System.out.println("Tipo de arma: " + jogadores.getTipoTiro());
        System.out.println("-----------------------------------------------------------------------------------------");
        System.out.print("Localizando asteroide.");
        Thread.sleep(1000);
        System.out.print(".");
        Thread.sleep(1000);
        System.out.println(".");
        Thread.sleep(1000);
        System.out.println("-----------------------------------------------------------------------------------------");
        System.out.println("Infos asteroide: ");
        System.out.println("Nome do asteroide: " + inimigo.getNome());
        System.out.println("Tipo do asteroide: " + inimigo.getTipoAsteroide());
        System.out.println("-----------------------------------------------------------------------------------------");
        System.out.print("Atirando.");
        Thread.sleep(1000);
        System.out.print(".");
        Thread.sleep(1000);
        System.out.println(".");
        Thread.sleep(1000);

        jogadores.atirar(inimigo);
        inimigo.destruir();
    }
}
