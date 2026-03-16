package model.Estados;

import model.Personagem;

public class EstadoDefendendo implements EstadoPersonagem {
    @Override
    public void atacar(Personagem jogador, Personagem inimigo) {
        System.out.println(jogador.getNome() + " está em posição de defesa");
    }

    @Override
    public void receberDano(Personagem jogador, int dano) {
        int danoReduzido = dano / 2;
        jogador.setLife(jogador.getLife() - danoReduzido);
        System.out.println(jogador.getNome() + " defendeu o golpe!! Dano reduzido para: " + danoReduzido);
        System.out.println(jogador.getNome() + " vida: " + jogador.getLife());
    }
}
