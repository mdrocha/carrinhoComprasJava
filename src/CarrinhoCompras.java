public class CarrinhoCompras {
    public static void main(String[] args) {
        Produto p1 = new Produto("Produto 1\n", 10.0);
        Produto p2 = new Produto("Produto 2\n", 20.0);
        Produto p3 = new Produto("Produto 3\n", 15.0);

        ItemCarrinho item1 = new ItemCarrinho(p1.getNome(), p1.getPreco(), 1);
        ItemCarrinho item2  = new ItemCarrinho(p2.getNome(), p2.getPreco(), 1);
        ItemCarrinho item3 = new ItemCarrinho(p3.getNome(), p3.getPreco(), 1);

        double totalCarrinho = item1.getPreco() + item2.getPreco() + item3.getPreco();

        System.out.println("Carrinho de Compras");
        System.out.println("Item 1: " + item1.getNome() + "Quantidade: " + item1.getQuantidade() + ", Preço total: " + item1.getPreco());
        System.out.println("Item2: " + item2.getNome() + "Quantidade: " + item2.getQuantidade() + ", Preço total: " + item2.getPreco());
        System.out.println("Item 3: " + item3.getNome() + "Quantidade: " + item3.getQuantidade() + ", Preço total: " + item3.getPreco());

        System.out.println("Total do Carrinho: " + totalCarrinho);
    }
}