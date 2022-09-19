package desafio4_5_6;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Pessoa> pessoas= new ArrayList<>();

        pessoas.add(new Pessoa("João", 15));
        pessoas.add(new Pessoa("Leandro", 21));
        pessoas.add(new Pessoa("Paulo", 17));
        pessoas.add(new Pessoa("Jessica", 18));

        Pessoa pessoaMaisVelha= pessoas.get(0);
        for (Pessoa pessoa : pessoas) {
            if(pessoa.getIdade()>pessoaMaisVelha.getIdade())
                pessoaMaisVelha=pessoa;
        }
        System.out.printf("Exercício 4: %n");
        System.out.printf("A pessoa mais velha é " + pessoaMaisVelha);

        //Exercício 5
        int idadeMinima=18;
        System.out.printf("%nExercício 5: %n");
        System.out.printf("Antes de remover, a lista tem %d pessoas %n", pessoas.size());
        pessoas.removeIf(p -> (p.getIdade() < idadeMinima));
        System.out.printf("Depois de remover, a lista tem %d pessoas %n", pessoas.size());

        //Exercício 6
        System.out.printf("Exercício 6: %n");

        for (Pessoa pessoa : pessoas) {
            if(pessoa.getNome()=="Jessica"){
                System.out.println(pessoa);
            }
        }

    }
}
