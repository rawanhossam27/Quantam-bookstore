public class DemoBook extends Book {

    public DemoBook(String title, String ISBN, double price, int yearPublished) {
        super(title, ISBN, price, yearPublished);
    }

    @Override
    public boolean isForSale() {
        return false;
    }

}