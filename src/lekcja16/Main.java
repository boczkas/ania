package lekcja16;

import java.io.File;
import java.io.FileInputStream;
import java.lang.reflect.Field;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        1. Wracamy do enuma
//          - Stworzyć sobie enuma do dni, na zasanie PN, WT, SR.
//              Enum to tak na prawdę klasa. To co sobie tam tworzymy to instancje tej klasy.
//          - Enum na bogato - dodać do niego możliwość wyciągnięcia pełnej ładnej nazwy.
//                Dodajemy pole, dodajemy konstruktor.

//        2. Refleksja - dwa słowa
//        Java ma bibliotekę pozwalającą na analizowanie klas
//        Kot dachowiec = new Kot("Dachowiec", 2);
//        Class aClass = dachowiec.getClass();
//
//        System.out.println(aClass.getName());
//
//        for(Field pole : aClass.getDeclaredFields()) {
//            System.out.println(pole);
//        }

//        3. Podstawy przechwytywanie wyjątków
//          Co to jest wyjątek? Nieoczekiwane zachowanie programu. Możemy go obsłużyć, tak, aby program nie zdechł.
//          Mamy dwa rodzaje wyjątków checked i unchecked - sprawdzane i nie sprawdzane.
//
//              - checked
//        File file = new File("lala");
//        FileInputStream inputStream = new FileInputStream(file);

//              - unchecked
//        Kompilator nie wymusza na nas ich obsługi, ale wiedząc, że taki może wystąpić możemy go obsłużyć

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbe:");
        int liczba = scanner.nextInt();

//        Napisać do okoła tego ładnego try/catcha
//        Zmodyfikujmy pod to Ani kółko/krzyżyk

//        4. Porady projektowe dotyczące dziedziczenia
//          - wspólne metody i pola umieszczaj w nadklasach
//          - nie używać pól protected, metody można jak najbardziej ale w klasie bazowej ma być ich "niedziałająca" implementacja
//          - dziedziczenia używaj do określania relacji typu JEST
//          - nie używaj dziedziczenia jeśli któraś z metod nie działa poprawnie (Kot dziedziczący po Psie)
//          - przesłaniając metodę nie zmieniaj jej oczekiwanego zachowania
//          - wykorzystuj polimorfizm zamiast wykorzystywania informacji o typach

        Zwierze kot = new Kot("a", 2);
        if (kot instanceof Kot) {
            kot.wydajDzwiek();
        }

//        Tylko po prostu kot.wydajDzwiek()

//          - nie nadużywaj refleksj
    }
}
