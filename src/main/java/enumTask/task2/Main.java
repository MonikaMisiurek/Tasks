package enumTask.task2;
/*
Stwórz klasę PackageSize ze stałymi SMALL, MEDIUM, LARGE
Enum powienien przyjmować w konstruktorze dwa parametry
- minimalny rozmiar paczki w cm
- maksymalny rozmiar paczki w cm
Dodatkowo enum PackageSize powienien zawierać metodę statyczną
getPackageSize, która przyjmuje na wejściu minimalny i maksymalny rozmiar paczki, a jako rezultat
powinna zwracać konkretny obiekt PackagrSize na podstawie przekazanego rozmiaru paczki
 */
public class Main {
    public static void main(String[] args) {
        PackageSize packageSize = PackageSize.getPackageSize(22,55);
        System.out.println(packageSize);

    }
}
