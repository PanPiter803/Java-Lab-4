package obliczenia;

public class Stala  extends Operand{
    public static final Stala PI = new Stala("PI", 3.141592653589793238);
    public static final Stala E = new Stala("E", 2.718281828459045235);
    public static final Stala PHI = new Stala("PHI", 1.618033988749894848);

    private final String nazwa;
    private final double stała;

    public Stala(String naz, double st) {
        if (naz == null) throw new IllegalArgumentException("stała jest null");
        if (!naz.matches("\\p{Alpha}\\w*}")) throw new IllegalArgumentException("nazwa stałej jest niepoprawna");
        nazwa = naz;
        stała = st;
    }

    @Override
    public double oblicz() { return stała; }

    @Override
    public String toString() { return nazwa; }
}
