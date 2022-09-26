package Task7;

/*
Zaimplementuj klasę Line , która będzie zawierać (na zasadzie kompozycji)
instancję dwóch obiektów Point 2D z zadania nr 4. Punkty te będą punktem
początkowym oraz końcowym odcinka. Ponadto klasa ta powinna
implementować:
konstruktor przyjmujący dwa punkty: początkowy i końcowy
konstruktor przyjmujący 4 parametry: współrzędne punktu początkowego
oraz końcowego
metody typu getter odpowiedzialne za zwracanie punktów: początkowego oraz końcowego
metody typu setter odpowiedzialne za ustalanie punktów: początkowego i końcowego
metodę odpowiedzialną za zwracanie współrzędnych punktu będącego
środkiem stworzonej prostej
Zaprezentuj zaimplementowane powyżej rozwiązanie na przykładzie.

 */

public class Main {
    public static void main(String[] args) {

        Line line = new Line(2,6,4,8);
        System.out.println(line);
        System.out.println(line.getMiddlePoint());



    }
}
