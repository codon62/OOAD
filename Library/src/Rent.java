import java.time.LocalDate;

public class Rent {
    private static final long rentalDays = 15;

    LocalDate fromDate;
    LocalDate toDate;
    BookCopy bookCopy;
    Human member;

    Rent(Human member, BookCopy bookCopy) {
        this.member = member;
        this.bookCopy = bookCopy;
        fromDate = LocalDate.now();
        toDate = fromDate.plusDays(Rent.rentalDays);
        bookCopy.notifyRented(this);
    }

//    Rent(Human member, Copy bookCopy, LocalDate setDate) { // LocalDate.of(2022, 3, 15);
//        this.member = member;
//        this.bookCopy = bookCopy;
//        fromDate = LocalDate.now();
//        toDate = fromDate.plusDays(Rent.rentalDays);
//        bookCopy.notifyRented(this);
//    }

    @Override
    public String toString() {
        return "Rent{" +
                "fromDate=" + fromDate +
                ", toDate=" + toDate +
                ", bookCopy=" + bookCopy.toString() +
                ", member=" + member.toString() +
                '}';
    }
}
