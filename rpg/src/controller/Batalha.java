package controller;

import java.util.Scanner;
import model.*;
import model.Estados.EstadorDefendendo;

public class Batalha  {
    private Scanner sc = new Scanner(System.in);
    public void iniciar(){
        System.out.printf("Iniciando batalha...%n");
        System.out.printf("Digite o nome do personagem: ");
        String nome = sc.nextLine();
        System.out.printf("Digite a força do personagem: ");
        int strength = sc.nextInt();
        System.out.printf("Digite a classe do personagem: %n1. Guerreiro%n2. Mago%n3. Arqueiro%n");
        int opcao = sc.nextInt();
        Personagem jogador = null;
        switch (opcao){
            case 1:
                jogador = new Guerreiro(nome, strength + 5);
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
                return;
        }
        System.out.println("Personagem criado: " + jogador);
        SpawnController spawn =  new SpawnController();
        Inimigos inimigo =  spawn.spawnInimigosBasico(jogador.getLevel());
        System.out.println("Inimigo encontrado: " + inimigo);

        while (jogador.getLife() > 0) {
            System.out.printf("O que deseja fazer?%n1. Atacar%n2. Defender%n3. Sair%n");
            int escolha = sc.nextInt();
            if (escolha == 1) {
                jogador.atacar(inimigo);
                System.out.println("Vida do Inimigo: " + inimigo.getLife());
                if (inimigo.getLife() > 0) {
                    inimigo.atacar(jogador);
                    System.out.printf("Vida do %s apos o ataque %d%n", jogador.getNome(), jogador.getLife());
                }else{
                    System.out.println("Inimigo derrotado!!");
                    jogador.setLevel(jogador.getLevel() + 1);

                }
            } else if (escolha == 2) {
                jogador.setEstadoAtual(new EstadorDefendendo());
                jogador.sofrerDano(inimigo.getStrength());

            }else if (escolha == 3) {
                System.out.println("Saindo da batalha...");
                break;
            }
            else {
                System.out.printf("Opção inválida. Tente novamente.%n");
            }
        }

    }

}
