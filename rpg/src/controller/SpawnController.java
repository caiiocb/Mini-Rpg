package controller;

import model.Inimigos;
import java.util.Random;

public class SpawnController {
    private Random random = new Random();

    public Inimigos spawnInimigosLevel(int levelJogador){
        if((levelJogador == 1) || (levelJogador == 2)){
            return spawnInimigosBasico(levelJogador);
        } else if ((levelJogador == 3) || (levelJogador == 4)){
            return spawnInimigosMedio(levelJogador);
        }else if (levelJogador == 5){
            return spawnInimigosMedio(levelJogador);
        }else{
            return null;
        }
    }
    public Inimigos spawnInimigosBasico(int level){
        int sorteio = random.nextInt(2);
        int forcaAletoria = random.nextInt(1, 3);
        if(sorteio == 0){
            return new Inimigos("Globin Reconhecedor",forcaAletoria, "Globin");
        }else {
            return new Inimigos("Ratos Mutantes", forcaAletoria, "Mutante");
        }
    }
    public Inimigos spawnInimigosMedio(int level){
        int sorteio = random.nextInt(2);
        int forcaAletoria = random.nextInt(4, 8);
        if(sorteio == 0){
            return new Inimigos("Zumbi Guerreiro",  forcaAletoria, "Zumbi");
        }else {
        return new Inimigos("Trolls",  forcaAletoria, "Trolls");
        }
    }
    public Inimigos spawnInimigosFortes(int level, int forca){
        int sorteio = random.nextInt(2);
        int forcaAletoria = random.nextInt(9, 12);
        if(sorteio == 0){
            return new Inimigos("Armadura Assombrada", forcaAletoria, "Fantasma");
        }else{
            return new Inimigos("Dragão mistico de duas cabeças", forcaAletoria, "Dragão");
        }

    }
}
