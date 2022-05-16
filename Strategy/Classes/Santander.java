package DesignPatterns.Strategy.Classes;

import DesignPatterns.Strategy.CalculaJurosStrategyInterface;

public class Santander implements CalculaJurosStrategyInterface {

    @Override
    public int calculaJurosBanco(int pedido) {
        pedido += pedido * 0.1;
        return pedido;
    }
}
