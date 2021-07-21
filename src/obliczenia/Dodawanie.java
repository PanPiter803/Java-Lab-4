package obliczenia;

public class Dodawanie extends Operator2{
    public Dodawanie(Wyrazenie a1, Wyrazenie a2) {
        super(a1, a2);
    }

    @Override
    public double oblicz() {
        return arg1.oblicz() + arg2.oblicz();
    }

    @Override
    public String toString() {
        return String.format("(%s + %s)", arg1, arg2);
    }
}
