package org.example.Menus.Atributos;

import org.example.Personagem.adicionais.Atributos;

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
}
