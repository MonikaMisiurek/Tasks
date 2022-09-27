package enumTask.task1;
/*
Stwórz klasę enum Weekday ze stałymi MONDAY, TUESDAY .... Enum powinien zawierać metody boolean
isWeekDay oraz boolen isHoliday.
Metoda isHoliday powinna zwracać rezultat przeciwny od rezultuatu
wywołania metody isWeekDay .
Dodatkowo w ramach klasy enum powinna być
zadeklarowana i zaimplementowana metoda whichIsGreater . Metoda ta
powinna przyjmować obiekt typu Weekday . Metoda ta powinna wyświetlać
informacje o tym, że wskazany dzień tygodnia jest poprzednikiem bądź
następnikiem dnia tygodnia przekazanego w argumencie. W tym celu skorzystaj
z metody compareTo .
Zaprezentuj zaimplementowane powyżej rozwiązanie na przykładzie.

 */
public class Main {
    public static void main(String[] args) {
        System.out.println("Saturday is holiday: " + WeekDay.SATURDAY.isHoliday());

        WeekDay.FRIDAY.wchichIsGreater(WeekDay.MONDAY);
        WeekDay.SATURDAY.wchichIsGreater(WeekDay.SUNDAY);
    }
}
