package obliczenia;

public class Przeciwne extends Operator1 {

    public Przeciwne(Wyrazenie a1) {
        super(a1);
    }

    @Override
    public double oblicz() {
        return -arg1.oblicz();
    }
    @Override
    public String toString() {
        if (arg1.czyOperand()) return String.format("- %s", arg1);
        else return String.format("- (%s)", arg1);
    }
}
