package obliczenia;

import java.util.*;

public class Zmienna extends Operand {

    private static Map<String, Double> zmienne = new TreeMap<String, Double>();

    public static boolean sprawdź(String zm) {
        if (zm == null) throw new IllegalArgumentException("zmienna jest null");
        return zmienne.containsKey(zm);
    }
    public static void dodaj(String zm) {
        if (zm == null) throw new IllegalArgumentException("zmienna jest null");
        if (! zm.matches("\\p{Alpha}\\w*")) throw new IllegalArgumentException("zmienna nie jest poprawnym identyfikatorem");
        if (sprawdź(zm)) throw new IllegalStateException("zmienna " + zm + " już istnieje");
        zmienne.put(zm, 0.0);
    }
    public static void zmień(String zm, double licz) {
        if (! sprawdź(zm)) throw new IllegalStateException("zmienna " + zm + " nie istnieje");
        zmienne.replace(zm, licz);
    }
    public static void usuń(String zm) {
        if (sprawdź(zm)) zmienne.remove(zm);
    }

    private String zmienna;

    public Zmienna(String zm) {
        if (zm == null) throw new IllegalArgumentException("zmienna jest null");
        if (! zm.matches("\\p{Alpha}\\w*")) throw new IllegalArgumentException("zmienna nie jest poprawnym identyfikatorem");
        zmienna = zm;
    }

    @Override
    public double oblicz() {
        if (! sprawdź(zmienna)) throw new IllegalStateException("zmienna " + zmienna + " nie istnieje");
        return zmienne.get(zmienna);
    }

    @Override
    public String toString() {
        return zmienna;
    }
}
