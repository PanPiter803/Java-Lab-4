package obliczenia;

public abstract class Wyrazenie implements Obliczalny {

    // metoda sumująca wyrażenia
    public static double suma (Wyrazenie... wyr) {
        double s = 0.0;
        for (Wyrazenie w: wyr) s += w.oblicz();
        return s;
    }
    // metoda mnożąca wyrażenia
    public static double iloczyn (Wyrazenie... wyr) {
        double il = 1.0;
        for (Wyrazenie w: wyr) il *= w.oblicz();
        return il;
    }

    public abstract boolean czyOperand();

    @Override
    public boolean equals(Object ob) {
        Wyrazenie wyr = (Wyrazenie)ob;
        return oblicz() == wyr.oblicz();
    }
}
