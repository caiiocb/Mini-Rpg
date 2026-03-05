package model;

public class Guerreiro extends Personagem {
    private int tecnica;

    public Guerreiro(String nome,int strength) {
        super(nome, strength);
        this.tecnica = 1;
    }

    @Override
    public void atacar(Personagem alvo){
        super.atacar(alvo);
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
