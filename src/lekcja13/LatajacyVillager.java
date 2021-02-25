package lekcja13;

public class LatajacyVillager extends Villager {

    public LatajacyVillager(String name, int age) {
        super(name, age);
    }

    @Override
    public void sayHello() {
        System.out.println("Ja latam!");
    }
}
