package obliczenia;

public class Odwrotne extends Operator1 {

    public Odwrotne(Wyrazenie a1) {
        super(a1);
    }

    @Override
    public double oblicz() {
        double d = arg1.oblicz();
        if (d == 0) throw new ArithmeticException("odwrotność 0");
        return 1 / d;
    }

    @Override
    public String toString() {
        if (arg1.czyOperand()) return String.format("1 / %s", arg1);
        else return String.format("(%s) ^ -1", arg1);
    }
}
