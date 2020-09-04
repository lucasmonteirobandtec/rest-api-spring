package com.example.restapi.domain;

import com.example.restapi.domain.Componente;

public class RAM extends Componente {

    private String tamanho;
    private String tipo;
    private Double precoFinal;

    public RAM(String nome, String marca, Double preco, String modelo, String tamanho, String tipo) {
        super(nome, marca, preco, modelo);
        this.tamanho = tamanho;
        this.tipo = tipo;
    }

    @Override
    public Double calcularTaxa() {
        precoFinal = super.getPreco() + (super.getPreco() * 1.5);
        return precoFinal;
    }

    public String getTamanho() {
        return tamanho;
    }

    public String getTipo() {
        return tipo;
    }

    public Double getPrecoFinal() {
        return calcularTaxa();
    }

    @Override
    public String toString() {
        return "RAM{" + super.toString() +
                "tamanho=" + tamanho + '\'' +
                ", tipo='" + tipo + '\'' +
                '}';
    }
}
