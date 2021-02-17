package lekcja12.villager;

public class Villager {
    String name;
    int age;


    public Villager(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void sayHello() {
        System.out.println("Siema jestem " + name + " i mam " + age + " lat.");
    }
}
