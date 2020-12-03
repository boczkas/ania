package lekcja4;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Zadanie {
    public static void main(String[] args) throws IOException {
        System.out.println(System.getProperty("user.dir"));
        Path fileName = Path.of(System.getProperty("user.dir") + "/src/lekcja4/PBG.txt");
        String biblia = Files.readString(fileName);

        System.out.println(biblia);

        // Oblicz ile razy w Bibli występuje słowo Amen
        // Oblicz ile linii ma Biblia

    }
}
