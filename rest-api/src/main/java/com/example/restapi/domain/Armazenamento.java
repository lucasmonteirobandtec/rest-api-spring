package com.example.restapi.domain;

public class Armazenamento extends Componente {

    private String tipo, leitura, espaco;
    private Double precoFinal;

    public Armazenamento(String nome, String marca, Double preco, String modelo, String tipo, String leitura, String espaco) {
        super(nome, marca, preco, modelo);
        this.tipo = tipo;
        this.leitura = leitura;
        this.espaco = espaco;
    }

    @Override
    public Double calcularTaxa() {
        precoFinal = super.getPreco() + (super.getPreco() * 0.2);
        return precoFinal;
    }

    public String getTipo() {
        return tipo;
    }

    public String getLeitura() {
        return leitura;
    }

    public String getEspaco() {
        return espaco;
    }

    public Double getPrecoFinal() {
        return calcularTaxa();
    }

    @Override
    public String toString() {
        return "Armazenamento{" + super.toString() +
                "tipo='" + tipo + '\'' +
                ", leitura='" + leitura + '\'' +
                ", espaco='" + espaco + '\'' +
                '}';
    }
}