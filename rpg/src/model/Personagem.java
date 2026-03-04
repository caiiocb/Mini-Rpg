package model;

public abstract class Personagem {
    private String nome;
    private int life;
    private int strength;
    private int level;

    public abstract void atacar(Personagem alvo);

    public Personagem(String nome, int strength) {
        this.nome = nome;
        this.life = 100;
        this.strength = strength;
        this.level = 1;
    }
    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getLife() {
        return life;
    }

    public void setLife(int life) {
        this.life = life;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    @Override
    public String toString() {
        return "Personagem{" +
                "level=" + level +
                ", nome='" + nome + '\'' +
                ", life=" + life +
                ", strength=" + strength +
                '}';
    }

}