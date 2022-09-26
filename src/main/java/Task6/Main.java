package Task6;
/*
Zaimplementuj klasę Shape . Klasa powinna zawierać:
-pole odpowiedzialne za przechowywanie koloru
-pole odpowiedzialne za przechowywanie informacji o tym czy kolor powinien wypełniać figurę czy nie
-konstruktor bezparametrowy ustawiający wartość pola color na unknown i isFilled na false
-konstruktor przyjmujący parametry color i isFilled
-metody typu getter odpowiedzialne za zwracanie wartości pól
-metody typu setter odpowiedzialne za ustawianie wartości pól
-===============nadpisaną metodę toString odpowiedzialną za wyświetlanie następującej
================informacji: Shape with color of ? and filled/NotFilled , gdzie ?
================oznacza wartość kolor, a wartość filled / not filled powinna zostać zwracana w zależności od pola isFilled

Zaimplementuj klasę Circle , która będzie rozszerzać klasę shape o
następujące cechy:
-pole odpowiedzialne za przechowywanie wartości promienia
-konstruktor bezparametrowy ustawiający wartość pola color na unknown i isFilled na false oraz pola radius na 1
konstruktor przyjmujący parametry color , isFilled , radius
metodę typu getter odpowiedzialną za zwracanie wartości pola radius
metodę typu setter odpowiedzialną za ustawianie wartości pola radius
metodę getArea odpowiedzialną za obliczanie pola powierzchni
metodę getPerimeter odpowiedzialną za obliczanie obwodu

nadpisaną metodę toString odpowiedzialną za wyświetlanie następującej
informacji: Circle with radius=? which is a subclass off y , gdzie ?
oznacza wartość promienia, a wartość y powinna być rezultatem
wywołania metody toString z klasu bazowej

Zaimplementuj klasę Rectangle , która będzie rozszerzać klasę shape o
następujące cechy:
-pole szerokość i długość (double)
-konstruktor bezparametrowy ustawiający wartość pola color na unknown i isFilled na false oraz pola width i length na 1
-konstruktor przyjmujący parametry color , isFilled , width i length
metodę typu getter odpowiedzialną za zwracanie wartości pola width i length
metodę typu setter odpowiedzialną za ustawianie wartości pola width i length
metodę getArea odpowiedzialną za obliczanie pola powierzchni
metodę getPerimeter odpowiedzialną za obliczanie obwodu
nadpisaną metodę toString odpowiedzialną za wyświetlanie następującej
informacji: Rectangle with width=? and length=? which is a subclass off y , gdzie ?
oznacza odpowiednio szerokość i długość, a wartość y powinna być rezultatem
wywołania metody toString z klasu bazowej

Zaimplementuj klasę Square, która będzie rozszerzać klasę Rectangle Klasa ta nie powinna wyprowadzać nowych pól
oraz funkcjonalności, ale powinna wymuszać na klasie bazowej zachowanie kwadratu


 */


public class Main {
    public static void main(String[] args) {

        Shape shape = new Shape();
        System.out.println(shape);
        Shape shape1 = new Shape("Black", false);
        System.out.println(shape1);

        Circle circle1 = new Circle("green", true,2);
        System.out.println(circle1);
        System.out.println(circle1.getArea());

        Rectangle rectangle = new Rectangle("blue",true,5,5);
        System.out.println(rectangle);
        System.out.println(rectangle.getArea());
        System.out.println(rectangle.getPerimeter());

        Square square = new Square("yellow", true, 6, 5);
        System.out.println(square);
        System.out.println(square.getArea());
        System.out.println(square.getPerimeter());

    }
}
