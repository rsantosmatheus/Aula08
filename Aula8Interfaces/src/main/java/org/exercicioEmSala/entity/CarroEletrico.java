package org.exercicioEmSala.entity;

import lombok.Getter;
import lombok.Setter;
import org.exercicioEmSala.interfaces.VeiculoEletrico;
import org.exercicioEmSala.enums.TipoCambio;
import org.exercicioEmSala.enums.TipoDirecao;

@Getter
@Setter
public class CarroEletrico extends Carro implements VeiculoEletrico {

    private double capacidadeMaxBateria;
    private int porcentagemCargaBateria;

    public CarroEletrico(String marca, String modelo, double kilometragem, int anoFabricacao, String cor,
                         TipoCambio tipoCambio, int qtdPortas, TipoDirecao tipoDireção, int potencia, String aroRodas,
                         double capacidadeMaxBateria, int porcentagemCargaBateria) {
        super(marca, modelo, kilometragem, anoFabricacao, cor, tipoCambio, qtdPortas, tipoDireção, potencia, aroRodas);
        this.capacidadeMaxBateria = capacidadeMaxBateria;
        this.porcentagemCargaBateria = porcentagemCargaBateria;
    }

    @Override
    public void carregarVeiculo(int horasCarregando, double amperagemCorrente) {
        double qtdCarregadaAmperes = horasCarregando*amperagemCorrente;
        double porcentagemCarregada = qtdCarregadaAmperes/capacidadeMaxBateria/100;;

        porcentagemCargaBateria += porcentagemCarregada;
    }

    @Override
    public double cargaDaBateria() {
        return porcentagemCargaBateria;
    }

    @Override
    public double tempoDeRecarga(double amperagemCorrente) {

        //calculo da capacidade restante baseado na porcentagem da bateria
        double capacidadeRestante = (100 - porcentagemCargaBateria) / 100 * capacidadeMaxBateria;
        double tempoRecargaRestante = capacidadeRestante / amperagemCorrente;

        return tempoRecargaRestante;
    }

    @Override
    public void sistemaRecuperacaoEnergia(double tempoFrenagem) {
        double qtdEnergiaRecuperada = tempoFrenagem * 0.5;
        double porcentagemCarregada = qtdEnergiaRecuperada / capacidadeMaxBateria / 100;

        porcentagemCargaBateria += porcentagemCarregada;
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
        return "CarroEletrico{" +
                "Numero de Serie' "+ getNumeroSerieVeiculo() + '\''+
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
                ", Capacidade Máxima da Bateria=" + capacidadeMaxBateria + " kWh" +
                ", Porcentagem de Carga da Bateria=" + porcentagemCargaBateria + "%" +
                '}';
    }
}
