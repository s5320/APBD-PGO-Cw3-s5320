import java.util.ArrayList;
import java.util.Objects;

public class Zamowienie {
    private int numerZamowienia;
    private Klient klient;
    private ArrayList<Menu> produkty;
    private boolean oplacone;
    private static int kolejnyNumer;

    public Zamowienie(Klient klient) {
        this.numerZamowienia = kolejnyNumer++;
        this.klient = klient;
        this.produkty = new ArrayList<>();
        this.oplacone = false;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Zamowienie that = (Zamowienie) o;
        return numerZamowienia == that.numerZamowienia;
    }
    @Override
    public String toString() {
        String statusPlatnosci;

        if (oplacone) {
            statusPlatnosci = "opłacone";
        } else {
            statusPlatnosci = "nieopłacone";
        }

        return "Zamówienie nr: " + numerZamowienia +
                "\nKlient: " + klient +
                "\nProdukty: " + produkty +
                "\nStatus płatności: " + statusPlatnosci;
    }
    @Override
    public int hashCode() {
        return Objects.hashCode(numerZamowienia);
    }

    public void dodajProdukt(Menu produkt) {
        if (produkt != null) {
            produkty.add(produkt);
        }
    }
}
