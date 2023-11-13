package bridge;

public class Main {
    public static void main(String[] args) {
        Produto livro = new ProdutoGenerico(new Livro("Livro sobre PowerBuilder", 500));
        Produto smartphone = new ProdutoGenerico(new Eletronico("Celularzao Tunado", "Ephone"));

        livro.exibir();
        smartphone.exibir();
    }
}