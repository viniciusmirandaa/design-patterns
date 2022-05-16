package DesignPatterns.Observer.Classes;

import DesignPatterns.Observer.Interfaces.IObservable;
import DesignPatterns.Observer.Interfaces.IObserver;

public class PhoneDisplay implements IObserver {

    private final WeatherStation observable;

    public PhoneDisplay(WeatherStation weatherStation) {
        this.observable = weatherStation;
    }

    @Override
    public void update() {
        System.out.println("A temperatura é: " + observable.getTemperature());
    }
}
