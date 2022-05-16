package DesignPatterns.Factory.Test;

import DesignPatterns.Factory.Classes.Moeda;
import DesignPatterns.Factory.Classes.MoedaFactory;
import DesignPatterns.Factory.Classes.Pais;

public class TestFactory {
    public static void main(String[] args) {
        Moeda moeda = MoedaFactory.criarMoeda(Pais.BRASIL);
        moeda.getSimbolo();
    }
}
