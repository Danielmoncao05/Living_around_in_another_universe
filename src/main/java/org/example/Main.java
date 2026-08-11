package org.example;


import java.util.Scanner;


public class Main {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String titulo = "Bem-vindo ao LAIAU";
        System.out.println(titulo);

    }

    public void MenuPrincipal() {
        String principal = """
                -----------------------------------
                |                                 |
                |                                 |
                -----------------------------------
                """;

        int opcao;

        do {
            System.out.println(principal);

            opcao = scanner.nextInt();
            scanner.nextLine();
            System.out.println("Selecione uma opção");

            switch (opcao) {
                case 1:
                    System.out.println("aaaaa");
                    break;
                default:
                    System.out.println("Opção invalida!!");
            }

        } while (opcao != 6);
    }
}