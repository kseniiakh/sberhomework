package homework1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Library {

    private static List<Book> bookListLibrary;
    //список посетителей
    private static List<Visitor> visitors;

    public Library() {
        visitors = new ArrayList<>(Arrays.asList(new Visitor("John"),
                new Visitor("Edward"),
                new Visitor("Donald"),
                new Visitor("Heather"),
                new Visitor("Terry"),
                new Visitor("Charles")));

        bookListLibrary = new ArrayList<>(Arrays.asList(new Book("Book1", "Author1"),
                new Book("Book2", "Author2"),
                new Book("Book3", "Author4"),
                new Book("Book4", "Author3"),
                new Book("Book5", "Author5"),
                new Book("Book6", "Author5"),
                new Book("Book7", "Author2"),
                new Book("Book8", "Author5"),
                new Book("Book9", "Author4"),
                new Book("Book10", "Author3"),
                new Book("Book11", "Author1"),
                new Book("Book12", "Author5"),
                new Book("Book13", "Author3"),
                new Book("Book14", "Author2"),
                new Book("Book15", "Author1")));
    }

    public Visitor getVisitorName(String name) {
        for (Visitor visitor : visitors) {
            if (visitor.getName().equals(name)) {
                return visitor;
            }
        }
        return null;
    }


    public void addVisitor(String name) {
        if (getVisitorName(name) == null) {
            visitors.add(new Visitor(name));
        } else {
            System.out.println("Такой пользователь уже есть");
        }
    }


    public void printAllVisitors() {
        for (Visitor visitor : visitors) {
            System.out.println(visitor);
        }
    }


    public void giveBookToVisitor(String nameVisitor, String title) {
        Visitor visitor = getVisitorName(nameVisitor);
        Book book = findBookTitle(title);
        if (visitor.getId() == 0) {
            visitor.setId();
        }
        if (book != null) {
            if (visitor.getBooks().size() == 0 && book.isBookStatus()) {
                visitor.getBooks().add(book);
                book.setBookStatus(false);
                System.out.println("Книга " + book.getTitle() + " выдана " + visitor.getName());
            } else {
                System.out.println(visitor.getName() + " отказано в выдаче книги");
            }
        } else {
            System.out.println("Такой книги нет в библиотеке");
        }
    }


    private boolean visitorThisBook(String nameVisitor, String title) {
        Visitor visitor = getVisitorName(nameVisitor);
        Book book = findBookTitle(title);
        for (Book visitorBook : visitor.getBooks()) {
            if (visitorBook.equals(book)) {
                return true;
            }
        }
        return false;
    }


    public void returnBookOfVisitor(String nameVisitor, String title) {
        Visitor visitor = getVisitorName(nameVisitor);
        Book book = findBookTitle(title);
        if (visitorThisBook(nameVisitor, title)) {
            bookListLibrary.add(book);
            book.setRating((int) (1 + Math.random() * 10));
            book.setBookStatus(true);
            visitor.getBooks().remove(book);
            System.out.println(visitor.getName() + " вернул книгу " + book.getTitle());
        } else {
            System.out.println("Не можем принять книгу. Сдавать должен тот, кто брал !!");
        }
    }


    private boolean isUniqueBook(String title) {
        for (Book book : bookListLibrary) {
            if (book.getTitle().equals(title)) {
                return false;
            }
        }
        return true;
    }


    public void addBookLibrary(String title, String author) {
        if (isUniqueBook(title)) {
            bookListLibrary.add(new Book(title, author));
        } else {
            System.out.println("Такая книга уже есть в библиотеке");
        }
    }


    public void removeBook(String title) {
        Book book = findBookTitle(title);
        if (book == null) {
            System.out.println("Такой книги нет!");
        } else if (book.isBookStatus()) {
            bookListLibrary.remove(book);
        } else {
            System.out.println("Удалить нельзя, так как книга в настоящий момент на руках.");
        }
    }


    public void printAllBooks() {
        for (Book book : bookListLibrary) {
            System.out.println(book);
        }
    }


    public Book findBookTitle(String title) {
        for (Book book : bookListLibrary) {
            if (book.getTitle().equals(title))
                return book;
        }
        return null;
    }


    public List<Book> findAllBooksAuthor(String author) {
        List<Book> listBookAuthor = new ArrayList<>();
        for (Book book : bookListLibrary) {
            if (book.getAuthor().equals(author)) {
                listBookAuthor.add(book);
            }
        }
        return listBookAuthor;
    }


    public double getRatingBook(String title) {
        Book book = findBookTitle(title);
        return book.getAverageRating();
    }
}
