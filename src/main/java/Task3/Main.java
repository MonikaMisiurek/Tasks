package Task3;

import java.util.Scanner;

/*
algorytm Euklidesa ( obliczanie nawiększego wspólnego dzielnika
 */
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();

        while (b != 0){
            int c = a % b;
            a = b;
            b = c;
            System.out.println(c);
        }

        System.out.println("Podaj liczbę dziesiętną");
        int num = scanner.nextInt();
        String bin = ""; // tworzymy zmienne pomocnicze
        int p = num;
        while(p != 0) {
            bin = p % 2 + bin; // zapisujemy modulo z dzielenia przez 2 (albo 0, albo 1), pamiejąc, że taka liczba jest tworzona od końca
            p /= 2; // dzielimy zmienną pomocniczą przez 2
        }
        System.out.println("Liczba binarna to: " + bin);

    }
    }

