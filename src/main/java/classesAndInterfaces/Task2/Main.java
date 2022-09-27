package classesAndInterfaces.Task2;
/*
Zaimplementuj klasę Car- będzie ona przechowywać informacje o nazwie i typie samochowu.
klasa powinna zawierać metody getter i setter

Klasa Engine
Zaimplementuj klasę Engine , która będzie zagnieżdżoną klasą niestetyczną w ramach klasy Car.
pola klasy: typ silnika, metoda setEngine (ustawia odpowiedni typ na podstawie typu samochodu)
Jeśli typ samochodu będzie równy economy -> typ silnika na diesel
typ samochodu = luxury -> typ silnika electric
w innym przypadku typ silnika -> petrol
 */
public class Main {
    public static void main(String[] args) {

        Car car = new Car("BMW", "sport");
        System.out.println(car);

        Car car1 = new Car("VW","economy");
        System.out.println(car1);
    }
}
