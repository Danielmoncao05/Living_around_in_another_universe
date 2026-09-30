package org.example.Menus.Atributos;

import org.example.Personagem.adicionais.Atributos;
import org.example.Personagem.person.Personagem;

import java.util.Scanner;

public class MenuAtributos {
    static Scanner scanner = new Scanner(System.in);

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

    public void distribuirAtributos (Personagem personagem) {
        int pontos = personagem.getPontosAtributos();

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
        System.out.println("Selecione um atributo que deseje evoluir: \n" + menuAtributos);
        int opcao = scanner.nextInt();
        scanner.nextLine();
        switch (opcao){
            case 1:
                System.out.println(personagem.getAtributos().getForca());
                System.out.println("Selecione quantidade de pontos a distribuir : ");
                int qnt  = scanner.nextInt();
                scanner.nextLine();
                pontos -= qnt;
                personagem.getAtributos().setForca(qnt);
                System.out.println("Atributo atualizado. Força : " + personagem.getAtributos().getForca());
                break;
            case 2 :
                break;
            case 3 :
                break;
            case 4 :
                break;
            case 5 :
                break;
            case 6 :
                break;
            default:
                System.out.println("Opção invalida! Tente novamente");
        }
    }
}
