package desafio1;

public class Main {
    public static void main(String[] args) {
        Veiculo carro1 = new Veiculo("Fiat", "Uno", "DVA7002", "cinza", 100, 15, 45000);
        
        carro1.ligar();
        System.out.printf("Velocidade: %d%n", carro1.getVelocidade());
        carro1.acelerar();
        System.out.printf("Velocidade: %d%n", carro1.getVelocidade());

        carro1.abastecer(50);

        carro1.frear();
        System.out.printf("A cor do carro é %s%n",carro1.getCor());
        carro1.pintar("vermelho");
        carro1.desligar();

    }
}
