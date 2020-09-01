package com.example.restapi.domain;

public class CPU extends Componente {

    private Integer nucleos;
    private String clock;
    private Double precoFinal;

    public CPU(String nome, String marca, Double preco, String modelo, Integer nucleos, String clock) {
        super(nome, marca, preco, modelo);
        this.nucleos = nucleos;
        this.clock = clock;
    }

    @Override
    public Double calcularTaxa() {
        precoFinal = super.getPreco() + (super.getPreco() * 1.25);
        return precoFinal;
    }

    public Integer getNucleos() {
        return nucleos;
    }

    public String getClock() {
        return clock;
    }

    public Double getPrecoFinal() {
        return calcularTaxa();
    }

    @Override
    public String toString() {
        return "CPU{" + super.toString() +
                "nucleos=" + nucleos +
                ", clock=" + clock + '\'' +
                '}';
    }
}
