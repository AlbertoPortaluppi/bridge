package bridge;

public class Eletronico implements DetalhesDoProduto {
    private String fabricante;
    private String modelo;

    public Eletronico(String fabricante, String modelo) {
        this.fabricante = fabricante;
        this.modelo = modelo;
    }

    @Override
    public String detalhes() {
        return "Eletrônico - Fabricante: " + fabricante + ", Modelo: " + modelo;
    }
}