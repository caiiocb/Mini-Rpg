package model;
import java.util.Random;

public class Mago extends Personagem {
    private int tecnica;


    public Mago(String nome, int strength) {
        super(nome, strength);
        this.tecnica = 1;
    }
    public int feiticos(){
        Random random = new Random();
        int sort = random.nextInt(3);
        switch (sort){
            case 0:
                return 2;
            case 1:
                return 1;
            case 2:
                return 3;
            default:
                return 0;
        }
    }

    @Override
    public void atacar(Personagem alvo) {
        int bonus = this.feiticos();
        int danoTotal = this.getStrength() + bonus;
        System.out.println(this.getNome() + " lança " + this.getFeitico(bonus) 
        + "\n causando " + danoTotal + " de dano em " + alvo.getNome());
        alvo.sofrerDano(danoTotal);
    }
    private String getFeitico(int bonus){
        switch (bonus) {
            case 2:
                return "Zoltraak";              
            case 1:
                return "Flechas de Gelo: Nephtear";
            case 3:
                return "Relâmpado Destrutivo: Judradjim";
            default:
                return "Feitiço básico";
        }
    }

    public int getTecnica() {
        return tecnica;
    }

    public void setTecnica(int tecnica) {
        this.tecnica = tecnica;
    }
}
