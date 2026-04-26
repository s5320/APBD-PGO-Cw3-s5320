# APBD-PGO-Cw3-s5320

## Cel projektu

Celem projektu jest przećwiczenie podstawowych elementów programowania obiektowego w Javie:

- tworzenie klas,
- definiowanie pól prywatnych,
- używanie konstruktorów,
- stosowanie getterów i setterów,
- użycie `ArrayList`,
- wykorzystanie pól i metod statycznych,
- nadpisanie metody `toString()`,
- nadpisanie metod `equals()` i `hashCode()`,
- podział logiki programu na kilka klas.

## Kontekst biznesowy

Aplikacja symuluje prosty system zamówień dla małej kawiarni. Właściciel kawiarni może posiadać listę produktów w menu, obsługiwać klienta oraz utworzyć dla niego zamówienie składające się z kilku produktów.

Program pokazuje podstawowy przepływ działania:

1. Utworzenie produktów z menu.
2. Utworzenie klienta.
3. Utworzenie zamówienia dla klienta.
4. Dodanie produktów do zamówienia.
5. Obliczenie łącznej wartości zamówienia.
6. Wyświetlenie podsumowania.
7. Porównanie produktów za pomocą `equals()`.
8. Oznaczenie zamówienia jako opłacone.

## Struktura projektu

APBD-PGO-Cw3-s5320
├── src
│   ├── Klient.java
│   ├── Menu.java
│   ├── Zamowienie.java
│   └── main.java
├── .gitignore
└── APBD-PGO-Cw3-s5320.iml
