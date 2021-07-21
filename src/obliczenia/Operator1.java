package obliczenia;

public abstract class Operator1 extends Operator {

    protected Wyrazenie arg1;

    public Operator1(Wyrazenie a1) {
        if (a1 == null) throw new IllegalArgumentException("argument pierwszy ustawiony na null");
        arg1 = a1;
    }
}
