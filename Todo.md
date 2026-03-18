# ⚔️ Projeto Mini RPG - POO System

Este projeto é um simulador de batalhas RPG desenvolvido em Java para consolidar os conceitos de Programação Orientada a Objetos, aplicando padrões de projeto e uma estrutura organizada de pacotes.

---

## 📅 Roadmap de Desenvolvimento (To-Do)

### 🟢 FASE 1: Core & Encapsulamento (Fundação) - Concluído
- [X] Configuração da estrutura de pastas (Subpastas por projeto).
- [X] Criação da classe abstrata `Personagem`.
- [X] Implementação de atributos privados (`nome`, `vida`, `forca`, `level`).
- [X] Métodos `getters` e `setters` com validações básicas.
- [X] Instanciação de objetos básicos no `Main`.

### 🟡 FASE 2: Herança & Polimorfismo (Especialização) - Concluído
- [X] Criar subclasses: `Guerreiro`, `Mago` e `Arqueiro`.
- [X] Implementar o método abstrato `atacar()` (cada classe com seu cálculo de dano).
- [X] Utilizar o `super()` nos construtores das subclasses.
- [X] Criar uma `Interface` chamada `ItemInterativo` (para poções ou equipamentos).

### 🟠 FASE 3: Engine de Batalha & Lógica (Controller)
- [X] Implementar o `Scanner` para leitura de comandos do jogador.
- [X] Criar a classe `Batalha.java` para gerenciar os turnos.
- [X] Lógica de Condicionais: Verificar se a vida chegou a 0 (Game Over).
- [ ] Sistema de experiência: Ganhar XP ao vencer uma batalha.

### 🔴 FASE 4: Refatoração & UI (Avançado)
- [X] Aplicar o **Padrão State** (Ex: Estados do Personagem: `Atacando`, `Defendendo`).
- [X] Tratamento de exceções (evitar que o programa feche ao digitar letras em vez de números).
- [ ] (Bônus) Migração da lógica para interface gráfica com **JavaFX**.

---

## 🏗️ Estrutura do Projeto (MVC Style)

Para manter o código limpo como no projeto do Tamagotchi, a estrutura segue:

* **`model/`**: Classes de dados e entidades (`Personagem.java`, `Inimigo.java`).
* **`controller/`**: Lógica de regras de negócio e fluxo do jogo.
* **`view/`**: Saídas no console (e futuramente JavaFX).
* **`util/`**: Classes utilitárias (Gerador de números aleatórios para o dano).

---

## 🛠️ Como rodar o projeto
1. Certifique-se de ter o JDK 17 ou superior instalado.
2. Clone o repositório.
3. Abra a pasta raiz no seu VS Code ou IntelliJ.
4. Execute a classe `Main.java`.