import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;
import java.util.StringTokenizer;


public class BibliaTokenizer {
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
            if (lineUpper.contains("PAN")) {
                StringTokenizer st = new StringTokenizer(lineUpper);
                while (st.hasMoreTokens()) {
                    String s = st.nextToken();
                    if (s.equals("PAN")) {
                        slowoPan++;
                    }
                }
            }
        }

        System.out.println("Teskt posiada " + liczbaWierszy + " linijek.");
        System.out.println("Słowo \"Pan\" występuje " + slowoPan + " razy.");
    }
}