package model;

public class Arqueiro extends Personagem{
    private int tecnica;

    public Arqueiro(String nome) {
        super(nome);
        this.tecnica = 1;
    }

    @Override
    public void atacar() {
        System.out.println("Atacando com flechas");
    }

    public int getTecnica() {
        return tecnica;
    }

    public void setTecnica(int tecnica) {
        this.tecnica = tecnica;
    }
}
