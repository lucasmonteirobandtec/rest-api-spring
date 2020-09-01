package com.example.restapi.domain;

import com.example.restapi.domain.Componente;

public class PlacaMae extends Componente {

    private String socket, tamanho;
    private Double precoFinal;

    public PlacaMae(String nome, String marca, Double preco, String modelo, String socket, String tamanho) {
        super(nome, marca, preco, modelo);
        this.socket = socket;
        this.tamanho = tamanho;
    }

    @Override
    public Double calcularTaxa() {
        precoFinal = super.getPreco() + (super.getPreco() * 1.25);
        return precoFinal;
    }

    public String getSocket() {
        return socket;
    }

    public String getTamanho() {
        return tamanho;
    }

    public Double getPrecoFinal() {
        return calcularTaxa();
    }

    @Override
    public String toString() {
        return "PlacaMae{" + super.toString() +
                "socket='" + socket + '\'' +
                ", tamanho='" + tamanho + '\'' +
                '}';
    }
}
