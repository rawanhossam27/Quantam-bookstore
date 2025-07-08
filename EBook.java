public class EBook extends Book {
    private String fileType;

    public EBook(String title, int ISBN, int price, int yearPublished, String fileType) {
        super(title, ISBN, price, yearPublished);
        this.fileType = fileType;
    }

    public String getFileType() {
        return fileType;
    }

    public void setFileType(String fileType) {
        this.fileType = fileType;
    }

    @Override
    public boolean isMailable() {
        return  true; 
    }
}