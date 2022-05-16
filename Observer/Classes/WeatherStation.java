package DesignPatterns.Observer.Classes;

import DesignPatterns.Observer.Interfaces.IObservable;
import DesignPatterns.Observer.Interfaces.IObserver;

import java.util.ArrayList;
import java.util.List;

public class WeatherStation implements IObservable {

    private final List<IObserver> listaObserver = new ArrayList<>();

    @Override
    public void add(IObserver observer) {
        listaObserver.add(observer);
    }

    @Override
    public void remove(IObserver observer) {
        listaObserver.remove(observer);
    }

    @Override
    public void notifica() {
        for (IObserver o : listaObserver) {
            o.update();
        }
    }

    public int getTemperature(){
        return 10;
    }
}
