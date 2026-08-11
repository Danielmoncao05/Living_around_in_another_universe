package org.example.Personagem.adicionais;

public class Atributos {
    private int forca = 5;
    private int agilidade = 5;
    private int inteligencia = 5;
    private int resistencia = 5;
    private int vitalidade = 5;



    public int getForca() {
        return forca;
    }

    public void setForca(int forca) {
        this.forca = forca;
    }

    public int getAgilidade() {
        return agilidade;
    }

    public void setAgilidade(int agilidade) {
        this.agilidade = agilidade;
    }

    public int getInteligencia() {
        return inteligencia;
    }

    public void setInteligencia(int inteligencia) {
        this.inteligencia = inteligencia;
    }

    public int getResistencia() {
        return resistencia;
    }

    public void setResistencia(int resistencia) {
        this.resistencia = resistencia;
    }

    public int getVitalidade() {
        return vitalidade;
    }

    public void setVitalidade(int vitalidade) {
        this.vitalidade = vitalidade;
    }

    @Override
    public String toString() {
        return "Atributos{" +
                "forca=" + forca +
                ", agilidade=" + agilidade +
                ", inteligencia=" + inteligencia +
                ", resistencia=" + resistencia +
                ", vitalidade=" + vitalidade +
                '}';
    }
}
