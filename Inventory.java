import java.util.*;

public class Inventory {
    private ArrayList<Book> books;

    public Inventory() {
        books = new ArrayList<>();
    }

    public ArrayList<Book> getBooks() {
        return books;
    }

    public int getBookCount() {
        return books.size();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public List<Book> removeOutdatedBooks(int maxAge) {
    List<Book> keptBooks = new ArrayList<>();

    Iterator<Book> iterator = books.iterator();
    while (iterator.hasNext()) {
        Book book = iterator.next();
        if (book.isOutdated(maxAge)) {
            iterator.remove();
        } else {
            keptBooks.add(book);
        }
    }

    return keptBooks;
}

public double buyBook(String isbn, int quantity, String email, String address) {
    for (Book book : books) {
        if (book.getISBN().equals(isbn)) {

            if (book instanceof DemoBook) {
                throw new RuntimeException("Book " + book.getTitle() + " is not for sale. It is  demo only.");
            }

            double total = book.getPrice() * quantity;

            if (book instanceof PaperBook paperBook) {
                paperBook.reduceStock(quantity);
                ShippingService.send(address, paperBook);
            }

            if (book instanceof EBook ebook) {
                MailService.send(email, ebook);
            }

            return total;
        }
    }

    throw new RuntimeException("Book with ISBN " + isbn + " not found.");
}


}