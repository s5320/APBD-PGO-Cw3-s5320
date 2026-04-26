public class Main {
    public static void main(String[] args) {
        Menu p1 = new Menu("K-01", "Espresso", 9.0, "kawa");
        Menu p2 = new Menu("K-02", "Cappuccino", 13.5, "kawa");
        Menu p3 = new Menu("D-01", "Sernik", 16.0, "deser");

        Klient klient = new Klient(100, "Julia", "Mazur", "j.mazur@mail.pl");

        Zamowienie zamowienie = new Zamowienie(klient);
        zamowienie.dodajProdukt(p1);
        zamowienie.dodajProdukt(p2);
        zamowienie.dodajProdukt(p3);

        System.out.println(klient);
        System.out.println(zamowienie);
        System.out.println("Łączna wartość: " + zamowienie.policzWartosc());
        System.out.println("Liczba pozycji: " + zamowienie.policzLiczbeProduktow());
        System.out.println("Liczba produktów utworzonych w systemie: " + ProduktMenu.getLiczbaProduktow());

        Menu kopiaEspresso = new Menu("K-01", "Espresso duplikat", 9.0, "kawa");
        System.out.println("Czy produkty są równe? " + p1.equals(kopiaEspresso));

        zamowienie.oznaczJakoOplacone();
        System.out.println(zamowienie);
    }
}