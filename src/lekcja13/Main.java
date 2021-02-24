package lekcja13;

import java.time.LocalDate;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // 1. Nadpisywanie metod @Override
        Villager villager = new Villager("Staszek", 52);
        villager.sayHello();
        villager = new NiezwyklyVillager("Zenek", 30, "krzycze");
        villager.sayHello();
        villager = new ChoryVillager("Kasztan", 1);
        villager.sayHello();

//        2. Przeciążanie metod (overload)
//        W NiezwyklyVillager
//        dopisać metodę dajPrezent(String nazwa)
//        dopisać metodę dajPrezent(String nazwa, int ilosc)

//        3. Pokazać, że nie można przeciążać na podstawie typu zwracanego, a jedynie na podsawie argumentów
//        zmodyfikować metodę dajPrezent(String nazwa) tak by zwracała String dzięki
//        dodać kolejne dajPrezent(String nazwa) tak aby zwracało int.

//        4. Covariant return type. Przeciążając metodę można zwrócić typ podrzędny klasy
//        przykład ktoJestMoimKuplem()

//        5. Wyłączanie dziedziczenia
//        Załóżmy, że nikt nie powinien dziedziczyć po chorym villagerze - dodać final do deklaracji klasy
//        Stworzyć bardzo chorego villagera, który chciałby podziedziczyć po chorym villagerze
//
//        Nie chcemy żeby dało się nadpisać jakąś metodę - final method
//        dodać final do getName() w Villager. Spróbować nadpisać w NiezwyklyVillager

//        Jeśli klasa jest finalna jej metody są automatycznie finalne, ale nie pola
//        Trzeba pamiętać, że pola też mogą być finalne - co to znaczy?

//        6. Rzutowanie obiektów
        List<Villager> villagers = List.of(new Villager("Staszek", 52),
                new ChoryVillager("Jozek", 30),
                new NiezwyklyVillager("Robert", 50, "jem koper psem"));

//        Nie da się, bo aktualnym typem obiektu jest Villager:
//        villagers.get(2).getSkill();

//        trzeba zrzutować:
//        NiezwyklyVillager niezwyklyVillager = (NiezwyklyVillager) villagers.get(2);
//        niezwyklyVillager.getSkill();

//        Co się tutaj stanie?
//                ChoryVillager niezwyklyVillager = (ChoryVillager) villagers.get(2);

//        Dobrze jest więc sprawdzać operatorem instanceof przed wykonaniem rzutowania.
//        No chyba, że jest się w 100% pewnym ;)

//        if (villagers.get(2) instanceof NiezwyklyVillager) {
//                    NiezwyklyVillager niezwyklyVillager = (NiezwyklyVillager) villagers.get(2);
//            System.out.println(niezwyklyVillager.getSkill());
//        }

//        Nie da się wykonać bezsensownego rzutowania
//        LocalDate localDate = (LocalDate) villagers.get(2);
//
//        Generalnie nie zaleca się ani rzutowania ani używania instanceof.
//        Jeśli jest taka konieczność jest spora szansa, że klasa bazowa została źle zaprojektowana.
    }
}
