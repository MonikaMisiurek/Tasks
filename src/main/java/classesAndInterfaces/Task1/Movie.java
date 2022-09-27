package classesAndInterfaces.Task1;

class Movie {
    private String title;
    private String director;
    private int yearOfpublishment;
    private String filmGenre;
    private String publisher;

    public Movie(String title, String director, int yearOfpublishment, String filmGenre, String publisher) {
        this.title = title;
        this.director = director;
        this.yearOfpublishment = yearOfpublishment;
        this.filmGenre = filmGenre;
        this.publisher = publisher;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public int getYearOfpublishment() {
        return yearOfpublishment;
    }

    public void setYearOfpublishment(int yearOfpublishment) {
        this.yearOfpublishment = yearOfpublishment;
    }

    public String getFilmGenre() {
        return filmGenre;
    }

    public void setFilmGenre(String filmGenre) {
        this.filmGenre = filmGenre;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }


    @Override
    public String toString() {
        return "Movie{" +
                "title='" + title + '\'' +
                ", director='" + director + '\'' +
                ", yearOfpublishment=" + yearOfpublishment +
                ", filmGenre='" + filmGenre + '\'' +
                ", publisher='" + publisher + '\'' +
                '}';
    }
    static class MovieCreator{
        private String title;
        private String director;
        private int yearOfpublishment;
        private String filmGenre;
        private String publisher;

        public MovieCreator setTitle(String title) {
            this.title = title;
            return this;
        }

        public MovieCreator setDirector(String director){
            this.director =director;
            return this;
        }
        public MovieCreator setyearOfpublishment(int yearOfpublishment){
            this.yearOfpublishment =yearOfpublishment;
            return this;
        }
        public MovieCreator setfilmGenre(String filmGenre){
            this.filmGenre =filmGenre;
            return this;
        }
        public MovieCreator setpublisher(String publisher){
            this.publisher =publisher;
            return this;
        }
//        metodę createMovie , która na podstawie ustawionych parametrów stworzy
//        instancję klasy Movie i zwróci ją w rezultacie działania metody

        public Movie createMovie(){
            Movie movie = new Movie(title,director,yearOfpublishment,filmGenre,publisher);
            return movie;
        }




    }
}
