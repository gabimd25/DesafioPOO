package desafio7;

public class Main {
    
    public static void main(String[] args) {
        Gerente gerente1 = new Gerente("Jaqueline Pedroso", 35, 9000.00);
        Supervisor supervisor1 = new Supervisor("Carlos de Souza", 42, 6000.00);
        Vendedor vendedor1 = new Vendedor("Marcelo Moraes", 22, 2500.00);

        System.out.printf("Gerente %s recebe %.2f de bonificação%n",gerente1.getNome(), gerente1.bonificacao());
        System.out.printf("Supervisor %s recebe %.2f de bonificação%n",supervisor1.getNome(), supervisor1.bonificacao());
        System.out.printf("Vendedor %s recebe %.2f de bonificação%n",vendedor1.getNome(), vendedor1.bonificacao());

    }
}
