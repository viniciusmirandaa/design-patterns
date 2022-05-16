package DesignPatterns.Decorator.Test;

import DesignPatterns.Decorator.Classes.Bebidas;
import DesignPatterns.Decorator.Classes.Cafe;
import DesignPatterns.Decorator.Classes.Caramelo;

public class TestDecorator {
    public static void main(String[] args) {
        Bebidas cafe = new Caramelo(new Cafe());
        System.out.println(cafe.custo());
    }
}
