package desafio3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        boolean parar = false;
        List<Mago> magos = new ArrayList<>();
        List<Guerreiro> guerreiros = new ArrayList<>();

        Mago mago1 = new Mago("Richard", 1500, 1000, 0, 200, 80, 1);
        Mago mago2 = new Mago("Rubert", 1600, 1300, 0, 180, 90, 1);
        Mago mago3 = new Mago("Ellie", 1500, 1100, 0, 220, 100, 1);

        Guerreiro guerreiro1 = new Guerreiro("Majore", 1800, 1000, 0, 60, 210, 1);
        Guerreiro guerreiro2 = new Guerreiro("Annabeth", 1600, 1100, 0, 80, 190, 1);
        Guerreiro guerreiro3 = new Guerreiro("Roberto", 1900, 900, 0, 60, 200, 1);

        magos.add(mago1);
        magos.add(mago2);
        magos.add(mago3);
        guerreiros.add(guerreiro1);
        guerreiros.add(guerreiro2);
        guerreiros.add(guerreiro3);

        System.out.printf("Seu pack tem %d personagens.%n", Mago.getQuantidadeMagos() + Guerreiro.getQuantidadeGuerreiros());

        System.out.printf("Jogador 1 escolha seu personagem:%n");
        mostrarPersonagens(magos,guerreiros);
        int input=0;
        String inputString;
        InputStreamReader streamReader = new InputStreamReader(System.in);
        BufferedReader bufferedReader = new BufferedReader(streamReader);
        do{
           inputString = bufferedReader.readLine();
           input = Integer.parseInt(inputString);
           if(input<0 || input>magos.size()+guerreiros.size()-1)
                System.out.printf("Número inválido! Digite novamente.%n");
        }while(input<0 || input>magos.size()+guerreiros.size()-1);
        
        Mago jogador1Mago= null;
        Guerreiro jogador1Guerreiro=null;
        if(input<magos.size()){
            jogador1Mago = escolherPersonagemMago(magos,input);
            System.out.printf("Jogador 1 personagem:%s %n",jogador1Mago.getNome());
        }
        else{
            jogador1Guerreiro = escolherPersonagemGuerreiro(guerreiros,input-magos.size());
            System.out.printf("Jogador 1 personagem:%s %n",jogador1Guerreiro.getNome());
        }

        System.out.printf("Jogador 1 escolha seu personagem:%n");
        mostrarPersonagens(magos,guerreiros);
        do{
            inputString = bufferedReader.readLine();
            input = Integer.parseInt(inputString);  
            if(input<0 || input>magos.size()+guerreiros.size()-1)
                System.out.printf("Número inválido! Digite novamente.%n");
        }while(input<0 || input>magos.size()+guerreiros.size()-1);
        
        Mago jogador2Mago=null;
        Guerreiro jogador2Guerreiro=null;
        if(input<magos.size()){
            jogador2Mago = escolherPersonagemMago(magos,input);
            System.out.printf("Jogador 2 personagem:%s%n",jogador2Mago.getNome());

        }
        else{
            jogador2Guerreiro = escolherPersonagemGuerreiro(guerreiros, input-magos.size());
            System.out.printf("Jogador 2 personagem:%s%n",jogador2Guerreiro.getNome());
        }        

        while(parar==false){
            int dano=0;
            System.out.printf("Jogador 1 ataca!%n");
            if(jogador1Mago!=null)
                dano=jogador1Mago.attack();            
            else
                dano=jogador1Guerreiro.attack();
            if(jogador2Mago!=null){
                jogador2Mago.dano(dano);
                System.out.printf("Jogador 2 personagem:%s sofreu %d de dano%n",jogador2Mago.getNome(),dano);
                if(jogador2Mago.getVida()<=0){
                    System.out.printf("Jogador 2 morreu!%nJogador 1 é o vencedor!%n");
                    break;
                }
            }                
            else{
                jogador2Guerreiro.dano(dano);
                System.out.printf("Jogador 2 personagem:%s sofreu %d de dano%n",jogador2Guerreiro.getNome(),dano);
                if(jogador2Guerreiro.getVida()<=0){
                    System.out.printf("Jogador 2 morreu!%nJogador 1 é o vencedor!%n");
                    break;
                }
            }            
            

            System.out.printf("Jogador 2 ataca!%n");
            if(jogador2Mago!=null)
                dano=jogador2Mago.attack();            
            else
                dano=jogador2Guerreiro.attack();
            if(jogador1Mago!=null){
                jogador1Mago.dano(dano);
                System.out.printf("Jogador 1 personagem:%s sofreu %d de dano%n",jogador1Mago.getNome(),dano);
                if(jogador1Mago.getVida()<=0){
                    System.out.printf("Jogador 1 morreu!%nJogador 2 é o vencedor!%n");
                    break;
                }
            }                
            else{
                jogador1Guerreiro.dano(dano);
                System.out.printf("Jogador 1 personagem:%s sofreu %d de dano%n",jogador1Guerreiro.getNome(),dano);
                if(jogador2Guerreiro.getVida()<=0){
                    System.out.printf("Jogador 2 morreu!%nJogador 1 é o vencedor!%n");
                    break;
                }
            }                
        }
    }      

    public static void mostrarPersonagens(List<Mago> magos, List<Guerreiro> guerreiros){
        int contador=0;
        for(Mago mago : magos){
            System.out.printf("%d - Mago %s, vida: %d, mana:%d, xp:%.1f, inteligência:%d, força:%d, level:%d%n",contador++,mago.getNome(),mago.getVida(),mago.getMana(),mago.getXp(),mago.getInteligencia(),mago.getForca(),mago.getLevel());
        }
        for(Guerreiro guerreiro : guerreiros){
            System.out.printf("%d - Guerreiro %s, vida: %d, mana:%d, xp:%.1f, inteligência:%d, força:%d, level:%d%n",contador++,guerreiro.getNome(),guerreiro.getVida(),guerreiro.getMana(),guerreiro.getXp(),guerreiro.getInteligencia(),guerreiro.getForca(),guerreiro.getLevel());
        }
    }

    public static Mago escolherPersonagemMago(List<Mago> magos,int input) {
        return magos.get(input);
    }

    private static Guerreiro escolherPersonagemGuerreiro(List<Guerreiro> guerreiros,int input) {
        return guerreiros.get(input);
    }
}
