package lekcja5;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
//        1. Pusty łańcuch
//        String pusty = "";
//
//        System.out.println(pusty.length() == 0);
//        System.out.println(pusty.isEmpty());

//        2. charAt
//        String witaj = "elo";
//        System.out.println(witaj);
//
//        char znak = witaj.charAt(1);
//        System.out.println(znak);

//        3. String API
//        jak korzystać z tego co daje nam String
//        String czesc = "Cześć Aniu!";
//        String substring = czesc.substring(5);
//        System.out.println(substring);

//        4. Wejście/wyjście I/O

//      Wyjście
//        System.out.println("No elo");

//      Wejście
//        Scanner in = new Scanner(System.in);
//        in.nextInt();
//        in.nextDouble();

//      5. Zapis i odczyt plików

//        Odczyt

//        Path fileName = Path.of(System.getProperty("user.dir") + "/src/lekcja5/test.txt");
//        System.out.println(System.getProperty("user.dir"));
//        String text = Files.readString(fileName);
//        System.out.println(text);

//         Zapis
//        FileWriter fileWriter = new FileWriter("src/lekcja5/test.txt");
//        fileWriter.write("Bardzo miło mi Panią powitać");
//        fileWriter.append("Cześć Aniu!");
//        fileWriter.close();
//
//        String milo = "Cześć Aniu!";
//        Files.write(Path.of("src/lekcja5/test.txt"), milo.getBytes(), StandardOpenOption.APPEND);


        //        System.out.println(System.getProperty("user.dir"));

//        6. Bloki i zasięgi

        {
            int n = 5;

            {
//                int n = 5;
            }
        }

        int n = 5;
        n = 10;

//        7. Kontrola przebiegu

//        int i = 5;
//        if (i < 7) {
//            System.out.println("siemasiema");
//            System.out.println("siemasiema");
//            System.out.println("siemasiema");
//            System.out.println("siemasiema");
//            System.out.println("siemasiema");
//        }
//        else if (i > 10) {
//
//        }
//        else {
//
//        }
//        String eloszka = "eloszka";
//
//        if (2 * i + 10 > 100 || 2 + i < 5 && !eloszka.isEmpty()) {
//            if (eloszka.length() > 3) {
//
//            }
//
//        }

//        8. Pętle

        int j = 0;
        while (j < 1) {
            j++;
            System.out.println(j);
        }

//        do {
//            System.out.println(j);
//        } while (j < 0);

        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }

        List<String> slowa = new ArrayList<>();
        slowa.add("siema");
        slowa.add("no elo");
        slowa.add("czesc");

//        for (String nazwa : slowa) {
//            System.out.println(nazwa);
//        }


        for (int k = 0; slowa.size() > 0 ;) {
            String s = slowa.get(k);
            System.out.println(s);
            slowa.remove(k);
        }

    }
}
