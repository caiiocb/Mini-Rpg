package controller;

import java.util.Scanner;
import model.*;
import model.Estados.EstadoAtacando;
import model.Estados.EstadoDefendendo;

public class Batalha  {
    private Scanner sc = new Scanner(System.in);
    int maxVida = 100;
    public void iniciar(){
        System.out.printf("Iniciando batalha...%n");
        Personagem jogador = criarJogador();
        SpawnController spawn =  new SpawnController();
        Inimigos inimigo =  spawn.spawnInimigosLevel(jogador.getLevel());
        System.out.println("Inimigo encontrado: " + inimigo);
        while (turno(jogador, inimigo)){
            if((inimigo == null) || (jogador.getLevel() > 5)) {
                System.out.println("Você zerou o jogo!! Parabêns");
                break;
            }
            if(inimigo.getLife() <= 0){
                inimigo = spawn.spawnInimigosLevel(jogador.getLevel());
                if (inimigo != null) {
                    System.out.println("Novo inimigo encontrado: " + inimigo);
                }
            }
        }
       
    }
    private Personagem criarJogador(){
        System.out.printf("Digite o nome do personagem: ");
        String nome = sc.nextLine();
        System.out.printf("Digite a força do personagem: ");
        int strength = sc.nextInt();
        System.out.printf("Digite a classe do personagem: %n1. Guerreiro%n2. Mago%n3. Arqueiro%n");
        int opcao = sc.nextInt();
        Personagem jogador = null;
        switch (opcao){
            case 1:
                jogador = new Guerreiro(nome, strength + 3);
                System.out.println("Você escolheu o caminho da espada");
                break;
            case 2:
                jogador  = new Mago(nome, strength);
                System.out.println("Você escolheu o caminho da magia");
                break;
            case 3:
                jogador = new Arqueiro(nome, strength + 2);
                System.out.println("Você escolheu a precisão do arco");
                break;
            default:
                System.out.println("opcao invalida!!");
                return null;
        }
        System.out.println("Personagem criado: " + jogador);
        
        return jogador;
    }

    private boolean prepararBatalha(Personagem jogador, Inimigos inimigo){
        System.out.printf("Escolha sua ação: %n1. Atacar%n2. Defender%n3. Sair%n");
        int opcao = sc.nextInt();
        switch (opcao){
            case 1:
                jogador.atacar(inimigo);
                inimigo.atacar(jogador);
                jogador.setEstadoAtual(new EstadoAtacando());
                return true;
            case 2:
                jogador.setEstadoAtual(new EstadoDefendendo());
                jogador.sofrerDano(inimigo.getStrength());
                jogador.setEstadoAtual(new EstadoAtacando());
                return true;
            case 3:
                System.out.println("Saindo da batalha...");
                return false;
            default:
                System.out.println("Opção inválida!!");
                return true;
        }
    }
    private boolean turno(Personagem jogador, Inimigos inimigo){
        boolean confirma = prepararBatalha(jogador, inimigo);
        if (jogador.getLife() <= 0){
            System.out.println("Você foi derrotado...");
            inimigo.setLife(maxVida);
            return continuarJogo(jogador, inimigo);
        }
        if (inimigo.getLife() <= 0){
            System.out.println("Inimigo derrotado!\nParabéns!!! Você subiu de nível, e aumentou a sua força");
            jogador.setLevel(jogador.getLevel() + 1);
            jogador.setStrength(jogador.getStrength() + 2);
            return continuarJogo(jogador, inimigo);
        }
        if(!confirma){
            return false;
        }
        return true;
    }
    private boolean continuarJogo(Personagem jogador, Inimigos inimigo){
        System.out.printf("Deseja continuar a aventura?%n1. Sim%n2. Não%n");
        int opcao = sc.nextInt();
        if (opcao == 1){
            jogador.setLife(Math.max(jogador.getLife(), maxVida));
            System.out.println(jogador);
            return true;
        } else if (opcao == 2){
            System.out.println("Saindo da aventura...");
            return false;
        } else {
            System.out.println("Opção inválida!!");
            return continuarJogo(jogador, inimigo);
        }
    }
}
