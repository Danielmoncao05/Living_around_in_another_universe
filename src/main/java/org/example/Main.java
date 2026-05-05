package org.example;


import org.example.Enums.Genero;
import org.example.Enums.Raca;
import org.example.Personagem.adicionais.Atributos;
import org.example.Personagem.person.Personagem;

import java.util.ArrayList;
import java.util.Scanner;


public class Main {

    static Scanner scanner = new Scanner(System.in);

    static ArrayList<Personagem> listaPersonagem = new ArrayList<>();

    public static void main(String[] args) {
        String titulo = "Bem-vindo ao LAIAU";
        String menu = """
                ---------------------------------
                |
                |
                |
                |
                |
                |
                |
                |
                ---------------------------------
                """;
    }


    public void CriarPersonagem () {
        System.out.println("Digite nome do personagem: ");
        String nome = scanner.nextLine();
        System.out.println("Digite idade do personagem:");
        int idade = scanner.nextInt();
        scanner.nextLine();
        Personagem personagem = new Personagem(nome, idade);
        EscolherGenero(personagem);
        System.out.println("Esoclha raça de personagem:");
        MenuRaca(personagem);

    }

    /*------------------------Menu Genero---------------------------------*/

    public void EscolherGenero (Personagem personagem) {
        String menuGenero = " |1- Masculino  ||2- Feminino|";
        System.out.println(menuGenero);
        int opcao = scanner.nextInt();
        scanner.nextLine();

        if (opcao == 1) {
            personagem.setGenero(Genero.MASCULINO);
        } else if (opcao == 2) {
            personagem.setGenero(Genero.FEMININO);
        } else {
        System.out.println("Opção inválida, tente novamente");
        }
    }

    /*-------------------Menu Raca-----------------*/
    public void MenuRaca(Personagem personagem) {
        String menuRaca = """
                -------------------------
                |                       |
                | 1- Humano             |
                | 2- Elfo               |
                | 3- Anão               |
                | 4- Gnomo              |
                | 5- Draconato          |
                |                       |
                -------------------------
                """;

        System.out.println(menuRaca);

        int opcaoRaca = scanner.nextInt();
        scanner.nextLine();

        switch (opcaoRaca) {
            case 1 :
                personagem.setRaca(Raca.HUMANO);
                break;
            case 2:
                personagem.setRaca(Raca.ELFOS);
                break;
            case 3 :
                personagem.setRaca(Raca.ANOES);
                break;
            case 4:
                personagem.setRaca(Raca.GNOMOS);
                break;
            case 5 :
                personagem.setRaca(Raca.DRACONATOS);
                break;
            default: String mensagem = "Não possui outra opção, tente novamente";
        }
    }


    /* -----------------Menu Atributos-------------------*/

    public void menuAtributos (int opcao , Atributos atributos) {
        String menuAtributos = """
                -------------------------
                |                       |
                | 1- Força              |
                | 2- agilidade          |
                | 3- Inteligencia       |
                | 4- resistencia        |
                | 5- vitalidade         |
                |                       |
                -------------------------
                """;

        int pontos = 10;

        switch (opcao) {
            case 1 :
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;

            default:
        }


    }



}