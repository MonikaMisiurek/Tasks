package Task2;

import java.util.Scanner;

/*
Program który rysuje choinkę, której liczba poziomów zostaje pobrana z konsoli
 */
public class Mian {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" "); // ta pętla działa 5 razy przy pierwszym wierszu
            }
            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print("*");
                // pierwsze wykonanie pętli i = 0, j = 0;
                // kolejne wykonanie pęli i = 0 , j = 1 -> warunek nie zostaje spełniony
            }
            System.out.println();

        }

        // to jest odległość nóżki od lewej strony
        for (int j =0 ; j < n - 1 ; j++ ){
            System.out.print(" ");
        }
        System.out.println("#");
    }
}