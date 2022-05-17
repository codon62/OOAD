import java.util.ArrayList;

public class Human {
    String name;
    Library myLibrary;
    ArrayList<Rent> rentalList;

    Human(String name) {
        this.name = name;
        this.myLibrary = null;
        this.rentalList = new ArrayList();
    }

    public void notifyMembership(Library library) {
        this.myLibrary = library;
    }

    public Rent rentBook(BookCopy bookCopy) {
        if (this.myLibrary != null) {
            if (this.rentalList.size() < 5) {
                if (!bookCopy.isReserved()) {
                    Rent rent = new Rent(this, bookCopy);
                    this.rentalList.add(rent);
                    return rent;
                }

                System.out.println("Reserved Book");
            } else {
                System.out.println("Rental limit exceed");
            }
        } else {
            System.out.println("Become a member first");
        }

        return null;
    }

    public String toString() {
        return "Human{name='" + this.name + "'}";
    }
}
