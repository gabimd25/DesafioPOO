package desafio3;

import java.util.List;
import java.util.Random;

public class Guerreiro extends Personagem {

    List<String> habilidade;
    private static int quantidadeGuerreiros;

    public Guerreiro(String nome, int vida, int mana, float xp, int inteligencia, int forca, int level) {
        super(nome, vida, mana, xp, inteligencia, forca, level);
        quantidadeGuerreiros++;
    }
      
    public List<String> getHabilidade() {
        return habilidade;
    }

    public void setHabilidade(List<String> habilidade) {
        this.habilidade = habilidade;
    }

    public static int getQuantidadeGuerreiros() {
        return quantidadeGuerreiros;
    }

    @Override
    public void lvlUp(){

    }

    public int attack(){
        Random random = new Random();
        int attack = this.getForca()*this.getLevel();
        attack += random.nextInt(300);
        return attack;
    }

    public void aprenderHabilidade(String habilidade){
        this.habilidade.add(habilidade);
    }
    
    public void dano(int dano){
        this.setVida(getVida()-dano);
    }
}
