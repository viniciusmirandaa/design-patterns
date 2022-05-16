package DesignPatterns.Factory.Classes;

public class Brasil implements Moeda{

    @Override
    public void getSimbolo() {
        System.out.println("R$");
    }
}
