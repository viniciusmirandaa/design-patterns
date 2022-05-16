package DesignPatterns.Factory.Classes;

public class EUA implements Moeda{

    @Override
    public void getSimbolo() {
        System.out.println("$");
    }
}
