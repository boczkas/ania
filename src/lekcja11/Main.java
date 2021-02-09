package lekcja11;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
//        1. Metody fabryczne - tworzymy obiekt nie przez kontruktor
        LocalDate localDate = LocalDate.of(1,1,1);
        System.out.println(localDate);

//        2. Przekazywanie argumentów do metod - w Javie zawsze przez wartość,
//        czyli wartość jest skopiowana
        double number = 3;
        triple(number);
        System.out.println("double number: " + number);

        Pracownik pracownik = new Pracownik(3);
        triple(pracownik);

        System.out.println("pracownik.wyplata: " + pracownik.wyplata);

//        Metoda nie może zmodyfikować parametru typu podstawowego (czyli będącego liczbą lub wartością logiczną)
//        Metoda może zmienić stan obiektu przekazanego jako parametr
//        Metoda nie może sprawić, aby parametr obiektowy zaczął się odwoływać do nowego obiektu

//        ====================================================================================================
//        Kontruowanie obiektów
//        ====================================================================================================
//        1. Przeciążanie
        Obywatel staszek = new Obywatel("Staszek");
        Obywatel julka = new Obywatel("Julka", 1,1,1,1);

        String tekst = "to jest jakiś kawałek tekstu";
        tekst.indexOf("j");
        tekst.indexOf("j", 5);

//        2. Domyślna inicjalizacja pól
        Obywatel bezimienny = new Obywatel();
        System.out.println("name: " + bezimienny.getName());
        System.out.println("dateOfBirth: " + bezimienny.getDateOfBirth());
        System.out.println("isSuspended: " + bezimienny.getIsSuspended());
        System.out.println("pocketMoney: " + bezimienny.getPocketMoney());

//        Domyślna inicjalizacja nie jest dobrym pomysłem. Należy jawnie inicjalizować pola
//        Pokazać jak to u nas działa w Obywatel

//        3. Wywołanie innego konstruktora w kontruktorze
//        public Obywatel(String name, LocalDate localDate)

//        4. Blok inicjalizacyjny
        System.out.println("ilu obywateli: " + Obywatel.getAmountOfPeople());

//        dodać static do bloku inicjalizacyjnego
    }

    private static void triple(double numerek) {
        System.out.println(numerek * 3);
    }

    private static void triple(Pracownik worker) {
        System.out.println(worker.wyplata = worker.wyplata * 3);
    }
}
