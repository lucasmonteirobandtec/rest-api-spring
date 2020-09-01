package com.example.restapi.domain;

import com.example.restapi.domain.Componente;

public class Fonte extends Componente {

    private String potencia;
    private String forma;
    private Double precoFinal;

    public Fonte(String nome, String marca, Double preco, String modelo, String potencia, String forma) {
        super(nome, marca, preco, modelo);
        this.potencia = potencia;
        this.forma = forma;
    }

    @Override
    public Double calcularTaxa() {
        precoFinal = super.getPreco() + (super.getPreco() * 0.25);
        return precoFinal;
    }

    public String getPotencia() {
        return potencia;
    }

    public String getForma() {
        return forma;
    }

    public Double getPrecoFinal() {
        return calcularTaxa();
    }

    @Override
    public String toString() {
        return "Fonte{" + super.toString() +
                "potencia='" + potencia + '\'' +
                ", forma='" + forma + '\'' +
                '}';
    }
}
