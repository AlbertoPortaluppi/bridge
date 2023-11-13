package bridge;

public abstract class Produto {
    protected DetalhesDoProduto detalhesDoProduto;

    protected Produto(DetalhesDoProduto detalhesDoProduto) {
        this.detalhesDoProduto = detalhesDoProduto;
    }

    public abstract void exibir();
}