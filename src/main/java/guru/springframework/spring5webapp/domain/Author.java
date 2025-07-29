package guru.springframework.spring5webapp.domain;

public class Author {
    private String firstName;
    private String lastName;
    private Set<Book> books;

    public Author() {
    }

    public Author(Set<Book> books, String lastName, String firstName) {
        this.books = books;
        this.lastName = lastName;
        this.firstName = firstName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Set<Book> getBooks() {
        return books;
    }

    public void setBooks(Set<Book> books) {
        this.books = books;
    }
}
