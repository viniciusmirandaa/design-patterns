package DesignPatterns.AbstractFactory.Classes.Factory;

import DesignPatterns.AbstractFactory.Classes.Domain.Roda;
import DesignPatterns.AbstractFactory.Classes.Domain.Som;

public abstract class AbstractFactory {

    public abstract Roda montarRoda();

    public abstract Som montarSom();

}
