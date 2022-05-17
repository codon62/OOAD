import java.util.ArrayList;

public class Book {
    String name;
    Boolean isReservedBook;
    ArrayList<BookCopy> copies;

    Book(String name, Boolean reserved) {
        this.name = name;
        this.isReservedBook = reserved;
        this.copies = new ArrayList();
    }

    public int registration(BookCopy copy) {
        if (!this.copies.contains(copy)) {
            this.copies.add(copy);
            return this.copies.size();
        } else {
            return -1;
        }
    }

    public String toString() {
        return "Book{name='" + this.name + "', isReservedBook=" + this.isReservedBook + "}";
    }

    public boolean isReserved() {
        return this.isReservedBook;
    }
}
