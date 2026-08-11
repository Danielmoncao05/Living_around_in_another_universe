package org.example.Menus.Personagem.RepositoryPersonagem;

import org.example.Personagem.person.Personagem;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class RepositoryPerson {
    // classe com lista de personagens

    ArrayList<Personagem> listaPersonagens = new ArrayList<>();


    public void  adicionarPersonagem (Personagem personagem){
        listaPersonagens.add(personagem);
    }


    // atualiza retorna personagem selecionado para atualizar
    public Personagem exibirPersonPorIndice (int index) {
        Personagem p = listaPersonagens.get(index -1);
        System.out.println(p);

        return p;
    }

    public void exibirPersonagens () {
        for (Personagem p : listaPersonagens){
            System.out.println(p);
        }
    }

    public void removerPersonagem (int index) {
        listaPersonagens.remove(index -1);
        System.out.println("Personagem removido!!!!!");

    }

}

