import java.util.ArrayList;

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

    Iterator<Book> iterator = inventory.iterator();
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
    for (Book book : inventory) {
        if (book.getIsbn().equals(isbn)) {

            if (book instanceof ShowcaseBook) {
                throw new RuntimeException("Book is not for sale.");
            }

            double total = book.getPrice() * quantity;

            if (book instanceof PaperBook paperBook) {
                if (paperBook.getStock() < quantity) {
                    throw new RuntimeException("Not enough stock.");
                }
                paperBook.reduceStock(quantity);
                ShippingService.send(address, paperBook);
                System.out.println("Shipping PaperBook to " + address);
            }

            if (book instanceof EBook ebook) {
                MailService.send(email, ebook);
                System.out.println("Sending EBook to " + email);
            }

            return total;
        }
    }

    throw new RuntimeException("Book with ISBN not found.");
}


}