package org.exercicioEmSala.entity;

import lombok.Getter;
import lombok.Setter;
import org.exercicioEmSala.VeiculoCombustão;
import org.exercicioEmSala.enums.TipoCambio;
import org.exercicioEmSala.enums.TipoDirecao;

@Getter
@Setter
public class CarroTradicional extends Carro implements VeiculoCombustão {

    private double capacidadeMaxTanqueCombustivel;
    private double qtdCombustivelTanque;

    public CarroTradicional(String marca, String modelo, double kilometragem, int anoFabricacao, String cor,
                            TipoCambio tipoCambio, int qtdPortas, TipoDirecao tipoDireção, int potencia, String aroRodas,
                            double capacidadeMaxTanqueCombustivel) {
        super(marca, modelo, kilometragem, anoFabricacao, cor, tipoCambio, qtdPortas, tipoDireção, potencia, aroRodas);
        this.capacidadeMaxTanqueCombustivel = capacidadeMaxTanqueCombustivel;
    }

    @Override
    public void abastecer(double qtdCombustivel) {
        if(qtdCombustivel <= capacidadeMaxTanqueCombustivel-qtdCombustivel){
            System.out.println(qtdCombustivel + "L abastecido");
            qtdCombustivelTanque += qtdCombustivel;
        }else{

        }
    }

    @Override
    public double qtdCombustivel() {
        return qtdCombustivelTanque;
    }

    @Override
    public void ligar() {
        System.out.println("O Carro está Ligado");
    }

    @Override
    public void desligar() {
        System.out.println("O Carro está Desligado");
    }

    @Override
    public String toString() {
        return "CarroTradicional{" +
                "Marca='" + getMarca() + '\'' +
                ", Modelo='" + getModelo() + '\'' +
                ", Kilometragem=" + getKilometragem() +
                ", Ano de Fabricação=" + getAnoFabricacao() +
                ", Cor='" + getCor() + '\'' +
                ", Tipo de Câmbio=" + getTipoCambio() +
                ", Quantidade de Portas=" + getQtdPortas() +
                ", Tipo de Direção=" + getTipoDirecao() +
                ", Potência=" + getPotencia() +
                ", Aro das Rodas='" + getAroRodas() + '\'' +
                ", Capacidade Máxima do Tanque de Combustível=" + capacidadeMaxTanqueCombustivel + " litros" +
                '}';
    }
}
