package lekcja12.villager;

public class ChoryVillager extends Villager{
    public ChoryVillager(String name, int age) {
        super(name, age);
    }

    @Override
    public void sayHello() {
        System.out.println("Nie chce z toba gadac!");
    }
}
