package homework1;

import java.util.ArrayList;
import java.util.List;

public class Book {

    private final String title;
    private final String author;
    private boolean bookStatus;
    private List<Integer> rating;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        rating = new ArrayList<>();
        bookStatus = true;
    }

    public List<Integer> getRating() {
        return rating;
    }

    public double getAverageRating() {
        double result = 0;
        for (int i = 0; i < rating.size(); i++) {
            result += rating.get(i);
        }
        return result / rating.size();
    }

    public void setRating(int n) {
        rating.add(n);
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public boolean isBookStatus() {
        return bookStatus;
    }

    public void setBookStatus(boolean bookStatus) {
        this.bookStatus = bookStatus;
    }

    @Override
    public String toString() {
        return "\"" + title + "\"" + "  -  " + author;
    }
}
