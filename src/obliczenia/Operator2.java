package obliczenia;

public abstract class Operator2 extends Operator1 {

    protected Wyrazenie arg2;

    public Operator2(Wyrazenie a1, Wyrazenie a2) {
        super(a1);
        if (a2 == null) throw new IllegalArgumentException("argument drugi ustawiony na null");
        arg2 = a2;
    }

}
