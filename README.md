# ⚔️ Mini RPG - POO System

Este projeto é um simulador de batalhas RPG desenvolvido em Java, focado na aplicação prática de conceitos de **Programação Orientada a Objetos (POO)** e padrões de projeto. A arquitetura foi organizada para manter o código limpo e modular, facilitando a manutenção e expansão das funcionalidades.

## 🚀 Tecnologias e Conceitos Aplicados

O desenvolvimento utiliza Java (JDK 17+) e explora os pilares da POO para criar uma experiência de jogo dinâmica:

* **Padrão State:** Gerencia o comportamento dos personagens através de estados como `Atacando` e `Defendendo`, alterando a lógica de dano e ações em tempo real.
* **Abstração e Herança:** Utilização de uma classe abstrata `Personagem` como base para classes especializadas como `Guerreiro`, `Mago` e `Arqueiro`.
* **Polimorfismo:** Cada classe de personagem implementa sua própria lógica de ataque e habilidades especiais (ex: feitiços variados para o Mago).
* **Encapsulamento:** Proteção de dados sensíveis dos personagens (vida, força, nível) com acesso controlado via métodos getters e setters.

## 🏗️ Estrutura do Projeto (Estilo MVC)

A organização das pastas segue uma divisão de responsabilidades para garantir a organização do sistema:

* **`model/`**: Contém as entidades principais (`Personagem.java`, `Inimigos.java`) e a lógica de estados.
* **`controller/`**: Responsável pelas regras de negócio, controle de turnos (`Batalha.java`) e geração de inimigos (`SpawnController.java`).
* **`view/`**: Atualmente lida com as interações e saídas via console.
* **`util/`**: Classes utilitárias para suporte ao sistema.

## 🎮 Funcionalidades Principais

* **Criação Personalizada:** O jogador define o nome, distribui pontos de força e escolhe uma classe com bônus específicos.
* **Sistema de Combate por Turnos:** Escolha estratégica entre atacar, defender ou recuar da batalha.
* **Progressão de Nível:** Ao derrotar inimigos, o personagem ganha níveis e incrementa seus atributos de força automaticamente.
* **Ecossistema de Inimigos:** Gerador aleatório que escala a dificuldade dos oponentes (Goblins, Trolls, Dragões) de acordo com o nível atual do jogador.

## 🛠️ Como rodar o projeto

1. Certifique-se de ter o **JDK 17** ou superior instalado em sua máquina.
2. Clone este repositório para o seu ambiente local.
3. Abra o projeto em sua IDE de preferência (IntelliJ IDEA, VS Code ou Eclipse).
4. Localize e execute a classe `Main.java` dentro do pacote `rpg.src`.

---
*Projeto desenvolvido por Caio Barbosa como parte dos estudos de Ciência da Computação na UFPA.*
