package lekcja12;


import lekcja11.Obywatel;
import lekcja12.villager.ChoryVillager;
import lekcja12.villager.NiezwyklyVillager;
import lekcja12.villager.Villager;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//        1. Pakiety - utworzyć zmienna typu LocalDate. Co oznacza ten import?
//        2. Tworzenie pakietów.
//        Pakiety tworzy się w celu organizacji pracy oraz uniknięcia konfliktów nazw. Jak u nas z Obywatelem.
//        Popatrz na pierwszą linike w naszych klasach w poprzednich lekcjach. W szczególności na lekcję 7.
//        Każda klasa może używać wszystkich klas ze swojego pakietu oraz PUBLICZNYCH klas z pozostałych pakietów.

//        Obywatel obywatel = new Obywatel();

//        Zadanie:
//              - utwórz pakiet ania
//              - utwórz pakiet baryłek
//              - w obu pakietach utwórz klasę Gdanszczanin
//              - stwórz obiekty obu klas w Main
//

//        3. Importowanie statyczne
//        double pow = Math.pow(2, 2);
//        double pow = pow(2, 2);

//        4. Modyfikatory dostępu.
//        Utworzyć klasę Gdansk w pakiecie ania. Usunac jej modyfikator dostepu.
//        Czy da się jej użyć w pakiecie lekcja12?

//        5. Dziedziczenie

//        Klasy mogą po sobie dziedziczyć. W Javie można dziedziczyć tylko po jednej klasie
//        Stwórz klasę Villager posiadającą imie i wiek. Utwórz odpowiedni kontruktor.
//        Stwórz klasę NiezwyklyVillager dziedziczącą po Villager, z dodatkowym polem umiejętność.
//        Utwórz konstruktor, który będzie przyjnował dodatkowy argument

        Villager villager = new Villager("Staszek", 45);
        NiezwyklyVillager niezwyklyVillager = new NiezwyklyVillager("Niezwkly", 100, "maluje");

        villager.sayHello();
        niezwyklyVillager.sayHello();
//        Klasa Villager ma dysponować metodą sayHello(), w której mieszkaniec wioski wita się swoim imieniem i wiekiem.
//        Klasa NiezwyklyVillager ma nadpisywac metodę sayHello(), tak aby witał się imieniem, wiekiem oraz umiejętnością.

//        Villager mieszkaniec = new NiezwyklyVillager();
//
//        Dodać klasę ChoryVillager, który w hello() odpowiada, że nie ma siły gadać.
//
        ChoryVillager choryVillager = new ChoryVillager("Chory", 30);

        List<Villager> mieszkancyWioski = new ArrayList<>();
        mieszkancyWioski.add(villager);
        mieszkancyWioski.add(niezwyklyVillager);
        mieszkancyWioski.add(choryVillager);

        for (Villager mieszkaniec : mieszkancyWioski) {
            mieszkaniec.sayHello();
        }


//        Polymorphism means "many forms", and it occurs when we have many classes that are related to each other by inheritance.
//        Polimofizm oznacza, że możemy w miejsce klasy bazowej podstawić dowolny element z klasy dziedziczącej.

//        Każda klasa dziedziczy po klasie Object
//        Object ukrytyMieszkaniec = mieszkaniec;
//        Sprawdzić jakie ma metody.
//        NiezwyklyVillager odkrytyMieszkaniec = (NiezwyklyVillager) ukrytyMieszkaniec;

        Object object = new Villager("Staszek", 50);
        Villager odkrytyVillager = (Villager) object;
        odkrytyVillager.sayHello();
    }
}
