package DesignPatterns.Observer.Test;

import DesignPatterns.Observer.Classes.PhoneDisplay;
import DesignPatterns.Observer.Classes.WeatherStation;

public class TestObservable {
    public static void main(String[] args) {
        WeatherStation weatherStation = new WeatherStation();
        PhoneDisplay phoneDisplay = new PhoneDisplay(weatherStation);

        weatherStation.add(phoneDisplay);
        weatherStation.notifica();
    }
}
