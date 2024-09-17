package org.exercicioEmSala.interfaces;

public interface VeiculoEletrico {

    public void carregarVeiculo(int horasCarregando, double amperagemCorrente);

    public double cargaDaBateria();

    public double tempoDeRecarga(double amperagemCorrente);

    public void sistemaRecuperacaoEnergia(double tempoFrenagem);

}
