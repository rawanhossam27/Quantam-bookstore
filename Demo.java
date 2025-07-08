public class DemoBook extends Book {

    public DemoBook(String title, int ISBN, int price, int yearPublished, String fileType) {
        super(title, ISBN, price, yearPublished);
        this.fileType = fileType;
    }

    @Override
    public boolean isForSale() {
        return false;
    }

}