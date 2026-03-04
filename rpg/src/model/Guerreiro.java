package model;

public class Guerreiro extends Personagem {
    private int tecnica;

    public Guerreiro(String nome,int strength) {
        super(nome, strength);
        this.tecnica = 1;
    }

    @Override
    public void atacar(Personagem alvo){
        System.out.println(getNome() + " atacou com força " + getStrength() + " e técnica " + tecnica);
        
        int novaVida = alvo.getLife() - this.getStrength();
        alvo.setLife(novaVida);

        System.out.println("Vida do alvo após o ataque: " + alvo.getLife());
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
