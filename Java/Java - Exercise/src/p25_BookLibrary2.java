import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import java.util.*;

public class p25_BookLibrary2 {
    public static class Book {
        private String title;
        private String author;
        private String publisher;
        private LocalDate releasedDate;
        private String isbn;
        private double price;

        public Book(String title, String author, String publisher, LocalDate releasedDate, String isbn, double price) {
            this.title = title;
            this.author = author;
            this.publisher = publisher;
            this.releasedDate = releasedDate;
            this.isbn = isbn;
            this.price = price;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getAuthor() {
            return author;
        }

        public void setAuthor(String author) {
            this.author = author;
        }

        public String getPublisher() {
            return publisher;
        }

        public void setPublisher(String publisher) {
            this.publisher = publisher;
        }

        public LocalDate getReleasedDate() {
            return releasedDate;
        }

        public void setReleasedDate(LocalDate releasedDate) {
            this.releasedDate = releasedDate;
        }

        public String getIsbn() {
            return isbn;
        }

        public void setIsbn(String isbn) {
            this.isbn = isbn;
        }

        public double getPrice() {
            return price;
        }

        public void setPrice(double price) {
            this.price = price;
        }
    }
    public static class Library {
        private String Name;
        private ArrayList<Book> Books;

        public Library(String name, ArrayList<Book> books) {
            Name = name;
            Books = books;
        }

        public String getName() {
            return Name;
        }

        public void setName(String name) {
            Name = name;
        }

        public ArrayList<Book> getBooks() {
            return Books;
        }

        public void setBooks(ArrayList<Book> books) {
            Books = books;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalBooks = Integer.parseInt(scanner.nextLine());
        TreeMap<String, LocalDate> data = new TreeMap<>();
        for (int i = 0; i < totalBooks; i++) {
            String[] parts = scanner.nextLine().split(" ");
            Book book = new Book(
                    parts[0], parts[1], parts[2],
                    LocalDate.parse(parts[3],
                            DateTimeFormatter.ofPattern("dd.MM.yyyy")),
                    parts[4],
                    Double.parseDouble(parts[5])
            );

                data.put(book.getTitle(), book.getReleasedDate());

        }

        LocalDate givenDate = LocalDate.parse(scanner.nextLine(),
                DateTimeFormatter.ofPattern("dd.MM.yyyy"));

        data
                .entrySet()
                .stream()
                .filter(e1 -> e1.getValue().isAfter(givenDate))
                .sorted(Comparator.comparing(Map.Entry::getValue))
                .forEach(e -> System.out.printf("%s -> %s\n", e.getKey(), e.getValue().format(DateTimeFormatter.ofPattern("dd.MM.yyyy"))));

    }
}

