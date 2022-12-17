package homework1;

public class Test {

    public static void main(String[] args) {
        Library library = new Library();

        library.addBookLibrary("title1", "testAuthor");

        library.removeBook("title1");

        System.out.println(library.findBookTitle("Book5").toString());

        System.out.println(library.findAllBooksAuthor("Author3").toString());

        library.giveBookToVisitor("Terry", "title1");
        library.giveBookToVisitor("Terry", "title1");

        library.returnBookOfVisitor("Terry", "title1");
    }
}
