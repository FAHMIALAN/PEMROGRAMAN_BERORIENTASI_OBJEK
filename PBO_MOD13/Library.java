
public class Library {

    private static class Book {

        private String title;

        public Book(String title) {
            this.title = title;
        }

        public void displayBook() {
            System.out.println("Judul Buku: " + title);
        }
    }

    public static void main(String[] args) {
        Book book = new Book("CRYPTO TRADING GUIDE");
        book.displayBook();
    }
}
