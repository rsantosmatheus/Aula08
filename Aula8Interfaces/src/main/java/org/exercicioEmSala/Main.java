package org.exercicioEmSala;

import org.exercicioEmSala.entity.*;
import org.exercicioEmSala.enums.TipoCambio;
import org.exercicioEmSala.enums.TipoDirecao;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Veiculo corollaHibrido = new CarroHibrido("Toyota", "Corolla", 1500.0, 2024,
                "Prata", TipoCambio.CVT, 4, TipoDirecao.ELETRICA, 221, "16 polegadas",
                50.0, 80.0, 45.0, 20.0
        );

        Veiculo teslaS = new CarroEletrico("Tesla", "Model S", 12000.0, 2022,
                "Preto", TipoCambio.NA, 4, TipoDirecao.ELETRICA, 670, "19 polegadas",
                100.0, 85
        );

        Veiculo focus = new CarroTradicional("Ford", "Focus", 25000.0, 2021,
                "Vermelho", TipoCambio.MANUAL, 4, TipoDirecao.HIDRAULICA, 150,
                "17 polegadas", 5.0
        );

        Veiculo hondaCB500 =  new Moto("Honda", "CB500", 5000.0, 2022, "Azul",
                500, "Disco"
        );

        List<Veiculo> veiculoList = List.of(corollaHibrido, teslaS,focus, hondaCB500);

        for(Veiculo veiculo : veiculoList){
            System.out.println(veiculo.toString());
        }

    }
}