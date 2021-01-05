package lekcja6;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Arrays;

public class Main {
//    1. Wybór wieloktrotny switch

    public static void main(String[] args) {
//        int number = 1;
//
//        switch (number) {
//            case 1:
//                System.out.println("Jestem w 1");
//                break;
//            case 2:
//                System.out.println("Jestem w 2");
//                break;
//            case 3:
//                System.out.println("Jestem w 3");
//                break;
//            default:
//                System.out.println("Jakaś dziwna ta liczba");
//        }

//        Zadziała na char, byte, short, int, String (od Java7), enumie

//        2. Instrukcje przerywające przepływ sterowania

//        break
//
//        int cel = 5;
//        int lata = 0;
//
//        while (lata < 100) {
//            if (cel > 10) break;
//
//            System.out.println("cel: " + cel);
//            System.out.println("lata: " + lata);
//            System.out.println();
//
//            cel++;
//            lata++;
//        }
//
//        int liczba1 = 0;
//        int liczba2 = 0;
//
//        while (liczba1 < 5) {
//            while (liczba2 < 5) {
//                if (liczba2 == 3) break;
//                System.out.println("liczba2: " + liczba2);
//                liczba2++;
//            }
//            System.out.println("liczba1: " + liczba1);
//            liczba1++;
//        }
//
//
//        continue
//
//
//        for (int i = 0; i < 10; i++) {
//            if (i == 5) continue;
//            System.out.println("i: " + i);
//        }

//        3. Duże liczby

//        BigInteger duzyInt = new BigInteger("123546545364567366564385721443242354");
//        System.out.println(duzyInt);
//
//        BigInteger jeden = new BigInteger("1");
//        BigInteger dwa = new BigInteger("2");
//
//        System.out.println(jeden.add(dwa));
//
//        BigDecimal duzyDecimal = new BigDecimal("12123213213.1231232132132132131231");
//        System.out.println(duzyDecimal);
//
//        BigDecimal pol = new BigDecimal("0.5");
//        System.out.println(pol.multiply(pol));

//        4. Tablice
//          Długość tablicy musi być stała
//        int[] a = new int[10];
//
//        a[0] = 0;
//        a[1] = 1;
//        a[2] = 2;
//        a[3] = 3;
//        a[4] = 4;
//        a[5] = 5;
//        a[6] = 6;
//        a[7] = 7;
//        a[8] = 8;
//        a[9] = 9;
////        a[10] = 10;
//
//        for (int i : a) {
//            System.out.println(i);
//        }

//        Wielowymiarowe
//
//        int[][] b = new int[2][2];
//
//        b[0][0] = 0;
//        b[0][1] = 1;
//        b[1][0] = 10;
//        b[1][1] = 11;
//
//        for (int[] i : b) {
//            for (int j : i) {
//                System.out.println(j);
//            }
//        }

//        int[] tablica1 = {1, 2, 3, 4, 5};
//        wypisywaczka(tablica1);
//
//        int[] tablica2 = tablica1;
//        tablica2[0] = 10;
//        wypisywaczka(tablica1);
//
//        System.out.println(tablica2);
//        Zadanie zadanie = new Zadanie();
//        System.out.println(zadanie);
//
//        int[] tablica3 = Arrays.copyOf(tablica1, tablica1.length);
//        tablica3[1] = 20;
//        wypisywaczka(tablica3);
    }

    static void wypisywaczka(int[] tablica) {
        System.out.println("=======================");
        for(int i : tablica) {
            System.out.println(i);
        }
    }
}
