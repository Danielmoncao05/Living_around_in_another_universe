package org.example.Menus.Genero;

import org.example.Enums.Genero;
import org.example.Personagem.person.Personagem;

import java.util.Scanner;

public class MenuGenero {

    static Scanner scanner = new Scanner(System.in);

    public static void EscolherGenero (Personagem personagem) {
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
}
