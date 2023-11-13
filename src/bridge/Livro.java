package bridge;

public class Livro implements DetalhesDoProduto {
    private String nome;
    private int pageCount;

    public Livro(String nome, int numPaginas) {
        this.nome = nome;
        this.pageCount = numPaginas;
    }

    @Override
    public String detalhes() {
        return "Livro - Nome: " + nome + ", Páginas: " + pageCount;
    }
}