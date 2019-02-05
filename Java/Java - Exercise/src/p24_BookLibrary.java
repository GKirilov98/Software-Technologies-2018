import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import java.util.Scanner;
import java.util.TreeMap;

public class p24_BookLibrary {
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



    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalBooks = Integer.parseInt(scanner.nextLine());
        TreeMap<String, Double> data = new TreeMap<>();
        for (int i = 0; i < totalBooks; i++) {
            String[] parts = scanner.nextLine().split(" ");
            Book book = new Book(
                    parts[0], parts[1], parts[2],
                    LocalDate.parse(parts[3],
                            DateTimeFormatter.ofPattern("dd.MM.yyyy")),
                    parts[4],
                    Double.parseDouble(parts[5])
            );
            if (!data.containsKey(book.getAuthor())) {
                data.put(book.getAuthor(), 0.0);
            }

            double currentPriceSum = data.get(book.getAuthor());
            currentPriceSum += book.getPrice();
            data.put(book.getAuthor(), currentPriceSum);
        }
        data
                .entrySet()
                .stream()
                .sorted((e1, e2) -> {
                    int priceComparison = e2.getValue().compareTo(e1.getValue());
                    if (priceComparison == 0) {
                        return e1.getKey().compareTo(e2.getKey());
                    }

                    return priceComparison;
                })
                .forEach(e -> System.out.printf("%s -> %.2f\n", e.getKey(), e.getValue()));


    }
}

