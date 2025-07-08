public class ShippingService {
    public static void send(String address, PaperBook book) {
        System.out.println("Shipping paper book '" + book.getTitle() + "' to address: " + address);
    }
}
