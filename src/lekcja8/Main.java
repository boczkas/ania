package lekcja8;

import lekcja8.zamowienia.Item;
import lekcja8.zamowienia.Order;

import java.time.Instant;
import java.time.LocalTime;
import java.time.Year;

public class Main {
//    1.
//    Zaprojektujemy sobie system do przyjmowania zamówień - wymyślimy klasy i metody.
//    Zamówienie składa się z przedmiotów (Item). Każdy przedmiot ma swoją cenę.

//    2.
//    Item przy tworzeniu ma przyjmować swoją nazwę i cenę - wprowadzenie do konstruktorów

//    3.
//    Przedmioty można dodawać i wyjmować z naszego zamówienia.

    public static void main(String[] args) {

        Item item = new Item("japko", 1.0);
        Order order = new Order();
        order.showItems();
        System.out.println("=================================");
        order.addItem(item);
        order.addItem(item);
        order.showItems();
        System.out.println("=================================");
        order.remove(item);
        order.showItems();
        System.out.println("=================================");


//        4. Używanie klas wbudowanych
//        Przejdziemy przez pakiet Time
        LocalTime localTime = LocalTime.of(1,1,1);
        System.out.println(localTime);

        LocalTime localTimePlusTwo = localTime.plusHours(2);
        System.out.println(localTimePlusTwo);

//        5. Spróbuj stworzyć datę swoich urodzin eksplorując pakiet Time
//        https://docs.oracle.com/javase/8/docs/api/java/time/package-summary.html

    }
}
