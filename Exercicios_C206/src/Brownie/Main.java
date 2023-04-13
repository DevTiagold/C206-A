package Brownie;

public class Main {
    public static void main(String[] args) {
        Brownie b1 = new BrownieNutella("Brownie Nutella", 10, "Nutella");
        Brownie b2 = new BrownieNutella("Brownie Café", 5, "Café");
        Brownie b3 = new BrownieNutella("Brownie Doce de Leite", 5, "Doce de leite");

        b1.mostraInfo();
        b1.addCarrinhoDeCompras();
        System.out.println("-----------------------------------------------------------");
        b2.mostraInfo();
        b2.addCarrinhoDeCompras();
        System.out.println("-----------------------------------------------------------");
        b3.mostraInfo();
        b3.addCarrinhoDeCompras();
        System.out.println("-----------------------------------------------------------");
    }
}
