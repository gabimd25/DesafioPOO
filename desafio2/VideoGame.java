package desafio2;

public class VideoGame implements Imposto{
    private String marca;
    private String modelo;
    private boolean isUsado;
    private Produto produto;

    public VideoGame(){}  

    public VideoGame(String nome, double preco, int qtd, String marca, String modelo, boolean isUsado) {
        this.produto = new Produto(nome, preco, qtd);
        this.marca = marca;
        this.modelo = modelo;
        this.isUsado = isUsado;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public boolean isUsado() {
        return isUsado;
    }

    public void setUsado(boolean isUsado) {
        this.isUsado = isUsado;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    @Override
    public double calculaImposto() {
        double imposto=0;
        if(this.isUsado){
            imposto = this.produto.getPreco()*0.25;
            System.out.printf("Imposto %s %s usado, RS %.1f %n",this.produto.nome, this.modelo, imposto);
        }
        else{
            imposto = this.produto.getPreco()*0.45;
            System.out.printf("Imposto %s %s RS %.1f %n",this.produto.nome, this.modelo, imposto);
        }
        return imposto;
    }
    
}
