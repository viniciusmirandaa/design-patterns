package DesignPatterns.AbstractFactory.Classes.Factory;

import DesignPatterns.AbstractFactory.Classes.Domain.Roda;
import DesignPatterns.AbstractFactory.Classes.Domain.Rodas.RodaSimples;
import DesignPatterns.AbstractFactory.Classes.Domain.Som;
import DesignPatterns.AbstractFactory.Classes.Domain.Sons.TocaFitas;

public class CarroSimplesFactory extends AbstractFactory{
    @Override
    public Roda montarRoda() {
        return new RodaSimples();
    }

    @Override
    public Som montarSom() {
        return new TocaFitas();
    }
}
