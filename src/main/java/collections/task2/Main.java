package collections.task2;

import java.util.Arrays;
import java.util.Stack;

/*
klasa Author
Zaimplementuj klasę Author , która będzie zawierać pola: imię, nazwisko, płeć.
Uwzględnij wszystkie niezbędne meotody oraz parametry konstruktora.
Zaimplementuj klasę hashCode i equals .

Klasa Book
Zaimplementuj klasę Book , która będzie zawierać pola: tytuł, cena, rok wydania
oraz lista autorów, gatunek (reprezentowany jako klasa enum). Uwzględnij
wszystkie niezbędne metody oraz parametry konstruktora. Zaimplementuj klasę hashCode
i equals .

Klasa BookService
Zaimplementuj klasę BookService , która będzie zawierać w sobie listę książek,
oraz będzie realizować poniższe metody:
dodawanie książek do listy
usuwanie książek z listy
zwracanie listy wszystkich książek
zwracanie książek podanego typu
zwracanie książek wydanych w podanym roku
zwracanie najdroższej książki
zwracanie najtańszej książki
zwracanie książki , które mają okresloną liczbę autorów
zwracanie listy wszystkich książek posortowanych rosnąco/ malejąco
sprawdzanie czy konkretna książka znajduje się na liście
zwracanie listy książek napisanych przez konkretnego autora
 */
public class Main {
    public static void main(String[] args) {

        Author author = new Author("Adam", "Mickiewicz", "man");
        Author author1 = new Author("Eliza","Orzeszkowa","female");
        Author author2 = new Author("Jarosław", "Grzędowicz", "man");
        Author author3 = new Author("Juliusz", "Słowacki", "man");
        Author author4 = new Author("Agatha", "Christie", "female");

        Book book = new Book("Dziady", 45,2000, Arrays.asList(author),Species.FANTASY_NOVEL);
        Book book1 = new Book("Nad Niemnem", 28.50, 2010,Arrays.asList(author1),Species.HORROR);
        Book book2 = new Book("Nie było już nikogo", 28, 2021,Arrays.asList(author4),Species.CRIME_STORY);
        Book book3 = new Book("Pan Lodowego Ogrodu", 50, 2012, Arrays.asList(author2),Species.FANTASY_NOVEL);

        BookService bookService = new BookService();
        bookService.addBook(book);
        bookService.addBook(book1);
        bookService.addBook(book2);
        bookService.addBook(book3);


        System.out.println(bookService.getAll());

        System.out.println(bookService.findByAuthor(author2));

        System.out.println(bookService.findByNumberOfAuthors(1));

        System.out.println(bookService.findBySpecies(Species.FANTASY_NOVEL));

        System.out.println(bookService.sortByTitleByDsc());

        System.out.println(bookService.findByYearOfPublishment(2000));

        System.out.println(bookService.findMoreExpensive());

        System.out.println(bookService.findChipest());

        bookService.removeBook(book);

        System.out.println(bookService.isBookInRepo(book));

        System.out.println(bookService.mapBooks());


        Stack<Book> bookStack= bookService.createBookStack();
        while (!bookStack.isEmpty()){
            System.out.println(bookStack.pop());
        }



    }
}
