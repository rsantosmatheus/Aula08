package org.exercicioEmSala.entity;

import lombok.Getter;
import lombok.Setter;
import org.exercicioEmSala.enums.TipoCambio;
import org.exercicioEmSala.enums.TipoDirecao;

@Getter
@Setter
public abstract class Carro extends Veiculo{
    private TipoCambio tipoCambio;
    private int qtdPortas;
    private TipoDirecao tipoDirecao;
    private int potencia;
    private String aroRodas;

    public Carro(String marca, String modelo, double kilometragem, int anoFabricacao, String cor, TipoCambio tipoCambio, int qtdPortas, TipoDirecao tipoDirecao, int potencia, String aroRodas) {
        super(marca, modelo, kilometragem, anoFabricacao, cor);
        this.tipoCambio = tipoCambio;
        this.qtdPortas = qtdPortas;
        this.tipoDirecao = tipoDirecao;
        this.potencia = potencia;
        this.aroRodas = aroRodas;
    }

}
