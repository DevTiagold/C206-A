package Brownie;

public class BrownieCafe extends Brownie{
    public BrownieCafe(String nome, double preco, String sabor) {
        super(nome, preco, sabor);
    }
    public void adicionaCafe(){
        System.out.println("Adicionado mais café!!");
    }

    @Override
    public void addCarrinhoDeCompras() {
        super.addCarrinhoDeCompras();
        System.out.println("Brownies de café foram adicionados ao carrinhos de compras!");
    }
}
