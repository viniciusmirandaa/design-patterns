package DesignPatterns.Adapter.Test;

import DesignPatterns.Adapter.Classes.Adaptee;
import DesignPatterns.Adapter.Classes.Adapter;
import DesignPatterns.Adapter.Classes.ITarget;

public class Client {
    public static void main(String[] args) {
        ITarget iTarget = new Adapter(new Adaptee());
        iTarget.request();
    }
}
