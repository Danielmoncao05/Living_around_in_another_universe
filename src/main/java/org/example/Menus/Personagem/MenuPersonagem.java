package org.example.Menus.Personagem;



import java.util.Scanner;

public class MenuPersonagem {
    static Scanner scanner = new Scanner(System.in);

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

    public void exbirMenu() {
        System.out.println(menuPersonagem);
    }

}

