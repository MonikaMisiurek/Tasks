package classesAndInterfaces.Task1;

/*
Zaimplementuj klasę Movie , która będzie zawierać pola reprezentujące
informacje takie jak: tytuł, reżyser, rok wydania, gatunek, wydawca. Klasa ta
powinna zawierać domyślny konstruktor oraz metody typu getter i setter ,
oraz nadpisaną metodę toString , która będzie odpowiedzialna za zwracanie
informacji o właściwościach konkretnego filmu

Zaimplementuj klasę zagnieżdżoną statyczną MovieCreator . Klasa ta powinna:
-zawierać pola klasy takie same jak klasa Movie
-zawierać metody umoliżwiające ustawianie konkretnych właściwości filmu.
Każda z metod powinna zwracać instancję obiektu, na rzecz którego
wywoływana jest metoda
metodę createMovie , która na podstawie ustawionych parametrów stworzy
instancję klasy Movie i zwróci ją w rezultacie działania metody

 */
public class Main {
    public static void main(String[] args) {

        Movie movie = new Movie.MovieCreator()
                .setTitle("One Flew Over the Cuckoo's Nest")
                .setDirector("Milos Forman")
                .setyearOfpublishment(1962)
                .setfilmGenre("fiction")
                .setpublisher("Fantasy Films")
                .createMovie();
        System.out.println(movie);

    }
}
