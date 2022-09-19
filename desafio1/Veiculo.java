package desafio1;

public class Veiculo {
    private String marca;
    private String modelo;
    private String placa;
    private String cor;
    private float km;
    private boolean isLigado= false;
    private int litrosCombustivel;
    private int velocidade;
    private double preco;
    private int capacidadeTanque = 60;
    
    public Veiculo(String marca, String modelo, String placa, String cor, float km, int litrosCombustivel,
            double preco) {
        this.marca = marca;
        this.modelo = modelo;
        this.placa = placa;
        this.cor = cor;
        this.km = km;
        this.litrosCombustivel = litrosCombustivel;
        this.preco = preco;
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
    public String getPlaca() {
        return placa;
    }
    public void setPlaca(String placa) {
        this.placa = placa;
    }
    public String getCor() {
        return cor;
    }
    public void setCor(String cor) {
        this.cor = cor;
    }
    public float getKm() {
        return km;
    }
    public void setKm(float km) {
        this.km = km;
    }
    public boolean isLigado() {
        return isLigado;
    }
    public void setLigado(boolean isLigado) {
        this.isLigado = isLigado;
    }
    public int getLitrosCombustivel() {
        return litrosCombustivel;
    }
    public void setLitrosCombustivel(int litrosCombustivel) {
        this.litrosCombustivel = litrosCombustivel;
    }
    public int getVelocidade() {
        return velocidade;
    }
    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }
    public double getPreco() {
        return preco;
    }
    public void setPreco(double preco) {
        this.preco = preco;
    } 

    public void acelerar(){
        if(isLigado==true)
            velocidade+=20;
        else{
            System.out.println("Ligue o carro.");
        }
    }
    public void abastecer(int combustivel){
        if(litrosCombustivel+combustivel<=60)
            litrosCombustivel+= combustivel;
        else{
            System.out.printf("O carro já possui %d, o abastecimento máximo é de %d litros%n", litrosCombustivel,capacidadeTanque-litrosCombustivel);
        }
    }

    public void frear(){
        if(velocidade>=20){
            velocidade-=20;
        }
        else if(velocidade>0){
            velocidade=0;
        }
        else{
            System.out.println("O carro já está parado%n");
        }
    }

    public void pintar(String cor){
        setCor(cor);
        System.out.printf("A nova cor do carro é %s%n", this.cor);
    }

    public void ligar(){
        if(!isLigado){
            isLigado=true;
        }
    }

    public void desligar(){
        if(velocidade==0)
        {
            if(isLigado)
                isLigado=false;
        }
        else{
            System.out.println("O carro só pode ser desligado quando está parado.%n");
        }
    }
}
