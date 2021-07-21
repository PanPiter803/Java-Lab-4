package obliczenia;

public class Logarytm extends Operator1{
    public Logarytm(Wyrazenie a1) { super(a1); }

    @Override
    public double oblicz() { return Math.log(arg1.oblicz()); }

    @Override
    public String toString() {
        return String.format("ln(%s)", arg1);
    }
}
