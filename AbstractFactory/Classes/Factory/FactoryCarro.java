package DesignPatterns.AbstractFactory.Classes.Factory;

import DesignPatterns.AbstractFactory.Classes.Domain.Carro;
import DesignPatterns.AbstractFactory.Classes.Domain.TipoCarro;

public class FactoryCarro {

    static AbstractFactory abstractFactory;

    public static Carro criarCarro(TipoCarro tipoCarro){
        if(tipoCarro.equals(TipoCarro.LUXO)){
            abstractFactory = new CarroLuxoFactory();
        }else if(tipoCarro.equals(TipoCarro.SIMPLES)){
            abstractFactory = new CarroSimplesFactory();
        }else {
            throw new IllegalArgumentException("não existe essa opção");
        }
        Carro carro = new Carro();
        carro.setRoda(abstractFactory.montarRoda());
        carro.setSom(abstractFactory.montarSom());
        return carro;
    }
}
