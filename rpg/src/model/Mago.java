package model;

public class Mago extends Personagem {
    private int tecnica;


    public Mago(String nome) {
        super(nome);
        this.tecnica = 1;
    }

    @Override
    public void atacar() {
        System.out.println("Mago atacando");
    }

    public int getTecnica() {
        return tecnica;
    }

    public void setTecnica(int tecnica) {
        this.tecnica = tecnica;
    }
}
