package model;

public class Arqueiro extends Personagem{
    private int tecnica;

    public Arqueiro(String nome, int strength) {
        super(nome, strength);
        this.tecnica = 1;
    }

    @Override
    public void atacar(Personagem alvo) {
        System.out.println("Atacando com flechas\nDano no " );
    }

    public int getTecnica() {
        return tecnica;
    }

    public void setTecnica(int tecnica) {
        this.tecnica = tecnica;
    }
}
