package model.Estados;

import model.Personagem;

public interface EstadoPersonagem {
    void atacar(Personagem jogador, Personagem inimigo);
    void receberDano(Personagem jogador, int dano);
}
