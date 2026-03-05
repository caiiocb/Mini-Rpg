package model;

public class Inimigos extends Personagem{
    private String especie;

    public Inimigos(String nome, int strength, String especie) {
        super(nome, strength);
        this.especie = especie;

    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }



    @Override
    public void atacar(Personagem alvo) {
        super.atacar(alvo);
    }
}
