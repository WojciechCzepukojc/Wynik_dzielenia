package pl.sda.arppl.pracawzespole;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj licznik");
        int licznik = scanner.nextInt();

        System.out.println("Podaj mianownik");
        int mianownik = scanner.nextInt();{
            if (licznik%mianownik == 0)
                System.out.println("Liczba " + licznik + " jest podzielna przez " + mianownik);
            else
                System.out.println("Liczba " + licznik + " nie jest podzielna przez " + mianownik);
        }

    }
}
