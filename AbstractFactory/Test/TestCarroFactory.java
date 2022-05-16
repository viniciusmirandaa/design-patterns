package DesignPatterns.AbstractFactory.Test;

import DesignPatterns.AbstractFactory.Classes.Domain.Carro;
import DesignPatterns.AbstractFactory.Classes.Domain.TipoCarro;
import DesignPatterns.AbstractFactory.Classes.Factory.FactoryCarro;

public class TestCarroFactory {
    public static void main(String[] args) {
        Carro carro = FactoryCarro.criarCarro(TipoCarro.LUXO);
        System.out.println(carro);
        Carro carro1 = FactoryCarro.criarCarro(TipoCarro.SIMPLES);
        System.out.println(carro1);
    }
}
