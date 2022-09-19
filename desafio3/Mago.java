package desafio3;

import java.util.List;
import java.util.Random;

public class Mago extends Personagem{

private List<String> magia;
private static int quantidadeMagos;

public Mago(String nome, int vida, int mana, float xp, int inteligencia, int forca, int level) {
    super(nome, vida, mana, xp, inteligencia, forca, level);
    quantidadeMagos++;
}

public List<String> getMagia() {
    return magia;
}

public void setMagia(List<String> magia) {
    this.magia = magia;
}

public static int getQuantidadeMagos(){
    return quantidadeMagos;
}

@Override
public void lvlUp() {
    super.lvlUp();
}

public int attack(){
    Random random = new Random();
    int attack = this.getInteligencia()*this.getLevel();
    attack += random.nextInt(300);
    return attack;
}

public void aprenderMagia(String magia){
    this.magia.add(magia);
}

public void dano(int dano){
    this.setVida(getVida()-dano);
}
    
}
