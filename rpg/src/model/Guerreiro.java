package model;

public class Guerreiro extends Personagem {
    private int tecnica;

    public Guerreiro(String nome) {
        super(nome);
        this.tecnica = 1;
    }

    @Override
    public void atacar() {
        System.out.println("Atacando com espada ");
    }

    public int getTecnica() {
        return tecnica;
    }

    public void setTecnica(int tecnica) {
        this.tecnica = tecnica;
    }

    @Override
    public String toString() {
        return "Guerreiro{" + super.toString() + "tecnica=" + tecnica + "}";
    }
}
