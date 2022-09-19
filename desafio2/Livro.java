package desafio2;

public class Livro implements Imposto{
    private String autor;
    private String tema;
    private int qtdPag;
    private Produto produto;

    public Livro(){}

    public Livro(String nome, double preco, int qtd, String autor, String tema, int qtdPag){
        this.produto = new Produto(nome, preco, qtd);
        this.autor=autor;
        this.tema=tema;
        this.qtdPag=qtdPag;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getTema() {
        return tema;
    }

    public void setTema(String tema) {
        this.tema = tema;
    }

    public int getQtdPag() {
        return qtdPag;
    }

    public void setQtdPag(int qtdPag) {
        this.qtdPag = qtdPag;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    @Override
    public double calculaImposto() {
        if(this.tema=="educativo"){
            System.out.printf("Livro educativo não tem imposto: %s.%n", this.getProduto().getNome());
            return 0;
        }
        else{
            double imposto = this.getProduto().getPreco()*0.1;
            System.out.printf("R$ %.1f de impostos sobre o livro %s.%n", imposto, this.getProduto().getNome());
            return imposto;
        }
    }
}
