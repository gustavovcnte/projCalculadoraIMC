package br.unisul.controlecalc.projcalcimc.dto;

public class ImcDTO {
    private double peso;
    private double altura;
    private double imc;

    public ImcDTO() {
    }

    public ImcDTO(double peso, double altura, double imc) {
        this.peso = peso;
        this.altura = altura;
        this.imc = imc;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getImc() {
        return imc;
    }

    public void setImc(double imc) {
        this.imc = imc;
    }

// Gustavo Machado Vicente

}
