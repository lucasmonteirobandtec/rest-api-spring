package com.example.restapi.domain;

public abstract class Componente {

    private String nome, marca, modelo;
    private Double preco;

    public Componente(String nome, String marca, Double preco, String modelo) {
        this.nome = nome;
        this.marca = marca;
        this.preco = preco;
        this.modelo = modelo;
    }

    public abstract Double calcularTaxa();

    public String getNome() {
        return nome;
    }

    public String getMarca() {
        return marca;
    }

    public Double getPreco() {
        return preco;
    }

    public String getModelo() {
        return modelo;
    }

    @Override
    public String toString() {
        return "Componente{" +
                "nome='" + nome + '\'' +
                ", marca='" + marca + '\'' +
                ", preço=" + preco +
                ", modelo='" + modelo + '\'' +
                '}';
    }
}
