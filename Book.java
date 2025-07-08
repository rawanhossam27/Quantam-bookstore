import java.time.Year;

public abstract class Book {

    private String title;
    private String ISBN;
    private double price;
    private int yearPublished;

    public Book(String title, String ISBN, double price, int yearPublished) {
        this.title = title;
        this.ISBN = ISBN;
        this.price = price;
        this.yearPublished = yearPublished;
    }

    public double getPrice() {
        return price;
    }

    public String getISBN() {
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

    public void setISBN(String ISBN) {
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

    public boolean isOutdated(int maxAge) {
        int currentYear = Year.now().getValue();
        return (currentYear - yearPublished) > maxAge;
    }
}