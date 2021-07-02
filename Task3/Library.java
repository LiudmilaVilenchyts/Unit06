package Task3;


public class Library {
    public static void main(String[] args) {
        Book b1 = new Book(1, "Hobbit", "J.Tolkien", "AST", 2002, 330, 20, "soft");
        Book b2 = new Book(2, "The Lord Of The Rings. 3 in 1", "J.Tolkien", "AST", 2004, 1100, 90, "hard");
        Book b3 = new Book(3, "Howl's Moving Castle", "D.Jones", "AST", 2005, 212, 50, "hard");

        BookShelf bookShelf = new BookShelf();
        bookShelf.addBookToShelf(b1);
        bookShelf.addBookToShelf(b2);
        bookShelf.addBookToShelf(b3);

        System.out.println("Books written by J.Tolkien: "+bookShelf.findTheAuthor("J.Tolkien"));
        System.out.println("Books published after 2003: "+bookShelf.findPublishedAfterYear(2003));
    }
}
