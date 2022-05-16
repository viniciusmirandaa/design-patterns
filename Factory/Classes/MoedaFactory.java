package DesignPatterns.Factory.Classes;

public class MoedaFactory {
    public static Moeda criarMoeda(Pais pais){
        if(pais.equals(Pais.BRASIL)){
            return new Brasil();
        }else if(pais.equals(Pais.EUA)){
            return new EUA();
        }
        throw new IllegalArgumentException("Não existe esse país");
    }
}
