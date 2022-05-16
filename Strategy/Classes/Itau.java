package DesignPatterns.Strategy.Classes;

import DesignPatterns.Strategy.CalculaJurosStrategyInterface;

public class Itau implements CalculaJurosStrategyInterface {
    @Override
    public int calculaJurosBanco(int pedido) {
        pedido *= 0.2;
        return pedido;
    }
}
