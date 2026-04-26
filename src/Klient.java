import java.util.Objects;

public class Klient {

    private String imie;
    private String nazisko;
    private int idKlient;
    private String email;

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public String getNazisko() {
        return nazisko;
    }

    public void setNazisko(String nazisko) {
        this.nazisko = nazisko;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Klient(int idKlient, String imie, String nazisko,  String email) {
        this.imie = imie;
        this.nazisko = nazisko;
        this.email = email;

    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Klient klient = (Klient) o;
        return idKlient == klient.idKlient;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(idKlient);
    }

    @Override
    public String toString() {
        return "Klient{" +
                "imie='" + imie + '\'' +
                ", nazisko='" + nazisko + '\'' +
                ", email='" + email + '\'' +
                ", idKlient=" + idKlient +
                '}';
    }
}
