package homework1;

import java.util.ArrayList;
import java.util.List;

public class Visitor {
    private final String name;
    private List<Book> visitorBooks;
    private int id;

    public Visitor(String name) {
        this.name = name;
        visitorBooks = new ArrayList<>();
        id = 0;
    }

    public String getName() {
        return name;
    }

    public List<Book> getBooks() {
        return visitorBooks;
    }

    public int getId() {
        return id;
    }

    public void setId() {
        if (visitorBooks.isEmpty() && id == 0)
            id = this.hashCode() + 100;
    }

    @Override
    public String toString() {
        return name + " " + id;
    }
}
