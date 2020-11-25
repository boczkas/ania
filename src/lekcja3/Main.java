package lekcja3;

public class Main {
    public static void main(String[] args) {


//          1. Konwersja typów numerycznych

//        int liczbaInt = 5;
//        double liczbaDouble = liczbaInt;
//
//        System.out.println(liczbaInt);
//        System.out.println(liczbaDouble);


//          2. Rzutowanie (konwersja stratna)

//        liczbaDouble = 3.999;
//        liczbaInt = liczbaDouble;
//
//        liczbaInt = (int) liczbaDouble;
//        System.out.println(liczbaInt);
//
//        liczbaInt = 300;
//        byte liczbaByte = (byte) liczbaInt;
//
//        System.out.println(liczbaByte);


//          3. Operatory z przypisaniem

//        int x = 0;
//
//        x = x + 5;
//        System.out.println(x);
//
//        x += 5;
//        System.out.println(x);
//
//        x *= 2;
//        System.out.println(x);


//          4. Operatory inkrementacji i dekrementacji
//
//        int i = 0;
//
//        // postinkrementacji
//        i++;
//        System.out.println(i);
//
//        // postdekrementacji
//        i--;
//        System.out.println(i);
//
//        // preinkrementacji
//        ++i;
//        System.out.println(i);
//
//        // postdekrementacji
//        --i;
//        System.out.println(i);
//
//        int m = 7;
//        int n = 7;
//
//        int a = 2 * ++m;
//        int b = 2 * n++;
//
//        System.out.println("m = " + m);
//        System.out.println("n = " + n);
//        System.out.println("a = " + a);
//        System.out.println("b = " + b);


//          5. Operatory relacyjne i logiczne

//        System.out.println( "3 == 7 " + (3 == 7));
//        System.out.println( "3 != 7 " + (3 != 7));
//        System.out.println( "3 > 7 " + (3 > 7));
//        System.out.println( "3 >= 7 " + (3 >= 7));
//        System.out.println( "3 <= 7 " + (3 <= 7));
//
//        System.out.println("true || false " + (true || false));
//        System.out.println("true && false " + (true && false));

//      Operatory są leniwe

//        if (zwracamFalse1() || zwracamTrue1() || zwracamTrue2()) {
//            System.out.println("No fajnie");
//        }
//
//        if (zwracamTrue1() && zwracamFalse1() && zwracamFalse2() && zwracamTrue2()) {
//            System.out.println("No fajnie");
//        } else {
//            System.out.println("No nie fajnie");
//        }

//          6. Szybki wstęp do metod na przykładzie to co mamy poniżej
//        static - jeśli potrzebne, bo miejsce z którego jest wywoływane jest static
//        typ zwracany - boolean
//        nazwa - zwracamTrue1
//        lista argumentów (tutaj pusta)
//        ciało w klamerkach
    }

    int liczeSume(int a, int b) {
        return a + b;
    }

    static boolean zwracamTrue1() {
        System.out.println("Zwracam True1");
        return true;
    }

    static boolean zwracamTrue2() {
        System.out.println("Zwracam True2");
        return true;
    }

    static boolean zwracamFalse1() {
        System.out.println("Zwracam False1");
        return false;
    }

    static boolean zwracamFalse2() {
        System.out.println("Zwracam False2");
        return false;
    }

}
