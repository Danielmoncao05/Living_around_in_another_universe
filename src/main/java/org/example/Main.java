package org.example;


import org.example.Enums.Classe;
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

// criar menu principal em main
        // finalizar crud de personagem e atributos

    }

    // Personagem //


    /* ------------menu personagem --------------------*/

    public void menuPersonagem () {
        String menuPersonagem = """
                ---------------------------------
                |                               |
                | 1- Criar personagem           |
                | 2- Exibir personagens         |
                | 3- Atualizar Personagem       |
                | 4- Deletar Personagem         |
                | 5- Voltar                     |
                ---------------------------------
                """;



//        int opcao = scanner.nextInt();
//        scanner.nextLine();

        System.out.println(menuPersonagem);

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
        MenuClasses(personagem);
        listaPersonagem.add(personagem);
        System.out.println("Personagem criado com sucesso");
    }

    /*exibir personagens*/

    public void exibirPersonagens () {

        for(Personagem p : listaPersonagem) {
            System.out.println(p);
        }
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
                
                QUAL RAÇA DESEJA SER : 
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
                personagem.getAtributos().setForca(+1);
                personagem.getAtributos().setAgilidade(+1);
                personagem.getAtributos().setInteligencia(+1);
                personagem.getAtributos().setResistencia(+1);
                personagem.getAtributos().setVitalidade(+1);

                System.out.println("Humano Criado");
                break;
            case 2:
                personagem.setRaca(Raca.ELFOS);
                personagem.getAtributos().setForca(+1);
                personagem.getAtributos().setAgilidade(+3);
                personagem.getAtributos().setInteligencia(+2);
                personagem.getAtributos().setResistencia(-1);
                personagem.getAtributos().setVitalidade(+2);

                System.out.println("Elfo Criado");
                break;
            case 3 :
                personagem.setRaca(Raca.ANOES);
                personagem.getAtributos().setForca(+3);
                personagem.getAtributos().setAgilidade(-1);
                personagem.getAtributos().setInteligencia(+2);
                personagem.getAtributos().setResistencia(+3);
                personagem.getAtributos().setVitalidade(+1);

                System.out.println("Anão Criado");
                break;
            case 4:
                personagem.setRaca(Raca.ORC);
                personagem.getAtributos().setForca(+4);
                personagem.getAtributos().setAgilidade(-1);
                personagem.getAtributos().setInteligencia(-2);
                personagem.getAtributos().setResistencia(+2);
                personagem.getAtributos().setVitalidade(+3);

                System.out.println("Orc Criado");
                break;
            case 5 :
                personagem.setRaca(Raca.DRACONATOS);
                personagem.getAtributos().setForca(+3);
                personagem.getAtributos().setInteligencia(+1);
                personagem.getAtributos().setResistencia(+2);
                personagem.getAtributos().setVitalidade(+2);

                System.out.println("Draconato Criado");
                break;

            case 6 :
                System.out.println("Saindo");
                break;
            default: String mensagem = "Não possui outra opção, tente novamente";
        }
    }


    /* -----------------Menu Atributos-------------------*/

    public void menuAtributos (Atributos atributos) {
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

        int opcao = scanner.nextInt();
        scanner.nextLine();

        do {
            System.out.println(menuAtributos);

            switch (opcao) {
                case 1 :
                    System.out.println("aaa");
                    break;
                case 2:
                    System.out.println("aaa");
                    break;
                case 3:
                    System.out.println("aaa");
                    break;
                case 4:
                    System.out.println("aaa");
                    break;
                case 5:
                    System.out.println("aaa");
                    break;
                case 6:
                    System.out.println("aaa");
                    break;
                default:
            }

        } while(opcao!= 6);



    }

    public void MenuClasses (Personagem personagem) {
        String menuClasses = """
                
                QUAL CLASSE DESEJA SE TORNAR:
                -------------------------
                |                       |
                | 1- Guerreiro          |
                | 2- Mago               |
                | 3- Paladino           |
                | 4- Barbaro            |
                | 5- Sair               |
                |                       |
                -------------------------
                """;

        int opcao = scanner.nextInt();
        scanner.nextLine();

        switch (opcao) {
            case 1 :
                personagem.setClasse(Classe.GUERREIRO);
                System.out.println("Guerreiro Criado");
                break;
            case 2:
                personagem.setClasse(Classe.MAGO);
                System.out.println("Mago Criado");
                break;
            case 3 :
                personagem.setClasse(Classe.PALADINO);
                System.out.println("Paladino Criado");
                break;
            case 4 :
                personagem.setClasse(Classe.BARBARO);
                System.out.println("Barbaro Criado");
            case 5 :
                break;
            default:
                System.out.println("Opção não existe, tente novamente");
        }
    }



}