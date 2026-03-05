package model.Estados;

import model.Personagem;

public class EstadoAtacando implements EstadoPersonagem {
    @Override
    public void atacar(Personagem jogador, Personagem inimigo) {
        int dano = jogador.getStrength();
        inimigo.setLife(inimigo.getLife() - dano);
        System.out.println(jogador.getNome() + " atacou, causando " + dano + " de dano!");
    }

    @Override
    public void receberDano(Personagem jogador, int dano) {
        jogador.setLife(jogador.getLife() - dano);
    }
}
