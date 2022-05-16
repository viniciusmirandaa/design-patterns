package DesignPatterns.Decorator.Classes;

public class Caramelo extends AddonDecorator{

    private final Bebidas bebidas;

    public Caramelo(Bebidas bebidas) {
        this.bebidas = bebidas;
    }

    @Override
    public double custo() {
        return 2 + bebidas.custo();
    }
}
