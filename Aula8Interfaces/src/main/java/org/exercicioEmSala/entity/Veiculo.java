package org.exercicioEmSala.entity;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public abstract class Veiculo {

    private String marca;
    private String modelo;
    private double kilometragem;
    private int anoFabricacao;
    private String cor;

    public abstract void ligar();

    public abstract void desligar();

    @Override
    public String toString(){
        return "Marca: " + marca +
                "\nModelo: " + modelo +
                "\nAno: " + anoFabricacao+
                "\nKilometragem: "+ kilometragem + "Km" +
                "\nCor: " + cor;
    }
}
