package org.example.Menus.Raca;

import org.example.Enums.Raca;
import org.example.Personagem.person.Personagem;

import java.util.Scanner;

public class MenuRaca {

    static Scanner scanner = new Scanner(System.in);

    public static void MenuRaca(Personagem personagem) {
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
}
