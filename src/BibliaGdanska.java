import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;


public class BibliaGdanska {
    public static void main(String[] args) throws IOException {
        System.out.println(System.getProperty("user.dir"));
        Path fileName = Path.of(System.getProperty("user.dir") + "/src/PBG.txt");
        String biblia = Files.readString(fileName);

        //System.out.println(biblia);
        // Oblicz ile razy w Bibli występuje słowo Pan
        // Oblicz ile linii ma Biblia

        int liczbaWierszy = 0;
        int slowoPan = 0;

        Scanner scanner = new Scanner(biblia);

        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            String lineUpper = line.toUpperCase();
            liczbaWierszy++;
            if (lineUpper.contains("PAN ")) {
                slowoPan++;
                int pozycjaPan = lineUpper.indexOf("PAN ");
                String substring = lineUpper.substring(pozycjaPan + 4);
                if (substring.contains("PAN ")) {
                    slowoPan++;
                    int pozycjaPan2 = substring.indexOf("PAN ");
                    String substring2 = substring.substring(pozycjaPan2 + 4);
                    if (substring2.contains("PAN ")) {
                        slowoPan++;
                        int pozycjaPan3 = substring2.indexOf("PAN ");
                        String substring3 = substring2.substring(pozycjaPan3 + 4);
                        if (substring3.contains("PAN ")) {
                            slowoPan++;

                            }
                        }
                    }
                }
            }

        System.out.println("Teskt posiada " + liczbaWierszy + " linijek.");
        System.out.println("Słowo \"Pan\" występuje " + slowoPan + " razy.");
    }
}






