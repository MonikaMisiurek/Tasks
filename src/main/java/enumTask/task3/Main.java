package enumTask.task3;
/*
Stwórz klasę enum TemperatureConvert ze stałymi C_F,
C_K, K_C, F_C, F_K, K_F.
enum powinien zawierać konstuktor ptzyjmujący trzy paramtry:
- jednostkę temperatury na wejściu
- jednostka teperatury na wyjściu
instancję interfejsu Converter( z metodą float convert(float tempIn))-
instancja powinna dostarczać niezbędne obliczenia w celu konwersji temperatury

Dodatkowo enum TemperatureConvert powinien zawierać metodę statyczną
convertTemperature , która przyjmuje następujące parametry:
jednostkę temperatury na wejściu
jednostkę temperatury na wyjściu
wartość temperatury
Metoda ta powinna zwracać skonwertowaną wartość. Do znalezienia
odpowiedniej stałej należy skorzystać z metody values()
 */
public class Main {
    public static void main(String[] args) {
        float convertedTemp = TemperatureConvert.convertTemperature('C','K',30);
        System.out.println(convertedTemp);
    }
}
