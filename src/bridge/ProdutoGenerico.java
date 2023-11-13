package bridge;

public class ProdutoGenerico extends Produto {

    public ProdutoGenerico(DetalhesDoProduto detalhesDoProduto) {
        super(detalhesDoProduto);
    }

    @Override
    public void exibir() {
        System.out.println("Detalhes do Produto: " + detalhesDoProduto.detalhes());
    }
}