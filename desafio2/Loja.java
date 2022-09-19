package desafio2;

import java.util.List;

public class Loja {
    private String nome;
    private String cnpj;
    private List<Livro> livros;
    private List<VideoGame> videoGames;

    public Loja(){}

    public Loja(String nome, String cnpj, List<Livro> livros, List<VideoGame> videoGames) {
        this.nome = nome;
        this.cnpj = cnpj;
        this.livros = livros;
        this.videoGames = videoGames;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public List<Livro> getLivros() {
        return livros;
    }

    public void setLivros(List<Livro> livros) {
        this.livros = livros;
    }

    public List<VideoGame> getVideoGames() {
        return videoGames;
    }

    public void setVideoGames(List<VideoGame> videoGames) {
        this.videoGames = videoGames;
    }
    
    public void listaLivros(){
        System.out.printf("-------------------------------------------------------------------%n");
        if(livros.size()==0){
            System.out.printf("A loja não tem livros no seu estoque.%n");
        }
        else{
            System.out.printf("A loja %s possui estes livros para venda:%n",this.nome);
            for (Livro livro : livros) {
                System.out.printf("Título: %s , preço: %.1f , quantidade: %d em estoque.%n",livro.getProduto().getNome(), livro.getProduto().getPreco(), livro.getProduto().getQtd());
            }
        }
    }

    public void listaVideoGames(){
        System.out.printf("-------------------------------------------------------------------%n");
        if(videoGames.size()==0){
            System.out.printf("A loja não tem video-games no seu estoque.%n");
        }
        else{
            System.out.printf("A loja %s possui estes video-games para venda:%n",this.nome);
            for (VideoGame videoGame : videoGames) {
                System.out.printf("Video-game: %s , preço: %.1f , quantidade: %d em estoque.%n",videoGame.getProduto().getNome(), videoGame.getProduto().getPreco(), videoGame.getProduto().getQtd());
            }
        }
    }

    public double calculaPatrimonio(){
        double valorPatrimonio=0;
        for (Livro livro : livros) {
            valorPatrimonio += livro.getProduto().getPreco()*livro.getProduto().getQtd();
        }
        for (VideoGame videoGame : videoGames) {
            valorPatrimonio += videoGame.getProduto().getPreco()*videoGame.getProduto().getQtd();
        }
        System.out.printf("-------------------------------------------------------------------%n");
        System.out.printf("O patrimonio da loja: %s é de R$ %.1f%n", this.nome,valorPatrimonio);
        return valorPatrimonio;
    }
}
