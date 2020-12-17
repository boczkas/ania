import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;


public class LosowanieSwiateczne {
    public static void main(String[] args) throws IOException {

        try {
            FileWriter wynikiLosowania = new FileWriter("src/wyniki.txt");


            List<String> lista = new ArrayList<>();
            lista.add("Ewa");
            lista.add("Andrzej");
            lista.add("Grzesiek");
            lista.add("Magda");
            lista.add("Maciek");
            lista.add("Piotr");


            int zakres = lista.size();
            //Scanner out = new Scanner(System.out);


            int nrOsoby = 6;
            for (nrOsoby = 6; nrOsoby > 0; nrOsoby--) {
                System.out.println("Losowanie dla osoby nr: " + nrOsoby);
                wynikiLosowania.write("Losowanie dla osoby nr: " + nrOsoby + "\n");
                int osoba = (int) Math.round(Math.random() * zakres);
                String imie = lista.get(osoba);
                System.out.println(imie);
                wynikiLosowania.write(imie + "\n");
                lista.remove(osoba);
                zakres = lista.size() - 1;
            }
            wynikiLosowania.close();
        } catch(Exception e) {System.out.println("Błąd "+e.getMessage());}
    }
}