package lekcja2;

// 1. char - pojedynczy znak, raczej się tego nie używa. Na String mówi się czasami łańcuch znaków, dlatego pokazuje
// 2. boolean - prawda/fałsz
// 3. zmienne - każda zmienna musi mieć określony typ
// 4. stałe - final
// 5. operatory
public class Main {
    public static void main(String[] args) {
//        1. char - pojedynczy znak, raczej się tego nie używa. Na String mówi się czasami łańcuch znaków, dlatego pokazuje
//
//
//        char znak = 'A';
//        System.out.println(znak);
//
//        znak = '\u03C0';
//        System.out.println(znak);
//
//
//        2. boolean - prawda/fałsz

//  nasze warunki w if'ach są do tego przerabiane i na podstawie tego podejmowane są decyzje

//        boolean warunek = true;
//        warunek = false;
//
//        if (warunek) {
//            System.out.println("Prawda");
//        } else {
//            System.out.println("Fałsz");
//        }
//
//        int dwa = 2;
//        int szesc = 6;
//
//        System.out.println(dwa > szesc);
//        System.out.println(szesc > dwa);
//
//        if (dwa > szesc) {
//            System.out.println("Jest tak");
//        } else {
//            System.out.println("Nie jest tak");
//        }

//        3. zmienne  - każda zmienna musi mieć określony typ

//  nazwa zmiennej musi zaczynać się literą i składać z liter i cyfr
//        double wyplata;
//        int liczbaDniWolnychOdPracyW2020RokuPoOdliczeniuSwiatNarodowych;
//        long populacjaLudnosciNaZiemi;
//        boolean zrobione;
//        Kot kocur;

//  zmienne trzeba zainicjalizować
//        int wiek = 5;
//        System.out.println(wiek);

//        StringBuilder stringBuilder = new StringBuilder();
//        for (int i = 0; i < 10; i++) {
//            stringBuilder.append(i);
//        }
//        System.out.println(stringBuilder.toString());

// deklarację zmiennych można przeplatać z regularnym kodem
// dobry styl programowania, to deklarowanie zmiennych jak najbliżej ich użycia
//        boolean prawdaCzyFalsz = true;
//
//        System.out.println("Coś tam coś tam" + prawdaCzyFalsz);
//
//
//        if(6 > 5) {
//            System.out.println("Costam");
//        }
//
//        System.out.println("Nie wiem");
//
//        String jakisTekst = "Jakiś tekst";
//        System.out.println(jakisTekst);
//        4. Stałe

// stałe oznaczamy słówkiem final i piszemy dużymi literami

//        final String IMIE = "Przemek";
//        System.out.println("Twoje imie to " + IMIE);
//
//        IMIE = "Ania";

//        5. Operatory: +, -, *, / , %
        System.out.println("1 + 2 = " + (1 + 2));
        System.out.println("1 - 2 = " + (1 - 2));
        System.out.println("2 * 2 = " + (2 * 2));
        System.out.println("9 / 3 = " + (9 / 3));
        System.out.println("5 % 2 = " + (5 % 2));

//        6. Funkcje i stałe matematyczne
//        Eksploracja przez klasę Math
        System.out.println(Math.sqrt(4));
        System.out.println(Math.pow(2, 3));
//
//        Zadanko na teraz: oblicz długość przeciwprostokątnej w trójkącie prostokątnym, długości boków wczytaj
//        ze standardowego wejścia

        Wielomian wielomian = new Wielomian();

        MiejscaZerowe miejscaZerowe = wielomian.obliczMiejscaZerowe(1, 2, 3);
        System.out.println(miejscaZerowe.getPiersze() + " " + " " + miejscaZerowe.getDrugie());
    }
}
