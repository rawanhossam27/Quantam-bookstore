public class test {
    public static void main(String[] args) {
        Inventory store = new Inventory();

        // Add books
        store.addBook(new PaperBook("Java for Beginners", "ISBN1", 150.0, 2010, 5));
        store.addBook(new EBook("Advanced Java", "ISBN2", 90.0, 2022, "PDF"));
        store.addBook(new DemoBook("Rare Manuscript", "ISBN3", 0.0, 1980));
        store.addBook(new PaperBook("Modern C++", "ISBN4", 120.0, 2015, 1)); // Only 1 in stock
        store.addBook(new EBook("Python Cookbook", "ISBN5", 60.0, 2018, "EPUB"));
        store.addBook(new DemoBook("Showcase", "ISBN6", 0.0, 2021));
        store.addBook(new PaperBook("Clean Code", "ISBN7", 200.0, 2020, 3)); // New paper book

        System.out.println("Quantum book store: Initial books added.");

        var keptBooks = store.removeOutdatedBooks(12);
        System.out.println("Removed outdated books. Remaining books: " + keptBooks.size());

        // Buy an ebook (success)
        try {
            double amount = store.buyBook("ISBN2", 1, "ebooklover@example.com", "N/A");
            System.out.println("Quantum book store: Purchase successful. Paid: " + amount);
        } catch (Exception e) {
            System.out.println("Quantum book store: " + e.getMessage());
        }

        // Try to buy more than available stock (should fail)
        try {
            store.buyBook("ISBN4", 2, "fail@example.com", "123 Cairo St.");
        } catch (Exception e) {
            System.out.println("Quantum book store: " + e.getMessage());
        }

        // Try to buy another DemoBook (should print not for sale)
        try {
            store.buyBook("ISBN6", 1, "fail@example.com", "N/A");
        } catch (Exception e) {
            System.out.println("Quantum book store: " + e.getMessage());
        }

        // Buy the new paper book (success)
        try {
            double amount = store.buyBook("ISBN7", 1, "buyer@example.com", "456 Alexandria Rd.");
            System.out.println("Quantum book store: Purchase successful. Paid: " + amount);
        } catch (Exception e) {
            System.out.println("Quantum book store: " + e.getMessage());
        }
    }
}
