package collections.task2;

import java.util.List;
import java.util.Objects;

public class Book {
    private String title;
    private double price;
    private int yeatOfpublishment;
    private List<Author> authors;
    private Species species;

    public Book(String title, double price, int yeatOfpublishment, List<Author> authors, Species species) {
        this.title = title;
        this.price = price;
        this.yeatOfpublishment = yeatOfpublishment;
        this.authors = authors;
        this.species = species;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getYeatOfpublishment() {
        return yeatOfpublishment;
    }

    public void setYeatOfpublishment(int yeatOfpublishment) {
        this.yeatOfpublishment = yeatOfpublishment;
    }

    public List<Author> getAuthors() {
        return authors;
    }

    public void setAuthors(List<Author> authors) {
        this.authors = authors;
    }

    public Species getSpecies() {
        return species;
    }

    public void setSpecies(Species species) {
        this.species = species;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Double.compare(book.price, price) == 0 && yeatOfpublishment == book.yeatOfpublishment && Objects.equals(title, book.title) && Objects.equals(authors, book.authors) && species == book.species;
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, price, yeatOfpublishment, authors, species);
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", price=" + price +
                ", yeatOfpublishment=" + yeatOfpublishment +
                ", authors=" + authors +
                ", species=" + species +
                '}';
    }
}
