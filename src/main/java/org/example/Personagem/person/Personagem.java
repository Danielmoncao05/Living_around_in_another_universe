package org.example.Personagem.person;

import org.example.Enums.Genero;
import org.example.Enums.Raca;
import org.example.Personagem.adicionais.Atributos;

public class Personagem {
    private String nome;
    private int idade;
    private Genero genero;
    private Raca raca;
    private Atributos atributos;
    private int level = 1;
    // atributo xp para evolução de level

    public Personagem(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    public Raca getRaca() {
        return raca;
    }

    public void setRaca(Raca raca) {
        this.raca = raca;
    }

    public Atributos getAtributos() {
        return atributos;
    }

    public void setAtributos(Atributos atributos) {
        this.atributos = atributos;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    @Override
    public String toString() {
        return "Personagem{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", genero=" + genero +
                ", raca=" + raca +
                ", atributos=" + atributos +
                ", level=" + level +
                '}';
    }
}
