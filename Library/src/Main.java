public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        Library myLibrary = new Library();
        Book dataMining = new Book("Data Mining", false);
        new BookCopy(dataMining);
        new BookCopy(dataMining);
        Book ooad = new Book("Object Oriented Analysis and Design", false);
        new BookCopy(ooad);
        new BookCopy(ooad);
        new BookCopy(ooad);
        Book designPattern = new Book("Design Pattern", false);
        BookCopy designPattern1 = new BookCopy(designPattern);
        Book softwareEng = new Book("Software Engineering", false);
        new BookCopy(softwareEng);
        Book keras = new Book("Keras: Deep Learning", true);
        new BookCopy(keras);
        Book blockChain = new Book("Block Chain", false);
        new BookCopy(blockChain);
        Book positiveThinking = new Book("Positive Thinking", false);
        new BookCopy(positiveThinking);
        Human kim = new Human("Kim");
        myLibrary.enrollMember(kim);
        Human lee = new Human("Lee");
        myLibrary.enrollMember(lee);
        new Human("Park");
        Rent rent = kim.rentBook(designPattern1);
        System.out.println(rent.toString());
    }
}
