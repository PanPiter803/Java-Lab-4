package test;

import obliczenia.*;

public class Main {

    public static void main(String[] args) {
        Zmienna.dodaj("x");
        Zmienna.zmień("x", 2.5);
        Wyrazenie a = new Liczba(2.345);
        System.out.println(String.format("%s = %f", a, a.oblicz()));
        Wyrazenie b = new Przeciwne(new Liczba(-34.56));
        System.out.println(String.format("%s = %f", b, b.oblicz()));
        Wyrazenie c = new Dodawanie(new Przeciwne(new Liczba(9.876)), new Liczba(12.345));
        System.out.println(String.format("%s = %f", c, c.oblicz()));
        Wyrazenie z = new Zmienna("x");
        System.out.println(String.format("%s = %f", z, z.oblicz()));

        Wyrazenie Przyklad = new Dodawanie (
                new Liczba(7),
                new Mnozenie(
                        new Zmienna("x"),
                        new Liczba(5)
                )
        );
        System.out.println(String.format("%s = %f", Przyklad, Przyklad.oblicz()));

        Wyrazenie Pierwsze = new Dodawanie(new Liczba(3), new Liczba(5));
        System.out.println(String.format("%s = %f", Pierwsze, Pierwsze.oblicz()));

        Wyrazenie Drugie = new Mnozenie(
                new Dzielenie(
                    new Liczba(1),
                    new Odejmowanie(
                        new Liczba(2),
                        new Zmienna("x")
                )), new Liczba(7));
        System.out.println(String.format("%s = %f", Drugie, Drugie.oblicz()));

        Wyrazenie Trzecie = new Dzielenie(
                new Przeciwne(
                    new Odejmowanie(
                        new Mnozenie(
                                new Liczba(3),
                                new Liczba(11)),
                        new Liczba(1))
                ), new Dodawanie(
                    new Liczba(7),
                    new Liczba(5)));
        System.out.println(String.format("%s = %f", Trzecie, Trzecie.oblicz()));

        Wyrazenie Czwarte = new Dodawanie(
                new Mnozenie(
                    new Dodawanie(
                        new Zmienna("x"),
                        new Liczba(13)
                    ), new Zmienna("x")),
                new Dzielenie(
                        new Odejmowanie(
                            new Liczba(1),
                            new Zmienna("x")),
                        new Liczba(2)));
        System.out.println(String.format("%s = %f", Czwarte, Czwarte.oblicz()));

        Wyrazenie Piąte = new Dodawanie(
                    new Potega(
                            new Liczba(2),
                            new Liczba(5)),
                    new Mnozenie(
                            new Zmienna("x"),
                            new Logarytm(new Zmienna("x"))));
        System.out.println(String.format("%s = %f", Piąte, Piąte.oblicz()));
    }
}
