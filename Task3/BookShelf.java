package Task3;

import java.util.ArrayList;

public class BookShelf {
    ArrayList<Book> bookShelf;

    public BookShelf() {
        bookShelf = new ArrayList<>();
    }

    public ArrayList<Book> getBookShelf() {
        return bookShelf;
    }

    public void addBookToShelf(Book b) {
        bookShelf.add(b);
    }

    public ArrayList<Book> findTheAuthor(String author) {
        ArrayList<Book> booksFound = new ArrayList<Book>();
        for (Book b : bookShelf) {
            if (b.getAuthor().equals(author))
                booksFound.add(b);
        }
        if (booksFound.isEmpty()) {
            System.out.println("No books on the shelf written by " + author);
        }
        return booksFound;
    }

    public ArrayList<Book> findPublishedAfterYear(int yearOfPublish) {
        ArrayList<Book> booksFound = new ArrayList<Book>();
        for (Book b : bookShelf) {
            if (b.getYearOfPublish() > yearOfPublish)
                booksFound.add(b);
        }
        if (booksFound.isEmpty()) {
            System.out.println("No books on the shelf published after " + yearOfPublish);
        }
        return booksFound;

    }

    public void setBookShelf(ArrayList<Book> _bookShelf) {
        this.bookShelf = _bookShelf;
    }
}




