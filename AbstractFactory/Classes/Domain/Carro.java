package DesignPatterns.AbstractFactory.Classes.Domain;

public class Carro {
    private Roda roda;
    private Som som;

    public void setRoda(Roda roda) {
        this.roda = roda;
    }

    @Override
    public String toString() {
        return "Carro{" +
                "roda=" + roda +
                ", som=" + som +
                '}';
    }

    public void setSom(Som som) {
        this.som = som;
    }
}
