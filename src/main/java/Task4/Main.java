package Task4;

/*
Zaimplementuj klasę Point2D . Klasa powinna zawierać:
dwa pola typu float: x ,y
konstruktor bezparametrowy ustawiający wartość pól x i y na 0
konstruktor z dwoma parametrami: float x , i float y
metody typu getter odpowiedzialne za zwracanie wartości zmiennej: x ,y
 ===============metodę getXY zwracającą współrzędne x i y w postaci tablicy dwuelementowej
metody typu setter odpowiedzialne za ustawianie wartości pól x ,y
======================metodę setXY ustawiającą współrzędne x i y
metoda toString która powinna zwracać łańcuch tekstowy o następującym formacie: (x, y) ;

Na podstawie klasy Point2D zaimplementuj klasę Point3D. Klasa ta powinna
rozszerzać klasę Point2D oraz dodawać następującą implementację:
pole prywatne typu float: z
konstruktor przyjmujący wartości dla pól: x , y ,z
metodę typu getter odpowiedzialną za zwracanie wartości zmiennej z
================metodę getXYZ zwracającą współrzędne x , y , w postaci tablicy trzyelementowej
metodę typu setter odpowiedzialną za ustawianie zmiennej z
==================metodę  setXYZ ustawiającą wartości dla zmiennych x , y ,z
metodę toString powinna zwracać łańcuch tekstowy o następującym
formacie: (x, y, z) ;
Zaprezentuj zaimplementowane powyżej rozwiązanie na przykładzie.

 */
public class Main {
    public static void main(String[] args) {

        Point2D point2D = new Point2D(10,10);
        point2D.setXY(43,42);
        System.out.println(point2D);

        Point3D point3D = new Point3D(10,10,5);
        point3D.setXYZ(55,5,10);
        System.out.println(point3D);

    }
}
