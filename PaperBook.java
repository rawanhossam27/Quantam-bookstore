public class PaperBook extends Book {
    private int stock;

    public PaperBook(String title, String ISBN, double price, int yearPublished, int stock) {
        super(title, ISBN, price, yearPublished);
        this.stock = stock;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    @Override
    public boolean isShippable() {
        return true; 
    }

    public void reduceStock(int quantity) {
        if (quantity > stock) {
            throw new RuntimeException("Not enough stock available for book " + getTitle() + ".");
        }
        stock -= quantity;
    }
}