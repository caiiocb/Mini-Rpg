package model;
import java.util.Random;

public class Mago extends Personagem {
    private int tecnica;


    public Mago(String nome, int strength) {
        super(nome, strength);
        this.tecnica = 1;
    }
    public String feiticos(){
        Random random = new Random();
        int sort = random.nextInt(3);
        switch (sort){
            case 0:
                this.setStrength(this.getStrength() + 2);
                return "Zoltraak";
            case 1:
                this.setStrength(this.getStrength() + 1);
                return "Flechas de Gelo: Nephtear";
            case 2:
                this.setStrength(this.getStrength() + 3);
                return "Relâmpago Destrutivo: Judradjim";
            default:
                return "Errou o feitiço";
        }
    }

    @Override
    public void atacar(Personagem alvo) {
        System.out.println(getNome() + " atacou com o feitiço " + this.feiticos());
        super.atacar(alvo);
    }

    public int getTecnica() {
        return tecnica;
    }

    public void setTecnica(int tecnica) {
        this.tecnica = tecnica;
    }
}
