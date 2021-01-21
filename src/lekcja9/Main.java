package lekcja9;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//        1. Dostęp do wartości elementów
//        LocalDate date = LocalDate.now();
//        System.out.println(date.getDayOfMonth());
//        System.out.println(date.getMonth());
//        System.out.println(date.getYear());

//        DO OX!!!!!!!!
        List<String> pola = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            pola.add("| |");
        }

        pola.set(2, "|X|");
        pola.set(5, "|O|");
        pola.set(7, "|X|");

        for (String pole : pola) {
            System.out.print(pole);
        }

//        2. NazwaKlasy - schemat klasy
//        3. Obywatel - przykładowa klasa
//        Obywatel nika = new Obywatel("Nika", 1988, 12, 12, 0);
////        System.out.println(nika.getDateOfBirth());
//
//        Obywatel tosia = new Obywatel("Tosia", 2016, 5, 27, 200);
//        Obywatel marysia = new Obywatel("Marysia", 2018, 10, 5, 200);
//
//        List<Obywatel> rodzinka = new ArrayList<>();
//        rodzinka.add(nika);
//        rodzinka.add(tosia);
//        rodzinka.add(marysia);
//
////        Pokazujemy wszystkim ile maja kieszonkowego
//        for (Obywatel czlonekRodziny : rodzinka) {
//            czlonekRodziny.showPocketMoney();
//        }
//
////        Podnosimy wszystkim kieszonkowe o 5%
//        for (Obywatel czlonekRodziny : rodzinka) {
//            czlonekRodziny.increasePocketMoney(5);
//        }
//
////        Pokazujemy wszystkim ile maja kieszonkowego
//        for (Obywatel czlonekRodziny : rodzinka) {
//            czlonekRodziny.showPocketMoney();
//        }

//        4. Przerobić powyższe na metody (+ wrzucić je do klasy), raisePocketMoney (co gdyby nie %  a kwota?)
//        5. Omówienie Obywatela
//        marysia.Obywatel();


    }
}
