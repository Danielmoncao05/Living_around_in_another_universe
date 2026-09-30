# ⚔️ RPG em Java

Projeto de um jogo de RPG desenvolvido em **Java puro**, criado com o objetivo de praticar e aplicar conceitos fundamentais da linguagem, lógica de programação e **Programação Orientada a Objetos (POO)**.

O projeto está sendo desenvolvido de forma incremental, permitindo adicionar novas mecânicas conforme os conceitos de Java são estudados e aplicados na prática.

## 🎯 Objetivo do projeto

O principal objetivo é utilizar o desenvolvimento de um RPG como ambiente de prática para conceitos de programação que fazem parte da formação em Java.

Entre os principais objetivos estão:

* Praticar Java puro;
* Reforçar lógica de programação;
* Aplicar os princípios da Programação Orientada a Objetos;
* Trabalhar com classes, objetos e métodos;
* Praticar encapsulamento, herança, polimorfismo e abstração;
* Trabalhar com Collections;
* Desenvolver sistemas de interação e regras de negócio;
* Organizar um projeto Java de forma evolutiva.

## 🧙 Criação de personagem

O jogo possui um fluxo de criação de personagens baseado em diferentes características.

Atualmente, o jogador define:

1. Nome
2. Idade
3. Gênero
4. Raça
5. Classe
6. Atributos

Após a escolha da raça e da classe, os atributos iniciais do personagem são calculados considerando as características fornecidas por cada uma.

O jogador recebe então **10 pontos adicionais para distribuir entre os atributos**, permitindo personalizar o personagem de acordo com seu estilo de jogo.

### Fluxo de criação

```text
Nome
  ↓
Idade
  ↓
Gênero
  ↓
Raça
  ↓
Classe
  ↓
Atributos iniciais
  ↓
Distribuição de 10 pontos
  ↓
Atributos finais
  ↓
Confirmação do personagem
```

## 🧩 Modelo do personagem

O personagem é construído utilizando composição entre diferentes objetos e características.

```text
Personagem
├── Raça
├── Classe
├── Atributos
├── Equipamentos
└── Efeitos
```

Essa estrutura permite que diferentes características do personagem sejam representadas por componentes separados, facilitando a organização e evolução do sistema.

## 📊 Sistema de atributos

Os atributos possuem valores iniciais influenciados pela **classe** e pela **raça** escolhidas pelo jogador.

De forma simplificada:

```text
Atributo final
      │
      ├── Base da Classe
      │
      ├── Modificador da Raça
      │
      └── Pontos distribuídos pelo jogador
```

O sistema também considera um valor mínimo para evitar que um atributo fique zerado.

O sistema de níveis, experiência e distribuição de pontos futuros ainda está em desenvolvimento.

## 🧬 Raças

As raças são representadas por um `enum` próprio dentro do projeto.

```text
Raca
├── ...
├── ...
└── ...
```

Cada raça pode possuir características que influenciam os atributos iniciais do personagem.

## ⚔️ Classes

As classes também são representadas por um `enum`.

```text
Classe
├── ...
├── ...
└── ...
```

A classe escolhida pelo jogador influencia os atributos iniciais do personagem e poderá futuramente ser utilizada para definir diferentes comportamentos e características durante o jogo.

## 🛠️ Tecnologias

* **Java**
* Java Collections
* Programação Orientada a Objetos
* `ArrayList`
* `enum`
* Exceções
* Métodos e classes

O projeto utiliza **Java puro**, sem frameworks externos, justamente para reforçar os fundamentos da linguagem.

## 🧠 Conceitos praticados

Durante o desenvolvimento estão sendo aplicados conceitos como:

### Programação Orientada a Objetos

* Classes e objetos
* Encapsulamento
* Herança
* Polimorfismo
* Abstração
* Composição

### Java

* Variáveis e tipos de dados
* Condicionais
* Estruturas de repetição
* Métodos
* Construtores
* `enum`
* Arrays
* `ArrayList`
* Collections
* Generics
* Tratamento de exceções

## 🗂️ Estrutura inicial do projeto

A estrutura atual utiliza pacotes para separar as responsabilidades relacionadas ao personagem e suas características.

```text
src/
└── org/
    └── example/
        ├── Enums/
        │   ├── Classe.java
        │   ├── Genero.java
        │   └── Raca.java
        │
        ├── Personagem/
        │   ├── person/
        │   │   └── Personagem.java
        │   │
        │   └── adicionais/
        │       └── Atributos.java
        │
        └── ...
```

A estrutura será expandida conforme novas funcionalidades e sistemas forem adicionados ao RPG.

## 💾 Gerenciamento de personagens

Os personagens criados são atualmente armazenados em uma `ArrayList<Personagem>`, permitindo trabalhar com uma coleção de objetos e praticar operações de gerenciamento dos personagens.

Essa implementação também serve como prática para conceitos de **Collections** e manipulação de objetos em Java.

## 🚧 Status do projeto

**Em desenvolvimento 🚧**

O projeto está sendo construído gradualmente. As mecânicas são adicionadas conforme novos conceitos de Java são estudados e aplicados.

### Atualmente desenvolvido

* [x] Criação de personagem
* [x] Definição de nome, idade e gênero
* [x] Escolha de raça
* [x] Escolha de classe
* [x] Sistema inicial de atributos
* [x] Distribuição de 10 pontos
* [x] Armazenamento dos personagens em `ArrayList`
* [x] Modelagem utilizando POO

### Em desenvolvimento

* [ ] Sistema de níveis e experiência
* [ ] Evolução dos atributos
* [ ] Sistema de equipamentos
* [ ] Sistema de efeitos
* [ ] Sistema de combate
* [ ] Sistema de inimigos
* [ ] Sistema de batalha

> As funcionalidades marcadas como "em desenvolvimento" representam a direção planejada do projeto e ainda podem sofrer alterações durante sua implementação.

## 📚 Aprendizados

O RPG funciona como um projeto prático para transformar conceitos teóricos de Java em funcionalidades reais.

A ideia é que cada nova mecânica represente uma oportunidade para aplicar um conceito diferente da linguagem, mantendo o projeto em evolução enquanto os conhecimentos são aprofundados.

## 👨‍💻 Autor

**Daniel Monção**

Projeto desenvolvido para estudos e prática de **Java, lógica de programação e Programação Orientada a Objetos**.
