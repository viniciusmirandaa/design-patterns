package DesignPatterns.Singleton.Classes;

public class Singleton {
    static private Singleton instance;

    private Singleton(){

    }

    public static Singleton getInstance(){
        if(instance == null){
            instance = new Singleton();
        }
        return instance;
    }
}
