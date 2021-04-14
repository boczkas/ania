package lekcja17;

public interface Krzykacz {
    void wydajDzwiek();
    default void nakrzycz(Krzykacz krzykacz) {
        System.out.println("Nie mów ciągle!");
        krzykacz.wydajDzwiek();
    }

    static void zwiekszGlosnosc(int wartosc) {
        System.out.println(++wartosc);
    }
}
