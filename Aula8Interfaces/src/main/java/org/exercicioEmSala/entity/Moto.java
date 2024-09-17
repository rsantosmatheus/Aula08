package org.exercicioEmSala.entity;

public class Moto extends Veiculo {

    private int cilindrada;
    private String tipoFreio;

    public Moto(String marca, String modelo, double kilometragem, int anoFabricacao, String cor,
                int cilindrada, String tipoFreio) {
        super(marca, modelo, kilometragem, anoFabricacao, cor);
        this.cilindrada = cilindrada;
        this.tipoFreio = tipoFreio;
    }

    @Override
    public void ligar() {
        System.out.println("A moto está ligada.");
    }

    @Override
    public void desligar() {
        System.out.println("A moto está desligada.");
    }

    @Override
    public String toString() {
        return "Moto{" +
                "Numero de Serie' "+ getNumeroSerieVeiculo() + '\''+
                "Marca='" + getMarca() + '\'' +
                ", Modelo='" + getModelo() + '\'' +
                ", Kilometragem=" + getKilometragem() +
                ", Ano de Fabricação=" + getAnoFabricacao() +
                ", Cor='" + getCor() + '\'' +
                ", Cilindrada=" + cilindrada + " cm³" +
                ", Tipo de Freio='" + tipoFreio + '\'' +
                '}';
    }
}