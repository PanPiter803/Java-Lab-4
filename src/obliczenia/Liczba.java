package obliczenia;

public class Liczba extends Operand {

    private double liczba;

    public Liczba(double licz) {
        liczba = licz;
    }

    @Override
    public double oblicz() {
        return liczba;
    }

    @Override
    public String toString() {
        return String.format("%.3f", liczba);
    }
}
