package lekcja13;

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

    public final String getName() {
        return name;
    }

//    Villager ktoJestMoimKuplem(ChoryVillager villager) {
//        System.out.println("Moim kumplem jest: " + villager.getName());
//        return villager;
//    }
}
