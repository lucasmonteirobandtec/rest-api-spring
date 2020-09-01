package com.example.restapi.domain;

import com.example.restapi.domain.Componente;

public class GPU extends Componente {

    private String tamanho, chipset;
    private Double precoFinal;

    public GPU(String nome, String marca, Double preco, String modelo, String tamanho, String chipset) {
        super(nome, marca, preco, modelo);
        this.tamanho = tamanho;
        this.chipset = chipset;
    }

    @Override
    public Double calcularTaxa() {
        precoFinal = super.getPreco() + (super.getPreco() * 2.5);
        return precoFinal;
    }

    public String getTamanho() {
        return tamanho;
    }

    public String getChipset() {
        return chipset;
    }

    public Double getPrecoFinal() {
        return calcularTaxa();
    }

    @Override
    public String toString() {
        return "GPU{" + super.toString() +
                "tamanho='" + tamanho + '\'' +
                ", chipset='" + chipset + '\'' +
                '}';
    }
}