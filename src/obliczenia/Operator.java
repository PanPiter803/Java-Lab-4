package obliczenia;

public abstract class Operator extends Wyrazenie {

    @Override
    public boolean czyOperand() {
        return false;
    }
}
