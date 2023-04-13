package Brownie;

public class BrownieNutella extends Brownie{

    public BrownieNutella(String nome, double preco, String sabor) {
        super(nome, preco, sabor);
    }
    public void adicionaNutella(){
        System.out.println("Adicionado mais nutella!!");
    }

    @Override
    public void addCarrinhoDeCompras() {
        super.addCarrinhoDeCompras();
        System.out.println("Brownies de nutella foram adicionados ao carrinhos de compras!");
    }
}
