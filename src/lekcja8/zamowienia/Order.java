package lekcja8.zamowienia;

import java.util.ArrayList;
import java.util.List;

public class Order {
    List<Item> orders;

    public Order() {
        this.orders = new ArrayList<>();
    }

    public void addItem(Item item) {
        this.orders.add(item);
    }

    public void remove(Item item) {
        this.orders.remove(item);
    }

    public void showItems() {
        System.out.println("orders ammount: " + orders.size());
        for (Item item : orders) {
            System.out.println(item);
        }
    }
}
