package org.exercicioEmSala.entity;

import lombok.Getter;
import lombok.Setter;
import org.exercicioEmSala.VeiculoCombustão;
import org.exercicioEmSala.VeiculoEletrico;
import org.exercicioEmSala.enums.TipoCambio;
import org.exercicioEmSala.enums.TipoDirecao;

@Getter
@Setter
public class CarroHibrido extends Carro implements VeiculoCombustão, VeiculoEletrico {

    private double capacidadeMaxBateria;
    private double porcentagemCargaBateria;
    private double capacidadeMaxTanqueCombustivel;
    private double qtdCombustivelTanque;

        public CarroHibrido(String marca, String modelo, double kilometragem, int anoFabricacao, String cor,
                            TipoCambio tipoCambio, int qtdPortas, TipoDirecao tipoDireção, int potencia,
                            String aroRodas, double capacidadeMaxBateria, double porcentagemCargaBateria,
                            double capacidadeMaxTanqueCombustivel, double qtdCombustivelTanque) {
            super(marca, modelo, kilometragem, anoFabricacao, cor, tipoCambio, qtdPortas, tipoDireção, potencia, aroRodas);
            this.capacidadeMaxBateria = capacidadeMaxBateria;
            this.porcentagemCargaBateria = porcentagemCargaBateria;
            this.capacidadeMaxTanqueCombustivel = capacidadeMaxTanqueCombustivel;
            this.qtdCombustivelTanque = qtdCombustivelTanque;
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
    public void carregarVeiculo(int horasCarregando, double amperagemCorrente) {
        double qtdCarregadaAmperes = horasCarregando*amperagemCorrente;
        double porcentagemCarregada = qtdCarregadaAmperes/capacidadeMaxBateria/100;

        porcentagemCargaBateria += porcentagemCarregada;
    }

    @Override
    public double cargaDaBateria() {
        return porcentagemCargaBateria;
    }

    @Override
    public double tempoDeRecarga(double amperagemCorrente) {
        //double tempoRecargaTotal = capacidadeMaxBateria/amperagemCorrente;

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
        return "CarroHibrido{" +
                "marca='" + getMarca() + '\'' +
                ", modelo='" + getModelo() + '\'' +
                ", kilometragem=" + getKilometragem() +
                ", anoFabricacao=" + getAnoFabricacao() +
                ", cor='" + getCor() + '\'' +
                ", tipoCambio=" + getTipoCambio() +
                ", qtdPortas=" + getQtdPortas() +
                ", tipoDirecao=" + getTipoDirecao() +
                ", potencia=" + getPotencia() +
                ", aroRodas='" + getAroRodas() + '\'' +
                ", capacidadeMaxBateria=" + getCapacidadeMaxBateria() +
                ", porcentagemCargaBateria=" + getPorcentagemCargaBateria() +
                ", capacidadeMaxTanqueCombustivel=" + getCapacidadeMaxTanqueCombustivel() +
                ", qtdCombustivelTanque=" + getQtdCombustivelTanque() +
                '}';
    }
}
