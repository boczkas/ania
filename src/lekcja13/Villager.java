package lekcja13;

public abstract class Villager {
    String name;
    int age;

    public Villager(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public abstract void sayHello();

    public final String getName() {
        return name;
    }
}
