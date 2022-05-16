package DesignPatterns.Strategy.Test;

import DesignPatterns.Strategy.Classes.CalculadoraJuros;
import DesignPatterns.Strategy.Classes.Itau;
import DesignPatterns.Strategy.Classes.Santander;

public class Test {
    public static void main(String[] args) {
        Santander santander = new Santander();
        Itau itau = new Itau();

        CalculadoraJuros calculadoraJuros = new CalculadoraJuros();

        calculadoraJuros.calculaJurosBancoContext(santander);
    }
}
