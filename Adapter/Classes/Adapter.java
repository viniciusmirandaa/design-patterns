package DesignPatterns.Adapter.Classes;

public class Adapter implements ITarget{

    private final Adaptee adaptee;

    public Adapter(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public void request() {
        adaptee.adaptedRequest();
    }
}
