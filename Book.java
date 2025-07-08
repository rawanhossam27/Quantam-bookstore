Public Class Book{
    private String title;
    private int ISBN;
    private int price;
    private int yearPublished;

    public Book(String title, int ISBN, int price, int yearPublished) {
        this.title = title;
        this.ISBN = ISBN;
        this.price = price;
        this.yearPublished = yearPublished;
    }

    public int getPrice() {
        return price;
    }

    public int getISBN() {
        return ISBN;
    }

    public int getYearPublished() {
        return yearPublished;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
    public void setPrice(int price) {
        this.price = price;
    }
    public void setYearPublished(int yearPublished) {
        this.yearPublished = yearPublished;
    }

    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }

    public boolean isShippable() {
        return false; 
    }
    public boolean isMailable() {
        return false; 
    }
    public boolean isForSale() {
        return true; 
    }
}