package zadanieOX;

public class Main {

    static Player player1 = new Player("Przemek");
    static Player player2 = new Player("Ania");

    public static void main(String[] args) {
//        Napisz prostą grę w kółko krzyżyk
//
//        Wymagania:
//        1. Gra ma być na dwóch graczy
//        2. Rozmiar planszy ma być konfigurowany na starcie gry
//        3. Gracz wygrywa, gdy ma 3 swoje symbole obok siebie w dowolnej konfiguracji - pion, poziom, skos
//        4. Gracze mają wprowadzać wybór swojego pola jeden po drugim
//        5. Program ma znajdować moment w którym jeden z graczy zwycięża
//        6. Można zakończyć grę w dowolnym momencie po wpisaniu słowa quit
//        7. Gra ma mieć 3 rundy
//        8. Zaczynający turę gracz ma się zmieniać co rozgrywkę


        Player currentPlayer = player1;

        System.out.println(currentPlayer);

        currentPlayer = switchPlayer(currentPlayer);

        System.out.println(currentPlayer);


    }

    static Player switchPlayer(Player currentPlayer) {
        return currentPlayer.equals(player1) ? player2 : player1;
    }
}
