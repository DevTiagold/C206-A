package Brownie;

public class BrownieDoceDeLeite extends Brownie{

    public BrownieDoceDeLeite(String nome, double preco, String sabor) {
        super(nome, preco, sabor);

    }
    public void adicionaMaisDoceDeLeite(){
        System.out.println("Adicionado mais Doce de leite!!");
    }

    @Override
    public void addCarrinhoDeCompras() {
        super.addCarrinhoDeCompras();
        System.out.println("Adicionado ao carrinhos de compras!");
        System.out.println("Brownies de Doce de leite foram adicionados ao carrinhos de compras!");
    }
}
