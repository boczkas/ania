package lekcja7;

import lekcja7.silnik.SilnikZaplonowy;
import lekcja7.stacyjka.Stacyjka;

public class Samochod {
    // składowe obiektu, inaczej pola klasy
    SilnikZaplonowy silnikZaplonowy;
    Stacyjka stacyjka;

    public Samochod() {
        this.silnikZaplonowy = new SilnikZaplonowy();
        this.stacyjka = new Stacyjka();
    }

    // metoda
    public void odpal() throws InterruptedException {
        if (!stacyjka.isPrzekrecona()) {
            stacyjka.przekrec();
        }
        silnikZaplonowy.odpalSilnikGlowny(stacyjka);
    }
}
