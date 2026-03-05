package controller;

import model.Inimigos;
import java.util.Random;

public class SpawnController {
    private Random random = new Random();

    public Inimigos spawnInimigosLevel(int levelJogador){
        if(levelJogador > 1 && levelJogador < 2){
            return spawnInimigosBasico(levelJogador);
        } else {
            return null;
        }
    }
    public Inimigos spawnInimigosBasico(int level){
        int sorteio = random.nextInt(2);
        int forcaAletoria = random.nextInt(5) + 1;
        if(sorteio == 0){
            return new Inimigos("Globin Reconhecedor",forcaAletoria, "Globin");
        }else {
            return new Inimigos("Ratos Mutantes", forcaAletoria, "Mutante");
        }
    }
}
