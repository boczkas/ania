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

//        2. NazwaKlasy - schemat klasy
//        3. Obywatel - przykładowa klasa
        Obywatel nika = new Obywatel("Nika", 1988, 12, 12, 0);
        System.out.println(nika.getDateOfBirth());

        Obywatel tosia = new Obywatel("Tosia", 2016, 5, 27, 100);
        Obywatel marysia = new Obywatel("Marysia", 2018, 10, 5, 100);

        List<Obywatel> rodzinka = new ArrayList<>();
        rodzinka.add(nika);
        rodzinka.add(tosia);
        rodzinka.add(marysia);

//        Pokazujemy wszystkim ile maja kieszonkowego
        for (Obywatel czlonekRodziny : rodzinka) {
            System.out.println(czlonekRodziny.getName() + ": " + czlonekRodziny.getPocketMoney());
        }

//        Podnosimy wszystkim kieszonkowe o 5%
        for (Obywatel czlonekRodziny : rodzinka) {
            czlonekRodziny.setPocketMoney(czlonekRodziny.getPocketMoney() + (czlonekRodziny.getPocketMoney() * 0.05));
        }

//        Pokazujemy wszystkim ile maja kieszonkowego
        for (Obywatel czlonekRodziny : rodzinka) {
            System.out.println(czlonekRodziny.getName() + ": " + czlonekRodziny.getPocketMoney());
        }

//        4. Przerobić powyższe na metody (+ wrzucić je do klasy), raisePocketMoney (co gdyby nie %  a kwota?)
//        5. Omówienie Obywatela
//        marysia.Obywatel();


    }
}
