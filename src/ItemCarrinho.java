public class ItemCarrinho extends Produto {
    private int quantidade;

    public ItemCarrinho(String nome, double preco, int quantidade){
        super(nome, preco);
        this.quantidade = quantidade;
    }

    public double getPreco() {
        return super.getPreco() * quantidade;
    }

    public void setQuantidade(int novaQuantidade){
        this.quantidade = novaQuantidade;
    }

    public int getQuantidade(){
        return quantidade;
    }
}