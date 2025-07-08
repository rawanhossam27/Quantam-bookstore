public class test {
    public static void main(String[] args) {
        Inventory store = new Inventory();

        // Add books
        store.addBook(new PaperBook("Java for Beginners", "ISBN1", 150.0, 2010, 5));
        store.addBook(new EBook("Advanced Java", "ISBN2", 90.0, 2022, "PDF"));
        store.addBook(new DemoBook("Rare Manuscript", "ISBN3", 0.0, 1980));

        System.out.println("Quantum book store: Initial books added.");

        var keptBooks = store.removeOutdatedBooks(12);
        System.out.println("Removed outdated books. Remaining books:");
        for (Book book : keptBooks) {
            System.out.println(" - " + book.getTitle());
        }

        // Buy a paper book
        try {
            double amount = store.buyBook("ISBN1", 2, "buyer@example.com", "123 Cairo St.");
            System.out.println("Purchase successful. Paid: " + amount);
        } catch (Exception e) {
            System.out.println("Quantum book store: " + e.getMessage());
        }

        // Buy an ebook
        try {
            double amount = store.buyBook("ISBN2", 1, "ebooklover@example.com", "N/A");
            System.out.println("Quantum book store: Purchase successful. Paid: " + amount);
        } catch (Exception e) {
            System.out.println("Quantum book store: " + e.getMessage());
        }

        // Try to buy a showcase book
        try {
            store.buyBook("ISBN3", 1, "fail@example.com", "N/A");
        } catch (Exception e) {
            System.out.println("Quantum book store: " + e.getMessage());
        }

        // Try to buy more than available stock
        try {
            store.buyBook("ISBN1", 10, "fail@example.com", "123 Cairo St.");
        } catch (Exception e) {
            System.out.println("Quantum book store: " + e.getMessage());
        }
    }
}
