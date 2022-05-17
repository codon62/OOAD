public class BookCopy {
    int id;
    Book book;
    Rent rent;

    BookCopy(Book book) {
        this.book = book;
        this.id = book.registration(this);
        this.rent = null;
    }

    public boolean isReserved() {
        return this.book.isReserved();
    }

    public void notifyRented(Rent rent) {
        this.rent = rent;
    }

    public String toString() {
        int var10000 = this.id;
        return "Copy{id=" + var10000 + ", book=" + this.book.toString() + "}";
    }
}
