package DesignPatterns.AbstractFactory.Classes.Factory;

import DesignPatterns.AbstractFactory.Classes.Domain.Roda;
import DesignPatterns.AbstractFactory.Classes.Domain.Rodas.RodaLigaLeve;
import DesignPatterns.AbstractFactory.Classes.Domain.Som;
import DesignPatterns.AbstractFactory.Classes.Domain.Sons.CDPlayer;

public class CarroLuxoFactory extends AbstractFactory{


    @Override
    public Roda montarRoda() {
        return new RodaLigaLeve();
    }

    @Override
    public Som montarSom() {
        return new CDPlayer();
    }
}
