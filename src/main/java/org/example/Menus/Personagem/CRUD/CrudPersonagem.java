package org.example.Menus.Personagem.CRUD;

import org.example.Menus.Classes.MenuClasses;
import org.example.Menus.Genero.MenuGenero;
import org.example.Menus.Raca.MenuRaca;
import org.example.Personagem.person.Personagem;

import java.util.ArrayList;
import java.util.Scanner;

public class CrudPersonagem {

    static Scanner scanner = new Scanner(System.in);
    static ArrayList<Personagem> listaPersonagem = new ArrayList<>();

    public void CriarPersonagem () {
        System.out.println("Digite nome do personagem: ");
        String nome = scanner.nextLine();
        System.out.println("Digite idade do personagem:");
        int idade = scanner.nextInt();
        scanner.nextLine();
        Personagem personagem = new Personagem(nome, idade);
        MenuGenero.EscolherGenero(personagem);
        System.out.println("Esoclha raça de personagem:");
        MenuRaca.MenuRaca(personagem);
        MenuClasses.MenuClasses(personagem);
        listaPersonagem.add(personagem);
        System.out.println("Personagem criado com sucesso");
    }

    /*exibir personagens*/

    public void exibirPersonagens () {

        for(Personagem p : listaPersonagem) {
            System.out.println(p);
        }
    }

    /*-------- atualizar personagem------------ */

    public void atualizarPersonagem () {
        for (Personagem p : listaPersonagem){
            System.out.println(p);
        }
        System.out.println("Selecione o personagem que deseja atualizar:");
        int opcao = scanner.nextInt();
        scanner.nextLine();
        Personagem atualizado = listaPersonagem.get(opcao - 1);
        System.out.println("Digite um novo nome:");
        String nome = scanner.nextLine();
        atualizado.setNome(nome);
        System.out.println("Digite uma nova idade: ");
        int idade = scanner.nextInt();
        scanner.nextLine();
        atualizado.setIdade(idade);
        System.out.println("Dados atualizado com sucesso");
    }

    public void deletarPersonagem () {
        for (Personagem p : listaPersonagem) {
            System.out.println(p);
        }
        System.out.println("Selecione o personagem que deseja excluir:");
        int opcao = scanner.nextInt();
        scanner.nextLine();
        listaPersonagem.remove(opcao -1);
        System.out.println("Personagem deletado com sucesso!!!");
    }
}
