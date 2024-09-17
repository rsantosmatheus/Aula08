package org.exercicioEmSala.entity;

import lombok.*;

@Getter
@Setter
public abstract class Veiculo {

    private static int numeroSerieGlobal;
    private int numeroSerieVeiculo;
    private String marca;
    private String modelo;
    private double kilometragem;
    private int anoFabricacao;
    private String cor;

    public Veiculo(String marca, String modelo, double kilometragem, int anoFabricacao, String cor) {
        numeroSerieGlobal++;
        this.numeroSerieVeiculo = numeroSerieGlobal;
        this.marca = marca;
        this.modelo = modelo;
        this.kilometragem = kilometragem;
        this.anoFabricacao = anoFabricacao;
        this.cor = cor;
    }

    public abstract void ligar();

    public abstract void desligar();

    @Override
    public String toString(){
        return "\nNumero de Serie: "+ numeroSerieVeiculo +
                "Marca: " + marca +
                "\nModelo: " + modelo +
                "\nAno: " + anoFabricacao+
                "\nKilometragem: "+ kilometragem + "Km" +
                "\nCor: " + cor;
    }
}
