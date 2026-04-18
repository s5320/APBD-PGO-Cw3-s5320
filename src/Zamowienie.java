import java.util.ArrayList;
import java.util.Objects;

public class Zamowienie {
    private int numerZamowienia;
    private Klient klient;
    private ArrayList<Menu> produkty;
    private boolean oplacone;
    private static int kolejnyNumer;

    public Zamowienie(Klient klient) {
        this.klient = klient;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Zamowienie that = (Zamowienie) o;
        return numerZamowienia == that.numerZamowienia;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(numerZamowienia);
    }
}
