package exception.task2;

import java.util.List;

/*
Zaimplementuj klasę BookRepository, która będzie odpowiedzialna za :
-dodawanie nowych obiektów typu Book
-usuwanie obiektów typu Book
-wyszukiwanie obiektów typu Book o wskazanej nazwie
- wyszukiwanie obiektów typu Book o wskazanym id
- usuwanie obiektów typu Book na podstawie przekazanego id

Klasa Book powinna zawierać pola
-isbn
-tytuł
-autor
-rok wydania

NoBookFoundException
w przypadkiu braku jakichkolwiek rezultató wyszukiwania, powinien zostać wyrzucony wyjątek: NoBookFoundException
Wyjątek ten powinien być zaimplementowanym włąsnoręcznie wyjątkiem,
przyjmującym jako parametr konstruktora obiekt typu String z informacją jakich elementów nie udało się odszukać

 */
public class Main {
    public static void main(String[] args) throws NoBookFoundException {
        BookRepository bookRepository = new BookRepository();
        bookRepository.addBook(new Book("1122","Harry Potter", "J.K.Rowling", 1997));
        bookRepository.addBook(new Book("1133","Harry Potter part 2 ", "J.K.Rowling", 1998));
        List<Book> book = bookRepository.findByName("Harry Potter");
        System.out.println(book);
        List<Book> book1 = bookRepository.findByName("??");


        Book book2 = bookRepository.findByIsbn("??");
        Book book3 = bookRepository.findByIsbn("1133");
        System.out.println(book3);


        bookRepository.deleteBook("43");
        bookRepository.deleteBook("1122");



    }
}
