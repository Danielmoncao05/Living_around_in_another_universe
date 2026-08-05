package org.example.Menus.Classes;

import org.example.Enums.Classe;
import org.example.Personagem.person.Personagem;

import java.util.Scanner;

public class DefinicaoClasses {
    static Scanner scanner = new Scanner(System.in);

    public  static Personagem DefinicaoClasse (Personagem personagem) {
        if (personagem.getClasse() == Classe.GUERREIRO) {
            personagem.getAtributos().setForca(+8);
            personagem.getAtributos().setAgilidade(+4);
            personagem.getAtributos().setInteligencia(+2);
            personagem.getAtributos().setVitalidade(+7);
            personagem.getAtributos().setResistencia(+5);
        } else if (personagem.getClasse() == Classe.MAGO) {
            personagem.getAtributos().setForca(+2);
            personagem.getAtributos().setAgilidade(+4);
            personagem.getAtributos().setInteligencia(+9);
            personagem.getAtributos().setVitalidade(+3);
            personagem.getAtributos().setResistencia(+1);
        }else if (personagem.getClasse() == Classe.PALADINO) {
            personagem.getAtributos().setForca(+7);
            personagem.getAtributos().setAgilidade(+3);
            personagem.getAtributos().setInteligencia(+5);
            personagem.getAtributos().setVitalidade(+8);
            personagem.getAtributos().setResistencia(+3);
        }else if (personagem.getClasse() == Classe.BARBARO) {
            personagem.getAtributos().setForca(+5);
            personagem.getAtributos().setAgilidade(+3);
            personagem.getAtributos().setInteligencia(+3);
            personagem.getAtributos().setVitalidade(+8);
            personagem.getAtributos().setResistencia(+8);
        }

        return personagem;
    }
}
