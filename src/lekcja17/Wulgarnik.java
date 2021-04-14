package lekcja17;

public interface Wulgarnik {
    default void nakrzycz(Krzykacz krzykacz) {
        System.out.println("O Ty piiiiiiiiiiiiiiiiii");
        krzykacz.wydajDzwiek();
    }
}
