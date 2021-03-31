package lekcja17;

public class Pracownik {
    String imie;
    double wyplata;

    public Pracownik(String imie, double wyplata) {
        this.imie = imie;
        this.wyplata = wyplata;
    }

//    @Override
//    public int compareTo(Pracownik o) {
//        return Double.compare(this.wyplata, o.wyplata);
//    }

    @Override
    public String toString() {
        return "Pracownik{" +
                "imie='" + imie + '\'' +
                ", wyplata=" + wyplata +
                '}';
    }
}
