public class MailService {
    public static void send(String email, EBook book) {
        System.out.println("Sending ebook '" + book.getTitle() + "' to email: " + email);
    }
}
