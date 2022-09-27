package collections.task2;

import java.util.*;
import java.util.function.ToDoubleFunction;


public class BookService {
    private List<Book> bookList= new ArrayList<>();

    public void addBook(Book book){
        bookList.add(book);
    }
    public void removeBook(Book book){
        bookList.remove(book);
    }

    public List<Book> getAll(){
        return bookList;
    }

    public List<Book> findBySpecies(Species species){
        List<Book> results = new ArrayList<>();
        for (Book book : bookList){
            if (book.getSpecies() == species ){
                results.add(book);
            }
        }
        return results;
    }

    public List<Book> findByYearOfPublishment(int yearOfPublishment){
        List<Book> results = new ArrayList<>();
        for (Book book : bookList){
            if (book.getYeatOfpublishment() == yearOfPublishment){
                results.add(book);
            }
        }
        return results;
    }

    public Book findMoreExpensive (){
        Book result = null;
        for (Book book : bookList){
            if (result == null || result.getPrice() < book.getPrice()){
                result = book;
            }
        }
        return result;
    }

    public Book findChipest (){
        Book result = null;
        for (Book book : bookList){
            if (result == null || result.getPrice() > book.getPrice()){
                result = book;
            }
        }
        return result;
    }

    public List<Book> findByNumberOfAuthors(int numberOfAuthors){
        List<Book> results = new ArrayList<>();
        for (Book book: bookList){
            if (numberOfAuthors == book.getAuthors().size() ){
                results.add(book);
            }
        }
        return results;
    }

    public List<Book> sortByTitleByDsc(){
        Collections.reverse(bookList);
        return bookList;

    }
    public boolean isBookInRepo(Book book){
        return bookList.contains(book);
    }

    public List<Book> findByAuthor(Author author){
        List<Book> result = new ArrayList<>();
        for (Book book : bookList){
            if ( book.getAuthors().contains(author)){
                result.add(book);
            }
        }
        return result;

    }

    public Map<Species, String > mapBooks(){
        Map<Species, String> mapBook = new HashMap<>();
        for (Book book : bookList){
            mapBook.put(book.getSpecies(), book.getTitle());
        }
        return mapBook;
    }
    public Stack<Book> createBookStack(){
        Collections.sort(bookList,Comparator.comparingDouble(new ToDoubleFunction<Book>() {
            @Override
            public double applyAsDouble(Book value) {
                return value.getPrice();
            }
        }));
        Stack<Book>bookStack = new Stack<>();
        for (Book book : bookList){
            bookStack.push(book);
        }
        return bookStack;
    }


}
