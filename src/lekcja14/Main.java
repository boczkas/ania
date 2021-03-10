package lekcja14;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
//        1. Ograniczenia dostępu
//        private - widoczność w obrębie klasy
//        public - widoczność wszędzie
//        protected - widoczność w pakiecie i wszystkich podklasach
//        <default> - widoczność w obrębie pakietu

//        Stworzyć metodę publiczną powiększWyplateO100
//        Stworzyć metodę publiczną powiększWyplateO200
//        Dołożyć prywatną powiekszWyplate

//        Spróbować użyć zmiennych z Pracownik w Main.
//        Zmienić dostęp jednej z nich na private
//        Zmienić na protected
//        Stworzyć klasę w podpakiecie dziedziczącą po Pracownik'u

//        2. equals()
//        Domyślne zachowanie to sprawdzanie równości referencji
//        Często nie jest to wystarczające, w szczególności w przypadku obiektów, które przechowywują jakiś stan
//        Wygenerować i omówić equals. Wspomnieć o hashCode
//        Stworzyć dwóch pracowników. Pokazać co zwraca equals przed i po nadpisaniu equals w Pracownik'u
//        Możesz sobie poczytać w książce o zasadach tworzenia dobrego equalsa - matematyczne. Tu nam wystarczy wygenerowane

//        3. hashCode() - powinna wyliczyć w miarę unikatową wartość dla obiektu. Pokazać jak nam wygenerowało
//        4. toString() - nadpisać automatycznie, nadpisać z palca

//        5. ArrayList - generyczna klasa z parametrem typu - co to oznacza? Możemy podać tutaj dowolny typ referencyjny
//        ArrayList<Pracownik>
//        Jaką to ma zaletę w stosunku do zwykłych list Pracownik[] pracownicy?
//        Pracownik[] pracowniks = new Pracownik[];
//        Samo się rozszerza jak jest potrzeba

//        Deklaracja
//        ArrayList<Pracownik> pracownicy = new ArrayList<Pracownik>();

//        Java 11
//        var pracownikArrayList = new ArrayList<Pracownik>();

//        Dodawanie do array vs dodawanie do arrayList
    }
}
