package Task5;
/*
Klasa Person
 Klasa powinna zawierać:
- dwa pola typu String (name, addrres)
- konstruktor bezparametrowy ustawiający wartości pól name i address na pusty String
- konstruktoer z dwoma paramtrami( String name , String address)
- metody typu getter odpowiedzialne za zwracanie wartości zmiennej name i address
- metody typu eetter odpowiedzialne za ustawianie wartości pól name i address
- metoda toString powinna zawierać łańcuch tekstowy o następującym formacie : ?->?, gdzie ? to odpowiednio adres i imię

Zaimplementuj klasę Student . Klasa ta powinna rozszerzać klasę Person .
Dodatkowo powinna zawierać:
-trzy pola: typ studiów, rok studiów, koszt studiów
-konstruktor z trzema parametrami: typ studiów, rok studiów, koszt studiów
-metody typu getter dla zdeklarowanych pól
-metody typu setter dla zdeklarowanych pól
-metoda toString wyświetlająca szczegółowe informacje o studencie

Zaimplementuj klasę Staff . Klasa ta powinna rozszerzać klasę Person .
Dodatkowo powinna zawierać:
-dwa pola: specjalizacja oraz wynagrodzenie
-konstruktor z dwoma parametrami: specjalizacja, wynagrodzenie
-metody typu getter dla zdeklarowanych pól
-metody typu setter dla zdeklarowanych pól
-metodę toString wyświetlającą szczegółowe informacje o wykładowcy
Zaprezentuj zaimplementowane powyżej rozwiązanie na przykładzie.

 */
public class Main {
    public static void main(String[] args) {
        Person student = new Student("Anna", "Kwiatowa", "Philospophy",4,45000);
        System.out.println(student);
        Staff staff= new Staff("Karol", "Wiejska", "Computer Programing",25640 );
        staff.setSalary(30000);
        System.out.println(staff);


    }
}
