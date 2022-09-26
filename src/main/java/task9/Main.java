package task9;

/*
Zaimplementuj interfejs GeometricObject, który będzie zawierać definicję współnych zachowań dla klas pochodnych
-double getPerimeter()
- double getArea()

Klasa Circle
-implementuje interfejs GeometricObject
- zawiera pole promień

Interfejs Resizable
- deklaruje metodę resizable(int percent) , które ma być odpowiedzialna za przesklowanie obiektów implementujących tworzony interfejs

KLASA ResizableCircle
- implementuje Resizable
- metoda resize, powinna procentowo zmniejszyć promień koła


 */
public class Main {
    public static void main(String[] args) {

        Circle circle = new Circle(5);
        System.out.println(circle);
        System.out.println(circle.getArea());
        System.out.println(circle.getPerimeter());


        ResizableCircle resizableCircle = new ResizableCircle(100);
        resizableCircle.resizable(20);
    }
}
