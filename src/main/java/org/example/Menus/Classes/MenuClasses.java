package org.example.Menus.Classes;

import org.example.Enums.Classe;
import org.example.Personagem.person.Personagem;

import java.util.Scanner;

public class MenuClasses {
    static Scanner scanner = new Scanner(System.in);

    public static void MenuClasses (Personagem personagem) {
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
                DefinicaoClasses.DefinicaoClasse(personagem);
                break;
            case 2:
                personagem.setClasse(Classe.MAGO);
                System.out.println("Mago Criado");
                DefinicaoClasses.DefinicaoClasse(personagem);
                break;
            case 3 :
                personagem.setClasse(Classe.PALADINO);
                System.out.println("Paladino Criado");
                DefinicaoClasses.DefinicaoClasse(personagem);
                break;
            case 4 :
                personagem.setClasse(Classe.BARBARO);
                System.out.println("Barbaro Criado");
                DefinicaoClasses.DefinicaoClasse(personagem);
            default:
                System.out.println("Opção não existe, tente novamente");
        }
    }
}
