import java.util.Objects;

public class Menu {
    private String kod;
    private String nazwa;
    private double cena;
    private String kategoria;
    private static int liczbaProduktow;
    public Menu(String kod, String nazwa, double cena, String kategoria) {
        this.kod = kod;
        this.nazwa = nazwa;
        this.cena = cena;
        this.kategoria = kategoria;
        liczbaProduktow++;
    }

    public String getKod() {
        return kod;
    }

    public void setKod(String kod) {
        this.kod = kod;
    }

    public String getNazwa() {
        return nazwa;
    }

    private void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public double getCena() {
        return cena;
    }

    private void setCena(double cena) {
        this.cena = cena;
    }

    public String getKategoria() {
        return kategoria;
    }

    public void setKategoria(String kategoria) {
        this.kategoria = kategoria;
    }
    @Override
    public String toString() {
        return nazwa + " [" + kod + "], kategoria: " + kategoria + ", cena: " + cena + " zł";
    }
    public static int getLiczbaProduktow() {
        return liczbaProduktow;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Menu menu = (Menu) o;
        return Objects.equals(kod, menu.kod);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(kod);
    }
}

