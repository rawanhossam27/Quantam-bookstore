Public class PaperBook extends Book {
    private int stock;

    public PaperBook(String title, int ISBN, int price, int yearPublished, int stock) {
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
}