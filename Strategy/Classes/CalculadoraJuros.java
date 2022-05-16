package DesignPatterns.Strategy.Classes;

import DesignPatterns.Strategy.CalculaJurosStrategyInterface;

import java.util.Scanner;

public class CalculadoraJuros {

    Scanner input = new Scanner(System.in);

    public void calculaJurosBancoContext(CalculaJurosStrategyInterface calculaJurosStrategyInterface){
        System.out.println("Qual o valor do pedido: ");
        int resultEscolha = input.nextInt();
        int resultPedido = calculaJurosStrategyInterface.calculaJurosBanco(resultEscolha);
        System.out.println(resultPedido);
    }
}
